/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author carlo
 */
public class Ciudad {
    String nombreCiudad;
    String provinciaCiudad;

    public Ciudad(String nom, String prov) {
        nombreCiudad = nom;
        provinciaCiudad = prov;
    }

    public void establecerNombreCiudad(String n) {
        nombreCiudad = n;
    }

    public void establecerProvinciaCiudad(String p) {
        provinciaCiudad = p;
    }

    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }

    public String obtenerProvinciaCiudad() {
        return provinciaCiudad;
    }
    
    
    
    
    
    
    
}
