/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konrad.lorenz.edu.co.proyectomvc.controlador;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import konrad.lorenz.edu.co.proyectomvc.dao.ProveedorDAO;
import konrad.lorenz.edu.co.proyectomvc.dao.impl.ProveedorDAOBDSimulada;
import konrad.lorenz.edu.co.proyectomvc.dao.impl.ProveedorDAOMySQL;
import konrad.lorenz.edu.co.proyectomvc.dao.impl.ProveedorJpaController;
import konrad.lorenz.edu.co.proyectomvc.dao.impl.exceptions.NonexistentEntityException;
import konrad.lorenz.edu.co.proyectomvc.modelo.Proveedor;
/**
 *
 * @author AD1SIS008
 */
public class ProveedorControlador {
     
    private ProveedorDAO dao;
    
    public ProveedorControlador(){
        //dao = new ProveedorDAOBDSimulada();
        //dao = new ProveedorDAOMySQL();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("konrad.lorenz.edu.co_ProyectoMVC_jar_1.0-SNAPSHOTPU"); 
        dao = new ProveedorJpaController(emf);
    }
    
    public void createProveedor(Proveedor nuevo) throws Exception{
        dao.create(nuevo);
    }
    
    public void updateProveedor(Proveedor viejo) throws Exception{
        dao.edit(viejo);
    }
    
    public void deleteProveedor(int nit) throws NonexistentEntityException{
        dao.destroy(nit);
    }
    
    public List<Proveedor> read(){
        return dao.findProveedorEntities();
    }
    
    public Proveedor read(int nit){
        return dao.findProveedor(nit);
    }
    
    
}
