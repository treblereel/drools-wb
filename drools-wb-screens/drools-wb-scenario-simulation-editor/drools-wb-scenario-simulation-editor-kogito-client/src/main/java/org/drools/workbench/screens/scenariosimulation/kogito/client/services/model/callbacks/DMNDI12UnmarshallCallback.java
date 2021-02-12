
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.callbacks;

import jsinterop.annotations.JsFunction;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmndi12.DMNDI12;

/**
 * Unmarshaller callback for <code>DMNDI12</code>
 * 
 */
@JsFunction
public interface DMNDI12UnmarshallCallback {


    void callEvent(DMNDI12 dMNDI12);

}
