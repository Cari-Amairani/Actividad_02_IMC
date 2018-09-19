/*
 * Carina Amairani Díaz Ramírez
 */
package main;

import model.ModelMessage;
import view.ViewMessage;
import controllers.ControllerMessage;

public class Main {

    public static void main(String[] args) {
        
       ModelMessage modelImc = new ModelMessage();
        ViewMessage viewImc = new ViewMessage();
        ControllerMessage controllerImc = new ControllerMessage(modelImc, viewImc);
        
        controllerImc.iniciar_vista();
        viewImc.setVisible(true);
    }
    
}
