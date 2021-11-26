/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konrad.lorenz.edu.co.proyectomvc.bd;

import java.util.ArrayList;
import java.util.List;
import konrad.lorenz.edu.co.proyectomvc.modelo.Proveedor;
/**
 ** clase que cumple con el patro singletos para mantener una base de datos simulada 
 * @author AD1SIS008
 */
public class BaseDatos {
    
    
    
    private static BaseDatos instancia;
    private List<Proveedor> listaProveedores = new ArrayList<Proveedor>();
    
    public static BaseDatos getInstancia() {
        if (instancia== null){
            instancia= new BaseDatos();
            }
        return instancia;
    }

    public List<Proveedor> getListaProveedores() {
        return listaProveedores;
    }
    
    
    
    
}
