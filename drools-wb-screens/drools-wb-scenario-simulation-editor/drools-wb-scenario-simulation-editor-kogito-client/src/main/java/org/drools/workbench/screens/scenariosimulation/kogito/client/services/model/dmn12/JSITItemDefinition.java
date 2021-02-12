
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
 * JSInterop adapter for <code>TItemDefinition</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITItemDefinition
        extends JSITNamedElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TItemDefinition";

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
        toReturn.setLocalPart("tItemDefinition");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tItemDefinition");
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

    /**
     * Native getter for <b>allowedValues</b>
     *
     * @return
     *     The <b>allowedValues</b> JSON property
     */
    @JsProperty(name = "allowedValues")
    public native JSITUnaryTests getAllowedValues();

    /**
     * Setter for <b>allowedValues</b>
     * 
     * @param allowedValuesParam
     *      <b>allowedValues</b> to set.
     */
    @JsProperty(name = "allowedValues")
    public final native void setAllowedValues(JSITUnaryTests allowedValuesParam);

    /**
     * READ-ONLY getter for <b>itemComponent</b> as a {@link List}
     * 
     * @return
     *     The <b>itemComponent</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITItemDefinition> getItemComponent() {
        if (getNativeItemComponent() == null) {
            setNativeItemComponent(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeItemComponent()));
    }

    /**
     * Appends the specified element to the end of <b>itemComponent</b>
     * 
     * @param element to be appended to <b>itemComponent</b>
     */
    @JsOverlay
    public final<D extends JSITItemDefinition>void addItemComponent(final D element) {
        if (getNativeItemComponent() == null) {
            setNativeItemComponent(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeItemComponent(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>itemComponent</b>
     * 
     * @param elements to be appended to <b>itemComponent</b>
     */
    @JsOverlay
    public final<D extends JSITItemDefinition>void addAllItemComponent(D... elements) {
        if (getNativeItemComponent() == null) {
            setNativeItemComponent(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeItemComponent(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>itemComponent</b>
     * 
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeItemComponent(final int index) {
        JsUtils.remove(getNativeItemComponent(), index);
    }

    /**
     * Native getter for <b>itemComponent</b>
     * 
     * @return
     *     The <b>itemComponent</b> JSON property
     */
    @JsProperty(name = "itemComponent")
    public native JsArrayLike<JSITItemDefinition> getNativeItemComponent();

    /**
     * Setter for <b>itemComponent</b> as a {@link List}
     * 
     * @param itemComponentParam
     *     The <b>itemComponent</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setItemComponent(List<JSITItemDefinition> itemComponentParam) {
        setNativeItemComponent(JsUtils.toJsArrayLike(itemComponentParam));
    }

    /**
     * Setter for <b>itemComponent</b>
     * 
     * @param itemComponentParam
     *      <b>itemComponent</b> to set.
     */
    @JsProperty(name = "itemComponent")
    public final native void setNativeItemComponent(JsArrayLike<JSITItemDefinition> itemComponentParam);

    /**
     * Native getter for <b>typeLanguage</b>
     * 
     * @return
     *     The <b>typeLanguage</b> JSON property
     */
    @JsProperty(name = "typeLanguage")
    public native String getTypeLanguage();

    /**
     * Setter for <b>typeLanguage</b>
     * 
     * @param typeLanguageParam
     *      <b>typeLanguage</b> to set.
     */
    @JsProperty(name = "typeLanguage")
    public final native void setTypeLanguage(String typeLanguageParam);

    /**
     * Native getter for <b>isCollection</b>
     * 
     * @return
     *     The <b>isCollection</b> JSON property
     */
    @JsProperty(name = "isCollection")
    public native boolean getIsCollection();

    /**
     * Setter for <b>isCollection</b>
     * 
     * @param isCollectionParam
     *      <b>isCollection</b> to set.
     */
    @JsProperty(name = "isCollection")
    public final native void setIsCollection(boolean isCollectionParam);

}
