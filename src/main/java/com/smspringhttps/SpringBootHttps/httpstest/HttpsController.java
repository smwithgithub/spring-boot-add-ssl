package com.smspringhttps.SpringBootHttps.httpstest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpsController {

    @GetMapping("/getinfo")
    public ResponseEntity<String> getInfo(){
        String result = "This is the message from test HTTPS server";

        return ResponseEntity.ok(result);
    }
}
