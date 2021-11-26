package com.dorayakisupplier.service;

import com.dorayakisupplier.model.LogRequest;
import com.dorayakisupplier.model.Request;
import com.dorayakisupplier.model.RequestDorayaki;
import com.dorayakisupplier.model.Variant;
import com.dorayakisupplier.repository.LogRequestRepository;
import com.dorayakisupplier.repository.RequestRepository;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class StatusRequestService {
    private static final RequestRepository requestRepository = new RequestRepository();
    private static final LogRequestRepository logRequestRepository = new LogRequestRepository();

    @WebMethod
    public List<Request> getStatusRequest(String ipAddress) {
        try{
            if (logRequestRepository.countLog(ipAddress, "/status") > 10) return new ArrayList<>();
            int resultLog = logRequestRepository.insertLog(new LogRequest(ipAddress, "/status"));

            if (resultLog == 1) return requestRepository.getAllRequest();
            else return new ArrayList<>();
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        return new ArrayList<>();

//        try {
//            return variantRepository.getAllVariant();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList<>();
//        }
    }
}
