package com.dh.veiculo.model;

public class Veiculo {

    public String name;
    public String maker;

    public Veiculo(String name, String maker) {
        this.name = name;
        this.maker = maker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
}
