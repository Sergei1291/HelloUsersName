package com.epam.hellousersname.main;

import com.epam.hellousersname.data.DataAcquirer;
import com.epam.hellousersname.data.DataAcquirerFactory;
import com.epam.hellousersname.data.ResourceType;
import com.epam.hellousersname.logic.MessageCreator;
import com.epam.hellousersname.view.OutputType;
import com.epam.hellousersname.view.Printer;
import com.epam.hellousersname.view.PrinterFactory;

public class Main {

    public static void main(String[] args) {

        //get user's name from console
        ResourceType type = ResourceType.CONSOLE;
        DataAcquirerFactory dataAcquirerFactory = new DataAcquirerFactory();
        DataAcquirer dataAcquirer = dataAcquirerFactory.createDataAcquirer(type);
        String userName = dataAcquirer.read();

        //create message
        MessageCreator messageCreator = new MessageCreator();
        String message = messageCreator.createMessage(userName);

        //view string message
        OutputType outputType = OutputType.CONSOLE;
        PrinterFactory printerFactory = new PrinterFactory();
        Printer printer = printerFactory.createPrinter(outputType);
        printer.print(message);

    }

}