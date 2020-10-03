package com.epam.hellousersname.data;

public class DataAcquirerFactory {

    public DataAcquirer createDataAcquirer(ResourceType resourceType) {

        switch (resourceType) {
            case CONSOLE:
                return new ConsoleDataAcquirer();
            default:
                throw new IllegalArgumentException("Unknown resource Type" + resourceType);
        }

    }

}