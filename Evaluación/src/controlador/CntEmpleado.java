/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;
import modelo.Empleado;
import modelo.EmpleadoDAO;
import vista.FrmEmpleado;

public class CntEmpleado extends WindowAdapter implements ActionListener, WindowListener{
private FrmEmpleado frmEmpleado;
private EmpleadoDAO empleadoDAO;
private Empleado empleado;

public CntEmpleado(FrmEmpleado frmEmpleado, EmpleadoDAO empleadoDAO) {
        this.frmEmpleado = frmEmpleado;
        this.empleadoDAO = empleadoDAO;
        registrarControladores();
    }
private void registrarControladores(){
frmEmpleado.getBtnGrabar().addActionListener(this);

frmEmpleado.addWindowListener(this);
}
public Empleado obtenerEmpleado(){
Integer id= Integer.parseInt(frmEmpleado.getTxtId().getText());
String nombre= frmEmpleado.getTxtNombre().getText();
return new Empleado(id,nombre);

}
private void grabar(){
if(empleadoDAO.grabar(obtenerEmpleado())){
    JOptionPane.showMessageDialog(frmEmpleado,"empleado almacenado");
}
else{
    JOptionPane.showMessageDialog(frmEmpleado,"empleado no almacenado");
}
}
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==frmEmpleado.getBtnGrabar()){
        grabar();
        
        
    }
    } 
}

