
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dc;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>Point</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSIPoint {

    @JsOverlay
    public final static String TYPE = "DC.Point";

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
        toReturn.setLocalPart("Point");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/DC/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/DC/}Point");
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

}
