package ru.bft.insurer.config;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.bft.insurer.service.InsurerServiceImpl;

import javax.xml.ws.Endpoint;;

@Configuration
@ComponentScan({"ru.bft.insurer.repository", "ru.bft.insurer.service"})
public class SoapConfig {

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint insurerEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new InsurerServiceImpl());
        endpoint.publish("/ServiceInsurer");
        return endpoint;
    }

}
