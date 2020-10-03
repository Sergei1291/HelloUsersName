package com.epam.hellousersname.view;

public class PrinterFactory {

    public Printer createPrinter(OutputType outputType) {

        switch (outputType) {
            case CONSOLE:
                return new ConsolePrinter();
            default:
                throw new IllegalArgumentException("Unknown output Type" + outputType);
        }

    }

}