package ru.bft.insurer.service;

import ru.bft.insurer.model.GetInsurerDataResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(
        serviceName = "Insurer",
        name = "InsurerService",
        portName = "InsurerPort",
        targetNamespace = "http://service.ws.demo/",
        endpointInterface = "ru.bft.insurer.service.InsurerService")
public interface InsurerService {

    @WebResult(name = "insurer", targetNamespace = "http://service.ws.demo/")
    @RequestWrapper(
            localName = "getInsurerData",
            targetNamespace = "http://service.ws.demo/",
            className = "java.lang.String")
    @WebMethod(action = "urn:GetInsurerData")
    @ResponseWrapper(
            localName = "getInsurerDataResponse",
            targetNamespace = "http://service.ws.demo/",
            className = "ru.bft.insurer.model.GetInsurerDataResponse")
    @SOAPBinding(style = SOAPBinding.Style.RPC)
    GetInsurerDataResponse getInsurerData(@WebParam(name = "regNum") String regNum);
}
