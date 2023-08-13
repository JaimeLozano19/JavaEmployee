/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluación;

import controlador.CntAutenticacion;
import vista.FrmAutenticacion;

/**
 *
 * @author User Kawaii UwU
 */
public class Evaluación {
  public static void main(String[] args) {
   FrmAutenticacion frmAutenticacion = new FrmAutenticacion();
   CntAutenticacion cntAutenticacion = new CntAutenticacion(frmAutenticacion);
   frmAutenticacion.setVisible(true);
    }  
}
