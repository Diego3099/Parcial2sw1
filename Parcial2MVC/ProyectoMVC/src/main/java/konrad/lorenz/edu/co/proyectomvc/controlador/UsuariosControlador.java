/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konrad.lorenz.edu.co.proyectomvc.controlador;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import konrad.lorenz.edu.co.proyectomvc.dao.UsuariosDAO;
import konrad.lorenz.edu.co.proyectomvc.dao.impl.UsuariosJpaController;
import konrad.lorenz.edu.co.proyectomvc.dao.impl.exceptions.NonexistentEntityException;
import konrad.lorenz.edu.co.proyectomvc.dao.impl.exceptions.PreexistingEntityException;
import konrad.lorenz.edu.co.proyectomvc.modelo.Usuarios;


/**
 *
 * @author AD1SIS008
 */
public class UsuariosControlador {
    
    private UsuariosDAO dao;
    
    public UsuariosControlador(){
    
      //dao = new ProveedorDAOBDSimulada();
        //dao = new ProveedorDAOMySQL();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("konrad.lorenz.edu.co_ProyectoMVC_jar_1.0-SNAPSHOTPU"); 
         dao = new UsuariosJpaController(emf);
    }
    
    public void createUsuarios(Usuarios nuevo) throws Exception {
        dao.create(nuevo);
    }
    
    public void updateUsuarios(Usuarios viejo) throws Exception{
        dao.edit(viejo);
    }
    
    public void deleteUsuarios(int nit) throws NonexistentEntityException{
        dao.destroy(nit);
    }
    
    public List<Usuarios> read(){
        return dao.findUsuariosEntities();
    }
    
    public Usuarios read(int nit){
        return dao.findUsuarios(nit);
    }
    
    
}
    
