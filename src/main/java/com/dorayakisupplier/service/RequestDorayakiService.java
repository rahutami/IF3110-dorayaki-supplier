package com.dorayakisupplier.service;

import com.dorayakisupplier.model.LogRequest;
import com.dorayakisupplier.model.RequestDorayaki;
import com.dorayakisupplier.repository.LogRequestRepository;
import com.dorayakisupplier.repository.RequestRepository;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class RequestDorayakiService {

    private static final RequestRepository requestRepository = new RequestRepository();
    private static final LogRequestRepository logRequestRepository = new LogRequestRepository();

    @WebMethod
    public String makeDorayakiRequest(int idDorayaki, int amount, String ipAddress){
        try{
            if(logRequestRepository.countLog(ipAddress, "/request-dorayaki") > 10) return "too many requests";

            RequestDorayaki reqDorayaki = new RequestDorayaki(idDorayaki, amount, ipAddress);
            reqDorayaki.toString();
            int resultDorayaki = requestRepository.insertRequest(reqDorayaki);
            int resultLog = logRequestRepository.insertLog(new LogRequest(reqDorayaki.getIpAddress(), Timestamp.valueOf(LocalDateTime.now()), "/request-dorayaki"));
            if (resultDorayaki == 1 && resultLog == 1) return "success";
            else return "error";
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        return "error";
    }
}
