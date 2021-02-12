
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>TLiteralExpression</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITLiteralExpression
        extends JSITExpression
{

    @JsOverlay
    public final static String TYPE = "DMN12.TLiteralExpression";

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
        toReturn.setLocalPart("tLiteralExpression");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tLiteralExpression");
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
     * Native getter for <b>text</b>
     *
     * @return
     *     The <b>text</b> JSON property
     */
    @JsProperty(name = "text")
    public native String getText();

    /**
     * Setter for <b>text</b>
     *
     * @param textParam
     *      <b>text</b> to set.
     */
    @JsProperty(name = "text")
    public final native void setText(String textParam);

    /**
     * Native getter for <b>importedValues</b>
     *
     * @return
     *     The <b>importedValues</b> JSON property
     */
    @JsProperty(name = "importedValues")
    public native JSITImportedValues getImportedValues();

    /**
     * Setter for <b>importedValues</b>
     * 
     * @param importedValuesParam
     *      <b>importedValues</b> to set.
     */
    @JsProperty(name = "importedValues")
    public final native void setImportedValues(JSITImportedValues importedValuesParam);

    /**
     * Native getter for <b>expressionLanguage</b>
     * 
     * @return
     *     The <b>expressionLanguage</b> JSON property
     */
    @JsProperty(name = "expressionLanguage")
    public native String getExpressionLanguage();

    /**
     * Setter for <b>expressionLanguage</b>
     * 
     * @param expressionLanguageParam
     *      <b>expressionLanguage</b> to set.
     */
    @JsProperty(name = "expressionLanguage")
    public final native void setExpressionLanguage(String expressionLanguageParam);

}
