
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmn12;

import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>TDMNElement</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITDMNElement {

    @JsOverlay
    public final static String TYPE = "DMN12.TDMNElement";

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
        toReturn.setLocalPart("tDMNElement");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tDMNElement");
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
     * Native getter for <b>description</b>
     * 
     * @return
     *     The <b>description</b> JSON property
     */
    @JsProperty(name = "description")
    public native String getDescription();

    /**
     * Setter for <b>description</b>
     * 
     * @param descriptionParam
     *      <b>description</b> to set.
     */
    @JsProperty(name = "description")
    public final native void setDescription(String descriptionParam);

    /**
     * Native getter for <b>extensionElements</b>
     * 
     * @return
     *     The <b>extensionElements</b> JSON property
     */
    @JsProperty(name = "extensionElements")
    public native JSITDMNElement.JSIExtensionElements getExtensionElements();

    /**
     * Setter for <b>extensionElements</b>
     * 
     * @param extensionElementsParam
     *      <b>extensionElements</b> to set.
     */
    @JsProperty(name = "extensionElements")
    public final native void setExtensionElements(JSITDMNElement.JSIExtensionElements extensionElementsParam);

    /**
     * Native getter for <b>id</b>
     * 
     * @return
     *     The <b>id</b> JSON property
     */
    @JsProperty(name = "id")
    public native String getId();

    /**
     * Setter for <b>id</b>
     * 
     * @param idParam
     *      <b>id</b> to set.
     */
    @JsProperty(name = "id")
    public final native void setId(String idParam);

    /**
     * Native getter for <b>label</b>
     * 
     * @return
     *     The <b>label</b> JSON property
     */
    @JsProperty(name = "label")
    public native String getLabel();

    /**
     * Setter for <b>label</b>
     * 
     * @param labelParam
     *      <b>label</b> to set.
     */
    @JsProperty(name = "label")
    public final native void setLabel(String labelParam);

    /**
     * Native getter for <b>otherAttributes</b>
     * 
     * @return
     *     The <b>otherAttributes</b> JSON property
     */
    @JsProperty(name = "otherAttributes")
    public native Map<QName, String> getOtherAttributes();

    /**
     * Setter for <b>otherAttributes</b>
     * 
     * @param otherAttributesParam
     *      <b>otherAttributes</b> to set.
     */
    @JsProperty(name = "otherAttributes")
    public final native void setOtherAttributes(Map<QName, String> otherAttributesParam);

    @JsOverlay
    public static Map<QName, String> getOtherAttributesMap(final JSITDMNElement instance) {
        return JsUtils.toAttributesMap(instance.getOtherAttributes());
    }


    /**
     * JSInterop adapter for <code>ExtensionElements</code>
     * 
     */
    @JsType(namespace = "Object", name = "ExtensionElements", isNative = true)
    public static class JSIExtensionElements {

        @JsOverlay
        public final static String TYPE = "DMN12.TDMNElement.ExtensionElements";

        @JsOverlay
        public static boolean instanceOf(final Object instance) {
            return TYPE.equals(JsUtils.getTypeName(instance));
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
         * READ-ONLY getter for <b>any</b> as a {@link List}
         * 
         * @return
         *     The <b>any</b> mapped as a {@link List}
         */
        @JsOverlay
        public final List<Object> getAny() {
            if (getNativeAny() == null) {
                setNativeAny(JsUtils.getNativeArray());
            }
            return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeAny()));
        }

        /**
         * Appends the specified element to the end of <b>any</b>
         * 
         * @param element to be appended to <b>any</b>
         */
        @JsOverlay
        public final<D extends Object >void addAny(final D element) {
            if (getNativeAny() == null) {
                setNativeAny(JsUtils.getNativeArray());
            }
            JsUtils.add(getNativeAny(), element);
        }

        /**
         * Iterates over the specified collection of elements, and adds each element returned by the iterator
         * to the end of <b>any</b>
         * 
         * @param elements to be appended to <b>any</b>
         */
        @JsOverlay
        public final<D extends Object >void addAllAny(D... elements) {
            if (getNativeAny() == null) {
                setNativeAny(JsUtils.getNativeArray());
            }
            JsUtils.addAll(getNativeAny(), elements);
        }

        /**
         * Removes the element at the specified position in the <b>any</b>
         * 
         * @param index of the element to be removed
         */
        @JsOverlay
        public final void removeAny(final int index) {
            JsUtils.remove(getNativeAny(), index);
        }

        /**
         * Native getter for <b>any</b>
         * 
         * @return
         *     The <b>any</b> JSON property
         */
        @JsProperty(name = "any")
        public native JsArrayLike<Object> getNativeAny();

        /**
         * Setter for <b>any</b> as a {@link List}
         * 
         * @param anyParam
         *     The <b>any</b> mapped as a {@link List}
         */
        @JsOverlay
        public final void setAny(List<Object> anyParam) {
            setNativeAny(JsUtils.toJsArrayLike(anyParam));
        }

        /**
         * Setter for <b>any</b>
         * 
         * @param anyParam
         *      <b>any</b> to set.
         */
        @JsProperty(name = "any")
        public final native void setNativeAny(JsArrayLike<Object> anyParam);

    }

}
