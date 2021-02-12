
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmndi12;

import javax.xml.namespace.QName;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.di.JSIEdge;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>DMNEdge</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSIDMNEdge
        extends JSIEdge
{

    @JsOverlay
    public final static String TYPE = "DMNDI12.DMNEdge";

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
        toReturn.setLocalPart("DMNEdge");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/DMNDI/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/DMNDI/}DMNEdge");
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
     * Native getter for <b>dmnLabel</b>
     * 
     * @return
     *     The <b>dmnLabel</b> JSON property
     */
    @JsProperty(name = "dmnLabel")
    public native JSIDMNLabel getDMNLabel();

    /**
     * Setter for <b>dmnLabel</b>
     * 
     * @param dmnLabelParam
     *      <b>dmnLabel</b> to set.
     */
    @JsProperty(name = "dmnLabel")
    public final native void setDMNLabel(JSIDMNLabel dmnLabelParam);

    /**
     * Native getter for <b>dmnElementRef</b>
     * 
     * @return
     *     The <b>dmnElementRef</b> JSON property
     */
    @JsProperty(name = "dmnElementRef")
    public native QName getDmnElementRef();

    /**
     * Setter for <b>dmnElementRef</b>
     * 
     * @param dmnElementRefParam
     *      <b>dmnElementRef</b> to set.
     */
    @JsProperty(name = "dmnElementRef")
    public final native void setDmnElementRef(QName dmnElementRefParam);

}
