package com.ananth.designpatterns.solid.dependency_inversion_principle;



import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;



public class JsonFormatter implements Formatter{

    @Override
    public String format(Message message) throws com.ananth.designpatterns.solid.dependency_inversion_principle.FormatException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        try{
            return objectMapper.writeValueAsString(message);
        }catch (JsonProcessingException e){
            e.printStackTrace();
            throw new FormatException(e);
        }
    }
}
