/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicoclase2;

/**
 *
 * @author ESTUDIANTE
 */
public class EjercicoClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tienda t =new Tienda("Donde Lucho", 33);
        Producto[] p= new Producto[4];
        p[0]= new Producto("Leche", 20, 0.04, 5, "SuperMercado", 3000);
        p[1]= new Producto("Huevos", 30, 0.04, 10, "SuperMercado", 300);
        p[2]= new Producto("Advil", 40, 0.12, 15, "Drogeria", 1000);
        p[3]= new Producto("Lapiz", 30, 0.16, 10, "Papeleria", 700);
        t.setProductos(p);
        
    }
    
}
