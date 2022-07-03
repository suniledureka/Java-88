/**
 * NumsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.edureka.services;

public class NumsServiceLocator extends org.apache.axis.client.Service implements co.edureka.services.NumsService {

    public NumsServiceLocator() {
    }


    public NumsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NumsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Nums
    private java.lang.String Nums_address = "http://localhost:8080/provider/services/Nums";

    public java.lang.String getNumsAddress() {
        return Nums_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NumsWSDDServiceName = "Nums";

    public java.lang.String getNumsWSDDServiceName() {
        return NumsWSDDServiceName;
    }

    public void setNumsWSDDServiceName(java.lang.String name) {
        NumsWSDDServiceName = name;
    }

    public co.edureka.services.Nums getNums() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Nums_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNums(endpoint);
    }

    public co.edureka.services.Nums getNums(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            co.edureka.services.NumsSoapBindingStub _stub = new co.edureka.services.NumsSoapBindingStub(portAddress, this);
            _stub.setPortName(getNumsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNumsEndpointAddress(java.lang.String address) {
        Nums_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (co.edureka.services.Nums.class.isAssignableFrom(serviceEndpointInterface)) {
                co.edureka.services.NumsSoapBindingStub _stub = new co.edureka.services.NumsSoapBindingStub(new java.net.URL(Nums_address), this);
                _stub.setPortName(getNumsWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Nums".equals(inputPortName)) {
            return getNums();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.edureka.co", "NumsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.edureka.co", "Nums"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Nums".equals(portName)) {
            setNumsEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
