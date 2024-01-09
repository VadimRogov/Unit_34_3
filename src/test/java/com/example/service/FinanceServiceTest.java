package com.example.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.repository.IncomeRepository;
import com.example.repository.SpendRepository;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FinanceServiceTest {
    @InjectMocks
    private FinanceService financeService;
    @Mock
    private SpendRepository spendRepository;
    @Mock
    private IncomeRepository incomeRepository;


    @Test
    public void addFinanceOperationTest() {
        String price = "150.0";
        String message = financeService.addFinanceOperation("/addincome", price, 500L);
        Assert.assertEquals("Доход в размере " + price + " был успешно добавлен", message);
        price = "200";
        message = financeService.addFinanceOperation("/nan", price, 250L);
        Assert.assertEquals("Расход в размере " + price + " был успешно добавлен", message);
    }
}