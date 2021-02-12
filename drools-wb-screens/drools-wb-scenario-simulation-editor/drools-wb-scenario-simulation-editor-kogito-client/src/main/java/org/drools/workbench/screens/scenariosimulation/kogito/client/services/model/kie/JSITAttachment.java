
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.kie;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>TAttachment</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSITAttachment {

    @JsOverlay
    public final static String TYPE = "KIE.TAttachment";

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
        toReturn.setLocalPart("tAttachment");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.drools.org/kie/dmn/1.2}");
        toReturn.setString("{http://www.drools.org/kie/dmn/1.2}tAttachment");
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
     * Native getter for <b>url</b>
     * 
     * @return
     *     The <b>url</b> JSON property
     */
    @JsProperty(name = "url")
    public native String getUrl();

    /**
     * Setter for <b>url</b>
     * 
     * @param urlParam
     *      <b>url</b> to set.
     */
    @JsProperty(name = "url")
    public final native void setUrl(String urlParam);

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

}
