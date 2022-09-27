package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void ShouldReturn100() {

        int actual = service.remain(900);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ShouldReturn0() {

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ShouldReturn900() {

        int actual = service.remain(1100);
        int expected = 900;

        Assert.assertEquals(actual, expected);
    }
}
