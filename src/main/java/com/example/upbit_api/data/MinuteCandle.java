package com.example.upbit_api.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MinuteCandle {

    private String market;

    private String cadleDateTimeUtc;

    private String candleDateTimeKst; // 갠들 기준 시각 KST 기준

    private String openingPrice; // 시가

    private String highPrice; // 고가

    private String lowPrice; // 저가

    private String tradePrice; //종가

    private String timestamp; //캔들에서 마지막 틱이 저장된 시각

    private String candleAccTradePrice; //누적 거래 금액

    private String candleAccTradeVolume; // 누적 거래량

    private String unit; //분 단위(유닛)

}
