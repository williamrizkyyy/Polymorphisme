/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeroplan;

/**
 *
 * @author WILLIAM
 */
public class AeroPlan extends Vehicle {

    /**
     * @param args the command line arguments
     */
    
      @Override
    public void walk(){
        System.out.println("Aeroplan Flying");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();    // TODO code application logic here
    }
    
}
