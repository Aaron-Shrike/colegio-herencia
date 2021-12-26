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
public class Alumno extends Persona implements Presentable{
    private String colegioProc;
    private int añoEgreso;

    public Alumno() {
        super();
        this.colegioProc = "";
        this.añoEgreso = 0;
    }

    public Alumno(String nombre, int edad, String colegioProc, int añoEgreso) {
        super(nombre, edad);
        this.colegioProc = colegioProc;
        this.añoEgreso = añoEgreso;
    }

    public String getColegioProc() {
        return colegioProc;
    }

    public void setColegioProc(String colegioProc) {
        this.colegioProc = colegioProc;
    }

    public int getAñoEgreso() {
        return añoEgreso;
    }

    public void setAñoEgreso(int añoEgreso) {
        this.añoEgreso = añoEgreso;
    }

    @Override
    public String presentaLinea() {
        return getNombre() + "\t" + getEdad() + "\t" + colegioProc + "\t" + añoEgreso;
    }

    @Override
    public String presentaDetalle() {
        return "ALUMNO \nNombre: " + getNombre() + "\nEdad: " + getEdad() +
                "\nColegio de procedencia: " + colegioProc + "\nAño de egreso: " + añoEgreso;
    }
 
}
