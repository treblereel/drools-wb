
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dc;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>Bounds</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSIBounds {

    @JsOverlay
    public final static String TYPE = "DC.Bounds";

    @JsOverlay
    public static boolean instanceOf(final Object instance) {
        return TYPE.equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for specific <code>JSIName</code>
     * 
     * @return
     *     Getter for specific <code>JSIName</code>
     */
    @JsOverlay
    public static JSIName getJSIName() {
        JSIName toReturn = new JSIName();
        toReturn.setNamespaceURI("http://www.omg.org/spec/DMN/20180521/DC/");
        toReturn.setLocalPart("Bounds");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/DC/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/DC/}Bounds");
        return toReturn;
    }

    /**
     * Native getter for <b>TYPE_NAME</b>
     * 
     * @return
     *     The <b>TYPE_NAME</b> JSON property
     */
    @JsProperty(name = "TYPE_NAME")
    public native String getTYPE_NAME();

    /**
     * Native getter for <b>x</b>
     * 
     * @return
     *     The <b>x</b> JSON property
     */
    @JsProperty(name = "x")
    public native double getX();

    /**
     * Setter for <b>x</b>
     * 
     * @param xParam
     *      <b>x</b> to set.
     */
    @JsProperty(name = "x")
    public final native void setX(double xParam);

    /**
     * Native getter for <b>y</b>
     * 
     * @return
     *     The <b>y</b> JSON property
     */
    @JsProperty(name = "y")
    public native double getY();

    /**
     * Setter for <b>y</b>
     * 
     * @param yParam
     *      <b>y</b> to set.
     */
    @JsProperty(name = "y")
    public final native void setY(double yParam);

    /**
     * Native getter for <b>width</b>
     * 
     * @return
     *     The <b>width</b> JSON property
     */
    @JsProperty(name = "width")
    public native double getWidth();

    /**
     * Setter for <b>width</b>
     * 
     * @param widthParam
     *      <b>width</b> to set.
     */
    @JsProperty(name = "width")
    public final native void setWidth(double widthParam);

    /**
     * Native getter for <b>height</b>
     * 
     * @return
     *     The <b>height</b> JSON property
     */
    @JsProperty(name = "height")
    public native double getHeight();

    /**
     * Setter for <b>height</b>
     * 
     * @param heightParam
     *      <b>height</b> to set.
     */
    @JsProperty(name = "height")
    public final native void setHeight(double heightParam);

}
