/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_datos;

import cap_logica.Docente;
import cap_logica.Persona;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Sh
 */
public class ListaPersonas {
    private static ArrayList<Persona> misdatos = new ArrayList();
    
    public static void agregar(Persona objP){
        misdatos.add(objP);
    }
    
    public static ArrayList obtener(){
        return misdatos;
    }
    
    public static ArrayList devolverDocentes(){
        ArrayList temporal = new ArrayList();
        Iterator elemento;
        
        elemento = misdatos.iterator();
        while(elemento.hasNext()){
            Persona objP = (Persona)elemento.next();
            
            if(objP instanceof Docente){
                temporal.add(objP);
            }
        }
        
        return temporal;
    }
    
    public static int[] cantidadDocentesPorGrado(){
        int[] contador = new int[3];
        Iterator elemento;
        
        elemento = misdatos.iterator();
        while(elemento.hasNext()){
            Persona objP = (Persona)elemento.next();
            
            if(objP instanceof Docente){
                
                if(((Docente) objP).getGrado().equalsIgnoreCase("BACHILLER")){
                    contador[0]++;
                }
                if(((Docente) objP).getGrado().equalsIgnoreCase("MAGISTER")){
                    contador[1]++;
                }
                if(((Docente) objP).getGrado().equalsIgnoreCase("DOCTOR")){
                    contador[2]++;
                }
            }
        }
        
        return contador;
    }
}
