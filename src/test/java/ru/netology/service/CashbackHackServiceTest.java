package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void ShouldReturn100() {

        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturn0() {

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturn900() {

        int expected = 900;
        int actual = service.remain(1100);

        Assert.assertEquals(expected, actual);
    }
}