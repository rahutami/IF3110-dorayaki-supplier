package com.dorayakisupplier.service;

import com.dorayakisupplier.model.RequestDorayaki;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class RequestDorayakiService {

    @WebMethod
    public String makeDorayakiRequest(RequestDorayaki reqDorayaki){
        return "success";
    }
}
