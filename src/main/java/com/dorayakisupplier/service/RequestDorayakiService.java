package com.dorayakisupplier.service;

import com.dorayakisupplier.http.PostRequestDorayaki;
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
//            Insert log
            RequestDorayaki reqDorayaki = new RequestDorayaki(idDorayaki, amount, ipAddress);
            int resultLog = logRequestRepository.insertLog(new LogRequest(reqDorayaki.getIpAddress(), "/request-dorayaki"));

//            Send post request
            PostRequestDorayaki postRequestDorayaki = new PostRequestDorayaki();
            int resultDorayaki = postRequestDorayaki.createPost(idDorayaki, amount);
//            String resultDorayaki = "success";
            System.out.println(resultDorayaki);
            if (resultDorayaki == 200 && resultLog == 1) return "success";
            else return "error";
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        return "error";
    }
}
