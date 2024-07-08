package calculadora;
import java.text.DecimalFormat;

public class Display {
    String visor;
      
    public void digitoDir(javax.swing.JLabel lab,double num){
        this.visor = Double.toString(num);
        if(lab.getText().length() < 7){
            DecimalFormat df = new DecimalFormat("#.#####");
            String number = df.format(num);
            this.visor = number;
            lab.setText(lab.getText() + this.visor);
        }
    }
    
    public void digitoSub(javax.swing.JLabel lab,double num){
        DecimalFormat df = new DecimalFormat("#.#####");
            String number = df.format(num);
            this.visor = number;
            lab.setText(this.visor);
    }
    
    public void pontoDec(javax.swing.JLabel lab,String pt){
        this.visor = pt;
        if (lab.getText().length() < 7 && !lab.getText().contains(Character.toString('.'))){
            lab.setText(lab.getText() + this.visor);
        }
    }
}   
