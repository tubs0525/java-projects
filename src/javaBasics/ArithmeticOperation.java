package javaBasics;

import java.util.Scanner;

public class ArithmeticOperation  {
     public static void main(String[] args) {
    float numberOne;
    float numberTwo;

Scanner scan = new Scanner(System.in);

System.out.print("First Number: ");
numberOne = scan.nextFloat();

System.out.print("Second Number");
numberTwo = scan.nextFloat();

System.out.println(numberOne + " * " + numberTwo + " = " + (numberOne * numberTwo));
     }
}


