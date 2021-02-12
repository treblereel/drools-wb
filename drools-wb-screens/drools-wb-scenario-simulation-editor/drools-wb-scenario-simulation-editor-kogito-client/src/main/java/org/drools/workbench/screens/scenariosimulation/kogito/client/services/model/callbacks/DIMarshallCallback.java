
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.callbacks;

import jsinterop.annotations.JsFunction;

/**
 * Marshaller callback for <code>DI</code>
 * 
 */
@JsFunction
public interface DIMarshallCallback {


    void callEvent(String xmlString);

}
