package com.epam.soap;

import com.epam.soap.model.PersonInfoRequest;
import com.epam.soap.model.PersonInfoResponse;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * @author Andrei_Yakushin
 * @since 7/25/2016 9:56 AM
 */
public class Client {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(PersonInfoService.class);
        factory.setAddress("http://localhost:9000/personinfo");
        PersonInfoService service = (PersonInfoService) factory.create();
        PersonInfoResponse response = service.getInfo(new PersonInfoRequest("a", "b"));
        System.out.println(response.getEmail());
    }
}
