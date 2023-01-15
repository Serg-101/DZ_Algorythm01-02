package org.example;

public class Main {
    public static void main(String[] args) {
        //Найти n-ое число Фибоначчи за O(n).
        int nn =  6; // n-ное число Фибоначи
        int n1 = 1;
        int n2 = 1;
        int n3 = 0;

        if (nn < 0){  // при отрицательных значениях числа
            for (int i = 1; i > nn; i--) {
                n3 = n1 - n2;
                n1 = n2;
                n2 = n3;
            }
        } else {  // при положительных значениях числа
            for (int i = 2; i < nn; i++) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
        }

        System.out.println(nn + "-ое число Фибоначчи за O(n) = " + n3);
    }
}