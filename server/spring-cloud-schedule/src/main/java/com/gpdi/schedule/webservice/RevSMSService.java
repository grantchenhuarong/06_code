package com.xxxx.schedule.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * 暴露服务名称
 */
@WebService(name = "revSMS", targetNamespace = "http://sms.xxxx.com")
public interface RevSMSService {

    @WebMethod
//    @WebResult(name = "", targetNamespace = "")
    public void echoOfSendSMS(String ucNum, String cee, int msgid, int res, String recvt);

}
