
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.callbacks;

import jsinterop.annotations.JsFunction;

/**
 * Marshaller callback for <code>KIE</code>
 * 
 */
@JsFunction
public interface KIEMarshallCallback {


    void callEvent(String xmlString);

}
