package com.example.upbit_api.controller;

import lombok.Getter;

@Getter
public class MinuteCandleRequest {
    private String market;
    private int count;
}
