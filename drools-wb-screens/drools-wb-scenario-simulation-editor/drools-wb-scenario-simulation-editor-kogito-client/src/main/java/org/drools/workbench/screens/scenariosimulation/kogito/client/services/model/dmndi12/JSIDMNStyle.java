
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmndi12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dc.JSIAlignmentKind;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dc.JSIColor;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.di.JSIStyle;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JSIName;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;

/**
 * JSInterop adapter for <code>DMNStyle</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class JSIDMNStyle
        extends JSIStyle
{

    @JsOverlay
    public final static String TYPE = "DMNDI12.DMNStyle";

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
        toReturn.setLocalPart("DMNStyle");
        toReturn.setPrefix("");
        toReturn.setKey("{http://www.omg.org/spec/DMN/20180521/DMNDI/}");
        toReturn.setString("{http://www.omg.org/spec/DMN/20180521/DMNDI/}DMNStyle");
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
     * Native getter for <b>fillColor</b>
     * 
     * @return
     *     The <b>fillColor</b> JSON property
     */
    @JsProperty(name = "fillColor")
    public native JSIColor getFillColor();

    /**
     * Setter for <b>fillColor</b>
     * 
     * @param fillColorParam
     *      <b>fillColor</b> to set.
     */
    @JsProperty(name = "fillColor")
    public final native void setFillColor(JSIColor fillColorParam);

    /**
     * Native getter for <b>strokeColor</b>
     * 
     * @return
     *     The <b>strokeColor</b> JSON property
     */
    @JsProperty(name = "strokeColor")
    public native JSIColor getStrokeColor();

    /**
     * Setter for <b>strokeColor</b>
     * 
     * @param strokeColorParam
     *      <b>strokeColor</b> to set.
     */
    @JsProperty(name = "strokeColor")
    public final native void setStrokeColor(JSIColor strokeColorParam);

    /**
     * Native getter for <b>fontColor</b>
     * 
     * @return
     *     The <b>fontColor</b> JSON property
     */
    @JsProperty(name = "fontColor")
    public native JSIColor getFontColor();

    /**
     * Setter for <b>fontColor</b>
     * 
     * @param fontColorParam
     *      <b>fontColor</b> to set.
     */
    @JsProperty(name = "fontColor")
    public final native void setFontColor(JSIColor fontColorParam);

    /**
     * Native getter for <b>fontFamily</b>
     * 
     * @return
     *     The <b>fontFamily</b> JSON property
     */
    @JsProperty(name = "fontFamily")
    public native String getFontFamily();

    /**
     * Setter for <b>fontFamily</b>
     * 
     * @param fontFamilyParam
     *      <b>fontFamily</b> to set.
     */
    @JsProperty(name = "fontFamily")
    public final native void setFontFamily(String fontFamilyParam);

    /**
     * Native getter for <b>fontSize</b>
     * 
     * @return
     *     The <b>fontSize</b> JSON property
     */
    @JsProperty(name = "fontSize")
    public native double getFontSize();

    /**
     * Setter for <b>fontSize</b>
     * 
     * @param fontSizeParam
     *      <b>fontSize</b> to set.
     */
    @JsProperty(name = "fontSize")
    public final native void setFontSize(double fontSizeParam);

    /**
     * Native getter for <b>fontItalic</b>
     * 
     * @return
     *     The <b>fontItalic</b> JSON property
     */
    @JsProperty(name = "fontItalic")
    public native boolean getFontItalic();

    /**
     * Setter for <b>fontItalic</b>
     * 
     * @param fontItalicParam
     *      <b>fontItalic</b> to set.
     */
    @JsProperty(name = "fontItalic")
    public final native void setFontItalic(boolean fontItalicParam);

    /**
     * Native getter for <b>fontBold</b>
     * 
     * @return
     *     The <b>fontBold</b> JSON property
     */
    @JsProperty(name = "fontBold")
    public native boolean getFontBold();

    /**
     * Setter for <b>fontBold</b>
     * 
     * @param fontBoldParam
     *      <b>fontBold</b> to set.
     */
    @JsProperty(name = "fontBold")
    public final native void setFontBold(boolean fontBoldParam);

    /**
     * Native getter for <b>fontUnderline</b>
     * 
     * @return
     *     The <b>fontUnderline</b> JSON property
     */
    @JsProperty(name = "fontUnderline")
    public native boolean getFontUnderline();

    /**
     * Setter for <b>fontUnderline</b>
     * 
     * @param fontUnderlineParam
     *      <b>fontUnderline</b> to set.
     */
    @JsProperty(name = "fontUnderline")
    public final native void setFontUnderline(boolean fontUnderlineParam);

    /**
     * Native getter for <b>fontStrikeThrough</b>
     * 
     * @return
     *     The <b>fontStrikeThrough</b> JSON property
     */
    @JsProperty(name = "fontStrikeThrough")
    public native boolean getFontStrikeThrough();

    /**
     * Setter for <b>fontStrikeThrough</b>
     * 
     * @param fontStrikeThroughParam
     *      <b>fontStrikeThrough</b> to set.
     */
    @JsProperty(name = "fontStrikeThrough")
    public final native void setFontStrikeThrough(boolean fontStrikeThroughParam);

    /**
     * Native getter for <b>labelHorizontalAlignement</b>
     * 
     * @return
     *     The <b>labelHorizontalAlignement</b> JSON property
     */
    @JsProperty(name = "labelHorizontalAlignement")
    public native JSIAlignmentKind getLabelHorizontalAlignement();

    /**
     * Setter for <b>labelHorizontalAlignement</b>
     * 
     * @param labelHorizontalAlignementParam
     *      <b>labelHorizontalAlignement</b> to set.
     */
    @JsProperty(name = "labelHorizontalAlignement")
    public final native void setLabelHorizontalAlignement(JSIAlignmentKind labelHorizontalAlignementParam);

    /**
     * Native getter for <b>labelVerticalAlignment</b>
     * 
     * @return
     *     The <b>labelVerticalAlignment</b> JSON property
     */
    @JsProperty(name = "labelVerticalAlignment")
    public native JSIAlignmentKind getLabelVerticalAlignment();

    /**
     * Setter for <b>labelVerticalAlignment</b>
     * 
     * @param labelVerticalAlignmentParam
     *      <b>labelVerticalAlignment</b> to set.
     */
    @JsProperty(name = "labelVerticalAlignment")
    public final native void setLabelVerticalAlignment(JSIAlignmentKind labelVerticalAlignmentParam);

}
