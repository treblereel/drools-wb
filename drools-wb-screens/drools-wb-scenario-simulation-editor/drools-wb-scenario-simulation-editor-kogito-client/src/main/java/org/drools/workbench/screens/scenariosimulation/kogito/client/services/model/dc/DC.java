
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dc;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * JSInterop container for <code>org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dc</code>
 * 
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class DC {


    /**
     * Native getter for <b>name</b>
     * 
     * @return
     *     The <b>name</b> JSON property
     */
    @JsProperty(name = "name")
    public native String getName();

    /**
     * Native getter for <b>Bounds</b>
     * 
     * @return
     *     The <b>Bounds</b> JSON property
     */
    @JsProperty(name = "Bounds")
    public native JSIBounds getBounds();

    /**
     * Setter for <b>Bounds</b>
     * 
     * @param BoundsParam
     *      <b>Bounds</b> to set.
     */
    @JsProperty(name = "Bounds")
    public final native void setBounds(JSIBounds BoundsParam);

    /**
     * Native getter for <b>Color</b>
     * 
     * @return
     *     The <b>Color</b> JSON property
     */
    @JsProperty(name = "Color")
    public native JSIColor getColor();

    /**
     * Setter for <b>Color</b>
     * 
     * @param ColorParam
     *      <b>Color</b> to set.
     */
    @JsProperty(name = "Color")
    public final native void setColor(JSIColor ColorParam);

    /**
     * Native getter for <b>Dimension</b>
     * 
     * @return
     *     The <b>Dimension</b> JSON property
     */
    @JsProperty(name = "Dimension")
    public native JSIDimension getDimension();

    /**
     * Setter for <b>Dimension</b>
     * 
     * @param DimensionParam
     *      <b>Dimension</b> to set.
     */
    @JsProperty(name = "Dimension")
    public final native void setDimension(JSIDimension DimensionParam);

    /**
     * Native getter for <b>Point</b>
     * 
     * @return
     *     The <b>Point</b> JSON property
     */
    @JsProperty(name = "Point")
    public native JSIPoint getPoint();

    /**
     * Setter for <b>Point</b>
     * 
     * @param PointParam
     *      <b>Point</b> to set.
     */
    @JsProperty(name = "Point")
    public final native void setPoint(JSIPoint PointParam);

}
