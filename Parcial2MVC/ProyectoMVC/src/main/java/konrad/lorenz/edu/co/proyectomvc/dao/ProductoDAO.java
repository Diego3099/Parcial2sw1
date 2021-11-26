/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konrad.lorenz.edu.co.proyectomvc.dao;

import java.util.List;
import konrad.lorenz.edu.co.proyectomvc.modelo.Producto;

/**
 *
 * @author AD1SIS008
 */
public interface ProductoDAO {
    public void create(Producto ProductoNuevo);
    
    public void edit(Producto ProductoAModificar);
    
    public void destroy(int codProductoAEliminar);
      
    public List<Producto> findProductoEntities();
    
    public Producto findProducto(Integer codProductoABuscar);   
    
}
