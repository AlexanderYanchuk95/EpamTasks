import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Character.getType;

public class Main {
    public static void main(String[] args) {
//        lpTask1(1, 3, 6);
//        lpTask2(4, 5, 6);
//        lpTask3(5, 7);
//        lpTask4(523.914);
//        lpTask5(3665);
//        lpTask6(0, 3);
//        vTask1(60, 30);
//        vTask2(2, 8, 6, 9);
//        vTask3(1, 1, 1, 5, 1, 16);
//        vTask4(6, 8, 3, 7, 9);
//        vTask5(2);
//        cTask1();
//        cTask2(0, 10, 2);
//        cTask3();
//        cTask4();
//        cTask5(0.5, 2);
//        cTask6();
//        cTask7();
//        cTask8(123, 456);

    }

    public static void lpTask1(double a, double b, double c) {

        double z = ((a - 3) * b / 2) + c;
        System.out.println(z);
    }

    public static void lpTask2(double a, double b, double c) {

        double z = 0;

        if (Math.sqrt(b * b + 4 * a * c) < 0) {
            System.out.println("There cannot be a number less than zero under the square root");
        } else if (a == 0) {
            System.out.println("The denominator cannot be zero");
        } else {
            z = ((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
            System.out.println(z);
        }
    }

    public static void lpTask3(double x, double y) {
        if ((Math.cos(x) - Math.sin(y)) == 0) {
            System.out.println("The denominator cannot be zero");
        } else {
            System.out.println(((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y));
        }
    }

    public static void lpTask4(double x) {
        double firstPart = (int) x;
        firstPart /= 1000;
        double secondPart = (x % 1) * 1000;
        System.out.printf("%.3f", (firstPart + secondPart));
    }

    public static void lpTask5(int t) {


        if (t < 0) {
            System.out.println("Time can't be negative");
        } else if (t == 0) {
            System.out.println("0ч 0мин 0с");
        } else {
            int hours = t / 3600;
            int min = (t - 3600 * hours) / 60;
            int sec = t - hours * 3600 - min * 60;
            System.out.println(hours + "ч " + min + "мин " + sec + "c.");
        }
    }

    public static void lpTask6(int x, int y) {
        boolean onField;

        if(((x >= -2) & (x <= 2)) & ((y >= 0) & (y <= 4))) onField = true;
        else if(((x >= -4) & (x <= 4)) & ((y <= 0) & (y >= -3))) onField = true;
        else onField = false;

        System.out.println(onField);
    }

    public static void vTask1(double angle1, double angle2) {

        double angle3 = 180 - angle1 - angle2;

        if(angle3 <= 0) System.out.println("Triangle does not exist");
        else if (angle3 > 90) System.out.println("Obtuse triangle");
        else if (angle1 > 90 || angle2 > 90) System.out.println("Obtuse triangle");
        else if (angle3 < 90) System.out.println("Acute triangle");
        else System.out.println("Right triangle");
    }

    public static void vTask2(double a, double b, double c, double d) {
        System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));
    }


    public static void vTask3(double x1, double y1, double x2, double y2, double x3, double y3) {

        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) System.out.println("Dots on the same line");
        else System.out.println("Dots not on the same line");
    }

    static Scanner scan = new Scanner(System.in);

    public static void vTask4(double a, double b, double x, double y, double z) {
        if((a >= x & b >= y) || (a >= x & b >= z) || (a >= y & b >= x) || (a >= y & b >= z) || (a >= z & b >= x) ||
                (a >= z & b >= y)) System.out.println("Brick will go through the hole");
        else System.out.println("Brick will not go through the hole");
    }

    public static void vTask5(double x) {
        if(x <= 3) System.out.println(x * x - 3 * 3 + 9);
        else System.out.println(1 / (Math.pow(x, 3) + 6));
    }

    public static void cTask1() {
        System.out.print("Input a number: ");
        int number = scan.nextInt();
        int summ = 0;

        for(int i = 1; i <= number; summ += i++);

        System.out.println(summ);
    }

    public static void cTask2(int a, int b, int h) {

        for(int i = a; i <= b; i += h) {
            System.out.println(i);
        }
    }

    public static void cTask3() {
        int summ = 0;

        for(int i = 0; i <= 100; summ += Math.pow(i++, 2));

        System.out.println(summ);
    }

    public static void cTask4() {
        int summ = 1;
        for(int i = 1; i <= 200; summ *= Math.pow(i++, 2));

        System.out.println(summ);
    }

    public static void cTask5(double num, int n) {
        double a = 0;

        for(int i = 2; Math.abs(a) <= Math.abs(num); i++) {
            a += 1 / (Math.pow(i, n));
        }
        System.out.println(a);
    }

    public static void cTask6() {

        for(int i = (int) 'a'; i <= (int) 'q'; i++)
            System.out.println("Letter " + ((char) i) + " corresponds to the number " + i);
    }

    public static void cTask7() {
        int m, n;
        int divideAmt;

        try {
            System.out.print("Input number 'm' type of Integer: ");
            m = scan.nextInt();
            System.out.print("Input number 'n' type of Integer: ");
            n = scan.nextInt();

            for (int i = m; i <= n; i++) {
                divideAmt = 0;
                System.out.print("For " + i + " dividers is: ");
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        System.out.print(j + " ");
                        divideAmt++;
                    }
                }
                if (divideAmt == 0) System.out.println("For number " + i + " no deviders");
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong type");
        }
    }

    public static void cTask8(int x, int y) {

        String strX = Integer.toString(x);
        String strY = Integer.toString(y);
        int noRepitLetters = 0;

        for(int i = 0; i < strX.length(); i++) {
            int repitedLetters = 0;
            for(int j = 0; j < strY.length(); j++) {
                if(strX.charAt(i) == strY.charAt(j)) repitedLetters++;
            }
            if(repitedLetters != 0){
                System.out.println(strX.charAt(i) + " in both");
                noRepitLetters++;
            }
        }
        if(noRepitLetters == 0) System.out.println("Letters don't repit");
    }
}

