
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
 * JSInterop adapter for <code>TRelation</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITRelation
        extends JSITExpression
{

    @JsOverlay
    public final static String TYPE = "DMN12.TRelation";

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
        toReturn.setLocalPart("tRelation");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tRelation");
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
     * READ-ONLY getter for <b>column</b> as a {@link List}
     * 
     * @return
     *     The <b>column</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITInformationItem> getColumn() {
        if (getNativeColumn() == null) {
            setNativeColumn(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeColumn()));
    }

    /**
     * Appends the specified element to the end of <b>column</b>
     * 
     * @param element to be appended to <b>column</b>
     */
    @JsOverlay
    public final<D extends JSITInformationItem>void addColumn(final D element) {
        if (getNativeColumn() == null) {
            setNativeColumn(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeColumn(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>column</b>
     * 
     * @param elements to be appended to <b>column</b>
     */
    @JsOverlay
    public final<D extends JSITInformationItem>void addAllColumn(D... elements) {
        if (getNativeColumn() == null) {
            setNativeColumn(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeColumn(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>column</b>
     * 
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeColumn(final int index) {
        JsUtils.remove(getNativeColumn(), index);
    }

    /**
     * Native getter for <b>column</b>
     * 
     * @return
     *     The <b>column</b> JSON property
     */
    @JsProperty(name = "column")
    public native JsArrayLike<JSITInformationItem> getNativeColumn();

    /**
     * Setter for <b>column</b> as a {@link List}
     * 
     * @param columnParam
     *     The <b>column</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setColumn(List<JSITInformationItem> columnParam) {
        setNativeColumn(JsUtils.toJsArrayLike(columnParam));
    }

    /**
     * Setter for <b>column</b>
     * 
     * @param columnParam
     *      <b>column</b> to set.
     */
    @JsProperty(name = "column")
    public final native void setNativeColumn(JsArrayLike<JSITInformationItem> columnParam);

    /**
     * READ-ONLY getter for <b>row</b> as a {@link List}
     * 
     * @return
     *     The <b>row</b> mapped as a {@link List}
     */
    @JsOverlay
    public final List<JSITList> getRow() {
        if (getNativeRow() == null) {
            setNativeRow(JsUtils.getNativeArray());
        }
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeRow()));
    }

    /**
     * Appends the specified element to the end of <b>row</b>
     * 
     * @param element to be appended to <b>row</b>
     */
    @JsOverlay
    public final<D extends JSITList>void addRow(final D element) {
        if (getNativeRow() == null) {
            setNativeRow(JsUtils.getNativeArray());
        }
        JsUtils.add(getNativeRow(), element);
    }

    /**
     * Iterates over the specified collection of elements, and adds each element returned by the iterator
     * to the end of <b>row</b>
     * 
     * @param elements to be appended to <b>row</b>
     */
    @JsOverlay
    public final<D extends JSITList>void addAllRow(D... elements) {
        if (getNativeRow() == null) {
            setNativeRow(JsUtils.getNativeArray());
        }
        JsUtils.addAll(getNativeRow(), elements);
    }

    /**
     * Removes the element at the specified position in the <b>row</b>
     * 
     * @param index of the element to be removed
     */
    @JsOverlay
    public final void removeRow(final int index) {
        JsUtils.remove(getNativeRow(), index);
    }

    /**
     * Native getter for <b>row</b>
     * 
     * @return
     *     The <b>row</b> JSON property
     */
    @JsProperty(name = "row")
    public native JsArrayLike<JSITList> getNativeRow();

    /**
     * Setter for <b>row</b> as a {@link List}
     * 
     * @param rowParam
     *     The <b>row</b> mapped as a {@link List}
     */
    @JsOverlay
    public final void setRow(List<JSITList> rowParam) {
        setNativeRow(JsUtils.toJsArrayLike(rowParam));
    }

    /**
     * Setter for <b>row</b>
     * 
     * @param rowParam
     *      <b>row</b> to set.
     */
    @JsProperty(name = "row")
    public final native void setNativeRow(JsArrayLike<JSITList> rowParam);

}
