/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_presentacion;

import LibMenu.Menu;
import LibMenu.Opcion;
import basicas.Consola;
import cap_datos.ListaPersonas;
import cap_logica.Alumno;
import cap_logica.Docente;
import cap_logica.Persona;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Sh
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu  objMenu = new Menu();
        Consola objConsola = new Consola();
        
        int opc;
        
        definirmenu(objMenu);       
        
        do{
            opc = objMenu.display();
            
            switch(opc){
                case 33:
                        Docente objD = new Docente();

                        objD.setNombre(objConsola.leer("Ingrese nombre: "));
                        objD.setEdad(objConsola.leer("Ingrese edad[18-75]: ",18,75));
                        objD.setGrado(objConsola.leer("Ingrese grado(BACHILLER/MAGISTER/DOCTOR): "));
                        objD.setTiempoDoc(objConsola.leer("Ingrese tiempo de docencia(Años): "));

                        ListaPersonas.agregar(objD);

                        System.out.println("\n* DOCENTE registrado en el sistema");
                    break;
                case 44: 
                        Alumno objA = new Alumno();

                        objA.setNombre(objConsola.leer("Ingrese nombre: "));
                        objA.setEdad(objConsola.leer("Ingrese edad[10-75]: ",10,75));
                        objA.setColegioProc(objConsola.leer("Ingrese colegio de procedencia: "));
                        objA.setAñoEgreso(objConsola.leer("Ingrese año de egreso[1980-2019]: ",1980,2019));

                        ListaPersonas.agregar(objA);

                        System.out.println("\n* ALUMNO registrado en el sistema");
                    break;
                case 71:
                        ArrayList temporal = ListaPersonas.obtener();
                        Iterator elemento;
                        
                        System.out.println("\nREPORTE GENERAL DE PERSONAS");
                        System.out.println("===========================");
                        
                        elemento = temporal.iterator();
                        while(elemento.hasNext()){
                            Persona objP = (Persona)elemento.next();
                            
                            System.out.println(objP.presentaLinea());
                        }
                    break;
                case 72:
                        ArrayList temporal1 = ListaPersonas.devolverDocentes();
                        Iterator elemento1;
                        
                        System.out.println("\nREPORTE GENERAL DE DOCENTES");
                        System.out.println("===========================");
                        
                        elemento1 = temporal1.iterator();
                        while(elemento1.hasNext()){
                            Persona objP = (Persona)elemento1.next();
                            
                            System.out.println(objP.presentaLinea());
                        }
                    break;
                case 73:
                        int[] contador = ListaPersonas.cantidadDocentesPorGrado();
                        
                        System.out.println("\nCANTIDAD DE DOCENTES POR GRADO");
                        System.out.println("GRADO\tCANTIDAD");
                        System.out.println("BACHILLER: " + contador[0]);
                        System.out.println("MAGISTER: " + contador[1]);
                        System.out.println("DOCTOR: " + contador[2]);
                    break;
            }
        
        }while(opc != 99);
    }

    private static void definirmenu(Menu objMenu) {
        objMenu.agregar(new Opcion(33,"Agregar Docente"));
        objMenu.agregar(new Opcion(44,"Agregar Alumno"));
        objMenu.agregar(new Opcion(71,"Reporte General"));
        objMenu.agregar(new Opcion(72,"Reporte solo Docentes"));
        objMenu.agregar(new Opcion(73,"Reporte cantidad Docentes x Grado"));
        objMenu.agregar(new Opcion(99,"Salir"));
    }
    
}
