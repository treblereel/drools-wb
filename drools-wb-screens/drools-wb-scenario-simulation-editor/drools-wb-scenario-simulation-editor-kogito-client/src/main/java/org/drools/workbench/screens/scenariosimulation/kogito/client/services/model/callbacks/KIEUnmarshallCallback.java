
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.callbacks;

import jsinterop.annotations.JsFunction;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.kie.KIE;

/**
 * Unmarshaller callback for <code>KIE</code>
 * 
 */
@JsFunction
public interface KIEUnmarshallCallback {


    void callEvent(KIE kIE);

}
