
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
 * JSInterop adapter for <code>TOrganizationUnit</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITOrganizationUnit
        extends JSITBusinessContextElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TOrganizationUnit";

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
        toReturn.setLocalPart("tOrganizationUnit");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tOrganizationUnit");
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
     * READ-ONLY getter for <b>decisionMade</b> as a {@link List}
     *
     * @return
     *     The <b>decisionMade</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getDecisionMade() {
        if (getNativeDecisionMade() == null) {
            setNativeDecisionMade(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeDecisionMade()));
    }

    /**
     * Appends the specified element to the end of <b>decisionMade</b>
     *
     * @param element to be appended to <b>decisionMade</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addDecisionMade(final D element) {
        if (getNativeDecisionMade() == null) {
            setNativeDecisionMade(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeDecisionMade(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>decisionMade</b>
     *
     * @param elements to be appended to <b>decisionMade</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addAllDecisionMade(D... elements) {
        if (getNativeDecisionMade() == null) {
            setNativeDecisionMade(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeDecisionMade(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>decisionMade</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeDecisionMade(final int index) {
        JsUtils.remove(getNativeDecisionMade(), index);
    }

    /**
     * Native getter for <b>decisionMade</b>
     *
     * @return
     *     The <b>decisionMade</b> JSON property
     */
    @JsProperty(name = "decisionMade")
    public native JsArrayLike<JSITDMNElementReference> getNativeDecisionMade();

    /**
     * Setter for <b>decisionMade</b> as a {@link List}
     *
     * @param decisionMadeParam
     *     The <b>decisionMade</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setDecisionMade(List<JSITDMNElementReference> decisionMadeParam) {
        setNativeDecisionMade(JsUtils.toJsArrayLike(decisionMadeParam));
    }

    /**
     * Setter for <b>decisionMade</b>
     *
     * @param decisionMadeParam
     *      <b>decisionMade</b> to set.
     */
    @JsProperty(name = "decisionMade")
    public final native void setNativeDecisionMade(JsArrayLike<JSITDMNElementReference> decisionMadeParam);

    /**
     * READ-ONLY getter for <b>decisionOwned</b> as a {@link List}
     *
     * @return
     *     The <b>decisionOwned</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getDecisionOwned() {
        if (getNativeDecisionOwned() == null) {
            setNativeDecisionOwned(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeDecisionOwned()));
    }

    /**
     * Appends the specified element to the end of <b>decisionOwned</b>
     *
     * @param element to be appended to <b>decisionOwned</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addDecisionOwned(final D element) {
        if (getNativeDecisionOwned() == null) {
            setNativeDecisionOwned(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeDecisionOwned(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>decisionOwned</b>
     *
     * @param elements to be appended to <b>decisionOwned</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addAllDecisionOwned(D... elements) {
        if (getNativeDecisionOwned() == null) {
            setNativeDecisionOwned(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeDecisionOwned(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>decisionOwned</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeDecisionOwned(final int index) {
        JsUtils.remove(getNativeDecisionOwned(), index);
    }

    /**
     * Native getter for <b>decisionOwned</b>
     *
     * @return
     *     The <b>decisionOwned</b> JSON property
     */
    @JsProperty(name = "decisionOwned")
    public native JsArrayLike<JSITDMNElementReference> getNativeDecisionOwned();

    /**
     * Setter for <b>decisionOwned</b> as a {@link List}
     *
     * @param decisionOwnedParam
     *     The <b>decisionOwned</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setDecisionOwned(List<JSITDMNElementReference> decisionOwnedParam) {
        setNativeDecisionOwned(JsUtils.toJsArrayLike(decisionOwnedParam));
    }

    /**
     * Setter for <b>decisionOwned</b>
     * 
     * @param decisionOwnedParam
     *      <b>decisionOwned</b> to set.
     */
    @JsProperty(name = "decisionOwned")
    public final native void setNativeDecisionOwned(JsArrayLike<JSITDMNElementReference> decisionOwnedParam);

}
