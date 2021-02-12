
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.di;

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
 * JSInterop adapter for <code>Style</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSIStyle {

    @JsOverlay
    public final static String TYPE = "DI.Style";

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
        toReturn.setNamespaceURI("http://www.omg.org/spec/DMN/20180521/DI/");
        toReturn.setLocalPart("Style");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/DI/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/DI/}Style");
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
     * Native getter for <b>extension</b>
     * 
     * @return
     *     The <b>extension</b> JSON property
     */
    @JsProperty(name = "extension")
    public native JSIStyle.JSIExtension getExtension();

    /**
     * Setter for <b>extension</b>
     * 
     * @param extensionParam
     *      <b>extension</b> to set.
     */
    @JsProperty(name = "extension")
    public final native void setExtension(JSIStyle.JSIExtension extensionParam);

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
    public static Map<QName, String> getOtherAttributesMap(final JSIStyle instance) {
        return JsUtils.toAttributesMap(instance.getOtherAttributes());
    }


    /**
     * JSInterop adapter for <code>Extension</code>
     * 
     */
    @JsType(namespace = "Object", name = "Extension", isNative = true)
    public static class JSIExtension {

        @JsOverlay
        public final static String TYPE = "DI.Style.Extension";

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
