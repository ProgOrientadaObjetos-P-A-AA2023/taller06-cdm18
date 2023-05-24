/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author carlo
 */
public class Medico {

    private String nombreDoctor;
    private String especialidad;
    private double sueldoMensual;

    public Medico(String doc, String espec, double sueldo) {

        nombreDoctor = doc;
        especialidad = espec;
        sueldoMensual = sueldo;

    }

    public void establecerNombreDoctor(String d) {
        nombreDoctor = d;
    }

    public void establecerEspecialidad(String espe) {
        especialidad = espe;
    }

    public void establecerSueldoMensual(double suel) {
        sueldoMensual = suel;
    }

    public String obtenerNombreDoctor() {
        return nombreDoctor;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public double obtenerSueldoMensual() {
        return sueldoMensual;
    }

}
