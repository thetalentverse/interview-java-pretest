package com.talentful.interview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;

class Main {
    public static void main(String[] args) throws JsonProcessingException {
        assertEquals(1, 1);
        Map<String, String> object = Map.of("key1", "value1", "key2", "value2");
        JsonMapper mapper = JsonMapper.builder().build();
        System.out.println(mapper.writeValueAsString(object));
    }
}