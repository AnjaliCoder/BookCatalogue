package com.practice.bookcatalogue;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class AppConfig extends ResourceConfig {
    public AppConfig(){
        register(BooksController.class);
    }
}
