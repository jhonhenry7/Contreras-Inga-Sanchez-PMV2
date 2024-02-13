package com.example.uberclone.models;

import java.util.Map;

public class FCMBody {

    private String to;
    private String priority;
    Map<String, String> data;

    public FCMBody(String to, String priority, Map<String, String> data){
        this.to = to;
        this.priority = priority;
        this.data = data;
    }

    public Map<String, String> getData(){
        return data;
    }

    public String getTo(){
        return to;
    }

    public String getPriority(){
        return priority;
    }

    public void setTo(String to){
        this.to = to;
    }

    public void setPriority(String priority){
        this.priority = priority;
    }


}
