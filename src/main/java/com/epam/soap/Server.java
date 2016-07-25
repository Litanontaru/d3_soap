package com.epam.soap;

import javax.xml.ws.Endpoint;

import static java.lang.Thread.sleep;

/**
 * @author Andrei_Yakushin
 * @since 7/25/2016 9:53 AM
 */
public class Server {
    public static void main(String[] args) {
        PersonInfoService service = new PersonInfoServiceImpl();
        Endpoint.publish("http://localhost:9000/personinfo", service);
        while (true) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
