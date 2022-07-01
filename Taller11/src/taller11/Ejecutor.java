/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Ejecutor {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                // TODO code application logic here
                ArrayList<Menu> lmenu = new ArrayList<>();
                MenuCarta menuCar1 = new MenuCarta("SALCHIPAPA", 5, 3, 2);
                menuCar1.establecerPorcentajeAdicional(10);
                menuCar1.calcularvalorMenuTotal();
                // System.out.println(menuCar1);
                MenudelDia menudia1 = new MenudelDia("HORNADO", 5, 2, 5);
                menudia1.calcularvalorMenuTotal();
                // System.out.println(menudia1);
                MenuNiños menunin1 = new MenuNiños("BOLON", 8, 3, 2);
                menunin1.calcularvalorMenuTotal();
                // System.out.println(menuninos1);
                MenuNiños menuninos2 = new MenuNiños("HUMITAS", 2, 2, 2);
                menuninos2.calcularvalorMenuTotal();
                // System.out.println(menuninos2);
                MenuEconomico menuEco1 = new MenuEconomico("FILETE DE POLLO CON SALSA", 4);
                menuEco1.establecerPorcentajeDescuento(10);
                menuEco1.calcularvalorMenuTotal();
                // System.out.println(menuEco1);

                lmenu.add(menuCar1);
                lmenu.add(menudia1);
                lmenu.add(menunin1);
                lmenu.add(menuninos2);
                lmenu.add(menuEco1);
                CuentaMenu cuenta1 = new CuentaMenu();
                cuenta1.establecerListamenu(lmenu);
                cuenta1.establecerId(012);
                cuenta1.establecerNombreCliente("Abraham Ayala");
                cuenta1.calcularvalortotalcancelar();
                System.out.println(cuenta1);

        }

}
