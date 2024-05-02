package com.ucb.demo;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
/*
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
*/

import com.ucb.demo.dto.ProductDto;

import io.sentry.Sentry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
/*import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;*/

import java.util.Set;

import org.springframework.http.ResponseEntity;

@RestController
public class HelloController implements IHelloApi{
    @GetMapping("/")
    public String index() {

        try {
            throw new Exception("This is a test.");
        } catch (Exception e) {
            Sentry.captureException(e);
        }
        return "Greetings from Spring boot";
    }
}


