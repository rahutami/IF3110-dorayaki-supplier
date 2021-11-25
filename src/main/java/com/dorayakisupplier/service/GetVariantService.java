package com.dorayakisupplier.service;
import com.dorayakisupplier.repository.VariantRepository;
import com.dorayakisupplier.model.Variant;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class GetVariantService {
    private static final VariantRepository variantRepository = new VariantRepository();

    @WebMethod
    public List<Variant> getAllVariant() {
        try {
            return variantRepository.getAllVariant();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
