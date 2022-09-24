package com.exercise.square_equation;

class kwa {//Klasa z pierwiastkami z rownania.
    public double x1, x2;
}

public class SquareEquation {//Klasa ktora rozwiazuje rownanie kwadratowe - ta klasa bedzie testowana przez inna klase.
    private final double a, b, c; //f(x)=a*x^2+b*x+c , wspolczynniki funkcji.

    public SquareEquation(double a, double b, double c) {//Konstruktor.
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public kwa Solution() {//Metoda na rozwiazanie rownania kwadratowego.
        double d = b * b - 4 * a * c;//Wspolczynnik 'zaleznosci'.
        if (d < 0)//Sprawdzenie czy rownanie posiada pierwiastki.
            throw new ArithmeticException("Rozwiazanie nie ma pierwiastkow.");
        kwa result = new kwa();//Obliczanie rezultatow(x1 i x2).
        result.x1 = (-b - Math.sqrt(d)) / (2 * a);
        result.x2 = (-b + Math.sqrt(d)) / (2 * a);
        return result;//Zwracanie rezultatow.
    }
}