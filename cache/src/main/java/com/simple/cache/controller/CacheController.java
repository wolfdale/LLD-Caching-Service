package com.simple.cache.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    @RequestMapping(value = "/cache/put", method = RequestMethod.POST)
    public ResponseEntity put(String key, String value) {

        return ResponseEntity.ok("");
    }

    @RequestMapping(value = "/cache/get", method = RequestMethod.POST)
    public ResponseEntity get(String key) {

        return ResponseEntity.ok("");
    }


}
