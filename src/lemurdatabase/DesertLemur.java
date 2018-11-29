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
public class DesertLemur extends Lemur {
     String fur = "white, to reflect the suns rays";
     String group = "two-thirds of the babies die due to puncture wounds from the cacti.";
     String food = "they obtain water from cacti";
    
    public String toString() {
        String output = super.toString();
            output +="Fur colour : " + fur + "\n";
            output += "Baby mortality: " + group + "\n";
            output += "Food type: " + food + "\n";
            
    //output string is complete, return it
    return output;
}
}
