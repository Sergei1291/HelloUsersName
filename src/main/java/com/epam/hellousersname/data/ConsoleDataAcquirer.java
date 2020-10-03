package com.epam.hellousersname.data;

import java.util.Scanner;

public class ConsoleDataAcquirer implements DataAcquirer {

    @Override
    public String read() {

        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);
            return scanner.nextLine();

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }

}