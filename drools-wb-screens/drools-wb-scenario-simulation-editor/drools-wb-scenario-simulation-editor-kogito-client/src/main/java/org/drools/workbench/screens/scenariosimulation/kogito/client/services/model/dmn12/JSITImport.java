
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>TImport</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITImport
        extends JSITNamedElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TImport";

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
        toReturn.setLocalPart("tImport");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/MODEL/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/MODEL/}tImport");
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
     * Native getter for <b>locationURI</b>
     * 
     * @return
     *     The <b>locationURI</b> JSON property
     */
    @JsProperty(name = "locationURI")
    public native String getLocationURI();

    /**
     * Setter for <b>locationURI</b>
     * 
     * @param locationURIParam
     *      <b>locationURI</b> to set.
     */
    @JsProperty(name = "locationURI")
    public final native void setLocationURI(String locationURIParam);

    /**
     * Native getter for <b>importType</b>
     * 
     * @return
     *     The <b>importType</b> JSON property
     */
    @JsProperty(name = "importType")
    public native String getImportType();

    /**
     * Setter for <b>importType</b>
     * 
     * @param importTypeParam
     *      <b>importType</b> to set.
     */
    @JsProperty(name = "importType")
    public final native void setImportType(String importTypeParam);

}
