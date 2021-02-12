
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
 * JSInterop adapter for <code>TDecisionTable</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITDecisionTable
        extends JSITExpression
{

    @JsOverlay
    public final static String TYPE = "DMN12.TDecisionTable";

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
        toReturn.setLocalPart("tDecisionTable");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tDecisionTable");
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
     * READ-ONLY getter for <b>input</b> as a {@link List}
     *
     * @return
     *     The <b>input</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITInputClause> getInput() {
        if (getNativeInput() == null) {
            setNativeInput(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeInput()));
    }

    /**
     * Appends the specified element to the end of <b>input</b>
     *
     * @param element to be appended to <b>input</b>
     */
    @JsOverlay
    public final<D extends JSITInputClause>void addInput(final D element) {
        if (getNativeInput() == null) {
            setNativeInput(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeInput(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>input</b>
     *
     * @param elements to be appended to <b>input</b>
     */
    @JsOverlay
    public final<D extends JSITInputClause>void addAllInput(D... elements) {
        if (getNativeInput() == null) {
            setNativeInput(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeInput(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>input</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeInput(final int index) {
        JsUtils.remove(getNativeInput(), index);
    }

    /**
     * Native getter for <b>input</b>
     *
     * @return
     *     The <b>input</b> JSON property
     */
    @JsProperty(name = "input")
    public native JsArrayLike<JSITInputClause> getNativeInput();

    /**
     * Setter for <b>input</b> as a {@link List}
     *
     * @param inputParam
     *     The <b>input</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setInput(List<JSITInputClause> inputParam) {
        setNativeInput(JsUtils.toJsArrayLike(inputParam));
    }

    /**
     * Setter for <b>input</b>
     *
     * @param inputParam
     *      <b>input</b> to set.
     */
    @JsProperty(name = "input")
    public final native void setNativeInput(JsArrayLike<JSITInputClause> inputParam);

    /**
     * READ-ONLY getter for <b>output</b> as a {@link List}
     *
     * @return
     *     The <b>output</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITOutputClause> getOutput() {
        if (getNativeOutput() == null) {
            setNativeOutput(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeOutput()));
    }

    /**
     * Appends the specified element to the end of <b>output</b>
     *
     * @param element to be appended to <b>output</b>
     */
    @JsOverlay
    public final<D extends JSITOutputClause>void addOutput(final D element) {
        if (getNativeOutput() == null) {
            setNativeOutput(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeOutput(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>output</b>
     *
     * @param elements to be appended to <b>output</b>
     */
    @JsOverlay
    public final<D extends JSITOutputClause>void addAllOutput(D... elements) {
        if (getNativeOutput() == null) {
            setNativeOutput(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeOutput(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>output</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeOutput(final int index) {
        JsUtils.remove(getNativeOutput(), index);
    }

    /**
     * Native getter for <b>output</b>
     *
     * @return
     *     The <b>output</b> JSON property
     */
    @JsProperty(name = "output")
    public native JsArrayLike<JSITOutputClause> getNativeOutput();

    /**
     * Setter for <b>output</b> as a {@link List}
     *
     * @param outputParam
     *     The <b>output</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setOutput(List<JSITOutputClause> outputParam) {
        setNativeOutput(JsUtils.toJsArrayLike(outputParam));
    }

    /**
     * Setter for <b>output</b>
     *
     * @param outputParam
     *      <b>output</b> to set.
     */
    @JsProperty(name = "output")
    public final native void setNativeOutput(JsArrayLike<JSITOutputClause> outputParam);

    /**
     * READ-ONLY getter for <b>annotation</b> as a {@link List}
     *
     * @return
     *     The <b>annotation</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITRuleAnnotationClause> getAnnotation() {
        if (getNativeAnnotation() == null) {
            setNativeAnnotation(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeAnnotation()));
    }

    /**
     * Appends the specified element to the end of <b>annotation</b>
     *
     * @param element to be appended to <b>annotation</b>
     */
    @JsOverlay
    public final<D extends JSITRuleAnnotationClause>void addAnnotation(final D element) {
        if (getNativeAnnotation() == null) {
            setNativeAnnotation(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeAnnotation(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>annotation</b>
     *
     * @param elements to be appended to <b>annotation</b>
     */
    @JsOverlay
    public final<D extends JSITRuleAnnotationClause>void addAllAnnotation(D... elements) {
        if (getNativeAnnotation() == null) {
            setNativeAnnotation(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeAnnotation(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>annotation</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeAnnotation(final int index) {
        JsUtils.remove(getNativeAnnotation(), index);
    }

    /**
     * Native getter for <b>annotation</b>
     *
     * @return
     *     The <b>annotation</b> JSON property
     */
    @JsProperty(name = "annotation")
    public native JsArrayLike<JSITRuleAnnotationClause> getNativeAnnotation();

    /**
     * Setter for <b>annotation</b> as a {@link List}
     *
     * @param annotationParam
     *     The <b>annotation</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setAnnotation(List<JSITRuleAnnotationClause> annotationParam) {
        setNativeAnnotation(JsUtils.toJsArrayLike(annotationParam));
    }

    /**
     * Setter for <b>annotation</b>
     *
     * @param annotationParam
     *      <b>annotation</b> to set.
     */
    @JsProperty(name = "annotation")
    public final native void setNativeAnnotation(JsArrayLike<JSITRuleAnnotationClause> annotationParam);

    /**
     * READ-ONLY getter for <b>rule</b> as a {@link List}
     *
     * @return
     *     The <b>rule</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITDecisionRule> getRule() {
        if (getNativeRule() == null) {
            setNativeRule(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeRule()));
    }

    /**
     * Appends the specified element to the end of <b>rule</b>
     *
     * @param element to be appended to <b>rule</b>
     */
    @JsOverlay
    public final<D extends JSITDecisionRule>void addRule(final D element) {
        if (getNativeRule() == null) {
            setNativeRule(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeRule(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>rule</b>
     *
     * @param elements to be appended to <b>rule</b>
     */
    @JsOverlay
    public final<D extends JSITDecisionRule>void addAllRule(D... elements) {
        if (getNativeRule() == null) {
            setNativeRule(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeRule(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>rule</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeRule(final int index) {
        JsUtils.remove(getNativeRule(), index);
    }

    /**
     * Native getter for <b>rule</b>
     *
     * @return
     *     The <b>rule</b> JSON property
     */
    @JsProperty(name = "rule")
    public native JsArrayLike<JSITDecisionRule> getNativeRule();

    /**
     * Setter for <b>rule</b> as a {@link List}
     *
     * @param ruleParam
     *     The <b>rule</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setRule(List<JSITDecisionRule> ruleParam) {
        setNativeRule(JsUtils.toJsArrayLike(ruleParam));
    }

    /**
     * Setter for <b>rule</b>
     *
     * @param ruleParam
     *      <b>rule</b> to set.
     */
    @JsProperty(name = "rule")
    public final native void setNativeRule(JsArrayLike<JSITDecisionRule> ruleParam);

    /**
     * Native getter for <b>hitPolicy</b>
     *
     * @return
     *     The <b>hitPolicy</b> JSON property
     */
    @JsProperty(name = "hitPolicy")
    public native JSITHitPolicy getHitPolicy();

    /**
     * Setter for <b>hitPolicy</b>
     *
     * @param hitPolicyParam
     *      <b>hitPolicy</b> to set.
     */
    @JsProperty(name = "hitPolicy")
    public final native void setHitPolicy(JSITHitPolicy hitPolicyParam);

    /**
     * Native getter for <b>aggregation</b>
     *
     * @return
     *     The <b>aggregation</b> JSON property
     */
    @JsProperty(name = "aggregation")
    public native JSITBuiltinAggregator getAggregation();

    /**
     * Setter for <b>aggregation</b>
     *
     * @param aggregationParam
     *      <b>aggregation</b> to set.
     */
    @JsProperty(name = "aggregation")
    public final native void setAggregation(JSITBuiltinAggregator aggregationParam);

    /**
     * Native getter for <b>preferredOrientation</b>
     *
     * @return
     *     The <b>preferredOrientation</b> JSON property
     */
    @JsProperty(name = "preferredOrientation")
    public native JSITDecisionTableOrientation getPreferredOrientation();

    /**
     * Setter for <b>preferredOrientation</b>
     * 
     * @param preferredOrientationParam
     *      <b>preferredOrientation</b> to set.
     */
    @JsProperty(name = "preferredOrientation")
    public final native void setPreferredOrientation(JSITDecisionTableOrientation preferredOrientationParam);

    /**
     * Native getter for <b>outputLabel</b>
     * 
     * @return
     *     The <b>outputLabel</b> JSON property
     */
    @JsProperty(name = "outputLabel")
    public native String getOutputLabel();

    /**
     * Setter for <b>outputLabel</b>
     * 
     * @param outputLabelParam
     *      <b>outputLabel</b> to set.
     */
    @JsProperty(name = "outputLabel")
    public final native void setOutputLabel(String outputLabelParam);

}
