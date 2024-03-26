package com.oguzcan.ws.soap.config;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.oguzcan.ws.soap.HelloWs;

@Configuration
public class WebServiceConfig {
    
    @Autowired
    private Bus bus;
    
    @Bean
    public EndpointImpl endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new HelloWs());
        endpoint.publish("/Hello");
        return endpoint;
    }
}
