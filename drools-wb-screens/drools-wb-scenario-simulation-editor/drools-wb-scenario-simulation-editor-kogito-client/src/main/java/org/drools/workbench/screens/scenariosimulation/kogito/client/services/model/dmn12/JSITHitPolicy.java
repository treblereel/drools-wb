
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmn12;

import jsinterop.annotations.JsType;

/**
 * JSInterop adapter for <code>THitPolicy</code>
 * 
 */
@JsType(name = "THitPolicy")
public enum JSITHitPolicy {

    UNIQUE("UNIQUE"),
    FIRST("FIRST"),
    PRIORITY("PRIORITY"),
    ANY("ANY"),
    COLLECT("COLLECT"),
    RULE_ORDER("RULE ORDER"),
    OUTPUT_ORDER("OUTPUT ORDER");
    private final String value;

    JSITHitPolicy(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

}
