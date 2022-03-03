package com.example.calc;

import org.springframework.stereotype.Component;

@Component
public class JsonToJavaBean {

    private int id;
    private String value;

    public JsonToJavaBean(){}

    public JsonToJavaBean(int id, String value){
        super();
        this.id = id;
        this.value = value;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setValue(String value){
        this.value = value;
    }

    public String printObject(){
        return Integer.valueOf(this.id)+": "+this.value;
    }


}
