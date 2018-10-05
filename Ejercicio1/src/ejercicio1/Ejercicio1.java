package ejercicio1;

import java.util.*;

public class Ejercicio1 {

    static String nombre;
    static int cedula;

    static void Presentar() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("La cedula es: " + cedula);
    }

}

class Estudiante {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Ejercicio1 test = new Ejercicio1();
        System.out.println("Ingrese el nombre del estudiante: ");
        test.nombre = teclado.next();
        System.out.println("Ingrese la cedula del estudiante: ");
        test.cedula = teclado.nextInt();
        test.Presentar();
    }

}
