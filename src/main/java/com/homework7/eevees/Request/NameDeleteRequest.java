package com.homework7.eevees.Request;

public class NameDeleteRequest {
    private  String waterEevee;
    private  String thunderEevee;
    private String flameEevee;

    public NameDeleteRequest(String waterEevee, String thunderEevee, String flameEevee) {
        this.waterEevee = waterEevee;
        this.thunderEevee = thunderEevee;
        this.flameEevee = flameEevee;
    }

    public String getWaterEevee() {
        return waterEevee;
    }

    public String getThunderEevee() {
        return thunderEevee;
    }

    public String getFlameEevee() {
        return flameEevee;
    }
}
