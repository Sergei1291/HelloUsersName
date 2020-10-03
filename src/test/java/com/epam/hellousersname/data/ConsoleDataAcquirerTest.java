package com.epam.hellousersname.data;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ConsoleDataAcquirerTest {

    @Test
    public void readNameShouldReturnNotNull() {
        //given
        String data = "user's_name";
        InputStream inputStream = new ByteArrayInputStream(data.getBytes());
        System.setIn(inputStream);
        ConsoleDataAcquirer acquirer = new ConsoleDataAcquirer();
        //when
        String actual = acquirer.read();
        //then
        Assert.assertNotNull(actual);
    }

    @Test
    public void readNameShouldReturnUsersName() {
        //given
        String expected = "user's_name";
        InputStream inputStream = new ByteArrayInputStream(expected.getBytes());
        System.setIn(inputStream);
        ConsoleDataAcquirer acquirer = new ConsoleDataAcquirer();
        //when
        String actual = acquirer.read();
        //then
        Assert.assertEquals(expected, actual);
    }

}