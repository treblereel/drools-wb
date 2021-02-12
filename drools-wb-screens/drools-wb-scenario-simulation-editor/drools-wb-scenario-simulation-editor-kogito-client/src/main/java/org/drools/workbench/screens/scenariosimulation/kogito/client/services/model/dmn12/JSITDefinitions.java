
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmn12;

import java.util.List;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmndi12.JSIDMNDI;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>TDefinitions</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITDefinitions
        extends JSITNamedElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TDefinitions";

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
        toReturn.setLocalPart("tDefinitions");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tDefinitions");
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
     * READ-ONLY getter for <b>_import</b> as a {@link List}
     *
     * @return
     *     The <b>_import</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITImport> getImport() {
        if (getNativeImport() == null) {
            setNativeImport(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeImport()));
    }

    /**
     * Appends the specified element to the end of <b>_import</b>
     *
     * @param element to be appended to <b>_import</b>
     */
    @JsOverlay
    public final<D extends JSITImport>void addImport(final D element) {
        if (getNativeImport() == null) {
            setNativeImport(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeImport(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>_import</b>
     *
     * @param elements to be appended to <b>_import</b>
     */
    @JsOverlay
    public final<D extends JSITImport>void addAllImport(D... elements) {
        if (getNativeImport() == null) {
            setNativeImport(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeImport(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>_import</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeImport(final int index) {
        JsUtils.remove(getNativeImport(), index);
    }

    /**
     * Native getter for <b>_import</b>
     *
     * @return
     *     The <b>_import</b> JSON property
     */
    @JsProperty(name = "_import")
    public native JsArrayLike<JSITImport> getNativeImport();

    /**
     * Setter for <b>_import</b> as a {@link List}
     *
     * @param _importParam
     *     The <b>_import</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setImport(List<JSITImport> _importParam) {
        setNativeImport(JsUtils.toJsArrayLike(_importParam));
    }

    /**
     * Setter for <b>_import</b>
     *
     * @param _importParam
     *      <b>_import</b> to set.
     */
    @JsProperty(name = "_import")
    public final native void setNativeImport(JsArrayLike<JSITImport> _importParam);

    /**
     * READ-ONLY getter for <b>itemDefinition</b> as a {@link List}
     *
     * @return
     *     The <b>itemDefinition</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITItemDefinition> getItemDefinition() {
        if (getNativeItemDefinition() == null) {
            setNativeItemDefinition(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeItemDefinition()));
    }

    /**
     * Appends the specified element to the end of <b>itemDefinition</b>
     *
     * @param element to be appended to <b>itemDefinition</b>
     */
    @JsOverlay
    public final<D extends JSITItemDefinition>void addItemDefinition(final D element) {
        if (getNativeItemDefinition() == null) {
            setNativeItemDefinition(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeItemDefinition(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>itemDefinition</b>
     *
     * @param elements to be appended to <b>itemDefinition</b>
     */
    @JsOverlay
    public final<D extends JSITItemDefinition>void addAllItemDefinition(D... elements) {
        if (getNativeItemDefinition() == null) {
            setNativeItemDefinition(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeItemDefinition(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>itemDefinition</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeItemDefinition(final int index) {
        JsUtils.remove(getNativeItemDefinition(), index);
    }

    /**
     * Native getter for <b>itemDefinition</b>
     *
     * @return
     *     The <b>itemDefinition</b> JSON property
     */
    @JsProperty(name = "itemDefinition")
    public native JsArrayLike<JSITItemDefinition> getNativeItemDefinition();

    /**
     * Setter for <b>itemDefinition</b> as a {@link List}
     *
     * @param itemDefinitionParam
     *     The <b>itemDefinition</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setItemDefinition(List<JSITItemDefinition> itemDefinitionParam) {
        setNativeItemDefinition(JsUtils.toJsArrayLike(itemDefinitionParam));
    }

    /**
     * Setter for <b>itemDefinition</b>
     *
     * @param itemDefinitionParam
     *      <b>itemDefinition</b> to set.
     */
    @JsProperty(name = "itemDefinition")
    public final native void setNativeItemDefinition(JsArrayLike<JSITItemDefinition> itemDefinitionParam);

    /**
     * READ-ONLY getter for <b>drgElement</b> as a {@link List}
     *
     * @return
     *     The <b>drgElement</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITDRGElement> getDrgElement() {
        if (getNativeDrgElement() == null) {
            setNativeDrgElement(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeDrgElement()));
    }

    /**
     * Appends the specified element to the end of <b>drgElement</b>
     *
     * @param element to be appended to <b>drgElement</b>
     */
    @JsOverlay
    public final<D extends JSITDRGElement>void addDrgElement(final D element) {
        if (getNativeDrgElement() == null) {
            setNativeDrgElement(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeDrgElement(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>drgElement</b>
     *
     * @param elements to be appended to <b>drgElement</b>
     */
    @JsOverlay
    public final<D extends JSITDRGElement>void addAllDrgElement(D... elements) {
        if (getNativeDrgElement() == null) {
            setNativeDrgElement(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeDrgElement(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>drgElement</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeDrgElement(final int index) {
        JsUtils.remove(getNativeDrgElement(), index);
    }

    /**
     * Native getter for <b>drgElement</b>
     *
     * @return
     *     The <b>drgElement</b> JSON property
     */
    @JsProperty(name = "drgElement")
    public native JsArrayLike<JSITDRGElement> getNativeDrgElement();

    /**
     * Setter for <b>drgElement</b> as a {@link List}
     *
     * @param drgElementParam
     *     The <b>drgElement</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setDrgElement(List<JSITDRGElement> drgElementParam) {
        setNativeDrgElement(JsUtils.toJsArrayLike(drgElementParam));
    }

    /**
     * Setter for <b>drgElement</b>
     *
     * @param drgElementParam
     *      <b>drgElement</b> to set.
     */
    @JsProperty(name = "drgElement")
    public final native void setNativeDrgElement(JsArrayLike<JSITDRGElement> drgElementParam);

    /**
     * READ-ONLY getter for <b>artifact</b> as a {@link List}
     *
     * @return
     *     The <b>artifact</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITArtifact> getArtifact() {
        if (getNativeArtifact() == null) {
            setNativeArtifact(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeArtifact()));
    }

    /**
     * Appends the specified element to the end of <b>artifact</b>
     *
     * @param element to be appended to <b>artifact</b>
     */
    @JsOverlay
    public final<D extends JSITArtifact>void addArtifact(final D element) {
        if (getNativeArtifact() == null) {
            setNativeArtifact(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeArtifact(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>artifact</b>
     *
     * @param elements to be appended to <b>artifact</b>
     */
    @JsOverlay
    public final<D extends JSITArtifact>void addAllArtifact(D... elements) {
        if (getNativeArtifact() == null) {
            setNativeArtifact(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeArtifact(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>artifact</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeArtifact(final int index) {
        JsUtils.remove(getNativeArtifact(), index);
    }

    /**
     * Native getter for <b>artifact</b>
     *
     * @return
     *     The <b>artifact</b> JSON property
     */
    @JsProperty(name = "artifact")
    public native JsArrayLike<JSITArtifact> getNativeArtifact();

    /**
     * Setter for <b>artifact</b> as a {@link List}
     *
     * @param artifactParam
     *     The <b>artifact</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setArtifact(List<JSITArtifact> artifactParam) {
        setNativeArtifact(JsUtils.toJsArrayLike(artifactParam));
    }

    /**
     * Setter for <b>artifact</b>
     *
     * @param artifactParam
     *      <b>artifact</b> to set.
     */
    @JsProperty(name = "artifact")
    public final native void setNativeArtifact(JsArrayLike<JSITArtifact> artifactParam);

    /**
     * READ-ONLY getter for <b>elementCollection</b> as a {@link List}
     *
     * @return
     *     The <b>elementCollection</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITElementCollection> getElementCollection() {
        if (getNativeElementCollection() == null) {
            setNativeElementCollection(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeElementCollection()));
    }

    /**
     * Appends the specified element to the end of <b>elementCollection</b>
     *
     * @param element to be appended to <b>elementCollection</b>
     */
    @JsOverlay
    public final<D extends JSITElementCollection>void addElementCollection(final D element) {
        if (getNativeElementCollection() == null) {
            setNativeElementCollection(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeElementCollection(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>elementCollection</b>
     *
     * @param elements to be appended to <b>elementCollection</b>
     */
    @JsOverlay
    public final<D extends JSITElementCollection>void addAllElementCollection(D... elements) {
        if (getNativeElementCollection() == null) {
            setNativeElementCollection(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeElementCollection(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>elementCollection</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeElementCollection(final int index) {
        JsUtils.remove(getNativeElementCollection(), index);
    }

    /**
     * Native getter for <b>elementCollection</b>
     *
     * @return
     *     The <b>elementCollection</b> JSON property
     */
    @JsProperty(name = "elementCollection")
    public native JsArrayLike<JSITElementCollection> getNativeElementCollection();

    /**
     * Setter for <b>elementCollection</b> as a {@link List}
     *
     * @param elementCollectionParam
     *     The <b>elementCollection</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setElementCollection(List<JSITElementCollection> elementCollectionParam) {
        setNativeElementCollection(JsUtils.toJsArrayLike(elementCollectionParam));
    }

    /**
     * Setter for <b>elementCollection</b>
     *
     * @param elementCollectionParam
     *      <b>elementCollection</b> to set.
     */
    @JsProperty(name = "elementCollection")
    public final native void setNativeElementCollection(JsArrayLike<JSITElementCollection> elementCollectionParam);

    /**
     * READ-ONLY getter for <b>businessContextElement</b> as a {@link List}
     *
     * @return
     *     The <b>businessContextElement</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITBusinessContextElement> getBusinessContextElement() {
        if (getNativeBusinessContextElement() == null) {
            setNativeBusinessContextElement(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeBusinessContextElement()));
    }

    /**
     * Appends the specified element to the end of <b>businessContextElement</b>
     *
     * @param element to be appended to <b>businessContextElement</b>
     */
    @JsOverlay
    public final<D extends JSITBusinessContextElement>void addBusinessContextElement(final D element) {
        if (getNativeBusinessContextElement() == null) {
            setNativeBusinessContextElement(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeBusinessContextElement(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>businessContextElement</b>
     *
     * @param elements to be appended to <b>businessContextElement</b>
     */
    @JsOverlay
    public final<D extends JSITBusinessContextElement>void addAllBusinessContextElement(D... elements) {
        if (getNativeBusinessContextElement() == null) {
            setNativeBusinessContextElement(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeBusinessContextElement(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>businessContextElement</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeBusinessContextElement(final int index) {
        JsUtils.remove(getNativeBusinessContextElement(), index);
    }

    /**
     * Native getter for <b>businessContextElement</b>
     *
     * @return
     *     The <b>businessContextElement</b> JSON property
     */
    @JsProperty(name = "businessContextElement")
    public native JsArrayLike<JSITBusinessContextElement> getNativeBusinessContextElement();

    /**
     * Setter for <b>businessContextElement</b> as a {@link List}
     *
     * @param businessContextElementParam
     *     The <b>businessContextElement</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setBusinessContextElement(List<JSITBusinessContextElement> businessContextElementParam) {
        setNativeBusinessContextElement(JsUtils.toJsArrayLike(businessContextElementParam));
    }

    /**
     * Setter for <b>businessContextElement</b>
     * 
     * @param businessContextElementParam
     *      <b>businessContextElement</b> to set.
     */
    @JsProperty(name = "businessContextElement")
    public final native void setNativeBusinessContextElement(JsArrayLike<JSITBusinessContextElement> businessContextElementParam);

    /**
     * Native getter for <b>dmndi</b>
     * 
     * @return
     *     The <b>dmndi</b> JSON property
     */
    @JsProperty(name = "dmndi")
    public native JSIDMNDI getDMNDI();

    /**
     * Setter for <b>dmndi</b>
     * 
     * @param dmndiParam
     *      <b>dmndi</b> to set.
     */
    @JsProperty(name = "dmndi")
    public final native void setDMNDI(JSIDMNDI dmndiParam);

    /**
     * Native getter for <b>expressionLanguage</b>
     * 
     * @return
     *     The <b>expressionLanguage</b> JSON property
     */
    @JsProperty(name = "expressionLanguage")
    public native String getExpressionLanguage();

    /**
     * Setter for <b>expressionLanguage</b>
     * 
     * @param expressionLanguageParam
     *      <b>expressionLanguage</b> to set.
     */
    @JsProperty(name = "expressionLanguage")
    public final native void setExpressionLanguage(String expressionLanguageParam);

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
     * Native getter for <b>namespace</b>
     * 
     * @return
     *     The <b>namespace</b> JSON property
     */
    @JsProperty(name = "namespace")
    public native String getNamespace();

    /**
     * Setter for <b>namespace</b>
     * 
     * @param namespaceParam
     *      <b>namespace</b> to set.
     */
    @JsProperty(name = "namespace")
    public final native void setNamespace(String namespaceParam);

    /**
     * Native getter for <b>exporter</b>
     * 
     * @return
     *     The <b>exporter</b> JSON property
     */
    @JsProperty(name = "exporter")
    public native String getExporter();

    /**
     * Setter for <b>exporter</b>
     * 
     * @param exporterParam
     *      <b>exporter</b> to set.
     */
    @JsProperty(name = "exporter")
    public final native void setExporter(String exporterParam);

    /**
     * Native getter for <b>exporterVersion</b>
     * 
     * @return
     *     The <b>exporterVersion</b> JSON property
     */
    @JsProperty(name = "exporterVersion")
    public native String getExporterVersion();

    /**
     * Setter for <b>exporterVersion</b>
     * 
     * @param exporterVersionParam
     *      <b>exporterVersion</b> to set.
     */
    @JsProperty(name = "exporterVersion")
    public final native void setExporterVersion(String exporterVersionParam);

}
