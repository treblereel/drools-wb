
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.kie;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * JSInterop container for <code>org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.kie</code>
 * 
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class KIE {


    /**
     * Native getter for <b>name</b>
     * 
     * @return
     *     The <b>name</b> JSON property
     */
    @JsProperty(name = "name")
    public native String getName();

    /**
     * Native getter for <b>attachment</b>
     * 
     * @return
     *     The <b>attachment</b> JSON property
     */
    @JsProperty(name = "attachment")
    public native JSITAttachment getAttachment();

    /**
     * Setter for <b>attachment</b>
     *
     * @param attachmentParam
     *      <b>attachment</b> to set.
     */
    @JsProperty(name = "attachment")
    public final native void setAttachment(JSITAttachment attachmentParam);

    /**
     * Native getter for <b>ComponentWidths</b>
     *
     * @return
     *     The <b>ComponentWidths</b> JSON property
     */
    @JsProperty(name = "ComponentWidths")
    public native JSITComponentWidths getComponentWidths();

    /**
     * Setter for <b>ComponentWidths</b>
     *
     * @param ComponentWidthsParam
     *      <b>ComponentWidths</b> to set.
     */
    @JsProperty(name = "ComponentWidths")
    public final native void setComponentWidths(JSITComponentWidths ComponentWidthsParam);

    /**
     * Native getter for <b>ComponentsWidthsExtension</b>
     *
     * @return
     *     The <b>ComponentsWidthsExtension</b> JSON property
     */
    @JsProperty(name = "ComponentsWidthsExtension")
    public native JSITComponentsWidthsExtension getComponentsWidthsExtension();

    /**
     * Setter for <b>ComponentsWidthsExtension</b>
     * 
     * @param ComponentsWidthsExtensionParam
     *      <b>ComponentsWidthsExtension</b> to set.
     */
    @JsProperty(name = "ComponentsWidthsExtension")
    public final native void setComponentsWidthsExtension(JSITComponentsWidthsExtension ComponentsWidthsExtensionParam);

}
