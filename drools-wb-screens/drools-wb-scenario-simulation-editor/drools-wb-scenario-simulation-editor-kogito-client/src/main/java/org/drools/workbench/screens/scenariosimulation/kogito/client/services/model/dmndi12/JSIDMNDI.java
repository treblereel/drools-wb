
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmndi12;

import java.util.List;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>DMNDI</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSIDMNDI {

    @JsOverlay
    public final static String TYPE = "DMNDI12.DMNDI";

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
        toReturn.setLocalPart("DMNDI");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/DMNDI/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/DMNDI/}DMNDI");
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
     * READ-ONLY getter for <b>dmnDiagram</b> as a {@link List}
     * 
     * @return
     *     The <b>dmnDiagram</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSIDMNDiagram> getDMNDiagram() {
        if (getNativeDMNDiagram() == null) {
            setNativeDMNDiagram(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeDMNDiagram()));
    }

    /**
     * Appends the specified element to the end of <b>dmnDiagram</b>
     * 
     * @param element to be appended to <b>dmnDiagram</b>
     */
    @JsOverlay
    public final<D extends JSIDMNDiagram>void addDMNDiagram(final D element) {
        if (getNativeDMNDiagram() == null) {
            setNativeDMNDiagram(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeDMNDiagram(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>dmnDiagram</b>
     * 
     * @param elements to be appended to <b>dmnDiagram</b>
     */
    @JsOverlay
    public final<D extends JSIDMNDiagram>void addAllDMNDiagram(D... elements) {
        if (getNativeDMNDiagram() == null) {
            setNativeDMNDiagram(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeDMNDiagram(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>dmnDiagram</b>
     * 
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeDMNDiagram(final int index) {
        JsUtils.remove(getNativeDMNDiagram(), index);
    }

    /**
     * Native getter for <b>dmnDiagram</b>
     * 
     * @return
     *     The <b>dmnDiagram</b> JSON property
     */
    @JsProperty(name = "dmnDiagram")
    public native JsArrayLike<JSIDMNDiagram> getNativeDMNDiagram();

    /**
     * Setter for <b>dmnDiagram</b> as a {@link List}
     * 
     * @param dmnDiagramParam
     *     The <b>dmnDiagram</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setDMNDiagram(List<JSIDMNDiagram> dmnDiagramParam) {
        setNativeDMNDiagram(JsUtils.toJsArrayLike(dmnDiagramParam));
    }

    /**
     * Setter for <b>dmnDiagram</b>
     * 
     * @param dmnDiagramParam
     *      <b>dmnDiagram</b> to set.
     */
    @JsProperty(name = "dmnDiagram")
    public final native void setNativeDMNDiagram(JsArrayLike<JSIDMNDiagram> dmnDiagramParam);

    /**
     * READ-ONLY getter for <b>dmnStyle</b> as a {@link List}
     * 
     * @return
     *     The <b>dmnStyle</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSIDMNStyle> getDMNStyle() {
        if (getNativeDMNStyle() == null) {
            setNativeDMNStyle(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeDMNStyle()));
    }

    /**
     * Appends the specified element to the end of <b>dmnStyle</b>
     *
     * @param element to be appended to <b>dmnStyle</b>
     */
    @JsOverlay
    public final<D extends JSIDMNStyle>void addDMNStyle(final D element) {
        if (getNativeDMNStyle() == null) {
            setNativeDMNStyle(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeDMNStyle(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>dmnStyle</b>
     *
     * @param elements to be appended to <b>dmnStyle</b>
     */
    @JsOverlay
    public final<D extends JSIDMNStyle>void addAllDMNStyle(D... elements) {
        if (getNativeDMNStyle() == null) {
            setNativeDMNStyle(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeDMNStyle(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>dmnStyle</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeDMNStyle(final int index) {
        JsUtils.remove(getNativeDMNStyle(), index);
    }

    /**
     * Native getter for <b>dmnStyle</b>
     *
     * @return
     *     The <b>dmnStyle</b> JSON property
     */
    @JsProperty(name = "dmnStyle")
    public native JsArrayLike<JSIDMNStyle> getNativeDMNStyle();

    /**
     * Setter for <b>dmnStyle</b> as a {@link List}
     *
     * @param dmnStyleParam
     *     The <b>dmnStyle</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setDMNStyle(List<JSIDMNStyle> dmnStyleParam) {
        setNativeDMNStyle(JsUtils.toJsArrayLike(dmnStyleParam));
    }

    /**
     * Setter for <b>dmnStyle</b>
     * 
     * @param dmnStyleParam
     *      <b>dmnStyle</b> to set.
     */
    @JsProperty(name = "dmnStyle")
    public final native void setNativeDMNStyle(JsArrayLike<JSIDMNStyle> dmnStyleParam);

}
