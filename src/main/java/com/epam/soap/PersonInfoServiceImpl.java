package com.epam.soap;

import com.epam.soap.model.PersonInfoRequest;
import com.epam.soap.model.PersonInfoResponse;

import javax.jws.WebService;

/**
 * @author Andrei_Yakushin
 * @since 7/25/2016 9:48 AM
 */

@WebService(endpointInterface = "com.epam.soap.PersonInfoService",
            serviceName = "personinfo")
public class PersonInfoServiceImpl implements PersonInfoService {
    @Override
    public PersonInfoResponse getInfo(PersonInfoRequest request) {
        PersonInfoResponse result = new PersonInfoResponse();
        result.setName(request.getName());
        result.setSurname(request.getSurname());
        result.setEmail(request.getName().toLowerCase() + "_" + request.getSurname().toLowerCase() + "@epam.com");
        return result;
    }
}
