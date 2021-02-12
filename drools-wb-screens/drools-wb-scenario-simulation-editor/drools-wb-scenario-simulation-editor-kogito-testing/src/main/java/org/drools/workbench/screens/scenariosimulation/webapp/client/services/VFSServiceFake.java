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

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

import elemental2.dom.DomGlobal;
import elemental2.webstorage.Storage;
import elemental2.webstorage.WebStorageWindow;
import org.uberfire.backend.vfs.DirectoryStream;
import org.uberfire.backend.vfs.Path;
import org.uberfire.backend.vfs.PathFactory;
import org.uberfire.backend.vfs.VFSService;
import org.uberfire.backend.vfs.impl.DirectoryStreamImpl;
import org.uberfire.java.nio.IOException;
import org.uberfire.java.nio.file.AtomicMoveNotSupportedException;
import org.uberfire.java.nio.file.DirectoryNotEmptyException;
import org.uberfire.java.nio.file.FileAlreadyExistsException;
import org.uberfire.java.nio.file.FileSystemAlreadyExistsException;
import org.uberfire.java.nio.file.NoSuchFileException;
import org.uberfire.java.nio.file.NotDirectoryException;
import org.uberfire.java.nio.file.ProviderNotFoundException;

@ApplicationScoped
public class VFSServiceFake implements VFSService {

    private static Storage localStorage;

    @PostConstruct
    public void init() {
        DomGlobal.console.log(getClass().getCanonicalName() + " init");
        localStorage = WebStorageWindow.of(DomGlobal.window).localStorage;
    }

    @Override
    public Path get(String uri) {
        DomGlobal.console.log("VFSServiceFake get " + uri);
        return null;
    }

    @Override
    public DirectoryStream<Path> newDirectoryStream(Path dir) throws IllegalArgumentException, NotDirectoryException, IOException {
        DomGlobal.console.log("VFSServiceFake newDirectoryStream 1 " + dir);
        List<Path> result = new LinkedList<>();
        for (int i = 0; i < localStorage.getLength(); i++) {
            String key = localStorage.key(i);
            if (key.startsWith("DMN:")) {

                DomGlobal.console.log("KEY " + key);
                //DomGlobal.console.log("KEY ? " + localStorage.getItem(key));
                //DomGlobal.console.log("KEY ?? " + new PathFactory.PathImpl(localStorage.getItem(key), localStorage.getItem(key)));
                Path path = new PathFactory.PathImpl(key, key);
                result.add(path);
            }
        }

        return new DirectoryStreamImpl(result);
    }

    @Override
    public DirectoryStream<Path> newDirectoryStream(Path dir, DirectoryStream.Filter<Path> filter) throws IllegalArgumentException, NotDirectoryException, IOException {
        DomGlobal.console.log("VFSServiceFake newDirectoryStream 2 " + dir);

        return null;
    }

    @Override
    public Path createDirectory(Path dir) throws IllegalArgumentException, UnsupportedOperationException, FileAlreadyExistsException, IOException {
        DomGlobal.console.log("VFSServiceFake createDirectory  " + dir);

        return null;
    }

    @Override
    public Path createDirectories(Path dir) throws UnsupportedOperationException, FileAlreadyExistsException, IOException {
        DomGlobal.console.log("VFSServiceFake createDirectories  " + dir);

        return null;
    }

    @Override
    public Path createDirectory(Path dir, Map<String, ?> attrs) throws IllegalArgumentException, UnsupportedOperationException, FileAlreadyExistsException, IOException {
        DomGlobal.console.log("VFSServiceFake createDirectory 3  " + dir);

        return null;
    }

    @Override
    public Path createDirectories(Path dir, Map<String, ?> attrs) throws UnsupportedOperationException, FileAlreadyExistsException, IOException {
        DomGlobal.console.log("VFSServiceFake createDirectories 2  " + dir);

        return null;
    }

    @Override
    public Map<String, Object> readAttributes(Path path) throws UnsupportedOperationException, IllegalArgumentException, IOException {
        DomGlobal.console.log("VFSServiceFake readAttributes  " + path);

        return null;
    }

    @Override
    public void setAttributes(Path path, Map<String, Object> attrs) throws IllegalArgumentException, FileSystemAlreadyExistsException, ProviderNotFoundException {
        DomGlobal.console.log("VFSServiceFake setAttributes  " + path);
    }

    @Override
    public void delete(Path path) throws IllegalArgumentException, NoSuchFileException, DirectoryNotEmptyException, IOException {
        DomGlobal.console.log("VFSServiceFake delete  " + path);
    }

    @Override
    public boolean deleteIfExists(Path path) throws IllegalArgumentException, DirectoryNotEmptyException, IOException {
        DomGlobal.console.log("VFSServiceFake deleteIfExists  " + path);

        return false;
    }

    @Override
    public Path copy(Path source, Path target) throws UnsupportedOperationException, FileAlreadyExistsException, DirectoryNotEmptyException, IOException {
        DomGlobal.console.log("VFSServiceFake copy  " + source + " " + target);

        return null;
    }

    @Override
    public Path move(Path source, Path target) throws UnsupportedOperationException, FileAlreadyExistsException, DirectoryNotEmptyException, AtomicMoveNotSupportedException, IOException {
        DomGlobal.console.log("VFSServiceFake move  " + source + " " + target);

        return null;
    }

    @Override
    public String readAllString(Path path) throws IllegalArgumentException, NoSuchFileException, IOException {
        DomGlobal.console.log("VFSServiceFake readAllString  " + path.getFileName() + " ? " + (localStorage.getItem(path.getFileName()) != null));

        return localStorage.getItem(path.getFileName());
    }

    @Override
    public Path write(Path path, String content) throws IllegalArgumentException, IOException, UnsupportedOperationException {
        DomGlobal.console.log(getClass().getCanonicalName() + " write " + " " + path);
        String filename = "DMN:" + path.getFileName();
        DomGlobal.console.log("DMN " + filename);
        localStorage.setItem(filename, content);

        return new PathFactory.PathImpl(filename, filename);
    }

    @Override
    public Path write(Path path, String content, Map<String, ?> attrs) throws IllegalArgumentException, IOException, UnsupportedOperationException {
        DomGlobal.console.log("VFSServiceFake write 2  " + path);

        return null;
    }

    @Override
    public boolean isRegularFile(String uri) {
        DomGlobal.console.log("VFSServiceFake isRegularFile   " + uri);

        return false;
    }

    @Override
    public boolean isRegularFile(Path path) {
        DomGlobal.console.log("VFSServiceFake isRegularFile 2  " + path);

        return false;
    }

    @Override
    public boolean isDirectory(String uri) {
        DomGlobal.console.log("VFSServiceFake isDirectory 1  " + uri);

        return false;
    }

    @Override
    public boolean isDirectory(Path path) {
        DomGlobal.console.log("VFSServiceFake isDirectory 1  " + path);

        return false;
    }
}
