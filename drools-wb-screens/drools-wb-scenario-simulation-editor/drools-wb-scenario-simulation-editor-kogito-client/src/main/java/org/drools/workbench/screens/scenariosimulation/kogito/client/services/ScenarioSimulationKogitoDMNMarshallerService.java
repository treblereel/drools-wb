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
package org.drools.workbench.screens.scenariosimulation.kogito.client.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.inject.Inject;

import elemental2.dom.DomGlobal;
import jsinterop.base.Js;
import org.drools.workbench.scenariosimulation.kogito.marshaller.mapper.JsUtils;
import org.jboss.errai.common.client.api.ErrorCallback;
import org.jboss.errai.common.client.api.RemoteCallback;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.MainJs;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.callbacks.DMN12UnmarshallCallback;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.DMN12;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDefinitions;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITItemDefinition;
import org.uberfire.backend.vfs.Path;
import org.uberfire.backend.vfs.PathFactory;
import org.uberfire.client.callbacks.Callback;

public class ScenarioSimulationKogitoDMNMarshallerService {

    @Inject
    private ScenarioSimulationKogitoResourceContentService resourceContentService;

    public void getDMNContent(final Path dmnFilePath,
                              final Callback<JSITDefinitions> callback,
                              final ErrorCallback<Object> errorCallback) {
        DomGlobal.console.log("getDMNContent " + dmnFilePath);


        resourceContentService.getFileContent(dmnFilePath,
                                              getDMNFileContentCallback(dmnFilePath, callback, errorCallback),
                                              errorCallback);
    }

    private RemoteCallback<String> getDMNFileContentCallback(final Path dmnFilePath,
                                                             final Callback<JSITDefinitions> callback,
                                                             final ErrorCallback<Object> errorCallback) {
       return dmnContent -> unmarshallDMN(dmnContent, getDMN12UnmarshallCallback(dmnFilePath, callback, errorCallback));
    }

    protected DMN12UnmarshallCallback getDMN12UnmarshallCallback(final Path dmnFilePath,
                                                                 final Callback<JSITDefinitions> callback,
                                                                 final ErrorCallback<Object> errorCallback) {
        DomGlobal.console.log("getDMN12UnmarshallCallback " + dmnFilePath);


        return new DMN12UnmarshallCallback() {
            @Override
            public void callEvent(DMN12 dmn12) {

                org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmn12.DMN12 _dmn12 = Js.uncheckedCast(dmn12);



                DomGlobal.console.log("ZZ 1 " + _dmn12.getName());

                org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmn12.JSITDefinitions _jsitDefinitions1 = Js.uncheckedCast(JsUtils.getUnwrappedElement(_dmn12));


                DomGlobal.console.log("ZZ 2.1 " + _jsitDefinitions1.getExporter());
                DomGlobal.console.log("ZZ 2.2 " + _jsitDefinitions1.getTypeLanguage());
                DomGlobal.console.log("ZZ 2.3 " + _jsitDefinitions1.getId());
                DomGlobal.console.log("ZZ 2.4 " + _jsitDefinitions1.getDMNDI());



                //DomGlobal.console.log("maybe JSITDefinitions 1 " + dmn12.toString());
                //DomGlobal.console.log("maybe JSITDefinitions 1 " + Json.stringify(dmn12));

                JSITDefinitions jsitDefinitions1 = Js.uncheckedCast(JsUtils.getUnwrappedElement(dmn12));

                DomGlobal.console.log("maybe 1 " + jsitDefinitions1.getExporter());
                DomGlobal.console.log("maybe 2 " + jsitDefinitions1.getName());
                DomGlobal.console.log("maybe 3 " + jsitDefinitions1.getNamespace());
                DomGlobal.console.log("maybe 4 " + jsitDefinitions1.getTypeLanguage());
                DomGlobal.console.log("maybe 5 " + jsitDefinitions1.getDMNDI());


                DomGlobal.console.log("maybe JSITDefinitions 2 " + jsitDefinitions1);
                DomGlobal.console.log("maybe JSITDefinitions 3 " + Json.stringify(JsUtils.getUnwrappedElement(dmn12)));

                final JSITDefinitions jsitDefinitions = uncheckedCast(dmn12);

                final Map<String, Path> includedDMNImportsPaths = new HashMap<>();
                if (jsitDefinitions.getImport() != null && !jsitDefinitions.getImport().isEmpty()) {
                    includedDMNImportsPaths.putAll(jsitDefinitions.getImport().stream()
                                                           .filter(jsitImport -> jsitImport.getImportType().toUpperCase().contains("DMN"))
                                                           .collect(Collectors.toMap(jsitImport -> jsitImport.getName(),
                                                                                     jsitImport -> PathFactory.newPath(jsitImport.getLocationURI(),
                                                                                                                       dmnFilePath.toURI().replace(dmnFilePath.getFileName(),
                                                                                                                                                   jsitImport.getLocationURI())))));
                }
                DomGlobal.console.log("dmn12 ?? " + jsitDefinitions.toString());

                if (includedDMNImportsPaths.isEmpty()) {
                    DomGlobal.console.log("dmn12 1 " + includedDMNImportsPaths.isEmpty());

                    DomGlobal.console.log("dmn12 2 " + (jsitDefinitions instanceof JSITDefinitions));
                    DomGlobal.console.log("dmn12 3 " + jsitDefinitions.getTYPE_NAME());

                    DomGlobal.console.log("JSON >" + Json.stringify(jsitDefinitions) + "<");


                    callback.callback(jsitDefinitions);
                } else {
                    final List<JSITDefinitions> importedItemDefinitions = new ArrayList<>();
                    for (Map.Entry<String, Path> importPath : includedDMNImportsPaths.entrySet()) {
                        resourceContentService.getFileContent(importPath.getValue(),
                                                              ScenarioSimulationKogitoDMNMarshallerService.this.getDMNImportContentRemoteCallback(callback,
                                                                                                                                                  jsitDefinitions,
                                                                                                                                                  importedItemDefinitions,
                                                                                                                                                  includedDMNImportsPaths.size()),
                                                              errorCallback);
                    }
                }
            }
        };
    }

    protected RemoteCallback<String> getDMNImportContentRemoteCallback(final Callback<JSITDefinitions> callback,
                                                                       final JSITDefinitions definitions,
                                                                       final List<JSITDefinitions> importedDefinitions,
                                                                       final int importsNumber) {
        return dmnContent -> {
            DMN12UnmarshallCallback dmn12UnmarshallCallback = getDMN12ImportsUnmarshallCallback(callback,
                                                                                                definitions,
                                                                                                importedDefinitions,
                                                                                                importsNumber);
            unmarshallDMN(dmnContent, dmn12UnmarshallCallback);
        };
    }
    protected DMN12UnmarshallCallback getDMN12ImportsUnmarshallCallback(final Callback<JSITDefinitions> callback,
                                                                        final JSITDefinitions definitions,
                                                                        final List<JSITDefinitions> importedDefinitions,
                                                                        final int importsNumber) {
        return new DMN12UnmarshallCallback() {
            @Override
            public void callEvent(DMN12 dmn12) {
                DomGlobal.console.log("getDMN12ImportsUnmarshallCallback " + dmn12.getName());

                final JSITDefinitions jsitDefinitions = ScenarioSimulationKogitoDMNMarshallerService.this.uncheckedCast(dmn12);
                importedDefinitions.add(jsitDefinitions);

                if (importsNumber == importedDefinitions.size()) {

                    for (int i = 0; i < importedDefinitions.size(); i++) {

                        final JSITDefinitions jsitDefinitions1 = Js.uncheckedCast(importedDefinitions.get(i));
                        List<JSITItemDefinition> itemDefinitionsRaw = jsitDefinitions1.getItemDefinition();

                        for (int j = 0; j < itemDefinitionsRaw.size(); j++) {
                            JSITItemDefinition value = Js.uncheckedCast(itemDefinitionsRaw.get(j));
                            definitions.addItemDefinition(value);
                        }
                    }

                    callback.callback(definitions);
                }
            }
        };
    }

    // Indirection for tests
    protected void unmarshallDMN(String dmnContent, DMN12UnmarshallCallback dmn12UnmarshallCallback) {
        DomGlobal.console.log("do unmarshallDMN >\n");
        DomGlobal.console.log(dmnContent);
        DomGlobal.console.log("<");

        MainJs.unmarshall(dmnContent, "", dmn12UnmarshallCallback);
    }

    // Indirection for tests
    protected JSITDefinitions uncheckedCast(DMN12 dmn12) {
        return Js.uncheckedCast(JsUtils.getUnwrappedElement(dmn12));
    }
}
