
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.di;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dc.JSIBounds;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>Shape</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSIShape
        extends JSIDiagramElement
{

    @JsOverlay
    public final static String TYPE = "DI.Shape";

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
        toReturn.setLocalPart("Shape");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/DI/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/DI/}Shape");
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
     * Native getter for <b>bounds</b>
     * 
     * @return
     *     The <b>bounds</b> JSON property
     */
    @JsProperty(name = "bounds")
    public native JSIBounds getBounds();

    /**
     * Setter for <b>bounds</b>
     * 
     * @param boundsParam
     *      <b>bounds</b> to set.
     */
    @JsProperty(name = "bounds")
    public final native void setBounds(JSIBounds boundsParam);

}
