package ui;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Pair p = new Pair("dog", "./data/tobs.jpg");
        Scanner input = new Scanner(System.in);
        MainMenu m = new MainMenu(input);
        m.runApp();

    }

}
