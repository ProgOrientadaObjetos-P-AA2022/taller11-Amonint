package taller11;

import java.util.ArrayList;

public class Ejecutor2 {
    public static void main(String[] args) {
        ArrayList<Menu> lista = new ArrayList<>();
        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
            {"Niños 02", "3.00", "1", "1.5"},
            {"Niños 03", "2.00", "2", "0.5"},
         };
        
        String[][] datos002 = {{"Econo 001", "4", "25"}, 
            {"Econo 002", "4", "15"},
            {"Econo 003", "4", "35"}
        };
        
        String[][] datos003 = { {"Dia 001", "5", "1", "1"}, 
            {"Dia 002", "6", "2", "2"},
            {"Dia 003", "5.5", "3", "1"},
        };
        
        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"}, 
            {"Carta 002", "7", "1.7", "2.1", "5"}, 
            {"Carta 003", "8", "1.9", "2.2", "5"}, 
            {"Carta 004", "9", "2.5", "2.9", "5"}, 
        };
                
        
        // Lista de Menus
        
        for (int i = 0; i < datos001.length; i++) {
            String nPlato =datos001[i][0];
            Double vinicial = Double.parseDouble(datos001[i][1]);
            Double vHelado = Double.parseDouble(datos001[i][2]);
            Double vPastel = Double.parseDouble(datos001[i][3]);
            MenuNiños menu1 = new MenuNiños(nPlato, vinicial,vPastel,vHelado);
            lista.add(menu1);
            System.out.println(lista);

        }
        
        /* Agregar un proceso para generar objetos de tipo Menu Carta, Día, 
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado, 
        agregar al ArrayList lista*/
        // Inicio de solución
        
        
        


    }

}
