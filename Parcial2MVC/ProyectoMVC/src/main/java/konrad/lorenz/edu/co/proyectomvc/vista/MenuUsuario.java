 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konrad.lorenz.edu.co.proyectomvc.vista;

import java.util.Scanner;
import konrad.lorenz.edu.co.proyectomvc.controlador.UsuariosControlador;
import konrad.lorenz.edu.co.proyectomvc.dao.impl.exceptions.NonexistentEntityException;
import konrad.lorenz.edu.co.proyectomvc.modelo.Usuarios;

/**
 *
 * @author AD1SIS008
 */
public class MenuUsuario {
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
                    eliminarUsuario();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }
    
    public void solicitarDatosCreacion() throws Exception{
        System.out.println("Digite la cedula del usuario");
        int cedula = sc.nextInt();
        
        System.out.println("Digite el email del usuario");
        String email = sc.next();
        
        System.out.println("Digite el nomnre del usuario");
        String nombre = sc.next();
        
        System.out.println("Digite la contraseña del usuario");
        String Password = sc.next();
        
        System.out.println("Digite el usuario");
        String usuario = sc.next();
        
        Usuarios nuevoU = new Usuarios();
        nuevoU.setCedulaUsuario(cedula);
        nuevoU.setEmailUsuario(email);
        nuevoU.setNombreUsuario(nombre);
        nuevoU.setPassword(Password);
        nuevoU.setUsuario(usuario);
        
        UsuariosControlador control = new UsuariosControlador();
        control.createUsuarios(nuevoU);
        System.out.println("USUARIO CREADO EXISTOSAMENTE");
    }
     public void eliminarUsuario() throws NonexistentEntityException{
    System.out.println("Digite el Codigo del Usuario");
        int codigoUsuario = sc.nextInt();
        
        UsuariosControlador controld = new UsuariosControlador();
        controld.deleteUsuarios(codigoUsuario);
        System.out.println("PRODUCTO ELIMINADO CORRECTAMENTE");    
}
}

