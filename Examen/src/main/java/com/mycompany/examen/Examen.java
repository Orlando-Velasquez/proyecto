/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen;

/**
 *
 * @author Lucas Pineda
 */
public class Examen {

    public static void main(String[] args) {
        Convertidor c = new ConvertirMetros();
        double metros = c.convertir(10, Unidad.METROS, Unidad.PIES);

        System.out.println("El valor es: " + metros);
    }
}
