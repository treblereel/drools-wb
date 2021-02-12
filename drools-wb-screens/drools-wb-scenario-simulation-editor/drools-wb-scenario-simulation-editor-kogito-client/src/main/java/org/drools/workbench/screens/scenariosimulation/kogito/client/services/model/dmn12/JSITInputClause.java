
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>TInputClause</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITInputClause
        extends JSITDMNElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TInputClause";

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
        toReturn.setLocalPart("tInputClause");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tInputClause");
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
     * Native getter for <b>inputExpression</b>
     *
     * @return
     *     The <b>inputExpression</b> JSON property
     */
    @JsProperty(name = "inputExpression")
    public native JSITLiteralExpression getInputExpression();

    /**
     * Setter for <b>inputExpression</b>
     *
     * @param inputExpressionParam
     *      <b>inputExpression</b> to set.
     */
    @JsProperty(name = "inputExpression")
    public final native void setInputExpression(JSITLiteralExpression inputExpressionParam);

    /**
     * Native getter for <b>inputValues</b>
     *
     * @return
     *     The <b>inputValues</b> JSON property
     */
    @JsProperty(name = "inputValues")
    public native JSITUnaryTests getInputValues();

    /**
     * Setter for <b>inputValues</b>
     * 
     * @param inputValuesParam
     *      <b>inputValues</b> to set.
     */
    @JsProperty(name = "inputValues")
    public final native void setInputValues(JSITUnaryTests inputValuesParam);

}
