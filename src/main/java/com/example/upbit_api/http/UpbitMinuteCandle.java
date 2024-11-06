package com.example.upbit_api.http;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class UpbitMinuteCandle {
    private String market;

    @JsonProperty("candle_date_time_utc") // 캔들 기준 시각( UTC 기준 ) yyyy-MM-dd 'T' HH:mm:ss
    private String cadleDateTimeUtc;

    @JsonProperty("candle_date_time_kst")
    private String candleDateTimeKst; // 갠들 기준 시각 KST 기준

    @JsonProperty("opening_price")
    private String openingPrice; // 시가

    @JsonProperty("high_price")
    private String highPrice; // 고가

    @JsonProperty("low_price")
    private String lowPrice; // 저가

    @JsonProperty("trade_price")
    private String tradePrice; //종가

    private String timestamp; //캔들에서 마지막 틱이 저장된 시각

    @JsonProperty("candle_acc_trade_price")
    private String candleAccTradePrice; //누적 거래 금액

    @JsonProperty("candle_acc_trade_volume")
    private String candleAccTradeVolume; // 누적 거래량

    private String unit; //분 단위(유닛)


}
