
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmn12;

import jsinterop.annotations.JsType;

/**
 * JSInterop adapter for <code>TAssociationDirection</code>
 * 
 */
@JsType(name = "TAssociationDirection")
public enum JSITAssociationDirection {

    NONE("None"),
    ONE("One"),
    BOTH("Both");
    private final String value;

    JSITAssociationDirection(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

}
