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
        SopaLetras sopa = new SopaLetras(5,5);
        
        sopa.mostrarMatriz();
        String palabra = JOptionPane.showInputDialog("Cual es la palabra");
        sopa.palabraHorizontal(0, 0, palabra);
        sopa.mostrarMatriz();
    }
}
