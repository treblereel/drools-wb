
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
 * JSInterop adapter for <code>TElementCollection</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITElementCollection
        extends JSITNamedElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TElementCollection";

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
        toReturn.setLocalPart("tElementCollection");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tElementCollection");
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
     * READ-ONLY getter for <b>drgElement</b> as a {@link List}
     * 
     * @return
     *     The <b>drgElement</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getDrgElement() {
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
    public final<D extends JSITDMNElementReference>void addDrgElement(final D element) {
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
    public final<D extends JSITDMNElementReference>void addAllDrgElement(D... elements) {
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
    public native JsArrayLike<JSITDMNElementReference> getNativeDrgElement();

    /**
     * Setter for <b>drgElement</b> as a {@link List}
     * 
     * @param drgElementParam
     *     The <b>drgElement</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setDrgElement(List<JSITDMNElementReference> drgElementParam) {
        setNativeDrgElement(JsUtils.toJsArrayLike(drgElementParam));
    }

    /**
     * Setter for <b>drgElement</b>
     * 
     * @param drgElementParam
     *      <b>drgElement</b> to set.
     */
    @JsProperty(name = "drgElement")
    public final native void setNativeDrgElement(JsArrayLike<JSITDMNElementReference> drgElementParam);

}
