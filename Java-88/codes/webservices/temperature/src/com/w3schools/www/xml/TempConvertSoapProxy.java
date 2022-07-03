package com.w3schools.www.xml;

public class TempConvertSoapProxy implements com.w3schools.www.xml.TempConvertSoap {
  private String _endpoint = null;
  private com.w3schools.www.xml.TempConvertSoap tempConvertSoap = null;
  
  public TempConvertSoapProxy() {
    _initTempConvertSoapProxy();
  }
  
  public TempConvertSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initTempConvertSoapProxy();
  }
  
  private void _initTempConvertSoapProxy() {
    try {
      tempConvertSoap = (new com.w3schools.www.xml.TempConvertLocator()).getTempConvertSoap();
      if (tempConvertSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)tempConvertSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)tempConvertSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (tempConvertSoap != null)
      ((javax.xml.rpc.Stub)tempConvertSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.w3schools.www.xml.TempConvertSoap getTempConvertSoap() {
    if (tempConvertSoap == null)
      _initTempConvertSoapProxy();
    return tempConvertSoap;
  }
  
  public java.lang.String fahrenheitToCelsius(java.lang.String fahrenheit) throws java.rmi.RemoteException{
    if (tempConvertSoap == null)
      _initTempConvertSoapProxy();
    return tempConvertSoap.fahrenheitToCelsius(fahrenheit);
  }
  
  public java.lang.String celsiusToFahrenheit(java.lang.String celsius) throws java.rmi.RemoteException{
    if (tempConvertSoap == null)
      _initTempConvertSoapProxy();
    return tempConvertSoap.celsiusToFahrenheit(celsius);
  }
  
  
}