import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */
/*
input
isolate the first p in the string
isolate three letters after the p
output
 */

    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter word ");


        JOptionPane.showMessageDialog(null, splitP(word));
    }




    public static String splitP(String word){

        int pIndex = word.indexOf('p');

        return word.substring(pIndex, pIndex + 4);


    }








}


