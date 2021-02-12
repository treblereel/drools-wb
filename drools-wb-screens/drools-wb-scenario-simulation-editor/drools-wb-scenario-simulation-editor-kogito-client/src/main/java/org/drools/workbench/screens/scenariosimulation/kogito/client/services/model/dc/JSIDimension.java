
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dc;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>Dimension</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSIDimension {

    @JsOverlay
    public final static String TYPE = "DC.Dimension";

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
        toReturn.setLocalPart("Dimension");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/DC/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/DC/}Dimension");
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
