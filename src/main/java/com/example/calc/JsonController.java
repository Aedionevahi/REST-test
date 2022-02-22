package com.example.calc;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/json")
public class JsonController {

    // ItemService itemService;

    //@RequestMapping(value="/json", method=RequestMethod.POST)
    @PostMapping
    public ResponseEntity<String> create() throws Exception {
        return new ResponseEntity<>("Hello There!",HttpStatus.OK);
    }

    /*{
        //OutputData output = new OutputData();
        //output.id = input.id;
        //output.value = input.value;
        //output.date = new Date();

        return input.id;
    }*/


}

