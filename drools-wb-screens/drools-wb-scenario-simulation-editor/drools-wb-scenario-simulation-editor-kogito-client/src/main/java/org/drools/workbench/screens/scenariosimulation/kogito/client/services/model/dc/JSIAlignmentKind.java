
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dc;

import jsinterop.annotations.JsType;

/**
 * JSInterop adapter for <code>AlignmentKind</code>
 * 
 */
@JsType(name = "AlignmentKind")
public enum JSIAlignmentKind {

    START("start"),
    END("end"),
    CENTER("center");
    private final String value;

    JSIAlignmentKind(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

}
