package common;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Morse {

    public static void main(String[] args) {
        //Läsa in text från användaren

        Scanner scan = new Scanner(System.in);

        Converter converter = new Converter();

        String text = scan.nextLine();
        String morse = converter.getMorse(text);

        //Skriva ut konverterad morse/text
        System.out.println(morse);
    }

}
