package com.propvalue.property;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PropertyNotFoundException extends RuntimeException {

    public PropertyNotFoundException() {
        super("Property Not Found");
    }
}
