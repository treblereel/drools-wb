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
        localStorage = WebStorageWindow.of(DomGlobal.window).sessionStorage;
    }

    @Override
    public Path get(String uri) {
        return null;
    }

    @Override
    public DirectoryStream<Path> newDirectoryStream(Path dir) throws IllegalArgumentException, IOException {
        List<Path> result = new LinkedList<>();
        for (int i = 0; i < localStorage.getLength(); i++) {
            String key = localStorage.key(i);
            if (key.startsWith(dir.toURI())) {
                Path path = new PathFactory.PathImpl(key.replaceAll(dir.toURI(),""), key);
                result.add(path);
            }
        }

        return new DirectoryStreamImpl(result);
    }

    @Override
    public DirectoryStream<Path> newDirectoryStream(Path dir, DirectoryStream.Filter<Path> filter) throws IllegalArgumentException, NotDirectoryException, IOException {
        return null;
    }

    @Override
    public Path createDirectory(Path dir) throws IllegalArgumentException, UnsupportedOperationException, FileAlreadyExistsException, IOException {
        return null;
    }

    @Override
    public Path createDirectories(Path dir) throws UnsupportedOperationException, FileAlreadyExistsException, IOException {
        return null;
    }

    @Override
    public Path createDirectory(Path dir, Map<String, ?> attrs) throws IllegalArgumentException, UnsupportedOperationException, FileAlreadyExistsException, IOException {
        return null;
    }

    @Override
    public Path createDirectories(Path dir, Map<String, ?> attrs) throws UnsupportedOperationException, FileAlreadyExistsException, IOException {
        return null;
    }

    @Override
    public Map<String, Object> readAttributes(Path path) throws UnsupportedOperationException, IllegalArgumentException, IOException {
        return null;
    }

    @Override
    public void setAttributes(Path path, Map<String, Object> attrs) throws IllegalArgumentException, FileSystemAlreadyExistsException, ProviderNotFoundException {
    }

    @Override
    public void delete(Path path) throws IllegalArgumentException, IOException {
    }

    @Override
    public boolean deleteIfExists(Path path) throws IllegalArgumentException, IOException {
        return false;
    }

    @Override
    public Path copy(Path source, Path target) throws UnsupportedOperationException, IOException {
        return null;
    }

    @Override
    public Path move(Path source, Path target) throws UnsupportedOperationException, FileAlreadyExistsException, DirectoryNotEmptyException, AtomicMoveNotSupportedException, IOException {
        return null;
    }

    @Override
    public String readAllString(Path path) throws IllegalArgumentException, NoSuchFileException, IOException {
        return localStorage.getItem(path.toURI());
    }

    @Override
    public Path write(Path path, String content) throws IllegalArgumentException, IOException, UnsupportedOperationException {
        localStorage.setItem(path.toURI(), content);
        return path;
    }

    @Override
    public Path write(Path path, String content, Map<String, ?> attrs) throws IllegalArgumentException, IOException, UnsupportedOperationException {
        return null;
    }

    @Override
    public boolean isRegularFile(String uri) {
        return false;
    }

    @Override
    public boolean isRegularFile(Path path) {
        return false;
    }

    @Override
    public boolean isDirectory(String uri) {
        return false;
    }

    @Override
    public boolean isDirectory(Path path) {
        return false;
    }
}
