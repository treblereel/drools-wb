
package org.drools.workbench.screens.scenariosimulation.kogito.client.services.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.callbacks.DCMarshallCallback;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.callbacks.DCUnmarshallCallback;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.callbacks.DIMarshallCallback;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.callbacks.DIUnmarshallCallback;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.callbacks.DMN12MarshallCallback;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.callbacks.DMN12UnmarshallCallback;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.callbacks.DMNDI12MarshallCallback;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.callbacks.DMNDI12UnmarshallCallback;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.callbacks.KIEMarshallCallback;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.callbacks.KIEUnmarshallCallback;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dc.DC;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.di.DI;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmn12.DMN12;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.dmndi12.DMNDI12;
import org.drools.workbench.screens.scenariosimulation.kogito.client.services.model.kie.KIE;

/**
 * JSInterop adapter to use for marshalling/unmarshalling.
 * 
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class MainJs {


    @JsOverlay
    private static JSONObject getJSONObjectMethod(String name, String typeName, String nameSpace) {
        final JSONObject toReturn = new JSONObject();
        toReturn.put("name", new JSONString(name));
        if (typeName!= null) {
            toReturn.put("typeName", new JSONString(typeName));
        }
        if (nameSpace!= null) {
            toReturn.put("nameSpace", new JSONString(nameSpace));
        }
        return toReturn;
    }

    @JsOverlay
    public static JsPropertyMap getConstructorsMap() {
        final JsPropertyMap toReturn = JsPropertyMap.of();
        final JSONObject[] toSet = new JSONObject[] {getJSONObjectMethod("JsInterop__ConstructorAPI__org__kie__workbench__common__dmn__webapp__kogito__marshaller__mapper__JSIName", null, null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMNDI12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmndi12__JSIDMNDI", "DMNDI12.DMNDI", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMNDI12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmndi12__JSIDMNDiagram", "DMNDI12.DMNDiagram", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMNDI12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmndi12__JSIDMNStyle", "DMNDI12.DMNStyle", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMNDI12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmndi12__JSIDMNShape", "DMNDI12.DMNShape", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMNDI12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmndi12__JSIDMNLabel", "DMNDI12.DMNLabel", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMNDI12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmndi12__JSIDMNDecisionServiceDividerLine", "DMNDI12.DMNDecisionServiceDividerLine", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMNDI12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmndi12__JSIDMNEdge", "DMNDI12.DMNEdge", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITDMNElement", "DMN12.TDMNElement", null), getJSONObjectMethod("ExtensionElements", "DMN12.TDMNElement.ExtensionElements", "JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITDMNElement"), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITNamedElement", "DMN12.TNamedElement", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITDefinitions", "DMN12.TDefinitions", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITImport", "DMN12.TImport", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITItemDefinition", "DMN12.TItemDefinition", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITUnaryTests", "DMN12.TUnaryTests", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITDRGElement", "DMN12.TDRGElement", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITArtifact", "DMN12.TArtifact", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITElementCollection", "DMN12.TElementCollection", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITDMNElementReference", "DMN12.TDMNElementReference", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITBusinessContextElement", "DMN12.TBusinessContextElement", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITDecision", "DMN12.TDecision", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITInformationItem", "DMN12.TInformationItem", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITInformationRequirement", "DMN12.TInformationRequirement", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITKnowledgeRequirement", "DMN12.TKnowledgeRequirement", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITAuthorityRequirement", "DMN12.TAuthorityRequirement", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITExpression", "DMN12.TExpression", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITPerformanceIndicator", "DMN12.TPerformanceIndicator", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITOrganizationUnit", "DMN12.TOrganizationUnit", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITInvocable", "DMN12.TInvocable", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITBusinessKnowledgeModel", "DMN12.TBusinessKnowledgeModel", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITFunctionDefinition", "DMN12.TFunctionDefinition", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITInputData", "DMN12.TInputData", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITKnowledgeSource", "DMN12.TKnowledgeSource", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITLiteralExpression", "DMN12.TLiteralExpression", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITImportedValues", "DMN12.TImportedValues", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITInvocation", "DMN12.TInvocation", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITBinding", "DMN12.TBinding", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITDecisionTable", "DMN12.TDecisionTable", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITInputClause", "DMN12.TInputClause", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITOutputClause", "DMN12.TOutputClause", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITRuleAnnotationClause", "DMN12.TRuleAnnotationClause", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITDecisionRule", "DMN12.TDecisionRule", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITRuleAnnotation", "DMN12.TRuleAnnotation", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITTextAnnotation", "DMN12.TTextAnnotation", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITAssociation", "DMN12.TAssociation", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITContext", "DMN12.TContext", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITContextEntry", "DMN12.TContextEntry", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITRelation", "DMN12.TRelation", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITList", "DMN12.TList", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DMN12__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dmn12__JSITDecisionService", "DMN12.TDecisionService", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DI__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__di__JSIDiagramElement", "DI.DiagramElement", null), getJSONObjectMethod("Extension", "DI.DiagramElement.Extension", "JsInterop__ConstructorAPI__DI__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__di__JSIDiagramElement"), getJSONObjectMethod("JsInterop__ConstructorAPI__DI__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__di__JSIStyle", "DI.Style", null), getJSONObjectMethod("Extension", "DI.Style.Extension", "JsInterop__ConstructorAPI__DI__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__di__JSIStyle"), getJSONObjectMethod("JsInterop__ConstructorAPI__DI__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__di__JSIDiagram", "DI.Diagram", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DI__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__di__JSIShape", "DI.Shape", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DI__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__di__JSIEdge", "DI.Edge", null), getJSONObjectMethod("JsInterop__ConstructorAPI__KIE__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__kie__JSITComponentsWidthsExtension", "KIE.TComponentsWidthsExtension", null), getJSONObjectMethod("JsInterop__ConstructorAPI__KIE__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__kie__JSITComponentWidths", "KIE.TComponentWidths", null), getJSONObjectMethod("JsInterop__ConstructorAPI__KIE__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__kie__JSITAttachment", "KIE.TAttachment", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DC__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dc__JSIDimension", "DC.Dimension", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DC__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dc__JSIColor", "DC.Color", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DC__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dc__JSIBounds", "DC.Bounds", null), getJSONObjectMethod("JsInterop__ConstructorAPI__DC__org__kie__workbench__common__dmn__webapp__kogito__marshaller__js__model__dc__JSIPoint", "DC.Point", null)};
        toReturn.set("constructors", toSet);
        return toReturn;
    }

    @JsMethod
    public final static native void initializeJsInteropConstructors(JsPropertyMap constructorsMap);

    @JsMethod
    public final static native void unmarshall(String xmlString, String dynamicNamespace, DCUnmarshallCallback dCUnmarshallCallback);

    @JsMethod
    public final static native void marshall(DC dC, JavaScriptObject namespaces, DCMarshallCallback dCMarshallCallback);

    @JsMethod
    public final static native void unmarshall(String xmlString, String dynamicNamespace, KIEUnmarshallCallback kIEUnmarshallCallback);

    @JsMethod
    public final static native void marshall(KIE kIE, JavaScriptObject namespaces, KIEMarshallCallback kIEMarshallCallback);

    @JsMethod
    public final static native void unmarshall(String xmlString, String dynamicNamespace, DMN12UnmarshallCallback dMN12UnmarshallCallback);

    @JsMethod
    public final static native void marshall(DMN12 dMN12, JavaScriptObject namespaces, DMN12MarshallCallback dMN12MarshallCallback);

    @JsMethod
    public final static native void unmarshall(String xmlString, String dynamicNamespace, DMNDI12UnmarshallCallback dMNDI12UnmarshallCallback);

    @JsMethod
    public final static native void marshall(DMNDI12 dMNDI12, JavaScriptObject namespaces, DMNDI12MarshallCallback dMNDI12MarshallCallback);

    @JsMethod
    public final static native void unmarshall(String xmlString, String dynamicNamespace, DIUnmarshallCallback dIUnmarshallCallback);

    @JsMethod
    public final static native void marshall(DI dI, JavaScriptObject namespaces, DIMarshallCallback dIMarshallCallback);

}
