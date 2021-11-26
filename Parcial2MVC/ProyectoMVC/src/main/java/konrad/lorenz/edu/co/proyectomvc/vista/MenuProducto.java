/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package konrad.lorenz.edu.co.proyectomvc.vista;

import java.util.List;
import java.util.Scanner;
import konrad.lorenz.edu.co.proyectomvc.controlador.ProductoControlador;
import konrad.lorenz.edu.co.proyectomvc.modelo.Producto;

/**
 *
 * @author AD1SIS008
 */
public class MenuProducto {
private Scanner sc = new Scanner(System.in);
    
    public void seleccionarAccion(){        
        System.out.println("POR FAVOR SELECCIONE LA ACCION A REALIZAR");
        System.out.println("1. Crear");
        System.out.println("2. Modificar");
        System.out.println("3. Consultar");
        System.out.println("4. Borrar");
        System.out.println("5. Salir");
        
        int opcion = sc.nextInt();
        
        if(opcion >0 && opcion<6){
            switch(opcion){
                case 1:
                    solicitarDatosCreacion();
                    break;
                case 2:
                    modificarProducto();
                    break;
                case 3:
                    verProductos();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
    
    public void solicitarDatosCreacion(){
        System.out.println("Digite el Codigo del Producto");
        int codigoProducto = sc.nextInt();
        
        System.out.println("Digite el iva del Producto");
        double iva = sc.nextDouble();
        
        System.out.println("Digite el nit del Producto");
        int nit = sc.nextInt();
        
        System.out.println("Digite el Nombre del Producto");
        String nombre = sc.next();
        
        System.out.println("Digite el precio de compra del Producto");
        double valorCompra = sc.nextDouble();
        
        System.out.println("Digite el precio de vemta del Producto");
        double valorVenta = sc.nextDouble();
        
        Producto nuevo = new Producto();
        nuevo.setCodigo_producto(codigoProducto);
        nuevo.setIvacompra(iva);
        nuevo.setNit_proveedor(nit);
        nuevo.setNombre_producto(nombre);
        nuevo.setPrecio_compra(valorCompra);
        nuevo.setPrecio_venta(valorVenta);
        
        ProductoControlador control = new ProductoControlador();
        control.createProducto(nuevo);
        System.out.println("PRODUCTO CREADO EXISTOSAMENTE");
    }
    
    public void eliminarProducto(){
    System.out.println("Digite el Codigo del Producto");
        int codigoProducto = sc.nextInt();
        
        Producto delete = new Producto();
        delete.getCodigo_producto();
        
        ProductoControlador controld = new ProductoControlador();
        controld.deleteProducto(codigoProducto);
        System.out.println("PRODUCTO ELIMINADO CORRECTAMENTE");    
}
    public void modificarProducto(){
        
        System.out.println("Digite el nuevo iva del Producto");
        double iva = sc.nextDouble();
        
        System.out.println("Digite el nuevo nit del Producto");
        int nit = sc.nextInt();
        
        System.out.println("Digite el nuevo Nombre del Producto");
        String nombre = sc.next();
        
        System.out.println("Digite el nuevo precio de compra del Producto");
        double valorCompra = sc.nextDouble();
        
        System.out.println("Digite el nuevo precio de vemta del Producto");
        double valorVenta = sc.nextDouble();
        
        
        System.out.println("Digite el Codigo del Producto que desea cambiar ");
        int codigoProducto = sc.nextInt();
        
        
        Producto modificar = new Producto();
        modificar.setIvacompra(iva);
        modificar.setNit_proveedor(nit);
        modificar.setNombre_producto(nombre);
        modificar.setPrecio_compra(valorCompra);
        modificar.setPrecio_venta(valorVenta);
        modificar.setCodigo_producto(codigoProducto);
        
        ProductoControlador controlm = new ProductoControlador();
        controlm.updateProducto(modificar);
        System.out.println("PRODUCTO MODIFICADO EXISTOSAMENTE");
    }
    public void verProductos() {
         System.out.println("Digite el Codigo del Producto");
        int codigoProducto = sc.nextInt();
        
        Producto read = new Producto();
        read.getCodigo_producto();
        
        ProductoControlador controlr = new ProductoControlador();
        controlr.read(codigoProducto);
        
        System.out.println("PRODUCTO"); 	
    }        
}
