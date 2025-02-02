// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.5.0, build 090727.2000.36696)

package cl.bicevida.envionominas.model.types.ws.bicevida.services.envionominas.runtime;

import oracle.j2ee.ws.common.encoding.*;
import oracle.j2ee.ws.common.encoding.literal.*;
import oracle.j2ee.ws.common.encoding.literal.DetailFragmentDeserializer;
import oracle.j2ee.ws.common.encoding.simpletype.*;
import oracle.j2ee.ws.common.soap.SOAPEncodingConstants;
import oracle.j2ee.ws.common.soap.SOAPEnvelopeConstants;
import oracle.j2ee.ws.common.soap.SOAPVersion;
import oracle.j2ee.ws.common.streaming.*;
import oracle.j2ee.ws.common.wsdl.document.schema.SchemaConstants;
import oracle.j2ee.ws.common.util.xml.UUID;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.AttachmentPart;

public class CamposVariables__LiteralSerializersrc extends LiteralObjectSerializerBase implements Initializable {
    private static final QName ns1_campoVariable_QNAME = new QName("http://bicevida.ws/services/envionominas", "campoVariable");
    private static final QName ns1_CampoVariableType_TYPE_QNAME = new QName("http://bicevida.ws/services/envionominas", "CampoVariableType");
    private CombinedSerializer myns1_CampoVariableType__CampoVariableType__LiteralSerializersrc;
    
    public CamposVariables__LiteralSerializersrc(QName type) {
        this(type,  false);
    }
    
    public CamposVariables__LiteralSerializersrc(QName type, boolean encodeType) {
        super(type, true, encodeType);
        setSOAPVersion(SOAPVersion.SOAP_11);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        myns1_CampoVariableType__CampoVariableType__LiteralSerializersrc = (CombinedSerializer)registry.getSerializer("", cl.bicevida.envionominas.model.types.ws.bicevida.services.envionominas.CampoVariableType.class, ns1_CampoVariableType_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        cl.bicevida.envionominas.model.types.ws.bicevida.services.envionominas.CamposVariables instance = new cl.bicevida.envionominas.model.types.ws.bicevida.services.envionominas.CamposVariables();
        java.lang.Object member=null;
        QName elementName;
        List values;
        java.lang.Object value;
        
        reader.nextElementContent();
        java.util.HashSet requiredElements = new java.util.HashSet();
        requiredElements.add("campoVariable");
        elementName = reader.getName();
        if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_campoVariable_QNAME))) {
            values = new ArrayList();
            for(;;) {
                elementName = reader.getName();
                if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_campoVariable_QNAME))) {
                    myns1_CampoVariableType__CampoVariableType__LiteralSerializersrc.setNullable( false );
                    context.setNillable( false );
                    value = myns1_CampoVariableType__CampoVariableType__LiteralSerializersrc.deserialize(ns1_campoVariable_QNAME, reader, context);
                    requiredElements.remove("campoVariable");
                    if (value == null) {
                        throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                    }
                    values.add(value);
                    reader.nextElementContent();
                } else {
                    break;
                }
            }
            member = new cl.bicevida.envionominas.model.types.ws.bicevida.services.envionominas.CampoVariableType[values.size()];
            member = values.toArray((java.lang.Object[]) member);
            instance.setCampoVariable((cl.bicevida.envionominas.model.types.ws.bicevida.services.envionominas.CampoVariableType[])member);
        }
        else if(!(reader.getState() == XMLReader.END)) {
        }
        if (!requiredElements.isEmpty()) {
            throw new DeserializationException( "literal.expectedElementName" , requiredElements.iterator().next().toString(), DeserializationException.FAULT_CODE_CLIENT );
        }
        
        if( reader.getState() != XMLReader.END)
        {
            reader.skipElement();
        }
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (java.lang.Object)instance;
    }
    
    public void doSerializeAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        cl.bicevida.envionominas.model.types.ws.bicevida.services.envionominas.CamposVariables instance = (cl.bicevida.envionominas.model.types.ws.bicevida.services.envionominas.CamposVariables)obj;
        
    }
    public void doSerializeAnyAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        cl.bicevida.envionominas.model.types.ws.bicevida.services.envionominas.CamposVariables instance = (cl.bicevida.envionominas.model.types.ws.bicevida.services.envionominas.CamposVariables)obj;
        
    }
    public void doSerialize(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        cl.bicevida.envionominas.model.types.ws.bicevida.services.envionominas.CamposVariables instance = (cl.bicevida.envionominas.model.types.ws.bicevida.services.envionominas.CamposVariables)obj;
        
        if (instance.getCampoVariable() != null) {
            for (int i = 0; i < instance.getCampoVariable().length; ++i) {
                if(instance.getCampoVariable()[i] == null) {
                    throw new SerializationException("literal.unexpectedNull");
                }
                myns1_CampoVariableType__CampoVariableType__LiteralSerializersrc.setNullable( false );
                context.setNillable( false );
                myns1_CampoVariableType__CampoVariableType__LiteralSerializersrc.serialize(instance.getCampoVariable()[i], ns1_campoVariable_QNAME, null, writer, context);
            }
        }
    }
}
