
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
 * JSInterop adapter for <code>TList</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITList
        extends JSITExpression
{

    @JsOverlay
    public final static String TYPE = "DMN12.TList";

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
        toReturn.setLocalPart("tList");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tList");
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
     * READ-ONLY getter for <b>expression</b> as a {@link List}
     * 
     * @return
     *     The <b>expression</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITExpression> getExpression() {
        if (getNativeExpression() == null) {
            setNativeExpression(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeExpression()));
    }

    /**
     * Appends the specified element to the end of <b>expression</b>
     * 
     * @param element to be appended to <b>expression</b>
     */
    @JsOverlay
    public final<D extends JSITExpression>void addExpression(final D element) {
        if (getNativeExpression() == null) {
            setNativeExpression(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeExpression(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>expression</b>
     * 
     * @param elements to be appended to <b>expression</b>
     */
    @JsOverlay
    public final<D extends JSITExpression>void addAllExpression(D... elements) {
        if (getNativeExpression() == null) {
            setNativeExpression(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeExpression(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>expression</b>
     * 
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeExpression(final int index) {
        JsUtils.remove(getNativeExpression(), index);
    }

    /**
     * Native getter for <b>expression</b>
     * 
     * @return
     *     The <b>expression</b> JSON property
     */
    @JsProperty(name = "expression")
    public native JsArrayLike<JSITExpression> getNativeExpression();

    /**
     * Setter for <b>expression</b> as a {@link List}
     * 
     * @param expressionParam
     *     The <b>expression</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setExpression(List<JSITExpression> expressionParam) {
        setNativeExpression(JsUtils.toJsArrayLike(expressionParam));
    }

    /**
     * Setter for <b>expression</b>
     * 
     * @param expressionParam
     *      <b>expression</b> to set.
     */
    @JsProperty(name = "expression")
    public final native void setNativeExpression(JsArrayLike<JSITExpression> expressionParam);

}
