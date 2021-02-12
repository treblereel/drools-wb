
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>TBinding</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITBinding {

    @JsOverlay
    public final static String TYPE = "DMN12.TBinding";

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
        toReturn.setLocalPart("tBinding");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tBinding");
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
     * Native getter for <b>parameter</b>
     * 
     * @return
     *     The <b>parameter</b> JSON property
     */
    @JsProperty(name = "parameter")
    public native JSITInformationItem getParameter();

    /**
     * Setter for <b>parameter</b>
     * 
     * @param parameterParam
     *      <b>parameter</b> to set.
     */
    @JsProperty(name = "parameter")
    public final native void setParameter(JSITInformationItem parameterParam);

    /**
     * Native getter for <b>expression</b>
     * 
     * @return
     *     The <b>expression</b> JSON property
     */
    @JsProperty(name = "expression")
    public native JSITExpression getExpression();

    /**
     * Setter for <b>expression</b>
     * 
     * @param expressionParam
     *      <b>expression</b> to set.
     */
    @JsProperty(name = "expression")
    public final native void setExpression(JSITExpression expressionParam);

}
