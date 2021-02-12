/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.drools.workbench.screens.scenariosimulation.webapp.client.services;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import elemental2.dom.DomGlobal;
import org.jboss.errai.common.client.api.ErrorCallback;
import org.jboss.errai.common.client.api.RemoteCallback;
import org.uberfire.backend.vfs.DirectoryStream;
import org.uberfire.backend.vfs.Path;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.mvp.PlaceRequest;
import org.uberfire.mvp.impl.DefaultPlaceRequest;

/**
 * Class used to provide <i>virtual file system</i> access to <i>kogito testing editors</i>
 */
@ApplicationScoped
public class TestingVFSService {

    public static final String CONTENT_PARAMETER_NAME = "content";
    public static final String FILE_NAME_PARAMETER_NAME = "fileName";
    private PlaceManager placeManager;
    private VFSServiceFake vfsServiceCaller;

    @Inject
    private VFSServiceFake vfsServiceFake;

    public TestingVFSService() {
        //CDI proxy
    }

    @Inject
    public TestingVFSService(final PlaceManager placeManager,
                             final VFSServiceFake vfsServiceCaller) {
        DomGlobal.console.log("TestingVFSService start");
        DomGlobal.console.log("1 " + placeManager.getClass().getCanonicalName());
        DomGlobal.console.log("2 " + vfsServiceCaller.getClass().getCanonicalName());
        DomGlobal.console.log("2 " + vfsServiceCaller.getClass().getCanonicalName());
        this.placeManager = placeManager;
        this.vfsServiceCaller = vfsServiceCaller;
    }

    /**
     * Create a directory at the given <code>Path</code>
     * @param dir
     * @return
     */
    public Path createDirectory(final Path dir) {
        return vfsServiceCaller.createDirectory(dir);
    }

    /**
     * Create a new file
     * @param editorId The <b>id</b> of the editor to open by the <code>PlaceRequest</code>
     * @param fileName
     */
    public void newFile(final String editorId,
                        final String fileName) {
        final PlaceRequest placeRequest = new DefaultPlaceRequest(editorId);
        placeRequest.addParameter(FILE_NAME_PARAMETER_NAME, fileName);
        placeManager.goTo(placeRequest);
    }

    /**
     * Open a file at given <code>Path</code> inside an <b>editor</b>
     * @param path the <code>Path</code> to the file
     * @param editorId The <b>id</b> of the editor to open by the <code>PlaceRequest</code>
     */
    public void openFile(final Path path,
                         final String editorId) {
        DomGlobal.console.log("TestingVFSService openFile 1" + path.toString());
        String xml = vfsServiceCaller.readAllString(path);

        final PlaceRequest placeRequest = new DefaultPlaceRequest(editorId);
        placeRequest.addParameter(FILE_NAME_PARAMETER_NAME, path.getFileName());
        placeRequest.addParameter(CONTENT_PARAMETER_NAME, xml);
        placeManager.goTo(placeRequest);

/*        vfsServiceCaller.call((String xml) -> {
            final PlaceRequest placeRequest = new DefaultPlaceRequest(editorId);
            placeRequest.addParameter(FILE_NAME_PARAMETER_NAME, path.getFileName());
            placeRequest.addParameter(CONTENT_PARAMETER_NAME, xml);
            placeManager.goTo(placeRequest);
        }).readAllString(path);*/
    }

    /**
     * Load the file at given <code>Path</code> and returns content inside a callback
     * @param path
     * @param callback
     * @param <T>
     */
    public <T> void loadFile(final Path path,
                             final RemoteCallback<String> callback,
                             final ErrorCallback<T> errorCallback) {

        DomGlobal.console.log("loadFile " + path);
        String xml = vfsServiceCaller.readAllString(path);

        //DomGlobal.console.log("XML>" + xml + "<");
        callback.callback(xml);


        //vfsServiceCaller.call(callback, errorCallback).readAllString(path);
    }

    @SuppressWarnings("unchecked")
    public <T> void saveFile(final Path path,
                             final String xml,
                             final RemoteCallback<String> callback,
                             final ErrorCallback<T> errorCallback) {
        DomGlobal.console.log("skipping saveFile for " + path.toString());
        DomGlobal.console.log("vfsServiceCaller?  " + (vfsServiceCaller != null));
        Path result = vfsServiceCaller.write(path, xml);
        callback.callback(xml);

        //vfsServiceCaller.call((Path p) -> callback.callback(xml), errorCallback).write(path, xml);
    }

    /**
     * Get the <code>List&lt;Path&gt;</code> contained in the given <b>root</b>
     * @param root
     * @param callback
     * @param errorCallback
     * @param <T>
     */
    public <T> void getItemsByPath(final Path root,
                                   final RemoteCallback<List<Path>> callback,
                                   final ErrorCallback<T> errorCallback) {
        DirectoryStream<Path> paths = vfsServiceCaller.newDirectoryStream(root);
        List<Path> files = paths != null ? StreamSupport.stream(paths.spliterator(), false)
                .collect(Collectors.toList()) : Collections.emptyList();
        callback.callback(files);
    }

    /**
     * Get <b>filtered</b> <code>List&lt;Path&gt;</code>  contained in the given <b>root</b>
     * @param root
     * @param fileSuffix
     * @param callback
     * @param errorCallback
     * @param <T>
     */
    public <T> void getItemsByPath(final Path root,
                                   final String fileSuffix,
                                   final RemoteCallback<List<Path>> callback,
                                   final ErrorCallback<T> errorCallback) {
        DomGlobal.console.log("skipping getItemsByPath for " + root.toString());
        String filteredSuffix = fileSuffix.startsWith(".") ? fileSuffix : "." + fileSuffix;

        DomGlobal.console.log("   filteredSuffix " + root.toString());


        DirectoryStream<Path> paths = vfsServiceCaller.newDirectoryStream(root);
        List<Path> files = paths != null ? StreamSupport.stream(paths.spliterator(), false)
                //.filter(path -> path.getFileName().endsWith(filteredSuffix))
                .collect(Collectors.toList()) : Collections.emptyList();
        callback.callback(files);


/*        vfsServiceCaller.call((DirectoryStream<Path> paths) -> {
            List<Path> files = paths != null ? StreamSupport.stream(paths.spliterator(), false)
                    .filter(path -> path.getFileName().endsWith(filteredSuffix))
                    .collect(Collectors.toList()) : Collections.emptyList();
            callback.callback(files);
        }, errorCallback).newDirectoryStream(root);*/
    }
}
