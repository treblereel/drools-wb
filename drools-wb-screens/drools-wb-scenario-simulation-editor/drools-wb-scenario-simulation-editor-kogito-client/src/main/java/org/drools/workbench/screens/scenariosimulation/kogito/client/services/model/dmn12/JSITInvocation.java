
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
 * JSInterop adapter for <code>TInvocation</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITInvocation
        extends JSITExpression
{

    @JsOverlay
    public final static String TYPE = "DMN12.TInvocation";

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
        toReturn.setLocalPart("tInvocation");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tInvocation");
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
     * READ-ONLY getter for <b>binding</b> as a {@link List}
     * 
     * @return
     *     The <b>binding</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITBinding> getBinding() {
        if (getNativeBinding() == null) {
            setNativeBinding(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeBinding()));
    }

    /**
     * Appends the specified element to the end of <b>binding</b>
     * 
     * @param element to be appended to <b>binding</b>
     */
    @JsOverlay
    public final<D extends JSITBinding>void addBinding(final D element) {
        if (getNativeBinding() == null) {
            setNativeBinding(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeBinding(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>binding</b>
     * 
     * @param elements to be appended to <b>binding</b>
     */
    @JsOverlay
    public final<D extends JSITBinding>void addAllBinding(D... elements) {
        if (getNativeBinding() == null) {
            setNativeBinding(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeBinding(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>binding</b>
     * 
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeBinding(final int index) {
        JsUtils.remove(getNativeBinding(), index);
    }

    /**
     * Native getter for <b>binding</b>
     * 
     * @return
     *     The <b>binding</b> JSON property
     */
    @JsProperty(name = "binding")
    public native JsArrayLike<JSITBinding> getNativeBinding();

    /**
     * Setter for <b>binding</b> as a {@link List}
     * 
     * @param bindingParam
     *     The <b>binding</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setBinding(List<JSITBinding> bindingParam) {
        setNativeBinding(JsUtils.toJsArrayLike(bindingParam));
    }

    /**
     * Setter for <b>binding</b>
     * 
     * @param bindingParam
     *      <b>binding</b> to set.
     */
    @JsProperty(name = "binding")
    public final native void setNativeBinding(JsArrayLike<JSITBinding> bindingParam);

}
