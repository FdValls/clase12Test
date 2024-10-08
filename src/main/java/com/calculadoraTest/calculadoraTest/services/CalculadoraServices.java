package com.calculadoraTest.calculadoraTest.services;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraServices {

    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir por 0!!");
        }

        return num1 / num2;
    }

    public double potencia(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public double raiz(double num1) {
        return Math.sqrt(num1);
    }
}