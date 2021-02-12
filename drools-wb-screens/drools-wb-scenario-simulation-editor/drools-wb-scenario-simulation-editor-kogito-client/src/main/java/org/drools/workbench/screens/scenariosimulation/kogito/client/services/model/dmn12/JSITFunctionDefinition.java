
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmn12;

import java.util.List;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>TFunctionDefinition</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITFunctionDefinition
        extends JSITExpression
{

    @JsOverlay
    public final static String TYPE = "DMN12.TFunctionDefinition";

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
        toReturn.setLocalPart("tFunctionDefinition");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tFunctionDefinition");
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
     * READ-ONLY getter for <b>formalParameter</b> as a {@link List}
     * 
     * @return
     *     The <b>formalParameter</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITInformationItem> getFormalParameter() {
        if (getNativeFormalParameter() == null) {
            setNativeFormalParameter(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeFormalParameter()));
    }

    /**
     * Appends the specified element to the end of <b>formalParameter</b>
     * 
     * @param element to be appended to <b>formalParameter</b>
     */
    @JsOverlay
    public final<D extends JSITInformationItem>void addFormalParameter(final D element) {
        if (getNativeFormalParameter() == null) {
            setNativeFormalParameter(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeFormalParameter(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>formalParameter</b>
     * 
     * @param elements to be appended to <b>formalParameter</b>
     */
    @JsOverlay
    public final<D extends JSITInformationItem>void addAllFormalParameter(D... elements) {
        if (getNativeFormalParameter() == null) {
            setNativeFormalParameter(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeFormalParameter(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>formalParameter</b>
     * 
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeFormalParameter(final int index) {
        JsUtils.remove(getNativeFormalParameter(), index);
    }

    /**
     * Native getter for <b>formalParameter</b>
     * 
     * @return
     *     The <b>formalParameter</b> JSON property
     */
    @JsProperty(name = "formalParameter")
    public native JsArrayLike<JSITInformationItem> getNativeFormalParameter();

    /**
     * Setter for <b>formalParameter</b> as a {@link List}
     * 
     * @param formalParameterParam
     *     The <b>formalParameter</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setFormalParameter(List<JSITInformationItem> formalParameterParam) {
        setNativeFormalParameter(JsUtils.toJsArrayLike(formalParameterParam));
    }

    /**
     * Setter for <b>formalParameter</b>
     * 
     * @param formalParameterParam
     *      <b>formalParameter</b> to set.
     */
    @JsProperty(name = "formalParameter")
    public final native void setNativeFormalParameter(JsArrayLike<JSITInformationItem> formalParameterParam);

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

    /**
     * Native getter for <b>kind</b>
     * 
     * @return
     *     The <b>kind</b> JSON property
     */
    @JsProperty(name = "kind")
    public native JSITFunctionKind getKind();

    /**
     * Setter for <b>kind</b>
     * 
     * @param kindParam
     *      <b>kind</b> to set.
     */
    @JsProperty(name = "kind")
    public final native void setKind(JSITFunctionKind kindParam);

}
