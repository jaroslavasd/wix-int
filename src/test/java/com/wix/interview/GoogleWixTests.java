package com.wix.interview;

import org.junit.Test;
import org.junit.Assert;

import com.wix.interview.base.BaseTest;

public class GoogleWixTests extends BaseTest {

    @Test
    public void shouldOpenGoogle() {

        driver.get("https://www.google.com/");

        Assert.assertEquals("https://www.google.com/", driver.getCurrentUrl());

    }
}