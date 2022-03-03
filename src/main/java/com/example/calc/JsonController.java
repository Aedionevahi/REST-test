package com.example.calc;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class JsonController {

    /*private JsonService jsonService;

    public JsonController(JsonService jsonService){
        this.jsonService = jsonService;
    }

    @RequestMapping(value="/json", method=RequestMethod.POST)
    public class JsonController implements*/

    @Autowired
    JsonToJavaBean jsonToJavaBean;

    @PostMapping("/json")
    public ResponseEntity<String> postJsonToJava(@RequestBody JsonToJavaBean body) {
        return new ResponseEntity<>(body.printObject(), HttpStatus.OK);
    }

    /*@PostMapping("/json")
    public ResponseEntity<String> create() throws Exception {
        return new ResponseEntity<>("POST request detected",HttpStatus.OK);
    }*/

    /*{
        //OutputData output = new OutputData();
        //output.id = input.id;
        //output.value = input.value;
        //output.date = new Date();

        return input.id;
    }*/


}

