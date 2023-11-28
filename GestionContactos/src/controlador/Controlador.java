package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


import vista.Ventana;
import vista.Ventana2;
import vista.Ventana3;


public class Controlador implements ActionListener {
	
	private Ventana ventana;
	private Ventana2 ventanaDos;
	private Ventana3 ventanaTres;
	
	
	
	
	public Controlador (Ventana ventana) {
		this.ventana = ventana;
	}
	
	public Controlador (Ventana2 ventanaDos) {
		this.ventanaDos = ventanaDos;
	}
	public Controlador (Ventana3 ventanaTres) {
		this.ventanaTres = ventanaTres;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()== ventana.getBotonAdd()) {
		ventanaDos = new Ventana2(ventana);
		ventanaDos.setVisible(true);
		
	   }
	
    if (e.getSource()== ventana.getBotonEdit()) {
	  //   ventanaTres = new Ventana3(ventana);
	     ventanaTres.setVisible(true);
       }
	     
	 if (e.getSource()== ventana.getAñadir()) {
		 ventanaDos = new Ventana2(ventana);
		 ventanaDos.setVisible(true);
	   }
	
	 if (e.getSource()== ventana.getEditar()) {
		 ventanaTres = new Ventana3(ventana);
		 ventanaTres.setVisible(true);
		 
		
	 }
	 

	}

   }
 
 

   
	
    
  
	


