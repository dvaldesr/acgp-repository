// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.0.0, build 060119.1546.05277)

package cl.bicevida.core.model.services.ws.proxy.oid.runtime;

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

public class OidBasicWebServiceSoapHttp_existsUser_RespS_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable {
    private static final QName ns1_result_QNAME = new QName("", "result");
    private static final QName ns2_boolean_TYPE_QNAME = SchemaConstants.QNAME_TYPE_BOOLEAN;
    private CombinedSerializer myns2__boolean__boolean_Boolean_Serializer;
    
    public OidBasicWebServiceSoapHttp_existsUser_RespS_LiteralSerializer(QName type) {
        this(type,  false);
    }
    
    public OidBasicWebServiceSoapHttp_existsUser_RespS_LiteralSerializer(QName type, boolean encodeType) {
        super(type, true, encodeType);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        myns2__boolean__boolean_Boolean_Serializer = (CombinedSerializer)registry.getSerializer("", boolean.class, ns2_boolean_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        cl.bicevida.core.model.services.ws.proxy.oid.runtime.OidBasicWebServiceSoapHttp_existsUser_RespS instance = new cl.bicevida.core.model.services.ws.proxy.oid.runtime.OidBasicWebServiceSoapHttp_existsUser_RespS();
        java.lang.Object member=null;
        QName elementName;
        List values;
        java.lang.Object value;
        
        reader.nextElementContent();
        // SOAP 1.2 deserializer result element
        if (reader.getState() == XMLReader.START) {
            if(reader.getName().equals(SOAPEnvelopeConstants.getSOAPEnvelopeConstants(SOAPVersion.SOAP_12).getQNameResult())) {
                reader.skipElement();
                reader.nextElementContent();
            }
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if ( matchQName(elementName, ns1_result_QNAME) ) {
                myns2__boolean__boolean_Boolean_Serializer.setNullable( false );
                member = myns2__boolean__boolean_Boolean_Serializer.deserialize(ns1_result_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setResult(((Boolean)member).booleanValue());
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new java.lang.Object[] { ns1_result_QNAME, reader.getName() }, DeserializationException.FAULT_CODE_CLIENT);
            }
        }
        
        if( reader.getState() != XMLReader.END)
        {
            reader.skipElement();
        }
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (java.lang.Object)instance;
    }
    
    public void doSerializeAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        cl.bicevida.core.model.services.ws.proxy.oid.runtime.OidBasicWebServiceSoapHttp_existsUser_RespS instance = (cl.bicevida.core.model.services.ws.proxy.oid.runtime.OidBasicWebServiceSoapHttp_existsUser_RespS)obj;
        
    }
    public void doSerializeAnyAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        cl.bicevida.core.model.services.ws.proxy.oid.runtime.OidBasicWebServiceSoapHttp_existsUser_RespS instance = (cl.bicevida.core.model.services.ws.proxy.oid.runtime.OidBasicWebServiceSoapHttp_existsUser_RespS)obj;
        
    }
    public void doSerialize(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        cl.bicevida.core.model.services.ws.proxy.oid.runtime.OidBasicWebServiceSoapHttp_existsUser_RespS instance = (cl.bicevida.core.model.services.ws.proxy.oid.runtime.OidBasicWebServiceSoapHttp_existsUser_RespS)obj;
        
        // SOAP 1.2 - add rpc namespace, and add rpc:result and result element qname
        if(context.getSOAPVersion().equals(SOAPVersion.SOAP_12)) {
            writer.startElement(SOAPEnvelopeConstants.getSOAPEnvelopeConstants(SOAPVersion.SOAP_12).getQNameResult());
            if(ns1_result_QNAME.getNamespaceURI() != null && ns1_result_QNAME.getNamespaceURI().length() > 0 ){
                writer.writeChars(writer.getPrefix(ns1_result_QNAME.getNamespaceURI())+":"+ns1_result_QNAME.getLocalPart());
            }
            else{
                writer.writeChars(ns1_result_QNAME.getLocalPart());
            }
            writer.endElement();//rpc:result
        }
        myns2__boolean__boolean_Boolean_Serializer.setNullable( false );
        myns2__boolean__boolean_Boolean_Serializer.serialize(new Boolean(instance.isResult()), ns1_result_QNAME, null, writer, context);
    }
}
