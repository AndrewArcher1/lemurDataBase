/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lemurdatabase;

/**
 *
 * @author anarc6700
 */
public class Lemur extends Mammal {
    
    String location = "Madagascar";
    String coat = "Fur";
    String classifcation = "Prosimians";
    
    
     public String toString() {
    String output = super.toString();
            output +=  "Location: " + location + "\n";
            output += "Classifcation: " + classifcation + "\n";
            output += "Fun Facts" + "can use their teeth as a comb" + "\n";
            output +=  "Females play the dominate role" + "\n";
           
    //output string is complete, return it
    return output;
}
     
}
