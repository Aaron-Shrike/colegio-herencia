/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_logica;

/**
 *
 * @author Sh
 */
public class Docente extends Persona implements Presentable{
    private String grado;
    private String tiempoDoc;

    public Docente() {
        super();
        this.grado = "";
        this.tiempoDoc = "";
    }

    public Docente(String nombre, int edad, String grado, String tiempoDoc) {
        super(nombre, edad);
        this.grado = grado;
        this.tiempoDoc = tiempoDoc;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getTiempoDoc() {
        return tiempoDoc;
    }

    public void setTiempoDoc(String tiempoDoc) {
        this.tiempoDoc = tiempoDoc;
    }

    @Override
    public String presentaLinea() {
        return getNombre() + "\t" + getEdad() + "\t" + grado+ "\t" + tiempoDoc;
    }

    @Override
    public String presentaDetalle() {
        return "DOCENTE \nNombre: " + getNombre() + "\nEdad: " + getEdad() +
                "\nGrado: " + grado + "\nTiempo de docencia: " + tiempoDoc;
    }
    
}
