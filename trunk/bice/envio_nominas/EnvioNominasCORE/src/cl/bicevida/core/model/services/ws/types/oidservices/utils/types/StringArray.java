// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.0.0, build 060119.1546.05277)

package cl.bicevida.core.model.services.ws.types.oidservices.utils.types;


public class StringArray implements java.io.Serializable {
    private java.lang.String[] myStringArray;
    
    public StringArray() {
    }
    
    public StringArray(java.lang.String[] sourceArray) {
        myStringArray = sourceArray;
    }
    
    public void fromArray(java.lang.String[] sourceArray) {
        this.myStringArray = sourceArray;
    }
    
    public java.lang.String[] toArray() {
        return myStringArray;
    }
    
    public java.lang.String[] getString() {
        return myStringArray;
    }
    
    public void setString(java.lang.String[] myStringArray) {
        this.myStringArray = myStringArray;
    }
}
