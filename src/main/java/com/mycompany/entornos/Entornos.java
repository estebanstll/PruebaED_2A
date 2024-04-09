/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.entornos;

import clases.Curso;
import clases.Persona;
import com.github.javafaker.Faker;
import java.util.Random;

/**
 *
 * @author Diurno
 */
public class Entornos {


    public static void main(String[] args) {
        Faker f = new Faker();
        Random r = new Random();

        Curso c = new Curso("1º DAM");

     
        for (int i = 0; i < 10; i++) {

            Persona p = new Persona(r.nextInt(10000000, 99999999), f.name().firstName(), 's', r.nextInt(1, 31), r.nextInt(1, 12), r.nextInt(1900, 2024));

            c.añadirAlumno(p);

        }

        System.out.println(c.toString());
    }
}
