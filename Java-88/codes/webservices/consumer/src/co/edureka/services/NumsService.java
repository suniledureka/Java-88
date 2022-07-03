/**
 * NumsService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.edureka.services;

public interface NumsService extends javax.xml.rpc.Service {
    public java.lang.String getNumsAddress();

    public co.edureka.services.Nums getNums() throws javax.xml.rpc.ServiceException;

    public co.edureka.services.Nums getNums(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
