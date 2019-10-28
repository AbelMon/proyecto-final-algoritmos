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
public abstract  class Messages {
    
    
    private static final String LINE_BREAK = "\n";
    
    
    public static final String NEW_SECTION = LINE_BREAK
            + LINE_BREAK
            + LINE_BREAK
            + "-------------------------------------------------"
            + LINE_BREAK;
    
    
    public static final String CUSTOMER_TITLE = "******************** CLIENTES ********************" + LINE_BREAK;
    public static final String MAIN_MENU_TITLE = "***************** MENÚ PRINCIPAL *****************" + LINE_BREAK;
    
    public static final String ERROR_CHOOSE_VALID_OPTION = "Elige una opción válida." + LINE_BREAK ;
    
    public static final String MAIN_MENU_MSG = "Bienvenido al programa de control de ventas."
            + LINE_BREAK 
            + "Ingresa el número de la sección a la que deseas ir: " 
            + LINE_BREAK + LINE_BREAK
            + "1. Clientes" + LINE_BREAK
            + "2. Facturación"
            + LINE_BREAK + LINE_BREAK
            + "Preciona 0 (cero) para salir."; 
    
    public static final String INPUT_INDICATOR = "> ";
    
    public static final String CUSTOMER_MENU_MSG = "Ingresa el número de la sección a la que deseas ir"
            + LINE_BREAK
            + "1. Ingresar clientes" + LINE_BREAK
            + "2. Ver clientes"
            + LINE_BREAK + LINE_BREAK
            + "Preciona 0 (cero) para regresar.";
}
