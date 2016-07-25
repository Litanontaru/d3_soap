package com.epam.soap;

import com.epam.soap.model.PersonInfoRequest;
import com.epam.soap.model.PersonInfoResponse;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @author Andrei_Yakushin
 * @since 7/25/2016 9:39 AM
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface PersonInfoService {
    @WebMethod PersonInfoResponse getInfo(PersonInfoRequest request);
}
