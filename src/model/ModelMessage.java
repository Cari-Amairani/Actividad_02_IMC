
/**
 *
 * @author Carina Amairani Díaz Ramírez
 */
package model;

import javax.swing.JOptionPane;

public class ModelMessage {
    
    private double peso = 0.0;
      private double estatura = 0.0;
      private double imc= 0.0;
   
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
    
 public double mujer(){
        
            this.imc = this.peso/(this.estatura *this.estatura);
                if (imc <10){
                    JOptionPane.showMessageDialog(null, "No existe valoracion");
                }
                else if(imc >10 && imc <=20){
                     JOptionPane.showMessageDialog(null, "desnutrido");
                    }
                else if(imc >20  && imc<=23.9){
                    JOptionPane.showMessageDialog(null, "Peso Normal");
                }
                else if(imc >24  && imc<=28.9){
                    JOptionPane.showMessageDialog(null, "Obesidad");
                }
                else if(imc >29  && imc<=37){
                     JOptionPane.showMessageDialog(null, "Obesidad Severa");
                }
                else if(imc >37){
                     JOptionPane.showMessageDialog(null, "No Existe Valoracion");
        }
                 else if(estatura > 1.99){
             JOptionPane.showMessageDialog(null, "No Existe valoracion");
        }
                
    
        return this.imc;

    }
 public double hombre(){
         this.imc = this.peso/(this.estatura *this.estatura);
    
            if (imc <10){
                    JOptionPane.showMessageDialog(null, "No existe valoracion");
                }
                else if(imc >10 && imc <=20){
                     JOptionPane.showMessageDialog(null, "desnutrido");
                    }
                else if(imc >20  && imc<=24.9){
                    JOptionPane.showMessageDialog(null, "Peso Normal");
                }
                else if(imc >25  && imc<=29.9){
                    JOptionPane.showMessageDialog(null, "Obesidad");
                }
                else if(imc >30  && imc<=40){
                     JOptionPane.showMessageDialog(null, "Obesidad Severa");
                }
                else if(imc >40){
                     JOptionPane.showMessageDialog(null, "Obesidad Muy Severa");
                 }
                 return this.imc;
}
    
}
