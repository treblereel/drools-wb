
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
 * JSInterop adapter for <code>TContext</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITContext
        extends JSITExpression
{

    @JsOverlay
    public final static String TYPE = "DMN12.TContext";

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
        toReturn.setLocalPart("tContext");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tContext");
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
     * READ-ONLY getter for <b>contextEntry</b> as a {@link List}
     *
     * @return
     *     The <b>contextEntry</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITContextEntry> getContextEntry() {
        if (getNativeContextEntry() == null) {
            setNativeContextEntry(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeContextEntry()));
    }

    /**
     * Appends the specified element to the end of <b>contextEntry</b>
     *
     * @param element to be appended to <b>contextEntry</b>
     */
    @JsOverlay
    public final<D extends JSITContextEntry>void addContextEntry(final D element) {
        if (getNativeContextEntry() == null) {
            setNativeContextEntry(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeContextEntry(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>contextEntry</b>
     *
     * @param elements to be appended to <b>contextEntry</b>
     */
    @JsOverlay
    public final<D extends JSITContextEntry>void addAllContextEntry(D... elements) {
        if (getNativeContextEntry() == null) {
            setNativeContextEntry(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeContextEntry(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>contextEntry</b>
     *
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeContextEntry(final int index) {
        JsUtils.remove(getNativeContextEntry(), index);
    }

    /**
     * Native getter for <b>contextEntry</b>
     *
     * @return
     *     The <b>contextEntry</b> JSON property
     */
    @JsProperty(name = "contextEntry")
    public native JsArrayLike<JSITContextEntry> getNativeContextEntry();

    /**
     * Setter for <b>contextEntry</b> as a {@link List}
     *
     * @param contextEntryParam
     *     The <b>contextEntry</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setContextEntry(List<JSITContextEntry> contextEntryParam) {
        setNativeContextEntry(JsUtils.toJsArrayLike(contextEntryParam));
    }

    /**
     * Setter for <b>contextEntry</b>
     * 
     * @param contextEntryParam
     *      <b>contextEntry</b> to set.
     */
    @JsProperty(name = "contextEntry")
    public final native void setNativeContextEntry(JsArrayLike<JSITContextEntry> contextEntryParam);

}
