
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.di;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * JSInterop container for <code>org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.di</code>
 * 
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class DI {


    /**
     * Native getter for <b>name</b>
     * 
     * @return
     *     The <b>name</b> JSON property
     */
    @JsProperty(name = "name")
    public native String getName();

    /**
     * Native getter for <b>Style</b>
     * 
     * @return
     *     The <b>Style</b> JSON property
     */
    @JsProperty(name = "Style")
    public native JSIStyle getStyle();

    /**
     * Setter for <b>Style</b>
     * 
     * @param StyleParam
     *      <b>Style</b> to set.
     */
    @JsProperty(name = "Style")
    public final native void setStyle(JSIStyle StyleParam);

}
