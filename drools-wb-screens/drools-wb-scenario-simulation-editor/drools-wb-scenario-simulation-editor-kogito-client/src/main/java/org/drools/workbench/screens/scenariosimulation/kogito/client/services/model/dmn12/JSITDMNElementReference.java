
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>TDMNElementReference</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITDMNElementReference {

    @JsOverlay
    public final static String TYPE = "DMN12.TDMNElementReference";

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
        toReturn.setNamespaceURI("http://www.omg.org/spec/DMN/20180521/MODEL/");
        toReturn.setLocalPart("tDMNElementReference");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tDMNElementReference");
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
     * Native getter for <b>href</b>
     * 
     * @return
     *     The <b>href</b> JSON property
     */
    @JsProperty(name = "href")
    public native String getHref();

    /**
     * Setter for <b>href</b>
     * 
     * @param hrefParam
     *      <b>href</b> to set.
     */
    @JsProperty(name = "href")
    public final native void setHref(String hrefParam);

}
