
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
 * JSInterop adapter for <code>TPerformanceIndicator</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITPerformanceIndicator
        extends JSITBusinessContextElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TPerformanceIndicator";

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
        toReturn.setLocalPart("tPerformanceIndicator");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tPerformanceIndicator");
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
     * READ-ONLY getter for <b>impactingDecision</b> as a {@link List}
     * 
     * @return
     *     The <b>impactingDecision</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getImpactingDecision() {
        if (getNativeImpactingDecision() == null) {
            setNativeImpactingDecision(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeImpactingDecision()));
    }

    /**
     * Appends the specified element to the end of <b>impactingDecision</b>
     * 
     * @param element to be appended to <b>impactingDecision</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addImpactingDecision(final D element) {
        if (getNativeImpactingDecision() == null) {
            setNativeImpactingDecision(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeImpactingDecision(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>impactingDecision</b>
     * 
     * @param elements to be appended to <b>impactingDecision</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addAllImpactingDecision(D... elements) {
        if (getNativeImpactingDecision() == null) {
            setNativeImpactingDecision(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeImpactingDecision(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>impactingDecision</b>
     * 
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeImpactingDecision(final int index) {
        JsUtils.remove(getNativeImpactingDecision(), index);
    }

    /**
     * Native getter for <b>impactingDecision</b>
     * 
     * @return
     *     The <b>impactingDecision</b> JSON property
     */
    @JsProperty(name = "impactingDecision")
    public native JsArrayLike<JSITDMNElementReference> getNativeImpactingDecision();

    /**
     * Setter for <b>impactingDecision</b> as a {@link List}
     * 
     * @param impactingDecisionParam
     *     The <b>impactingDecision</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setImpactingDecision(List<JSITDMNElementReference> impactingDecisionParam) {
        setNativeImpactingDecision(JsUtils.toJsArrayLike(impactingDecisionParam));
    }

    /**
     * Setter for <b>impactingDecision</b>
     * 
     * @param impactingDecisionParam
     *      <b>impactingDecision</b> to set.
     */
    @JsProperty(name = "impactingDecision")
    public final native void setNativeImpactingDecision(JsArrayLike<JSITDMNElementReference> impactingDecisionParam);

}
