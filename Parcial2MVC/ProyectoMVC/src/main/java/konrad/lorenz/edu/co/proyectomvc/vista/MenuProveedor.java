/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konrad.lorenz.edu.co.proyectomvc.vista;

import java.util.Scanner;
import konrad.lorenz.edu.co.proyectomvc.controlador.ProveedorControlador;
import konrad.lorenz.edu.co.proyectomvc.modelo.Proveedor;


/**
 *
 * @author AD1SIS008
 */
public class MenuProveedor {
private Scanner sc = new Scanner(System.in);
    
    public void seleccionarAccion() throws Exception{        
        System.out.println("POR FAVOR SELECCIONE LA ACCION A REALIZAR");
        System.out.println("1. Crear");
        System.out.println("2. Modificar");
        System.out.println("3. Listar");
        System.out.println("4. Consultar");
        System.out.println("5. Borrar");
        System.out.println("6. Salir");
        
        int opcion = sc.nextInt();
        
        if(opcion >0 && opcion<6){
            switch(opcion){
                case 1:
                    solicitarDatosCreacion();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }
    
    public void solicitarDatosCreacion() throws Exception{
        System.out.println("Digite el nit del proveedor");
        int nit = sc.nextInt();
        
        System.out.println("Digite el nombre del proveedor");
        String nombre = sc.next();
        
        System.out.println("Digite la direccion del proveedor");
        String direccion = sc.next();
        
        System.out.println("Digite la ciudad del proveedor");
        String ciudad = sc.next();
        
        System.out.println("Digite el telefono del proveedor");
        String telefono = sc.next();
        
        Proveedor nuevo = new Proveedor();
        nuevo.setCiudadProveedor(ciudad);
        nuevo.setDireccionProveedor(direccion);
        nuevo.setNitProveedor(nit);
        nuevo.setNombreProveedor(nombre);
        nuevo.setTelefonoProveedor(telefono);
        
        ProveedorControlador control = new ProveedorControlador();
        control.createProveedor(nuevo);
        System.out.println("PROVEEDOR CREADO EXISTOSAMENTE");
    }
}
