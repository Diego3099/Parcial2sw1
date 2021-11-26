/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package konrad.lorenz.edu.co.proyectomvc.controlador;

import java.util.List;
import konrad.lorenz.edu.co.proyectomvc.dao.ProductoDAO;
import konrad.lorenz.edu.co.proyectomvc.dao.impl.ProductoDAOMysql;
import konrad.lorenz.edu.co.proyectomvc.modelo.Producto;

/**
 *
 * @author AD1SIS008
 */
public class ProductoControlador {
    private ProductoDAO dao;
    
    public ProductoControlador(){
    //dao = new ProveedorDAOBDSimulada();
    dao =  new ProductoDAOMysql();
            
        
    }
    public void createProducto(Producto nuevo){
        dao.create(nuevo);
    }
    public void updateProducto(Producto viejo){
        dao.edit(viejo);
    }
    public void deleteProducto (int codigo){
        dao.destroy(codigo);
    }
    public List<Producto> read(){
        return dao.findProductoEntities();
    }
    public Producto read(int codigo){
        return dao.findProducto(codigo);
    }
}



