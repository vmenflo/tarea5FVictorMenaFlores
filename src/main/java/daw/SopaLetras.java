/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author victor
 */
public class SopaLetras {

    //Atributos
    private char[][] sopaLetras;

    //Constructor
    public SopaLetras(int numFilas, int numColumnas) {
        this.sopaLetras = rellenarMatriz(numFilas, numColumnas);
    }

    //GETTER AND SETTER
    public char[][] getSopaLetras() {
        return sopaLetras;
    }

    public void setSopaLetras(char[][] sopaLetras) {
        this.sopaLetras = sopaLetras;
    }

    //TO STRING
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SopaLetras{");
        sb.append("sopaLetras=").append(sopaLetras);
        sb.append('}');
        return sb.toString();
    }

    //Equals and hash
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Arrays.deepHashCode(this.sopaLetras);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SopaLetras other = (SopaLetras) obj;
        return Arrays.deepEquals(this.sopaLetras, other.sopaLetras);
    }

    //Generar matriz
    public char[][] rellenarMatriz(int filas, int columnas) {
        char[][] matriz = new char[filas][columnas];
        //Objeto random
        Random r = new Random();
        //Bucle para rellenar
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int letra = r.nextInt(65, 91);

                matriz[i][j] = (char) letra;
            }
        }
        return matriz;
    }

    //Metodo que recibe matriz y muestra forma tabulada
    public void mostrarMatriz() {
        for (char[] sopaLetra : sopaLetras) {
            for (int j = 0; j < sopaLetra.length; j++) {
                System.out.print(sopaLetra[j] + "  ");
            }
            System.out.println();
        }
    }

    //Método colocar palabra horizontal
    public void palabraHorizontal(int fila, int columna, String palabra) {
        char[] letra = new char[palabra.length()];//Creo una Array del tamaño palabra
        int c = 0;//Controlo la posicion del indice de la array
        int indiceColumna = columna; //Se moverá por la matriz
        //Bucle para rellenar la matriz con la palabra
        for (int j = 0; j < palabra.length(); j++) {//Recorra el tamaño de la palabra
            if (j <= sopaLetras[fila].length) {//Rellene mientras no se salga de la matriz
                letra[c] = (char) palabra.charAt(c);//Convierto la letra en char
                sopaLetras[fila][indiceColumna] = letra[c];
                c++;
                indiceColumna++;
            }
        }
    }

    //Método colocar palabra vertical
    public void palabraVertical(int fila, int columna, String palabra) {
        char[] letra = new char[palabra.length()];
        int c = 0;
        int indiceFila = fila;//Uso para moverme por la misma columna
        
        for (int j = 0; j < palabra.length(); j++) {
            if (j <= sopaLetras[fila].length) {
                letra[c] = (char) palabra.charAt(c);
                sopaLetras[indiceFila][columna] = letra[c];
                c++;
                indiceFila++;
            }
        }
    }

    //Método colocar palabra inversa horizontal
    public void palabraInversaHorizontal(int fila, int columna, String palabra) {
        char[] letra = new char[palabra.length()];
        int c = 0;
        int indiceColumna = columna;//Por donde se va a mover
        int termina = palabra.length() - 1;//Obtengo la posicion final

        for (int j = 0; j < palabra.length(); j++) {
            if (j <= sopaLetras[fila].length) {
                int cInversa = termina - c;//Actualizo la posicion
                letra[c] = (char) palabra.charAt(cInversa);
                sopaLetras[fila][indiceColumna] = letra[c];
                c++;
                indiceColumna++;
            }
        }
    }
    
    //Método colocar palabra inversa vertical
    public void palabraInversaVertical(int fila, int columna, String palabra) {
        char[] letra = new char[palabra.length()];
        int c = 0;
        int indiceFila = fila;//Por donde se va a mover
        int termina = palabra.length() - 1;//Obtengo la posicion final

        for (int j = 0; j < palabra.length(); j++) {
            if (j <= sopaLetras[fila].length) {
                int cInversa = termina - c;//Actualizo la posicion
                letra[c] = (char) palabra.charAt(cInversa);
                sopaLetras[indiceFila][columna] = letra[c];
                c++;
                indiceFila++;
            }
        }
    }
}
