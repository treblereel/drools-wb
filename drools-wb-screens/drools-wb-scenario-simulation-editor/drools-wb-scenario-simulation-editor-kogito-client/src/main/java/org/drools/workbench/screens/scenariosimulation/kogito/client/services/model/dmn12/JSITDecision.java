
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
 * JSInterop adapter for <code>TDecision</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITDecision
        extends JSITDRGElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TDecision";

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
        toReturn.setLocalPart("tDecision");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tDecision");
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
     * Native getter for <b>question</b>
     *
     * @return
     *     The <b>question</b> JSON property
     */
    @JsProperty(name = "question")
    public native String getQuestion();

    /**
     * Setter for <b>question</b>
     *
     * @param questionParam
     *      <b>question</b> to set.
     */
    @JsProperty(name = "question")
    public final native void setQuestion(String questionParam);

    /**
     * Native getter for <b>allowedAnswers</b>
     *
     * @return
     *     The <b>allowedAnswers</b> JSON property
     */
    @JsProperty(name = "allowedAnswers")
    public native String getAllowedAnswers();

    /**
     * Setter for <b>allowedAnswers</b>
     *
     * @param allowedAnswersParam
     *      <b>allowedAnswers</b> to set.
     */
    @JsProperty(name = "allowedAnswers")
    public final native void setAllowedAnswers(String allowedAnswersParam);

    /**
     * Native getter for <b>variable</b>
     *
     * @return
     *     The <b>variable</b> JSON property
     */
    @JsProperty(name = "variable")
    public native JSITInformationItem getVariable();

    /**
     * Setter for <b>variable</b>
     *
     * @param variableParam
     *      <b>variable</b> to set.
     */
    @JsProperty(name = "variable")
    public final native void setVariable(JSITInformationItem variableParam);

    /**
     * READ-ONLY getter for <b>informationRequirement</b> as a {@link List}
     *
     * @return
     *     The <b>informationRequirement</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITInformationRequirement> getInformationRequirement() {
        if (getNativeInformationRequirement() == null) {
            setNativeInformationRequirement(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeInformationRequirement()));
    }

    /**
     * Appends the specified element to the end of <b>informationRequirement</b>
     *
     * @param element to be appended to <b>informationRequirement</b>
     */
    @JsOverlay
    public final<D extends JSITInformationRequirement>void addInformationRequirement(final D element) {
        if (getNativeInformationRequirement() == null) {
            setNativeInformationRequirement(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeInformationRequirement(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>informationRequirement</b>
     *
     * @param elements to be appended to <b>informationRequirement</b>
     */
    @JsOverlay
    public final<D extends JSITInformationRequirement>void addAllInformationRequirement(D... elements) {
        if (getNativeInformationRequirement() == null) {
            setNativeInformationRequirement(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeInformationRequirement(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>informationRequirement</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeInformationRequirement(final int index) {
        JsUtils.remove(getNativeInformationRequirement(), index);
    }

    /**
     * Native getter for <b>informationRequirement</b>
     *
     * @return
     *     The <b>informationRequirement</b> JSON property
     */
    @JsProperty(name = "informationRequirement")
    public native JsArrayLike<JSITInformationRequirement> getNativeInformationRequirement();

    /**
     * Setter for <b>informationRequirement</b> as a {@link List}
     *
     * @param informationRequirementParam
     *     The <b>informationRequirement</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setInformationRequirement(List<JSITInformationRequirement> informationRequirementParam) {
        setNativeInformationRequirement(JsUtils.toJsArrayLike(informationRequirementParam));
    }

    /**
     * Setter for <b>informationRequirement</b>
     *
     * @param informationRequirementParam
     *      <b>informationRequirement</b> to set.
     */
    @JsProperty(name = "informationRequirement")
    public final native void setNativeInformationRequirement(JsArrayLike<JSITInformationRequirement> informationRequirementParam);

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

    /**
     * READ-ONLY getter for <b>supportedObjective</b> as a {@link List}
     *
     * @return
     *     The <b>supportedObjective</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getSupportedObjective() {
        if (getNativeSupportedObjective() == null) {
            setNativeSupportedObjective(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeSupportedObjective()));
    }

    /**
     * Appends the specified element to the end of <b>supportedObjective</b>
     *
     * @param element to be appended to <b>supportedObjective</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addSupportedObjective(final D element) {
        if (getNativeSupportedObjective() == null) {
            setNativeSupportedObjective(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeSupportedObjective(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>supportedObjective</b>
     *
     * @param elements to be appended to <b>supportedObjective</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addAllSupportedObjective(D... elements) {
        if (getNativeSupportedObjective() == null) {
            setNativeSupportedObjective(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeSupportedObjective(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>supportedObjective</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeSupportedObjective(final int index) {
        JsUtils.remove(getNativeSupportedObjective(), index);
    }

    /**
     * Native getter for <b>supportedObjective</b>
     *
     * @return
     *     The <b>supportedObjective</b> JSON property
     */
    @JsProperty(name = "supportedObjective")
    public native JsArrayLike<JSITDMNElementReference> getNativeSupportedObjective();

    /**
     * Setter for <b>supportedObjective</b> as a {@link List}
     *
     * @param supportedObjectiveParam
     *     The <b>supportedObjective</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setSupportedObjective(List<JSITDMNElementReference> supportedObjectiveParam) {
        setNativeSupportedObjective(JsUtils.toJsArrayLike(supportedObjectiveParam));
    }

    /**
     * Setter for <b>supportedObjective</b>
     *
     * @param supportedObjectiveParam
     *      <b>supportedObjective</b> to set.
     */
    @JsProperty(name = "supportedObjective")
    public final native void setNativeSupportedObjective(JsArrayLike<JSITDMNElementReference> supportedObjectiveParam);

    /**
     * READ-ONLY getter for <b>impactedPerformanceIndicator</b> as a {@link List}
     *
     * @return
     *     The <b>impactedPerformanceIndicator</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getImpactedPerformanceIndicator() {
        if (getNativeImpactedPerformanceIndicator() == null) {
            setNativeImpactedPerformanceIndicator(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeImpactedPerformanceIndicator()));
    }

    /**
     * Appends the specified element to the end of <b>impactedPerformanceIndicator</b>
     *
     * @param element to be appended to <b>impactedPerformanceIndicator</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addImpactedPerformanceIndicator(final D element) {
        if (getNativeImpactedPerformanceIndicator() == null) {
            setNativeImpactedPerformanceIndicator(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeImpactedPerformanceIndicator(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>impactedPerformanceIndicator</b>
     *
     * @param elements to be appended to <b>impactedPerformanceIndicator</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addAllImpactedPerformanceIndicator(D... elements) {
        if (getNativeImpactedPerformanceIndicator() == null) {
            setNativeImpactedPerformanceIndicator(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeImpactedPerformanceIndicator(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>impactedPerformanceIndicator</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeImpactedPerformanceIndicator(final int index) {
        JsUtils.remove(getNativeImpactedPerformanceIndicator(), index);
    }

    /**
     * Native getter for <b>impactedPerformanceIndicator</b>
     *
     * @return
     *     The <b>impactedPerformanceIndicator</b> JSON property
     */
    @JsProperty(name = "impactedPerformanceIndicator")
    public native JsArrayLike<JSITDMNElementReference> getNativeImpactedPerformanceIndicator();

    /**
     * Setter for <b>impactedPerformanceIndicator</b> as a {@link List}
     *
     * @param impactedPerformanceIndicatorParam
     *     The <b>impactedPerformanceIndicator</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setImpactedPerformanceIndicator(List<JSITDMNElementReference> impactedPerformanceIndicatorParam) {
        setNativeImpactedPerformanceIndicator(JsUtils.toJsArrayLike(impactedPerformanceIndicatorParam));
    }

    /**
     * Setter for <b>impactedPerformanceIndicator</b>
     *
     * @param impactedPerformanceIndicatorParam
     *      <b>impactedPerformanceIndicator</b> to set.
     */
    @JsProperty(name = "impactedPerformanceIndicator")
    public final native void setNativeImpactedPerformanceIndicator(JsArrayLike<JSITDMNElementReference> impactedPerformanceIndicatorParam);

    /**
     * READ-ONLY getter for <b>decisionMaker</b> as a {@link List}
     *
     * @return
     *     The <b>decisionMaker</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getDecisionMaker() {
        if (getNativeDecisionMaker() == null) {
            setNativeDecisionMaker(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeDecisionMaker()));
    }

    /**
     * Appends the specified element to the end of <b>decisionMaker</b>
     *
     * @param element to be appended to <b>decisionMaker</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addDecisionMaker(final D element) {
        if (getNativeDecisionMaker() == null) {
            setNativeDecisionMaker(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeDecisionMaker(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>decisionMaker</b>
     *
     * @param elements to be appended to <b>decisionMaker</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addAllDecisionMaker(D... elements) {
        if (getNativeDecisionMaker() == null) {
            setNativeDecisionMaker(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeDecisionMaker(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>decisionMaker</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeDecisionMaker(final int index) {
        JsUtils.remove(getNativeDecisionMaker(), index);
    }

    /**
     * Native getter for <b>decisionMaker</b>
     *
     * @return
     *     The <b>decisionMaker</b> JSON property
     */
    @JsProperty(name = "decisionMaker")
    public native JsArrayLike<JSITDMNElementReference> getNativeDecisionMaker();

    /**
     * Setter for <b>decisionMaker</b> as a {@link List}
     *
     * @param decisionMakerParam
     *     The <b>decisionMaker</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setDecisionMaker(List<JSITDMNElementReference> decisionMakerParam) {
        setNativeDecisionMaker(JsUtils.toJsArrayLike(decisionMakerParam));
    }

    /**
     * Setter for <b>decisionMaker</b>
     *
     * @param decisionMakerParam
     *      <b>decisionMaker</b> to set.
     */
    @JsProperty(name = "decisionMaker")
    public final native void setNativeDecisionMaker(JsArrayLike<JSITDMNElementReference> decisionMakerParam);

    /**
     * READ-ONLY getter for <b>decisionOwner</b> as a {@link List}
     *
     * @return
     *     The <b>decisionOwner</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getDecisionOwner() {
        if (getNativeDecisionOwner() == null) {
            setNativeDecisionOwner(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeDecisionOwner()));
    }

    /**
     * Appends the specified element to the end of <b>decisionOwner</b>
     *
     * @param element to be appended to <b>decisionOwner</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addDecisionOwner(final D element) {
        if (getNativeDecisionOwner() == null) {
            setNativeDecisionOwner(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeDecisionOwner(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>decisionOwner</b>
     *
     * @param elements to be appended to <b>decisionOwner</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addAllDecisionOwner(D... elements) {
        if (getNativeDecisionOwner() == null) {
            setNativeDecisionOwner(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeDecisionOwner(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>decisionOwner</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeDecisionOwner(final int index) {
        JsUtils.remove(getNativeDecisionOwner(), index);
    }

    /**
     * Native getter for <b>decisionOwner</b>
     *
     * @return
     *     The <b>decisionOwner</b> JSON property
     */
    @JsProperty(name = "decisionOwner")
    public native JsArrayLike<JSITDMNElementReference> getNativeDecisionOwner();

    /**
     * Setter for <b>decisionOwner</b> as a {@link List}
     *
     * @param decisionOwnerParam
     *     The <b>decisionOwner</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setDecisionOwner(List<JSITDMNElementReference> decisionOwnerParam) {
        setNativeDecisionOwner(JsUtils.toJsArrayLike(decisionOwnerParam));
    }

    /**
     * Setter for <b>decisionOwner</b>
     *
     * @param decisionOwnerParam
     *      <b>decisionOwner</b> to set.
     */
    @JsProperty(name = "decisionOwner")
    public final native void setNativeDecisionOwner(JsArrayLike<JSITDMNElementReference> decisionOwnerParam);

    /**
     * READ-ONLY getter for <b>usingProcess</b> as a {@link List}
     *
     * @return
     *     The <b>usingProcess</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getUsingProcess() {
        if (getNativeUsingProcess() == null) {
            setNativeUsingProcess(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeUsingProcess()));
    }

    /**
     * Appends the specified element to the end of <b>usingProcess</b>
     *
     * @param element to be appended to <b>usingProcess</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addUsingProcess(final D element) {
        if (getNativeUsingProcess() == null) {
            setNativeUsingProcess(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeUsingProcess(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>usingProcess</b>
     *
     * @param elements to be appended to <b>usingProcess</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addAllUsingProcess(D... elements) {
        if (getNativeUsingProcess() == null) {
            setNativeUsingProcess(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeUsingProcess(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>usingProcess</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeUsingProcess(final int index) {
        JsUtils.remove(getNativeUsingProcess(), index);
    }

    /**
     * Native getter for <b>usingProcess</b>
     *
     * @return
     *     The <b>usingProcess</b> JSON property
     */
    @JsProperty(name = "usingProcess")
    public native JsArrayLike<JSITDMNElementReference> getNativeUsingProcess();

    /**
     * Setter for <b>usingProcess</b> as a {@link List}
     *
     * @param usingProcessParam
     *     The <b>usingProcess</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setUsingProcess(List<JSITDMNElementReference> usingProcessParam) {
        setNativeUsingProcess(JsUtils.toJsArrayLike(usingProcessParam));
    }

    /**
     * Setter for <b>usingProcess</b>
     *
     * @param usingProcessParam
     *      <b>usingProcess</b> to set.
     */
    @JsProperty(name = "usingProcess")
    public final native void setNativeUsingProcess(JsArrayLike<JSITDMNElementReference> usingProcessParam);

    /**
     * READ-ONLY getter for <b>usingTask</b> as a {@link List}
     *
     * @return
     *     The <b>usingTask</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getUsingTask() {
        if (getNativeUsingTask() == null) {
            setNativeUsingTask(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeUsingTask()));
    }

    /**
     * Appends the specified element to the end of <b>usingTask</b>
     *
     * @param element to be appended to <b>usingTask</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addUsingTask(final D element) {
        if (getNativeUsingTask() == null) {
            setNativeUsingTask(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeUsingTask(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>usingTask</b>
     *
     * @param elements to be appended to <b>usingTask</b>
     */
    @JsOverlay
    public final<D extends JSITDMNElementReference>void addAllUsingTask(D... elements) {
        if (getNativeUsingTask() == null) {
            setNativeUsingTask(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeUsingTask(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>usingTask</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeUsingTask(final int index) {
        JsUtils.remove(getNativeUsingTask(), index);
    }

    /**
     * Native getter for <b>usingTask</b>
     *
     * @return
     *     The <b>usingTask</b> JSON property
     */
    @JsProperty(name = "usingTask")
    public native JsArrayLike<JSITDMNElementReference> getNativeUsingTask();

    /**
     * Setter for <b>usingTask</b> as a {@link List}
     *
     * @param usingTaskParam
     *     The <b>usingTask</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setUsingTask(List<JSITDMNElementReference> usingTaskParam) {
        setNativeUsingTask(JsUtils.toJsArrayLike(usingTaskParam));
    }

    /**
     * Setter for <b>usingTask</b>
     * 
     * @param usingTaskParam
     *      <b>usingTask</b> to set.
     */
    @JsProperty(name = "usingTask")
    public final native void setNativeUsingTask(JsArrayLike<JSITDMNElementReference> usingTaskParam);

    /**
     * Native getter for <b>expression</b>
     * 
     * @return
     *     The <b>expression</b> JSON property
     */
    @JsProperty(name = "expression")
    public native JSITExpression getExpression();

    /**
     * Setter for <b>expression</b>
     * 
     * @param expressionParam
     *      <b>expression</b> to set.
     */
    @JsProperty(name = "expression")
    public final native void setExpression(JSITExpression expressionParam);

}
