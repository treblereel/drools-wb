
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dc;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>Color</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSIColor {

    @JsOverlay
    public final static String TYPE = "DC.Color";

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
        toReturn.setLocalPart("Color");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/DC/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/DC/}Color");
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
     * Native getter for <b>red</b>
     * 
     * @return
     *     The <b>red</b> JSON property
     */
    @JsProperty(name = "red")
    public native int getRed();

    /**
     * Setter for <b>red</b>
     * 
     * @param redParam
     *      <b>red</b> to set.
     */
    @JsProperty(name = "red")
    public final native void setRed(int redParam);

    /**
     * Native getter for <b>green</b>
     * 
     * @return
     *     The <b>green</b> JSON property
     */
    @JsProperty(name = "green")
    public native int getGreen();

    /**
     * Setter for <b>green</b>
     * 
     * @param greenParam
     *      <b>green</b> to set.
     */
    @JsProperty(name = "green")
    public final native void setGreen(int greenParam);

    /**
     * Native getter for <b>blue</b>
     * 
     * @return
     *     The <b>blue</b> JSON property
     */
    @JsProperty(name = "blue")
    public native int getBlue();

    /**
     * Setter for <b>blue</b>
     * 
     * @param blueParam
     *      <b>blue</b> to set.
     */
    @JsProperty(name = "blue")
    public final native void setBlue(int blueParam);

}
