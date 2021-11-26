/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konrad.lorenz.edu.co.proyectomvc.dao.impl;

import java.util.List;
import konrad.lorenz.edu.co.proyectomvc.bd.BaseDatos;
import konrad.lorenz.edu.co.proyectomvc.dao.ProveedorDAO;
import konrad.lorenz.edu.co.proyectomvc.modelo.Proveedor;


/**
 *
 * @author AD1SIS008
 */
public class ProveedorDAOBDSimulada implements ProveedorDAO  {

    @Override
    public void create(Proveedor proveedorNuevo) {
        BaseDatos bd =  BaseDatos.getInstancia();
        List<Proveedor> proveedores = bd.getListaProveedores();
        proveedores.add(proveedorNuevo);

    }

    @Override
    public void edit(Proveedor proveedorAModificar) {
        BaseDatos bd =  BaseDatos.getInstancia();
        List<Proveedor> proveedores = bd.getListaProveedores();
        for (Proveedor fila : proveedores ){
            if (fila.getNitProveedor()== proveedorAModificar.getNitProveedor()){
                fila.setCiudadProveedor(proveedorAModificar.getCiudadProveedor());
                fila.setDireccionProveedor(proveedorAModificar.getDireccionProveedor());
                fila.setNombreProveedor(proveedorAModificar.getNombreProveedor());
                fila.setTelefonoProveedor(proveedorAModificar.getTelefonoProveedor());
                break;
            }
        }
        
    }

    @Override
    public void destroy(int nitProveedorAEliminar) {
        BaseDatos bd =  BaseDatos.getInstancia();
        List<Proveedor> proveedores = bd.getListaProveedores();
        for (Proveedor fila : proveedores ){
            if (fila.getNitProveedor()== nitProveedorAEliminar){
                proveedores.remove(fila);
                break;
            }
        }
        
    }

    @Override
    public List<Proveedor> findProveedorEntities() {
        BaseDatos bd =  BaseDatos.getInstancia();
        List<Proveedor> proveedores = bd.getListaProveedores();
        return proveedores;
        
    }

    @Override
    public Proveedor findProveedor(Integer nitProveedorABuscar) {
                BaseDatos bd =  BaseDatos.getInstancia();
        List<Proveedor> proveedores = bd.getListaProveedores();
        for (Proveedor fila : proveedores ){
            if (fila.getNitProveedor()== nitProveedorABuscar){
                return fila;
            }
        }
        return null;
    }
    
}
