
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.callbacks;

import jsinterop.annotations.JsFunction;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dc.DC;

/**
 * Unmarshaller callback for <code>DC</code>
 * 
 */
@JsFunction
public interface DCUnmarshallCallback {


    void callEvent(DC dC);

}
