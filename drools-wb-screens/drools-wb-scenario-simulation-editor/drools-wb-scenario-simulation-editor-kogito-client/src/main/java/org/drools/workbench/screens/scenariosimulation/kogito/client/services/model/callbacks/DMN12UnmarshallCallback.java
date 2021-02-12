
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.callbacks;

import jsinterop.annotations.JsFunction;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmn12.DMN12;

/**
 * Unmarshaller callback for <code>DMN12</code>
 * 
 */
@JsFunction
public interface DMN12UnmarshallCallback {


    void callEvent(DMN12 dMN12);

}
