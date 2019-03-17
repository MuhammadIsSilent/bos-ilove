package com.example.bosconfigclient.dto;

public abstract class Converter<A,B> {

    protected abstract B doForward(A a);

    protected abstract A doBackward(B b);


}
