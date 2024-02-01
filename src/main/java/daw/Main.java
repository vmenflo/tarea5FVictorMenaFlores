/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import javax.swing.JOptionPane;

/**
 *
 * @author victor
 */
public class Main {
    public static void main(String[] args) {
        SopaLetras sopa = new SopaLetras(10,10);
        
        sopa.mostrarMatriz();
        sopa.palabraHorizontal(0, 0, "hola");
        sopa.palabraHorizontal(3, 2, "gato");
        sopa.palabraHorizontal(5, 6, "loro");
        sopa.palabraHorizontal(7, 1, "sabado");
        sopa.palabraVertical(1, 0, "movil");
        sopa.palabraVertical(0, 9, "cell");
        sopa.palabraVertical(0, 8, "bus");
        sopa.palabraInversaHorizontal(8, 0, "adios");
        sopa.palabraInversaHorizontal(6, 1, "ordenador");
        sopa.palabraInversaVertical(1, 4, "victor");
        
        System.out.println("---------");
        sopa.mostrarMatriz();
    }
}
