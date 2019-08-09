
package com.dragonsoft.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "qqOnlineWebServiceSoap", targetNamespace = "http://WebXml.com.cn/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface QqOnlineWebServiceSoap {


    /**
     * <br /><h3>�����ѶQQ����״̬</h3><p>���������QQ���� String��Ĭ��QQ���룺8698053���������ݣ�String��Y = ���ߣ�N = ���ߣ�E = QQ�������A = ��ҵ�û���֤ʧ�ܣ�V = ����û���������</p><br />
     * 
     * @param qqCode
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://WebXml.com.cn/qqCheckOnline")
    @WebResult(name = "qqCheckOnlineResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "qqCheckOnline", targetNamespace = "http://WebXml.com.cn/", className = "cn.com.webxml.QqCheckOnline")
    @ResponseWrapper(localName = "qqCheckOnlineResponse", targetNamespace = "http://WebXml.com.cn/", className = "cn.com.webxml.QqCheckOnlineResponse")
    public String qqCheckOnline(
            @WebParam(name = "qqCode", targetNamespace = "http://WebXml.com.cn/")
                    String qqCode);

}
