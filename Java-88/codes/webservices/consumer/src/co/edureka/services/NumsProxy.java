package co.edureka.services;

public class NumsProxy implements co.edureka.services.Nums {
  private String _endpoint = null;
  private co.edureka.services.Nums nums = null;
  
  public NumsProxy() {
    _initNumsProxy();
  }
  
  public NumsProxy(String endpoint) {
    _endpoint = endpoint;
    _initNumsProxy();
  }
  
  private void _initNumsProxy() {
    try {
      nums = (new co.edureka.services.NumsServiceLocator()).getNums();
      if (nums != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)nums)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)nums)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (nums != null)
      ((javax.xml.rpc.Stub)nums)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public co.edureka.services.Nums getNums() {
    if (nums == null)
      _initNumsProxy();
    return nums;
  }
  
  public int add(int x, int y) throws java.rmi.RemoteException{
    if (nums == null)
      _initNumsProxy();
    return nums.add(x, y);
  }
  
  public float sub(float a, float b) throws java.rmi.RemoteException{
    if (nums == null)
      _initNumsProxy();
    return nums.sub(a, b);
  }
  
  
}