package com.example.uberclone.models;

import java.util.ArrayList;

public class FCMResponse {

    private Long multicast_id;
    private int success;
    private int failure;
    private int canonical_ids;

    ArrayList<Object> results = new ArrayList<Object>();

    public FCMResponse(Long multicast_id, int success, int failure, int canonical_ids, ArrayList<Object> results) {

        this.multicast_id = multicast_id;
        this.success = success;
        this.failure = failure;
        this.canonical_ids = canonical_ids;
        this.results = results;

    }

    public Long getMulticast_id() {
        return multicast_id;
    }

    public void setMulticast_id(Long multicast_id) {
        this.multicast_id = multicast_id;
    }

    public float getSuccess(){
        return success;
    }

    public float getFailure(){
        return failure;
    }

    public float getCanonical_ids(){
        return canonical_ids;
    }

}
