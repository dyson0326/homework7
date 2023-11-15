package com.homework7.eevees.Request;

import jakarta.validation.constraints.NotEmpty;

public  class NameCreateRequest{
    @NotEmpty(message="ポケモンがいません")
    private  String waterEevee;
    @NotEmpty(message="ポケモンがいません")
    private  String thunderEevee;
    @NotEmpty(message="ポケモンがいません")
    private String flameEevee;

    public NameCreateRequest(String waterEevee, String thunderEevee, String flameEevee) {
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