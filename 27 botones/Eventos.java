

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


// Por obligacion observo que no le puedo poner private a esta clase manejadora de eventos o ponerle public o no ponerle nada
	    class Eventos implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String mensaje="";
			if(ae.getActionCommand()=="Aceptar")    // El metodo getActionCommand() devuelve el texto que aparece en el bptpn
			private	mensaje="Se ha presionado el boton ACEPTAR";
			//else if (ae.getSource()==bCancelar) este metodo no me permite tener esta clase manejadora de eventos en un archivo independiente como lo estoy haciendo     	
			else if (ae.getActionCommand()=="Cancelar")     
				mensaje="Se ha presionado el boton CANCELAR";
			else if(ae.getActionCommand()=="Otro")
				mensaje="Se ha presionado el boton OTRO";
			else mensaje = "Este mensaje no deberia aparecer";
			JOptionPane.showMessageDialog(null, mensaje);
		} 
	} // Fin de la clase manejadora de eventos        */