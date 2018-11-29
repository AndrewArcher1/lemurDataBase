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
public class JungleLemur extends Lemur {
    String fur = "Blue or Black";
     String group = "They travel in small groups";
     String food = "They eat mice,snails and insects" ;
     String mane = "No mane";
    public String toString() {
    String output = super.toString();
            output +="Fur colour : " + fur + "\n";
            output += "Baby mortality: " + group + "\n";
            output += "Food type: " + food + "\n";
            output += "Mane: " + mane + "\n";
    //output string is complete, return it
    return output;
}
}
