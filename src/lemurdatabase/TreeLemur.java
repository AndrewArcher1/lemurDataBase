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
public class TreeLemur extends Lemur{
     String fur = "red";
     String group = "large";
     String food = "fruit";
    
    public String toString() {
    String output = super.toString();
            output +="Fur colour: " + fur + "\n";
            output += "Group size: " + group + "\n";
            output += "Food type: " + food + "\n";
            
    //output string is complete, return it
    return output;
}
}
