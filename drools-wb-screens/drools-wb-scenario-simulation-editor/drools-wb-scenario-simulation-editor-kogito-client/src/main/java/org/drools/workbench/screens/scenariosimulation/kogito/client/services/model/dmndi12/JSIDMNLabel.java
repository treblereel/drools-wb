
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmndi12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.di.JSIShape;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>DMNLabel</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSIDMNLabel
        extends JSIShape
{

    @JsOverlay
    public final static String TYPE = "DMNDI12.DMNLabel";

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
        toReturn.setLocalPart("DMNLabel");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/DMNDI/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/DMNDI/}DMNLabel");
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
     * Native getter for <b>text</b>
     * 
     * @return
     *     The <b>text</b> JSON property
     */
    @JsProperty(name = "text")
    public native String getText();

    /**
     * Setter for <b>text</b>
     * 
     * @param textParam
     *      <b>text</b> to set.
     */
    @JsProperty(name = "text")
    public final native void setText(String textParam);

}
