package com.company;

import javax.swing.*;
import java.awt.*;

public class SpringApplet extends JApplet{

    @Override
    public void init() {

        //1 stworzone wektory
        Vector2D wektor1 = new Vector2D(10f, 5f);
        Vector2D wektor2 = new Vector2D(20f, 14f);
        //2 wektory sluzace do przypisania wartosci
        Vector2D wektor3 = wektor1.dodajWektory(wektor2);
        Vector2D wektor4 = wektor1.odejmijWektory(wektor2);
        //3
        Vector2D wektor5 = wektor1.normalizacjaWektora();
        Vector2D wektor6 = wektor2.normalizacjaWektora();
        //4
        float dlugosc1 = wektor1.dlugoscWektora();
        float dlugosc2 = wektor2.dlugoscWektora();
        //5
        Vector2D zmienna1 = wektor1.pomnozWektory(10f);
        //6
        System.out.println("  ");
        System.out.println("Parametry wektora 1");
        System.out.println("Wspolrzedne (x: " + wektor1.x + ", y: " + wektor1.y + ")");
        System.out.println("Znormalizowana wartosc wynosi : " + wektor5.dlugoscWektora());
        System.out.println("Dlugosc wynosi : " + dlugosc1);
        System.out.println("  ");
        System.out.println("Parametry wektora 2");
        System.out.println("Wspolrzedne (x: " + wektor2.x + ", y: " + wektor2.y + ")");
        System.out.println("Znormalizowana wartosc wynosi : " + wektor6.dlugoscWektora());
        System.out.println("Dlugosc wynosi : " + dlugosc2);
        System.out.println("  ");
        System.out.println("Suma wektorow = (x: " + wektor3.x + ", y: " + wektor3.y + ")");
        System.out.println("Roznica wektorow = (x: " + wektor4.x + ", y: " + wektor4.y + ")");
        System.out.println("Iloczyn wektorow = (x: " + zmienna1.x + ", y: " + zmienna1.y + ")");
    }
    @Override
    public void paint(Graphics g) {

    }
    }
