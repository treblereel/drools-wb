
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
 * JSInterop adapter for <code>TDecisionRule</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITDecisionRule
        extends JSITDMNElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TDecisionRule";

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
        toReturn.setLocalPart("tDecisionRule");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tDecisionRule");
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
     * READ-ONLY getter for <b>inputEntry</b> as a {@link List}
     * 
     * @return
     *     The <b>inputEntry</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITUnaryTests> getInputEntry() {
        if (getNativeInputEntry() == null) {
            setNativeInputEntry(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeInputEntry()));
    }

    /**
     * Appends the specified element to the end of <b>inputEntry</b>
     * 
     * @param element to be appended to <b>inputEntry</b>
     */
    @JsOverlay
    public final<D extends JSITUnaryTests>void addInputEntry(final D element) {
        if (getNativeInputEntry() == null) {
            setNativeInputEntry(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeInputEntry(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>inputEntry</b>
     * 
     * @param elements to be appended to <b>inputEntry</b>
     */
    @JsOverlay
    public final<D extends JSITUnaryTests>void addAllInputEntry(D... elements) {
        if (getNativeInputEntry() == null) {
            setNativeInputEntry(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeInputEntry(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>inputEntry</b>
     * 
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeInputEntry(final int index) {
        JsUtils.remove(getNativeInputEntry(), index);
    }

    /**
     * Native getter for <b>inputEntry</b>
     * 
     * @return
     *     The <b>inputEntry</b> JSON property
     */
    @JsProperty(name = "inputEntry")
    public native JsArrayLike<JSITUnaryTests> getNativeInputEntry();

    /**
     * Setter for <b>inputEntry</b> as a {@link List}
     * 
     * @param inputEntryParam
     *     The <b>inputEntry</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setInputEntry(List<JSITUnaryTests> inputEntryParam) {
        setNativeInputEntry(JsUtils.toJsArrayLike(inputEntryParam));
    }

    /**
     * Setter for <b>inputEntry</b>
     * 
     * @param inputEntryParam
     *      <b>inputEntry</b> to set.
     */
    @JsProperty(name = "inputEntry")
    public final native void setNativeInputEntry(JsArrayLike<JSITUnaryTests> inputEntryParam);

    /**
     * READ-ONLY getter for <b>outputEntry</b> as a {@link List}
     * 
     * @return
     *     The <b>outputEntry</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITLiteralExpression> getOutputEntry() {
        if (getNativeOutputEntry() == null) {
            setNativeOutputEntry(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeOutputEntry()));
    }

    /**
     * Appends the specified element to the end of <b>outputEntry</b>
     * 
     * @param element to be appended to <b>outputEntry</b>
     */
    @JsOverlay
    public final<D extends JSITLiteralExpression>void addOutputEntry(final D element) {
        if (getNativeOutputEntry() == null) {
            setNativeOutputEntry(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeOutputEntry(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>outputEntry</b>
     * 
     * @param elements to be appended to <b>outputEntry</b>
     */
    @JsOverlay
    public final<D extends JSITLiteralExpression>void addAllOutputEntry(D... elements) {
        if (getNativeOutputEntry() == null) {
            setNativeOutputEntry(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeOutputEntry(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>outputEntry</b>
     * 
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeOutputEntry(final int index) {
        JsUtils.remove(getNativeOutputEntry(), index);
    }

    /**
     * Native getter for <b>outputEntry</b>
     * 
     * @return
     *     The <b>outputEntry</b> JSON property
     */
    @JsProperty(name = "outputEntry")
    public native JsArrayLike<JSITLiteralExpression> getNativeOutputEntry();

    /**
     * Setter for <b>outputEntry</b> as a {@link List}
     * 
     * @param outputEntryParam
     *     The <b>outputEntry</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setOutputEntry(List<JSITLiteralExpression> outputEntryParam) {
        setNativeOutputEntry(JsUtils.toJsArrayLike(outputEntryParam));
    }

    /**
     * Setter for <b>outputEntry</b>
     * 
     * @param outputEntryParam
     *      <b>outputEntry</b> to set.
     */
    @JsProperty(name = "outputEntry")
    public final native void setNativeOutputEntry(JsArrayLike<JSITLiteralExpression> outputEntryParam);

    /**
     * READ-ONLY getter for <b>annotationEntry</b> as a {@link List}
     * 
     * @return
     *     The <b>annotationEntry</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITRuleAnnotation> getAnnotationEntry() {
        if (getNativeAnnotationEntry() == null) {
            setNativeAnnotationEntry(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeAnnotationEntry()));
    }

    /**
     * Appends the specified element to the end of <b>annotationEntry</b>
     * 
     * @param element to be appended to <b>annotationEntry</b>
     */
    @JsOverlay
    public final<D extends JSITRuleAnnotation>void addAnnotationEntry(final D element) {
        if (getNativeAnnotationEntry() == null) {
            setNativeAnnotationEntry(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeAnnotationEntry(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>annotationEntry</b>
     * 
     * @param elements to be appended to <b>annotationEntry</b>
     */
    @JsOverlay
    public final<D extends JSITRuleAnnotation>void addAllAnnotationEntry(D... elements) {
        if (getNativeAnnotationEntry() == null) {
            setNativeAnnotationEntry(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeAnnotationEntry(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>annotationEntry</b>
     * 
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeAnnotationEntry(final int index) {
        JsUtils.remove(getNativeAnnotationEntry(), index);
    }

    /**
     * Native getter for <b>annotationEntry</b>
     * 
     * @return
     *     The <b>annotationEntry</b> JSON property
     */
    @JsProperty(name = "annotationEntry")
    public native JsArrayLike<JSITRuleAnnotation> getNativeAnnotationEntry();

    /**
     * Setter for <b>annotationEntry</b> as a {@link List}
     * 
     * @param annotationEntryParam
     *     The <b>annotationEntry</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setAnnotationEntry(List<JSITRuleAnnotation> annotationEntryParam) {
        setNativeAnnotationEntry(JsUtils.toJsArrayLike(annotationEntryParam));
    }

    /**
     * Setter for <b>annotationEntry</b>
     * 
     * @param annotationEntryParam
     *      <b>annotationEntry</b> to set.
     */
    @JsProperty(name = "annotationEntry")
    public final native void setNativeAnnotationEntry(JsArrayLike<JSITRuleAnnotation> annotationEntryParam);

}
