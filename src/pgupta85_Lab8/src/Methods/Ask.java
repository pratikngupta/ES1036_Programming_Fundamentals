package pgupta85_Lab8.src.Methods;

import java.util.Scanner;

public class Ask {

    public static Scanner input = new Scanner(System.in);

    public static void printMessage(String message){
        if (message.length()>0){
            System.out.print(message);
        }
        System.out.print(": ");
    }
    public static int getInt (String message){
        printMessage(message);
        return input.nextInt();
    }
    public static double getDouble (String message){
        printMessage(message);
        return input.nextDouble();
    }
    public static char getChar (String message, int options){
        char getChar;
        printMessage(message);
        getChar = input.next().charAt(0);
        if (options == 0){
            return Character.toLowerCase(getChar);
        }
        else if (options == 1){
            return Character.toUpperCase(getChar);
        }
        return input.next().charAt(0);
    }
    public static String getString (String message){
        printMessage(message);
        if (input.hasNextLine()){
            input.nextLine();
        }
        return input.nextLine();
    }
}
