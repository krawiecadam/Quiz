package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        UserTools.clearScreen();

        Path path = Paths.get("src/main/resources/quiz.txt");
        List<String> lines = Files.readAllLines(path);
        int points = 0;

        for (String line : lines) {
            String[] questionAndAnswer = line.split(";");
            System.out.println(questionAndAnswer[0]);

            System.out.println("1. " + questionAndAnswer[1]);
            System.out.println("2. " + questionAndAnswer[2]);
            System.out.println("3. " + questionAndAnswer[3]);
            System.out.println("4. " + questionAndAnswer[4]);
            System.out.println();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Którą odpowiedź wybierasz? ");
            int answer = scanner.nextInt();
            if (answer == Integer.parseInt(questionAndAnswer[5])) {
                System.out.println("Odpowiedź jest dobra");
                points++;
            UserTools.whatNext();
            } else {
                System.out.println("Błąd");
                int goodAnswer = Integer.parseInt(questionAndAnswer[5]);
                System.out.println("Prawidłowa odpowiedź to: " + questionAndAnswer[5] + " - " + questionAndAnswer[goodAnswer]);
            UserTools.whatNext();
            }

        } System.out.println("Zdobyłeś punktów: " + points + " z 3 możliwych.");

    }
}