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
public class ProyectoFinal {

    
    /**
     * @param args the command line arguments
     */
    
    
    private String selection = "";
    
    public static void main(String[] args) {
        // TODO code application logic here
    
        ProyectoFinal proyecto = new ProyectoFinal();
        proyecto.printMenuInstructions();
        proyecto.selectOption();
        
    
    }
    
    public void printMenuInstructions() {
        System.out.println(Messages.MAIN_MENU_TITLE);
        System.out.println(Messages.MAIN_MENU_MSG);
    }
    public void selectOption() {
        
        selection = GeneralUtils.getStringInput();
       
        //0 is the key to end this program
        if (selection.trim().equals("0")) {
            return;
        }
        
        if (selection.trim().equals("1")) {
            initCustomerSection();
            return;
        }
        
        if (selection.trim().equals("2")) {
            return;
        }
        
        System.out.println(Messages.ERROR_CHOOSE_VALID_OPTION);
        selectOption();
    }
    
    private void initCustomerSection() {
        GeneralUtils.newScreenSection();
        CustomerMannager mannager = new CustomerMannager();
        mannager.init();
    }
    
    
}
