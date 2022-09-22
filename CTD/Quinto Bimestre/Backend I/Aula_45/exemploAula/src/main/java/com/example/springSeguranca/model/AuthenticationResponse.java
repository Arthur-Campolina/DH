package com.example.springSeguranca.model;

//volta com a resposta necessariamente somente para fazer o test
public class AuthenticationResponse {

    private final String jwt;


    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
