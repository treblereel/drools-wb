
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
 * JSInterop adapter for <code>TDecisionService</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITDecisionService
        extends JSITInvocable
{

    @JsOverlay
    public final static String TYPE = "DMN12.TDecisionService";

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
        toReturn.setLocalPart("tDecisionService");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tDecisionService");
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
     * READ-ONLY getter for <b>outputDecision</b> as a {@link List}
     *
     * @return
     *     The <b>outputDecision</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getOutputDecision() {
        if (getNativeOutputDecision() == null) {
            setNativeOutputDecision(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeOutputDecision()));
    }

    /**
     * Appends the specified element to the end of <b>outputDecision</b>
     *
     * @param element to be appended to <b>outputDecision</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addOutputDecision(final D element) {
        if (getNativeOutputDecision() == null) {
            setNativeOutputDecision(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeOutputDecision(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>outputDecision</b>
     *
     * @param elements to be appended to <b>outputDecision</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addAllOutputDecision(D... elements) {
        if (getNativeOutputDecision() == null) {
            setNativeOutputDecision(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeOutputDecision(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>outputDecision</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeOutputDecision(final int index) {
        JsUtils.remove(getNativeOutputDecision(), index);
    }

    /**
     * Native getter for <b>outputDecision</b>
     *
     * @return
     *     The <b>outputDecision</b> JSON property
     */
    @JsProperty(name = "outputDecision")
    public native JsArrayLike<JSITDMNElementReference> getNativeOutputDecision();

    /**
     * Setter for <b>outputDecision</b> as a {@link List}
     *
     * @param outputDecisionParam
     *     The <b>outputDecision</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setOutputDecision(List<JSITDMNElementReference> outputDecisionParam) {
        setNativeOutputDecision(JsUtils.toJsArrayLike(outputDecisionParam));
    }

    /**
     * Setter for <b>outputDecision</b>
     *
     * @param outputDecisionParam
     *      <b>outputDecision</b> to set.
     */
    @JsProperty(name = "outputDecision")
    public final native void setNativeOutputDecision(JsArrayLike<JSITDMNElementReference> outputDecisionParam);

    /**
     * READ-ONLY getter for <b>encapsulatedDecision</b> as a {@link List}
     *
     * @return
     *     The <b>encapsulatedDecision</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getEncapsulatedDecision() {
        if (getNativeEncapsulatedDecision() == null) {
            setNativeEncapsulatedDecision(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeEncapsulatedDecision()));
    }

    /**
     * Appends the specified element to the end of <b>encapsulatedDecision</b>
     *
     * @param element to be appended to <b>encapsulatedDecision</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addEncapsulatedDecision(final D element) {
        if (getNativeEncapsulatedDecision() == null) {
            setNativeEncapsulatedDecision(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeEncapsulatedDecision(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>encapsulatedDecision</b>
     *
     * @param elements to be appended to <b>encapsulatedDecision</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addAllEncapsulatedDecision(D... elements) {
        if (getNativeEncapsulatedDecision() == null) {
            setNativeEncapsulatedDecision(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeEncapsulatedDecision(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>encapsulatedDecision</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeEncapsulatedDecision(final int index) {
        JsUtils.remove(getNativeEncapsulatedDecision(), index);
    }

    /**
     * Native getter for <b>encapsulatedDecision</b>
     *
     * @return
     *     The <b>encapsulatedDecision</b> JSON property
     */
    @JsProperty(name = "encapsulatedDecision")
    public native JsArrayLike<JSITDMNElementReference> getNativeEncapsulatedDecision();

    /**
     * Setter for <b>encapsulatedDecision</b> as a {@link List}
     *
     * @param encapsulatedDecisionParam
     *     The <b>encapsulatedDecision</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setEncapsulatedDecision(List<JSITDMNElementReference> encapsulatedDecisionParam) {
        setNativeEncapsulatedDecision(JsUtils.toJsArrayLike(encapsulatedDecisionParam));
    }

    /**
     * Setter for <b>encapsulatedDecision</b>
     *
     * @param encapsulatedDecisionParam
     *      <b>encapsulatedDecision</b> to set.
     */
    @JsProperty(name = "encapsulatedDecision")
    public final native void setNativeEncapsulatedDecision(JsArrayLike<JSITDMNElementReference> encapsulatedDecisionParam);

    /**
     * READ-ONLY getter for <b>inputDecision</b> as a {@link List}
     *
     * @return
     *     The <b>inputDecision</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getInputDecision() {
        if (getNativeInputDecision() == null) {
            setNativeInputDecision(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeInputDecision()));
    }

    /**
     * Appends the specified element to the end of <b>inputDecision</b>
     *
     * @param element to be appended to <b>inputDecision</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addInputDecision(final D element) {
        if (getNativeInputDecision() == null) {
            setNativeInputDecision(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeInputDecision(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>inputDecision</b>
     *
     * @param elements to be appended to <b>inputDecision</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addAllInputDecision(D... elements) {
        if (getNativeInputDecision() == null) {
            setNativeInputDecision(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeInputDecision(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>inputDecision</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeInputDecision(final int index) {
        JsUtils.remove(getNativeInputDecision(), index);
    }

    /**
     * Native getter for <b>inputDecision</b>
     *
     * @return
     *     The <b>inputDecision</b> JSON property
     */
    @JsProperty(name = "inputDecision")
    public native JsArrayLike<JSITDMNElementReference> getNativeInputDecision();

    /**
     * Setter for <b>inputDecision</b> as a {@link List}
     *
     * @param inputDecisionParam
     *     The <b>inputDecision</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setInputDecision(List<JSITDMNElementReference> inputDecisionParam) {
        setNativeInputDecision(JsUtils.toJsArrayLike(inputDecisionParam));
    }

    /**
     * Setter for <b>inputDecision</b>
     *
     * @param inputDecisionParam
     *      <b>inputDecision</b> to set.
     */
    @JsProperty(name = "inputDecision")
    public final native void setNativeInputDecision(JsArrayLike<JSITDMNElementReference> inputDecisionParam);

    /**
     * READ-ONLY getter for <b>inputData</b> as a {@link List}
     *
     * @return
     *     The <b>inputData</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getInputData() {
        if (getNativeInputData() == null) {
            setNativeInputData(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeInputData()));
    }

    /**
     * Appends the specified element to the end of <b>inputData</b>
     *
     * @param element to be appended to <b>inputData</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addInputData(final D element) {
        if (getNativeInputData() == null) {
            setNativeInputData(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeInputData(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>inputData</b>
     *
     * @param elements to be appended to <b>inputData</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addAllInputData(D... elements) {
        if (getNativeInputData() == null) {
            setNativeInputData(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeInputData(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>inputData</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeInputData(final int index) {
        JsUtils.remove(getNativeInputData(), index);
    }

    /**
     * Native getter for <b>inputData</b>
     *
     * @return
     *     The <b>inputData</b> JSON property
     */
    @JsProperty(name = "inputData")
    public native JsArrayLike<JSITDMNElementReference> getNativeInputData();

    /**
     * Setter for <b>inputData</b> as a {@link List}
     *
     * @param inputDataParam
     *     The <b>inputData</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setInputData(List<JSITDMNElementReference> inputDataParam) {
        setNativeInputData(JsUtils.toJsArrayLike(inputDataParam));
    }

    /**
     * Setter for <b>inputData</b>
     * 
     * @param inputDataParam
     *      <b>inputData</b> to set.
     */
    @JsProperty(name = "inputData")
    public final native void setNativeInputData(JsArrayLike<JSITDMNElementReference> inputDataParam);

}
