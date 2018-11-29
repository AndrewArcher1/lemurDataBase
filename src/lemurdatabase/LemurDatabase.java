/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lemurdatabase;

import javax.swing.JOptionPane;

/**
 *
 * @author anarc6700
 */
public class LemurDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int amount = Integer.parseInt(JOptionPane.showInputDialog("How many lemurs do you want to add"));
      

        for(int n =0 ; n<amount;n++){
          Mammal  lemur1= new Mammal();
            String lemurchoice =JOptionPane.showInputDialog("Please enter a type of lemur to add " +
                    "1. Tree Lemur" + "2. Desert Lemur" + "3. Jungle Lemurs");
           
            int num = Integer.parseInt(lemurchoice);

        Lemur lemur[] = new Lemur[num];
        
         lemur1.setWeight((int)(Math.random() * 15 + 1));
            lemur1.setAge((int)(Math.random() * 15 + 1));
            
          int win= ((int) Math.random());
          if(win>=1){
           String win1= "Male";
            lemur1.setGenger(win1);
          }else{
             String win1="Female";
              lemur1.setGenger(win1);
          }
            System.out.println(n);
        if(num == 1){
                System.out.println("Creating Tree Lemur.");
                lemur[n] = new TreeLemur();
                System.out.println(lemur[n]);
                
            }
            else if(num == 2){
                System.out.println("Creating Desert Lemur.");
                lemur[n] = new DesertLemur();
                System.out.println(lemur[n]);
                
            }
            else if(num == 3){
                System.out.println("Creating Jungle Lemur.");
                lemur[n] = new JungleLemur();
                System.out.println(lemur[n]);
                
            }
            else {
                System.out.println("Invalid selection.  Try again.");
                n--;
            }
        
            
          
         
              
           
        }
        
    }
    
}
