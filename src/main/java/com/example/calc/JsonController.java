package com.example.calc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class JsonController {

    @PostMapping("/json")
    public ResponseEntity<Response> postJsonToJava(@RequestBody @Valid Request body) {
        return new ResponseEntity<>(
                new Response(body.getRequestId(), body.getRequestValue()),
                HttpStatus.OK
        );
    }

}
