/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Alumno Mañana
 */
public class AccesoDatos implements Interfaz{
    
    @Override
            public void leerArchivo(String nombre){
        BufferedReader entrada = null;
        //1º Declaramos el File
        File archivo = new File(nombre);
        try {
            entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while(lectura != null){
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex){
            ex.printStackTrace(System.out);
        }
    }
            public static void crearArchivo(String nombre){ 
        File archivo = new File(nombre);
        try{
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
        } catch(FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
    }
            public static void agregarArchivo(String nombre, String contenido){
        PrintWriter salida = null;
        File archivo = new File(nombre);
        
        try {
            salida = new PrintWriter(new FileWriter(nombre, true));
            salida.println(contenido);
        } catch (IOException ex) {
            
        }finally { 
            salida.close();
        }
        
    }
}
