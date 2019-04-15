/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class cuentabancaria {
   private int numero;
   private String dueño;
   private int clave;
   private double saldo;

    public cuentabancaria(int numero, String dueño, int clave, double saldo) {
        this.numero = numero;
        this.dueño = dueño;
        this.clave = clave;
        this.saldo = saldo;
    }

    
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   public boolean retirar (double valor){
            if(valor > 0 && this.saldo >= valor ){
                this.saldo -= valor;
            return true;
           
       
}else return false;

   }
   
   public boolean consignar (double valor){
       if(valor > 0){
           this.saldo += valor;
           return true;
           
       }else return false;
       
       
  
}
   public double consultar (){
       return this.saldo;
   }
   
   public boolean cambiarclave (int nuevaclave){
       if(nuevaclave > 1000 && nuevaclave < 9999 ){
           this.clave = nuevaclave;
           return true;
           
           
       }else return false;
   }

}

