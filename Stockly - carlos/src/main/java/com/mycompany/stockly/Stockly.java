/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stockly;

import javax.swing.SwingUtilities;

/**
 *
 * @author c.marques
 */
public class Stockly {

    public static void main(String[] args) {
         SwingUtilities.invokeLater(() -> {
            new Buscar().setVisible(true);
        });
    }
}
