/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konrad.lorenz.edu.co.proyectomvc.dao;

import java.util.List;
import konrad.lorenz.edu.co.proyectomvc.dao.impl.exceptions.NonexistentEntityException;
import konrad.lorenz.edu.co.proyectomvc.dao.impl.exceptions.PreexistingEntityException;
import konrad.lorenz.edu.co.proyectomvc.modelo.Proveedor;


/**
 *
 * @author AD1SIS008
 */
public interface ProveedorDAO {
    
    public void create(Proveedor proveedorNuevo)throws PreexistingEntityException, Exception;
    
    public void edit(Proveedor proveedorAModificar)throws NonexistentEntityException, Exception;
    
    public void destroy(int nitProveedorAEliminar)throws NonexistentEntityException;
      
    public List<Proveedor> findProveedorEntities();
    
    public Proveedor findProveedor(Integer nitProveedorABuscar);
    
    
    
}
