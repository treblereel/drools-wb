
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.di;

import java.util.List;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dc.JSIPoint;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>Edge</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSIEdge
        extends JSIDiagramElement
{

    @JsOverlay
    public final static String TYPE = "DI.Edge";

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
        toReturn.setNamespaceURI("http://www.omg.org/spec/DMN/20180521/DI/");
        toReturn.setLocalPart("Edge");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/DI/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/DI/}Edge");
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
     * READ-ONLY getter for <b>waypoint</b> as a {@link List}
     * 
     * @return
     *     The <b>waypoint</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSIPoint> getWaypoint() {
        if (getNativeWaypoint() == null) {
            setNativeWaypoint(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeWaypoint()));
    }

    /**
     * Appends the specified element to the end of <b>waypoint</b>
     * 
     * @param element to be appended to <b>waypoint</b>
     */
    @JsOverlay
    public final<D extends JSIPoint>void addWaypoint(final D element) {
        if (getNativeWaypoint() == null) {
            setNativeWaypoint(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeWaypoint(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>waypoint</b>
     * 
     * @param elements to be appended to <b>waypoint</b>
     */
    @JsOverlay
    public final<D extends JSIPoint>void addAllWaypoint(D... elements) {
        if (getNativeWaypoint() == null) {
            setNativeWaypoint(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeWaypoint(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>waypoint</b>
     * 
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeWaypoint(final int index) {
        JsUtils.remove(getNativeWaypoint(), index);
    }

    /**
     * Native getter for <b>waypoint</b>
     * 
     * @return
     *     The <b>waypoint</b> JSON property
     */
    @JsProperty(name = "waypoint")
    public native JsArrayLike<JSIPoint> getNativeWaypoint();

    /**
     * Setter for <b>waypoint</b> as a {@link List}
     * 
     * @param waypointParam
     *     The <b>waypoint</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setWaypoint(List<JSIPoint> waypointParam) {
        setNativeWaypoint(JsUtils.toJsArrayLike(waypointParam));
    }

    /**
     * Setter for <b>waypoint</b>
     * 
     * @param waypointParam
     *      <b>waypoint</b> to set.
     */
    @JsProperty(name = "waypoint")
    public final native void setNativeWaypoint(JsArrayLike<JSIPoint> waypointParam);

}
