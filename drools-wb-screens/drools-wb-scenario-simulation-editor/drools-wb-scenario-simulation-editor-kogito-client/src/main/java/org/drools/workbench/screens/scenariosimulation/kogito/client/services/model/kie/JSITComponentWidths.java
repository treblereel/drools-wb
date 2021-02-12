
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.kie;

import java.util.ArrayList;
import java.util.List;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>TComponentWidths</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITComponentWidths {

    @JsOverlay
    public final static String TYPE = "KIE.TComponentWidths";

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
        toReturn.setNamespaceURI("http://www.drools.org/kie/dmn/1.2");
        toReturn.setLocalPart("tComponentWidths");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.drools.org/kie/dmn/1.2}");
        toReturn.setString("{http://www.drools.org/kie/dmn/1.2}tComponentWidths");
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
     * READ-ONLY getter for <b>width</b> as a {@link List}
     * 
     * @return
     *     The <b>width</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<Float> getWidth() {
        if (getNativeWidth() == null) {
            setNativeWidth(new float[] { });
        }
        float[] original = getNativeWidth();
        final List<Float> toReturn = new ArrayList<Float>();
        for (int i = 0; (i<original.length); i ++) {
            toReturn.add(original[i]);
        }
        return toReturn;
    }

    /**
     * Appends the specified element to the end of <b>width</b>
     * 
     * @param element to be appended to <b>width</b>
     */
    @JsOverlay
    public final void addWidth(final float element) {
        if (getNativeWidth() == null) {
            setNativeWidth(new float[] { });
        }
        float[] original = getNativeWidth();
        float[] toSet = new float[(original.length + 1)] ;
        System.arraycopy(original, 0, toSet, 0, original.length);
        toSet[(toSet.length- 1)] = element;
        setNativeWidth(toSet);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>width</b>
     * 
     * @param elements to be appended to <b>width</b>
     */
    @JsOverlay
    public final void addAllWidth(float... elements) {
        for (int i = 0; (i<elements.length); i ++) {
            addWidth(elements[i]);
        }
    }

    /**
     * Removes the element at the specified position in the <b>width</b>
     * 
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeWidth(final int index) {
        if (getNativeWidth() == null) {
            setNativeWidth(new float[] { });
        }
        float[] original = getNativeWidth();
        if ((original.length< 1)||((index< 0)||(index >= original.length))) {
            return ;
        }
        float[] toSet = new float[(original.length- 1)] ;
        int counter = 0;
        for (int i = 0; (i<original.length); i ++) {
            if (i == index) {
                continue;
            }
            toSet[counter] = original[i];
            counter += 1;
        }
        setNativeWidth(toSet);
    }

    /**
     * Native getter for <b>width</b>
     * 
     * @return
     *     The <b>width</b> JSON property
     */
    @JsProperty(name = "width")
    public native float[] getNativeWidth();

    /**
     * Setter for <b>width</b> as a {@link List}
     * 
     * @param widthParam
     *     The <b>width</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setWidth(List<Float> widthParam) {
        float[] toSet = new float[widthParam.size()] ;
        for (int i = 0; (i<toSet.length); i ++) {
            toSet[i] = widthParam.get(i);
        }
        setNativeWidth(toSet);
    }

    /**
     * Setter for <b>width</b>
     * 
     * @param widthParam
     *      <b>width</b> to set.
     */
    @JsProperty(name = "width")
    public final native void setNativeWidth(float[] widthParam);

    /**
     * Native getter for <b>dmnElementRef</b>
     * 
     * @return
     *     The <b>dmnElementRef</b> JSON property
     */
    @JsProperty(name = "dmnElementRef")
    public native String getDmnElementRef();

    /**
     * Setter for <b>dmnElementRef</b>
     * 
     * @param dmnElementRefParam
     *      <b>dmnElementRef</b> to set.
     */
    @JsProperty(name = "dmnElementRef")
    public final native void setDmnElementRef(String dmnElementRefParam);

}
