package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldShowIfUnder1000() {
        int amount = 700;

        int actual = service.remain(amount);
        int expected = 300;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldShowIfOver1000() {
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }
    
  @Test
    public void shouldShowIfEqual1000() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}
