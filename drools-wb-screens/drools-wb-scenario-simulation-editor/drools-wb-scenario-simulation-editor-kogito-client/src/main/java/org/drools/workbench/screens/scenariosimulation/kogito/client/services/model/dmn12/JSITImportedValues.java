
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>TImportedValues</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITImportedValues
        extends JSITImport
{

    @JsOverlay
    public final static String TYPE = "DMN12.TImportedValues";

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
        toReturn.setLocalPart("tImportedValues");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tImportedValues");
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
     * Native getter for <b>importedElement</b>
     * 
     * @return
     *     The <b>importedElement</b> JSON property
     */
    @JsProperty(name = "importedElement")
    public native String getImportedElement();

    /**
     * Setter for <b>importedElement</b>
     * 
     * @param importedElementParam
     *      <b>importedElement</b> to set.
     */
    @JsProperty(name = "importedElement")
    public final native void setImportedElement(String importedElementParam);

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
