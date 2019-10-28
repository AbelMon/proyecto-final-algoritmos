/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author desarrolloapp
 */
public class CustomerMannager {
    
    private String userSelection = "";
    
    public CustomerMannager() {
        
    }
    
    
    public void init() {
        System.out.println(Messages.CUSTOMER_TITLE);
        System.out.println(Messages.CUSTOMER_MENU_MSG);
        selectOption();
    }
    
    
    public void selectOption() {
        
        userSelection = GeneralUtils.getStringInput();
        
        if (userSelection.trim().equals("0")) {
            initMainMenu();
            return;
        }
        
        
        if (userSelection.trim().equals("1")) {
            return;
        }
        
        
        if (userSelection.trim().equals("2")) {
            return;
        }
        
        
        System.out.println(Messages.ERROR_CHOOSE_VALID_OPTION);
        selectOption();
    }
    
    
    public void initMainMenu() {
        GeneralUtils.newScreenSection();
        ProyectoFinal proyecto = new ProyectoFinal();
        proyecto.printMenuInstructions();
        proyecto.selectOption();
    }
    
    
    public void addCustomer() {
        
    }
}
