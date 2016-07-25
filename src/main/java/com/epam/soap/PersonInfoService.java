package com.epam.soap;

import com.epam.soap.model.PersonInfoRequest;
import com.epam.soap.model.PersonInfoResponse;

import javax.jws.WebService;

/**
 * @author Andrei_Yakushin
 * @since 7/25/2016 9:39 AM
 */
public interface PersonInfoService {
    PersonInfoResponse getInfo(PersonInfoRequest request);
}
