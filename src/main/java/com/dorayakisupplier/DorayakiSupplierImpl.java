package com.dorayakisupplier;

import com.dorayakisupplier.model.DorayakiData;
import com.dorayakisupplier.model.VariantList;

import javax.jws.WebMethod;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;

public class DorayakiSupplierImpl implements DorayakiSupplier{

    @WebMethod
    public void requestDorayaki(int idDorayaki, String namaDorayaki, int jumlah, XMLGregorianCalendar requestTime, Holder<Integer> code, Holder<String> message, Holder<DorayakiData> data) {

    }

    @WebMethod
    public void getStatusRequest(XMLGregorianCalendar requestTime, Holder<Integer> code, Holder<String> message, Holder<DorayakiData> data) {

    }

    @WebMethod
    public void getListVariant(XMLGregorianCalendar requestTime, Holder<Integer> code, Holder<String> message, Holder<VariantList> data) {

    }
}
