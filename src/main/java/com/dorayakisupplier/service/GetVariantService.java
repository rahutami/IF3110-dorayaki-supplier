package com.dorayakisupplier.service;
import com.dorayakisupplier.model.LogRequest;
import com.dorayakisupplier.model.RequestDorayaki;
import com.dorayakisupplier.model.Variant;
import com.dorayakisupplier.repository.VariantRepository;
import com.dorayakisupplier.repository.LogRequestRepository;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class GetVariantService {
    private static final VariantRepository variantRepository = new VariantRepository();
    private static final LogRequestRepository logRequestRepository = new LogRequestRepository();

    @WebMethod
    public List<Variant> getAllVariant(String ipAddress) {
        // bingung masalah ipAddress
        try{
            if(logRequestRepository.countLog(ipAddress, "/variant") > 10) return new ArrayList<>();
            int resultLog = logRequestRepository.insertLog(new LogRequest(ipAddress, Timestamp.valueOf(LocalDateTime.now()), "/variant"));
            if (resultLog == 1) return variantRepository.getAllVariant();
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
