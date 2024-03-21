package org.example;

public class NestedCatch {
    public static void main(String[] args) {
        int A[] = {30, 20, 10, 40, 0};

        try {
            int c = A[0] / A[4];
            System.out.println("Division is " + c);

        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be 0");
        }

        try {
            System.out.println(A[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is Invalid");
        }

        System.out.println("finally block alternative");
    }
}
