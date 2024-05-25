/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author Lucas Pineda
 */

public class ConvertirMetros  implements Convertidor{
    @Override
    public double convertir(double cantidad, Unidad origen, Unidad destino) {
    if(origen == Unidad.METROS && destino == Unidad.PIES) {
    return cantidad * 3.281;
    }
        return 0;
  }
     @Override
    public double convertir(double cantidad, Unidad origen, Unidad destino) {
    if(origen == Unidad.METROS && destino == Unidad.PIES) {
    return cantidad * 3.281;
    }
}
