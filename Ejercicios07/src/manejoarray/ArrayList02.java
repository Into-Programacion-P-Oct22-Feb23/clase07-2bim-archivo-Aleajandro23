/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArrayList02 {

    public static void main(String[] args) {

        ArrayList<String> arreglo2 = obtenerDatos();
        String cadenaFinal = obtenerCadenaFinal(arreglo2);
        System.out.println(cadenaFinal);
    }

    public static ArrayList<String> obtenerDatos() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> arreglo2 = new ArrayList<>();
        boolean bandera = true;
        String op;
        String pais;
        while (bandera == true) {

            System.out.println("Ingrese nombre de paises");
            pais = entrada.nextLine();
            arreglo2.add(pais);

            System.out.println("Desea Salir del Ciclo? Ingrese (si) para salir y (no) para no salir");
            op = entrada.nextLine();

            if (op.equals("si")) {    // equals para cadena 
                bandera = false;
            }
        }
        return arreglo2;
    }

    public static String obtenerCadenaFinal(ArrayList<String> cad) {
        String cadenaFinal = "";
        System.out.println("----------------------------------");
        for (int i = 0; i < cad.size(); i++) {
            cadenaFinal = String.format("%s%s\n", cadenaFinal, cad.get(i));
        }
        return cadenaFinal;
    }
}

/*
        ArrayList <String> arreglo2 = new ArrayList<>();
        
        codigo 
        
        ArrayList <Boolean> arreglo4 = new ArrayList<>();
 */
