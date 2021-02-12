
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
 * JSInterop adapter for <code>TKnowledgeSource</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITKnowledgeSource
        extends JSITDRGElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TKnowledgeSource";

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
        toReturn.setLocalPart("tKnowledgeSource");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tKnowledgeSource");
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

    /**
     * Native getter for <b>type</b>
     * 
     * @return
     *     The <b>type</b> JSON property
     */
    @JsProperty(name = "type")
    public native String getType();

    /**
     * Setter for <b>type</b>
     * 
     * @param typeParam
     *      <b>type</b> to set.
     */
    @JsProperty(name = "type")
    public final native void setType(String typeParam);

    /**
     * Native getter for <b>owner</b>
     * 
     * @return
     *     The <b>owner</b> JSON property
     */
    @JsProperty(name = "owner")
    public native JSITDMNElementReference getOwner();

    /**
     * Setter for <b>owner</b>
     * 
     * @param ownerParam
     *      <b>owner</b> to set.
     */
    @JsProperty(name = "owner")
    public final native void setOwner(JSITDMNElementReference ownerParam);

    /**
     * Native getter for <b>locationURI</b>
     * 
     * @return
     *     The <b>locationURI</b> JSON property
     */
    @JsProperty(name = "locationURI")
    public native String getLocationURI();

    /**
     * Setter for <b>locationURI</b>
     * 
     * @param locationURIParam
     *      <b>locationURI</b> to set.
     */
    @JsProperty(name = "locationURI")
    public final native void setLocationURI(String locationURIParam);

}
