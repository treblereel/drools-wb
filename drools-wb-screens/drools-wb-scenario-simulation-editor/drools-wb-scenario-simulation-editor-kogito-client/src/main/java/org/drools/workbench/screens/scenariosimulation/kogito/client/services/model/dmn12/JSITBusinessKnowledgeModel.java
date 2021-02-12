
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
 * JSInterop adapter for <code>TBusinessKnowledgeModel</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITBusinessKnowledgeModel
        extends JSITInvocable
{

    @JsOverlay
    public final static String TYPE = "DMN12.TBusinessKnowledgeModel";

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
        toReturn.setLocalPart("tBusinessKnowledgeModel");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tBusinessKnowledgeModel");
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
     * Native getter for <b>encapsulatedLogic</b>
     * 
     * @return
     *     The <b>encapsulatedLogic</b> JSON property
     */
    @JsProperty(name = "encapsulatedLogic")
    public native JSITFunctionDefinition getEncapsulatedLogic();

    /**
     * Setter for <b>encapsulatedLogic</b>
     * 
     * @param encapsulatedLogicParam
     *      <b>encapsulatedLogic</b> to set.
     */
    @JsProperty(name = "encapsulatedLogic")
    public final native void setEncapsulatedLogic(JSITFunctionDefinition encapsulatedLogicParam);

    /**
     * READ-ONLY getter for <b>knowledgeRequirement</b> as a {@link List}
     * 
     * @return
     *     The <b>knowledgeRequirement</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITKnowledgeRequirement> getKnowledgeRequirement() {
        if (getNativeKnowledgeRequirement() == null) {
            setNativeKnowledgeRequirement(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeKnowledgeRequirement()));
    }

    /**
     * Appends the specified element to the end of <b>knowledgeRequirement</b>
     * 
     * @param element to be appended to <b>knowledgeRequirement</b>
     */
    @JsOverlay
    public final<D extends JSITKnowledgeRequirement>void addKnowledgeRequirement(final D element) {
        if (getNativeKnowledgeRequirement() == null) {
            setNativeKnowledgeRequirement(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeKnowledgeRequirement(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>knowledgeRequirement</b>
     * 
     * @param elements to be appended to <b>knowledgeRequirement</b>
     */
    @JsOverlay
    public final<D extends JSITKnowledgeRequirement>void addAllKnowledgeRequirement(D... elements) {
        if (getNativeKnowledgeRequirement() == null) {
            setNativeKnowledgeRequirement(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeKnowledgeRequirement(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>knowledgeRequirement</b>
     * 
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeKnowledgeRequirement(final int index) {
        JsUtils.remove(getNativeKnowledgeRequirement(), index);
    }

    /**
     * Native getter for <b>knowledgeRequirement</b>
     * 
     * @return
     *     The <b>knowledgeRequirement</b> JSON property
     */
    @JsProperty(name = "knowledgeRequirement")
    public native JsArrayLike<JSITKnowledgeRequirement> getNativeKnowledgeRequirement();

    /**
     * Setter for <b>knowledgeRequirement</b> as a {@link List}
     * 
     * @param knowledgeRequirementParam
     *     The <b>knowledgeRequirement</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setKnowledgeRequirement(List<JSITKnowledgeRequirement> knowledgeRequirementParam) {
        setNativeKnowledgeRequirement(JsUtils.toJsArrayLike(knowledgeRequirementParam));
    }

    /**
     * Setter for <b>knowledgeRequirement</b>
     * 
     * @param knowledgeRequirementParam
     *      <b>knowledgeRequirement</b> to set.
     */
    @JsProperty(name = "knowledgeRequirement")
    public final native void setNativeKnowledgeRequirement(JsArrayLike<JSITKnowledgeRequirement> knowledgeRequirementParam);

    /**
     * READ-ONLY getter for <b>authorityRequirement</b> as a {@link List}
     * 
     * @return
     *     The <b>authorityRequirement</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITAuthorityRequirement> getAuthorityRequirement() {
        if (getNativeAuthorityRequirement() == null) {
            setNativeAuthorityRequirement(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeAuthorityRequirement()));
    }

    /**
     * Appends the specified element to the end of <b>authorityRequirement</b>
     * 
     * @param element to be appended to <b>authorityRequirement</b>
     */
    @JsOverlay
    public final<D extends JSITAuthorityRequirement>void addAuthorityRequirement(final D element) {
        if (getNativeAuthorityRequirement() == null) {
            setNativeAuthorityRequirement(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeAuthorityRequirement(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>authorityRequirement</b>
     * 
     * @param elements to be appended to <b>authorityRequirement</b>
     */
    @JsOverlay
    public final<D extends JSITAuthorityRequirement>void addAllAuthorityRequirement(D... elements) {
        if (getNativeAuthorityRequirement() == null) {
            setNativeAuthorityRequirement(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeAuthorityRequirement(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>authorityRequirement</b>
     * 
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeAuthorityRequirement(final int index) {
        JsUtils.remove(getNativeAuthorityRequirement(), index);
    }

    /**
     * Native getter for <b>authorityRequirement</b>
     * 
     * @return
     *     The <b>authorityRequirement</b> JSON property
     */
    @JsProperty(name = "authorityRequirement")
    public native JsArrayLike<JSITAuthorityRequirement> getNativeAuthorityRequirement();

    /**
     * Setter for <b>authorityRequirement</b> as a {@link List}
     * 
     * @param authorityRequirementParam
     *     The <b>authorityRequirement</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setAuthorityRequirement(List<JSITAuthorityRequirement> authorityRequirementParam) {
        setNativeAuthorityRequirement(JsUtils.toJsArrayLike(authorityRequirementParam));
    }

    /**
     * Setter for <b>authorityRequirement</b>
     * 
     * @param authorityRequirementParam
     *      <b>authorityRequirement</b> to set.
     */
    @JsProperty(name = "authorityRequirement")
    public final native void setNativeAuthorityRequirement(JsArrayLike<JSITAuthorityRequirement> authorityRequirementParam);

}
