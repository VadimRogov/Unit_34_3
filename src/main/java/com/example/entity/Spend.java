package com.example.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
public class Spend {
    private long chatId;
    private BigDecimal spend;
}
