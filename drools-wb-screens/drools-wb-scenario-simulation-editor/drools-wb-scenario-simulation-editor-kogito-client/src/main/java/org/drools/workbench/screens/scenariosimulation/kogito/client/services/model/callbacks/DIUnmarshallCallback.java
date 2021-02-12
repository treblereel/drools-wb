
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.callbacks;

import jsinterop.annotations.JsFunction;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.di.DI;

/**
 * Unmarshaller callback for <code>DI</code>
 * 
 */
@JsFunction
public interface DIUnmarshallCallback {


    void callEvent(DI dI);

}
