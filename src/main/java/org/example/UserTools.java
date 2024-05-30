package org.example;

import javax.swing.*;
import java.util.Scanner;

public class UserTools {
    public static void clearScreen() {

        System.out.println();
        System.out.print("\033[H\033[2J");
        JFrame jf = new JFrame();
        jf.setSize(1650, 1080);
    }

    public static void whatNext() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("(kliknij Enter)");
        String whatNext1 = scanner.nextLine();
    }
}
