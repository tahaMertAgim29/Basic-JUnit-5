package com.example.junit2;

public class SimpleCalculator {

     public int addition(int a, int b) {
        return a + b;
    }
    public double divide(double a, double b) {
        if(b == 0)
            throw new ArithmeticException("Divided by zero");

        return a / b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    
    public boolean squared(double num) {
        double root = Math.sqrt(num) - Math.floor(Math.sqrt(num));

        if(root == 0)
            return true;

        return false;
    }

    public boolean isPrime(int num) {
        int counter = 0;
        for(int i=2; i<num; i++) {
            if(num % i == 0)
                counter++;
        }

        if(counter == 0)
            return true;

        return false;
    }

    public long factorial(int num) {
        if(num == 0)
            return 1;

        else if(num == 1) {
            return num;
        }
        else {
            return num*factorial(num-1);
        }

    }

    public boolean isDivided(int a, int b) {
        if(a > b) {
            if(a % b == 0)
                return true;

            return false;
        }
        else {
            if(b % a == 0)
                return true;

            return false;
        }

    }
}
