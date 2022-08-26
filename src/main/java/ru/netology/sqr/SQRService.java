package ru.netology.sqr;

public class SQRService {
    public int numberOfSquares(int borderA, int borderB) {
        int myNumberOfSquares = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= borderA && i * i <= borderB) {
                myNumberOfSquares++;

            }

        }
        return myNumberOfSquares;
    }
}


