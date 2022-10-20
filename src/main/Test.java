/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import dominio.Orden;
import dominio.Producto;
import interfaz.AccesoDatos;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Alumno Mañana
 */
public class Test { 
    
    static Scanner dato = new Scanner(System.in);
    public static void agregarCompra(Orden orden , int maximoProductos , double precio , String nombre) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("INICIANDO COMPRA");
        while (!nombre.equals("0") && maximoProductos != 0) {
            System.out.println("Por favor, introduce el nombre del producto ");
            maximoProductos--;
            nombre = teclado.nextLine();
            if (!nombre.equals("0")) {
                do {
                    System.out.println("Introduce su precio  ");
                        precio = teclado.nextFloat();
                } while (precio <= 0);
                 orden.agregarProducto(new Producto(nombre, precio));
            }
            System.out.println("si quiere terminar pulse 0");
            if(nombre.equals("0")) {
                System.out.println("            Ha terminado tu compra  ");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                break;
            }
            nombre = teclado.nextLine();
        }
    }
    public static void main(String[] args) {
        menu();
        Orden orden = new Orden();
        String nombreArchivo = "prueba.txt";
        AccesoDatos.crearArchivo(nombreArchivo);
        orden.mostarOrdenArchivo(null,nombreArchivo);
    }
    public static void menu(){
        int opcion=-1;
        boolean sw1=false;
        boolean sw2=false;
	while(opcion!=0){
            
            System.out.println("Ejercicio Caja Registradora");
            System.out.println("======================\n");
            System.out.printf("1.- CAJA REGISTRADORA\n");
            System.out.printf("2.- SALIR\n");
            System.out.printf("\n\tSeleccione una de las siguientes opciones: "); 
            opcion = dato.nextInt();
            switch(opcion){
                case 1:
                    Orden orden = new Orden();
                    int maximoProductos = Orden.getMAX_PRODUCTOS();
                    String nombre = "";
                    double precio = 0;
                    agregarCompra(orden , maximoProductos , precio , nombre );
                    orden.mostrarOrden(null);
                    orden.calcularTotal();
                    break;
                case 2:
                    System.out.println("\n\nGracias por usar la aplicación\n");
                    break;
            }
            break;
        }
    }
    
}