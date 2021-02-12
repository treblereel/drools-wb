
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>TOutputClause</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITOutputClause
        extends JSITDMNElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TOutputClause";

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
        toReturn.setLocalPart("tOutputClause");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tOutputClause");
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
     * Native getter for <b>outputValues</b>
     * 
     * @return
     *     The <b>outputValues</b> JSON property
     */
    @JsProperty(name = "outputValues")
    public native JSITUnaryTests getOutputValues();

    /**
     * Setter for <b>outputValues</b>
     * 
     * @param outputValuesParam
     *      <b>outputValues</b> to set.
     */
    @JsProperty(name = "outputValues")
    public final native void setOutputValues(JSITUnaryTests outputValuesParam);

    /**
     * Native getter for <b>defaultOutputEntry</b>
     * 
     * @return
     *     The <b>defaultOutputEntry</b> JSON property
     */
    @JsProperty(name = "defaultOutputEntry")
    public native JSITLiteralExpression getDefaultOutputEntry();

    /**
     * Setter for <b>defaultOutputEntry</b>
     * 
     * @param defaultOutputEntryParam
     *      <b>defaultOutputEntry</b> to set.
     */
    @JsProperty(name = "defaultOutputEntry")
    public final native void setDefaultOutputEntry(JSITLiteralExpression defaultOutputEntryParam);

    /**
     * Native getter for <b>name</b>
     * 
     * @return
     *     The <b>name</b> JSON property
     */
    @JsProperty(name = "name")
    public native String getName();

    /**
     * Setter for <b>name</b>
     * 
     * @param nameParam
     *      <b>name</b> to set.
     */
    @JsProperty(name = "name")
    public final native void setName(String nameParam);

    /**
     * Native getter for <b>typeRef</b>
     * 
     * @return
     *     The <b>typeRef</b> JSON property
     */
    @JsProperty(name = "typeRef")
    public native String getTypeRef();

    /**
     * Setter for <b>typeRef</b>
     * 
     * @param typeRefParam
     *      <b>typeRef</b> to set.
     */
    @JsProperty(name = "typeRef")
    public final native void setTypeRef(String typeRefParam);

}
