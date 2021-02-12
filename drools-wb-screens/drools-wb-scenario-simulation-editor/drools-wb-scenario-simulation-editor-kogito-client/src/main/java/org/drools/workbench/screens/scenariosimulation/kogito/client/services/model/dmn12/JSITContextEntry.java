
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>TContextEntry</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITContextEntry
        extends JSITDMNElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TContextEntry";

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
        toReturn.setLocalPart("tContextEntry");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tContextEntry");
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
     * Native getter for <b>variable</b>
     * 
     * @return
     *     The <b>variable</b> JSON property
     */
    @JsProperty(name = "variable")
    public native JSITInformationItem getVariable();

    /**
     * Setter for <b>variable</b>
     * 
     * @param variableParam
     *      <b>variable</b> to set.
     */
    @JsProperty(name = "variable")
    public final native void setVariable(JSITInformationItem variableParam);

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
