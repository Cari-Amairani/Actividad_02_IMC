/*
 * Carina Amairani Díaz Ramírez
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModelMessage;
import view.ViewMessage;

public class ControllerMessage implements ActionListener {
    
    ModelMessage modelMessage;
    ViewMessage viewMessage;
    
  public ControllerMessage(ModelMessage modelMessage, ViewMessage viewMessage) {
        this.modelMessage = modelMessage;
        this.viewMessage = viewMessage;
        this.viewMessage.jB_Mujer.addActionListener(this);
       this.viewMessage.jB_Hombre.addActionListener(this);
    }
  
  public void iniciar_vista(){
        viewMessage.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        modelMessage.setPeso(Double.parseDouble(viewMessage.jTF_Peso.getText()));
        modelMessage.setEstatura(Double.parseDouble(viewMessage.jTF_Altura.getText()));
        
   if(e.getSource()==viewMessage.jB_Mujer) modelMessage.mujer();
   if(e.getSource()==viewMessage.jB_Hombre) modelMessage.hombre();
    
    viewMessage.jL_SuIMC.setText(String.valueOf(modelMessage.getImc()));
    
        
    }

 private void initComponets() {
         viewMessage.setVisible(true);
        viewMessage.setVisible(true);
    }
    
}
