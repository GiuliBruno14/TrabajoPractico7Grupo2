
package com.mycompany.trabajopractico7;

import Entidades.Alumno;
import Entidades.Materia;
import java.util.HashMap;

public class Colegio {

    public static void main(String[] args) {
        Materia m1 = new Materia(100,"Ingles I",1);
        Materia m2 = new Materia(101,"Matematica",1);
        Materia m3 = new Materia(102,"Laboratorio I",1);
        Alumno a1 = new Alumno(1001,"Lopez","Martin");
        Alumno a2 = new Alumno(1002,"Martinez","Brenda");
        
        System.out.println("Inscribiendo al primer alumno");
        a1.agregarMateria(m1);
        a1.agregarMateria(m2);
        a1.agregarMateria(m3);
        System.out.println("Inscribiendo al segundo alumno");
        a2.agregarMateria(m1);
        a2.agregarMateria(m2);
        a2.agregarMateria(m3);
        a2.agregarMateria(m3);
        System.out.println("Cantidad de materias del primer alumno: "+a1.cantidadMaterias());
        System.out.println("Cantidad de materias del segundo alumno: "+a2.cantidadMaterias());
    }
}
