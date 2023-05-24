/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author carlo
 */
public class Hospital {

    private String nombreH;
    private String direccion;
    private Ciudad ciudad;
    private int especialidades;
    private Medico[] m;
    private Enfermero[] e;
    private double totalSueldo;

    public Hospital(String h, String dir, Ciudad datos,
            Medico[] datosMed, Enfermero[] datosEnf) {
        nombreH = h;
        direccion = dir;
        ciudad = datos;
        m = datosMed;
        e = datosEnf;
    }

    public void establecerNombreH(String n) {
        nombreH = n;
    }

    public void establecerDireccion(String d) {
        direccion = d;
    }

    public void establecerCiudad(Ciudad ciu) {
        ciudad = ciu;
    }

    public void calcularEspecialidades() {
        especialidades = m.length + e.length;
    }

    public void establecerMedicos(Medico[] meds) {
        m = meds;
    }

    public void establecerEnfermeros(Enfermero[] enfs) {
        e = enfs;
    }

    public void calcularTotalSueldo() {
        for (int i = 0; i < m.length; i++) {
            totalSueldo += m[i].obtenerSueldoMensual();
        }

        for (int i = 0; i < e.length; i++) {
            totalSueldo += e[i].obtenerSueldoEnfermero();
        }
    }

    public String obtenerNombreH() {
        return nombreH;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public int obtenerEspecialidades() {
        return especialidades;
    }

    public Medico[] obtenerMedicos() {
        return m;
    }

    public Enfermero[] obtenerEnfermeros() {
        return e;
    }

    public double obtenerTotalSueldo() {
        return totalSueldo;
    }

    @Override
    public String toString() {
        String mensaje;
        mensaje = String.format("HOSPITAL %S\n"
                + "Dirección: %s\n"
                + "Ciudad: %s\n"
                + "Provincia: %s\n"
                + "Número de especialidades: %d\n"
                + "Listado de médicos\n",
                obtenerNombreH(),
                obtenerDireccion(),
                obtenerCiudad().nombreCiudad,
                obtenerCiudad().provinciaCiudad,
                obtenerEspecialidades());

        for (int i = 0; i < m.length; i++) {
            mensaje = String.format("%s- %s - sueldo: %.2f - %s\n",
                     mensaje,
                     obtenerMedicos()[i].obtenerNombreDoctor(),
                     obtenerMedicos()[i].obtenerSueldoMensual(),
                     m[i].obtenerEspecialidad());
        }

        mensaje = String.format("%sListado de enfermeros(as)\n", mensaje);
        for (int i = 0; i < e.length; i++) {
            mensaje = String.format("%s- %s - sueldo: %.2f - %s\n",
                     mensaje,
                     obtenerEnfermeros()[i].obtenerNombreEnfermero(),
                     obtenerEnfermeros()[i].obtenerSueldoEnfermero(),
                     obtenerEnfermeros()[i].obtenerContrato());

        }

        mensaje = String.format("%s\nTotal de sueldos a pagar por mes:"
                + " %.2f", mensaje, obtenerTotalSueldo());

        return mensaje;

    }

}
