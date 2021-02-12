
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmndi12;

import java.util.List;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dc.JSIDimension;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.di.JSIDiagram;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.di.JSIDiagramElement;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>DMNDiagram</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSIDMNDiagram
        extends JSIDiagram
{

    @JsOverlay
    public final static String TYPE = "DMNDI12.DMNDiagram";

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
        toReturn.setNamespaceURI("http://www.omg.org/spec/DMN/20180521/DMNDI/");
        toReturn.setLocalPart("DMNDiagram");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/DMNDI/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/DMNDI/}DMNDiagram");
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
     * Native getter for <b>size</b>
     * 
     * @return
     *     The <b>size</b> JSON property
     */
    @JsProperty(name = "size")
    public native JSIDimension getSize();

    /**
     * Setter for <b>size</b>
     * 
     * @param sizeParam
     *      <b>size</b> to set.
     */
    @JsProperty(name = "size")
    public final native void setSize(JSIDimension sizeParam);

    /**
     * READ-ONLY getter for <b>dmnDiagramElement</b> as a {@link List}
     * 
     * @return
     *     The <b>dmnDiagramElement</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSIDiagramElement> getDMNDiagramElement() {
        if (getNativeDMNDiagramElement() == null) {
            setNativeDMNDiagramElement(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeDMNDiagramElement()));
    }

    /**
     * Appends the specified element to the end of <b>dmnDiagramElement</b>
     * 
     * @param element to be appended to <b>dmnDiagramElement</b>
     */
    @JsOverlay
    public final<D extends JSIDiagramElement>void addDMNDiagramElement(final D element) {
        if (getNativeDMNDiagramElement() == null) {
            setNativeDMNDiagramElement(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeDMNDiagramElement(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>dmnDiagramElement</b>
     * 
     * @param elements to be appended to <b>dmnDiagramElement</b>
     */
    @JsOverlay
    public final<D extends JSIDiagramElement>void addAllDMNDiagramElement(D... elements) {
        if (getNativeDMNDiagramElement() == null) {
            setNativeDMNDiagramElement(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeDMNDiagramElement(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>dmnDiagramElement</b>
     * 
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeDMNDiagramElement(final int index) {
        JsUtils.remove(getNativeDMNDiagramElement(), index);
    }

    /**
     * Native getter for <b>dmnDiagramElement</b>
     * 
     * @return
     *     The <b>dmnDiagramElement</b> JSON property
     */
    @JsProperty(name = "dmnDiagramElement")
    public native JsArrayLike<JSIDiagramElement> getNativeDMNDiagramElement();

    /**
     * Setter for <b>dmnDiagramElement</b> as a {@link List}
     * 
     * @param dmnDiagramElementParam
     *     The <b>dmnDiagramElement</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setDMNDiagramElement(List<JSIDiagramElement> dmnDiagramElementParam) {
        setNativeDMNDiagramElement(JsUtils.toJsArrayLike(dmnDiagramElementParam));
    }

    /**
     * Setter for <b>dmnDiagramElement</b>
     * 
     * @param dmnDiagramElementParam
     *      <b>dmnDiagramElement</b> to set.
     */
    @JsProperty(name = "dmnDiagramElement")
    public final native void setNativeDMNDiagramElement(JsArrayLike<JSIDiagramElement> dmnDiagramElementParam);

}
