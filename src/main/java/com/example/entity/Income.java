package com.example.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Income {
    private Long chatId;
    private BigDecimal income;
}
