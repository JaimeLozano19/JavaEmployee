/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.EmpleadoDAO;

import modelo.HibernateUtil;


import vista.FrmAutenticacion;
import vista.FrmEmpleado;



/**
 *
 * @author User Kawaii UwU
 */
public class CntAutenticacion implements ActionListener{
    private FrmAutenticacion frmAutenticacion;

    public CntAutenticacion(FrmAutenticacion frmAutenticacion) {
        this.frmAutenticacion = frmAutenticacion;
        registrarControlador();
    }
    
    private void registrarControlador(){
        frmAutenticacion.getBtnAutenticar().addActionListener(this);
    }
    private void conectar(){
    String usuario= frmAutenticacion.getTxtUsuario().getText();
    String password= frmAutenticacion.getTxtPassword().getText();
     if(HibernateUtil.getSessionFactory(usuario,password)!=null){
    FrmEmpleado frmEmpleado= new FrmEmpleado();
    EmpleadoDAO empleadoDAO= new EmpleadoDAO();
    CntEmpleado cntEmpleado= new CntEmpleado(frmEmpleado, empleadoDAO);
    frmEmpleado.setVisible(true);
     frmAutenticacion.dispose();
     
     }
     else{
         JOptionPane.showMessageDialog(null,"CONEXIÓN FALLIDA");
     }
     
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()==frmAutenticacion.getBtnAutenticar()){
     conectar();
     }
    }
 
    
    
    
 
    
}
