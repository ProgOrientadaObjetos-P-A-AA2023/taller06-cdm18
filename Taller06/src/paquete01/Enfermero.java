/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author carlo
 */
public class Enfermero {

    private String nombreEnfermero;
    private String contrato;
    private double sueldoEnfermero;
    

    public Enfermero(String nombreE, String tipoE, double sueldoE) {
        nombreEnfermero = nombreE;
        contrato = tipoE;
        sueldoEnfermero = sueldoE;
        
    }

    public void establecerNombreEnfermero(String nombreE) {
        nombreEnfermero = nombreE;
    }

    public void establecerContrato(String tipo) {
        contrato = tipo;
    }

    public void establecerSueldoEnfermero(double sueldoE) {
        sueldoEnfermero = sueldoE;
    }

    public String obtenerNombreEnfermero() {
        return nombreEnfermero;
    }

    public String obtenerContrato() {
        return contrato;
    }

    public double obtenerSueldoEnfermero() {
        return sueldoEnfermero;
    }

   

}
