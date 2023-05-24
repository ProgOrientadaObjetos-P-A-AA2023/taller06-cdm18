/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Locale;
import paquete01.Hospital;
import java.util.Scanner;
import paquete01.Ciudad;
import paquete01.Enfermero;
import paquete01.Medico;

/**
 *
 * @author carlo
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String h;
        String ciudad;
        String provincia;
        String nombreMed;
        String nombreEnf;
        String especs;
        String contrato;
        String dir;
        double sueldoMed;
        double sueldoEnf;
        int cantMed;
        int cantEnf;
       
     
        
       

        System.out.println("Ingrese el nombre del hospital:");
        h = entrada.nextLine();
        System.out.println("Ingrese la direccion del hospital:");
        dir = entrada.nextLine();
        System.out.println("Ingrese la ciudad del hospital:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese la provincia:");
        provincia = entrada.nextLine();
        
        Ciudad ciudad1 = new Ciudad(ciudad, provincia);

        System.out.println("Ingrese la cantidad de médicos a ingresar");
        cantMed = entrada.nextInt();

        entrada.nextLine();
        
        Medico [] medicos = new Medico [cantMed];   
        for (int i = 0; i < cantMed; i++) {
            
            
            System.out.println("Ingrese el nombre del médico");
            nombreMed = entrada.nextLine();   
            
            System.out.println("Ingrese la especialidad del médico");
            especs = entrada.nextLine();
            
            System.out.println("Ingrese el sueldo del médico");
            sueldoMed = entrada.nextDouble();
            
            entrada.nextLine();

            medicos[i] = new Medico (nombreMed, especs, sueldoMed);
        }
        
        System.out.println("Ingrese la cantidad de enfermeros a ingresar");
        cantEnf = entrada.nextInt();
        entrada.nextLine();
        
        Enfermero [] enfermeros = new Enfermero [cantEnf];
        
        for (int i = 0; i < cantEnf; i++) {
            System.out.println("Ingrese el nombre del enfermero");
            nombreEnf = entrada.nextLine();

            System.out.println("Ingrese el tipo de contrato del enfermero");
            contrato = entrada.nextLine();

            System.out.println("Ingrese el sueldo del enfermero");
            sueldoEnf = entrada.nextDouble();

            entrada.nextLine();

            enfermeros[i] = new Enfermero (nombreEnf, contrato, sueldoEnf);

        }
        
        
        Hospital h1 = new Hospital(h, dir, ciudad1, medicos, enfermeros);
        
        h1.calcularTotalSueldo();
        h1.calcularEspecialidades();
        System.out.println("");
        System.out.println(h1);

    }
}
