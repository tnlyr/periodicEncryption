/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;

/**
 *
 * @author Administrator
 */
public class EncryptionProcedures {
    
    private static final String[] arrPeriodicTableValues = {"h", "he", "li", "be", "b", "c", "n", "o", "f", "ne", "na", "mg", "al", "si","p", "s", "cl", "ar", "k", "ca", "sc", "ti", "v", "cr", "mn", "fe", "co", "ni", "cu", "zn", "ga", "ge", "as", "se", "br", "kr", "rb", "sr", "y", "zr", "nb", "mo", "tc", "ru", "rh", "pd", "ag", "cd", "in", "sn", "sb", "te", "i", "xe", "cs", "ba", "la", "ce", "pr", "nd", "pm", "sm", "eu", "gd", "tb", "dy", "ho", "er", "tm", "yb", "lu", "hf", "ta", "w", "re", "os", "ir", "pt", "au", "hg","tl", "pb", "bi", "po", "at", "rn", "fr", "ra", "ac", "th", "pa", "u", "np", "pu", "am", "cm", "bk", "cf", "es", "fm", "md", "no","lr", "rf", "db", "sg", "bh", "hs", "mt", "ds", "rg", "cn", "nh", "fl", "mc", "lv", "ts", "og"};
    
    private static int findIndex(String userText){
        int n = -1; // first index before array starts
        for (int i = 0; i < arrPeriodicTableValues.length; i++){
            if (userText.equals(arrPeriodicTableValues[i])){
                n = i+1;
            }
        } 
        // Loops until it finds an index value that is equal to userText
        return n;
    }
    
    
    public static String periodicEncrypt(String userText){
        String originalText = userText;
        String encrypted = "";
        originalText = userText.toLowerCase();
        
        while (originalText.length() > 0){
            if (originalText.length() >= 2 && findIndex(originalText.substring(0,2)) != -1){
                encrypted += findIndex(originalText.substring(0,2));
                originalText = originalText.substring(2);
            }
            
            
            else if(findIndex(originalText.substring(0,1)) != -1){
                encrypted += findIndex(originalText.substring(0,1));
                originalText = originalText.substring(1);
            }
                      
            else{
               encrypted += originalText.substring(0,1);
               originalText = originalText.substring(1);    
            }
        }
        return encrypted;
    }
}