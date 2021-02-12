
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmn12;

import jsinterop.annotations.JsType;

/**
 * JSInterop adapter for <code>TDecisionTableOrientation</code>
 * 
 */
@JsType(name = "TDecisionTableOrientation")
public enum JSITDecisionTableOrientation {

    RULE_AS_ROW("Rule-as-Row"),
    RULE_AS_COLUMN("Rule-as-Column"),
    CROSS_TABLE("CrossTable");
    private final String value;

    JSITDecisionTableOrientation(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

}
