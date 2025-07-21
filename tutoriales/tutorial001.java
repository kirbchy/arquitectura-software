// Tutorial 001: Guardar un nombre en un archivo txt.
// Estudiante: Paula Llanos

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class tutorial001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre;

        System.out.println("Ingresa tu nombre por favor: ");
        nombre = sc.nextLine();

        escribirArchivo(nombre);
    
    }

    public static void escribirArchivo(String nombre) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("nombre.txt"))) {
            escritor.write(nombre);
            System.out.println("Nombre guardado en archivo.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

}