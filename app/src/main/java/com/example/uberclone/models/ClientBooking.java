package com.example.uberclone.models;

public class ClientBooking {

    String idClient;
    String idDriver;
    String destination;
    String origin;
    String time;
    String km;
    String status;
    double originlat;
    double originlng;
    double destinationlat;
    double getDestinationlng;

    public ClientBooking(String idClient, String idDriver, String destination, String origin, String time, String km, String status, double originlat, double originlng, double destinationlat, double getDestinationlng) {
        this.idClient = idClient;
        this.idDriver = idDriver;
        this.destination = destination;
        this.origin = origin;
        this.time = time;
        this.km = km;
        this.status = status;
        this.originlat = originlat;
        this.originlng = originlng;
        this.destinationlat = destinationlat;
        this.getDestinationlng = getDestinationlng;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(String idDriver) {
        this.idDriver = idDriver;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getOriginlat() {
        return originlat;
    }

    public void setOriginlat(double originlat) {
        this.originlat = originlat;
    }

    public double getOriginlng() {
        return originlng;
    }

    public void setOriginlng(double originlng) {
        this.originlng = originlng;
    }

    public double getDestinationlat() {
        return destinationlat;
    }

    public void setDestinationlat(double destinationlat) {
        this.destinationlat = destinationlat;
    }

    public double getGetDestinationlng() {
        return getDestinationlng;
    }

    public void setGetDestinationlng(double getDestinationlng) {
        this.getDestinationlng = getDestinationlng;
    }
}
