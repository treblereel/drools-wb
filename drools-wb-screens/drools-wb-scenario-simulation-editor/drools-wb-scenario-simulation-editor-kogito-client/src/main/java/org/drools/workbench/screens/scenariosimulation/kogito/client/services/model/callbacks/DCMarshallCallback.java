
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.callbacks;

import jsinterop.annotations.JsFunction;

/**
 * Marshaller callback for <code>DC</code>
 * 
 */
@JsFunction
public interface DCMarshallCallback {


    void callEvent(String xmlString);

}
