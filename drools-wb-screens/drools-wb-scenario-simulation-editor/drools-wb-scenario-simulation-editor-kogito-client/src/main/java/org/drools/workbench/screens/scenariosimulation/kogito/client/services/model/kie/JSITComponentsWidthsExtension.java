
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.kie;

import java.util.List;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>TComponentsWidthsExtension</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITComponentsWidthsExtension {

    @JsOverlay
    public final static String TYPE = "KIE.TComponentsWidthsExtension";

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
        toReturn.setNamespaceURI("http://www.drools.org/kie/dmn/1.2");
        toReturn.setLocalPart("tComponentsWidthsExtension");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.drools.org/kie/dmn/1.2}");
        toReturn.setString("{http://www.drools.org/kie/dmn/1.2}tComponentsWidthsExtension");
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
     * READ-ONLY getter for <b>componentWidths</b> as a {@link List}
     * 
     * @return
     *     The <b>componentWidths</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITComponentWidths> getComponentWidths() {
        if (getNativeComponentWidths() == null) {
            setNativeComponentWidths(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeComponentWidths()));
    }

    /**
     * Appends the specified element to the end of <b>componentWidths</b>
     *
     * @param element to be appended to <b>componentWidths</b>
     */
    @JsOverlay
    public final<D extends JSITComponentWidths>void addComponentWidths(final D element) {
        if (getNativeComponentWidths() == null) {
            setNativeComponentWidths(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeComponentWidths(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>componentWidths</b>
     *
     * @param elements to be appended to <b>componentWidths</b>
     */
    @JsOverlay
    public final<D extends JSITComponentWidths>void addAllComponentWidths(D... elements) {
        if (getNativeComponentWidths() == null) {
            setNativeComponentWidths(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeComponentWidths(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>componentWidths</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeComponentWidths(final int index) {
        JsUtils.remove(getNativeComponentWidths(), index);
    }

    /**
     * Native getter for <b>componentWidths</b>
     *
     * @return
     *     The <b>componentWidths</b> JSON property
     */
    @JsProperty(name = "componentWidths")
    public native JsArrayLike<JSITComponentWidths> getNativeComponentWidths();

    /**
     * Setter for <b>componentWidths</b> as a {@link List}
     *
     * @param componentWidthsParam
     *     The <b>componentWidths</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setComponentWidths(List<JSITComponentWidths> componentWidthsParam) {
        setNativeComponentWidths(JsUtils.toJsArrayLike(componentWidthsParam));
    }

    /**
     * Setter for <b>componentWidths</b>
     * 
     * @param componentWidthsParam
     *      <b>componentWidths</b> to set.
     */
    @JsProperty(name = "componentWidths")
    public final native void setNativeComponentWidths(JsArrayLike<JSITComponentWidths> componentWidthsParam);

}
