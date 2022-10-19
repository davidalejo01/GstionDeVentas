/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;
import java.util.ArrayList;
/**
 *
 * @author Alumno Mañana
 */
public class Orden {
    private int id0rden; 
    private ArrayList <Producto> artProductos;
    static int contador0rdenes; 
    static final int MAX_PRODUCTOS=10;

    public Orden() {
        contador0rdenes++;
        this.id0rden=contador0rdenes;
        ArrayList <Producto> otrProducto=new ArrayList<>();
        this.artProductos=otrProducto;
    }
    public void agregarProducto(Producto producto){
    this.artProductos.add(producto); 
    }
    public double calcularTotal(){
        double total=0;
        for(int i =0;i< artProductos.size(); i++){
            total=total+(this.artProductos.get(i).getPrecio());
        }
        System.out.println("          El total de su compra es = "+ total+"€");
        return 0;
    }
    public void mostrarOrden(ArrayList<Producto>arrayList){
          for (int i = 0; i < artProductos.size(); i++) {
            System.out.println(artProductos.get(i).toString());
        }
    }
    public static int getMAX_PRODUCTOS() {
        return MAX_PRODUCTOS;
    }
}
