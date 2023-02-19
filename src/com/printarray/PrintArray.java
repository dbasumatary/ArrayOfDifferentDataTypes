package com.printarray;
/*Printing an array of integer, double and character*/

public class PrintArray {
    public static void toPrint(Integer[] elements){             //array of integer
        for (int element : elements) {
            System.out.print(element + "  ");
        }
        System.out.println();
    }
    public static void toPrint(Double[] elements){               //array of double
        for (double element : elements) {
            System.out.print(element + "  ");
        }
        System.out.println();
    }
    public static void toPrint(Character[] elements){            //array of character
        for (char element : elements) {
            System.out.print(element + "  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] integer = {1,2,3,4,5,6};
        Double[] doubleNumber = {1.2,3.2,4.1,1.1,5.3,3.7};
        Character[] character = {'e','q','k','s','v','d'};
        PrintArray.toPrint(integer);
        PrintArray.toPrint(doubleNumber);
        PrintArray.toPrint(character);
    }
}
