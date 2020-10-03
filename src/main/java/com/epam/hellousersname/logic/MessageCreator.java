package com.epam.hellousersname.logic;

public class MessageCreator {

    public String createMessage(String userName) {

        String message = "Hello ";

        message = message.concat(userName);

        return message;
    }

}