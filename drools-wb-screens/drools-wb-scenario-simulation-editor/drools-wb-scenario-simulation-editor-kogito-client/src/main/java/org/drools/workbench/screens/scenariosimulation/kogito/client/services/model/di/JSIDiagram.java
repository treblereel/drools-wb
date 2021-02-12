
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.di;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>Diagram</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSIDiagram
        extends JSIDiagramElement
{

    @JsOverlay
    public final static String TYPE = "DI.Diagram";

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
        toReturn.setLocalPart("Diagram");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/DI/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/DI/}Diagram");
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
     * Native getter for <b>name</b>
     * 
     * @return
     *     The <b>name</b> JSON property
     */
    @JsProperty(name = "name")
    public native String getName();

    /**
     * Setter for <b>name</b>
     * 
     * @param nameParam
     *      <b>name</b> to set.
     */
    @JsProperty(name = "name")
    public final native void setName(String nameParam);

    /**
     * Native getter for <b>documentation</b>
     * 
     * @return
     *     The <b>documentation</b> JSON property
     */
    @JsProperty(name = "documentation")
    public native String getDocumentation();

    /**
     * Setter for <b>documentation</b>
     * 
     * @param documentationParam
     *      <b>documentation</b> to set.
     */
    @JsProperty(name = "documentation")
    public final native void setDocumentation(String documentationParam);

    /**
     * Native getter for <b>resolution</b>
     * 
     * @return
     *     The <b>resolution</b> JSON property
     */
    @JsProperty(name = "resolution")
    public native double getResolution();

    /**
     * Setter for <b>resolution</b>
     * 
     * @param resolutionParam
     *      <b>resolution</b> to set.
     */
    @JsProperty(name = "resolution")
    public final native void setResolution(double resolutionParam);

}
