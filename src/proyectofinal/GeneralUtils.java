/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.Scanner;

/**
 *
 * @author desarrolloapp
 */
public abstract class GeneralUtils {
    
   
    public static String getStringInput() {
        System.out.print(Messages.INPUT_INDICATOR);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    
    public static void newScreenSection() {
        System.out.println(Messages.NEW_SECTION);
    }
}
