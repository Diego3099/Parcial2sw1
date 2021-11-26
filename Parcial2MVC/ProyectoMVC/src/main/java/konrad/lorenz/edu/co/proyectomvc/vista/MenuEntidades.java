/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konrad.lorenz.edu.co.proyectomvc.vista;

import java.util.Scanner;
import konrad.lorenz.edu.co.proyectomvc.vista.MenuProveedor;
import konrad.lorenz.edu.co.proyectomvc.vista.MenuProducto;

/**
 *
 * @author AD1SIS008
 */
public class MenuEntidades {
    public void seleccionarEntidad() throws Exception{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("POR FAVOR SELECCIONE LA ENTIDAD A GESTIONAR");
        System.out.println("1. Cliente");
        System.out.println("2. Usuario");
        System.out.println("3. Venta");
        System.out.println("4. Proveedor");
        System.out.println("5. Producto");
        System.out.println("6. Salir");
        
        int opcion = sc.nextInt();
        
        while(opcion >0 && opcion<6){
            switch(opcion){
                case 1:
                    break;
                case 2:
                    MenuUsuario menuU = new MenuUsuario();
                    menuU.seleccionarAccion();
                    break;
                case 3:
                    break;
                case 4:
                    MenuProveedor menu = new MenuProveedor();
                    menu.seleccionarAccion();
                    break;
                case 5:
                    MenuProducto menuP = new MenuProducto();
                    menuP.seleccionarAccion();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }
    
}
