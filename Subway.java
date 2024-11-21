/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.subway;
import javax.swing.SwingUtilities;

/**
 *
 * @author santi
 */
public class Subway {

    public static void main(String[] args) {
        // Utilizamos invokeLater para que la interfaz gráfica se ejecute en el hilo de la interfaz
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Aquí creas e inicias tu formulario
                Form form = new Form();  // Cambia 'Form1' por el nombre de tu formulario
                form.setVisible(true);      // Hace que el formulario sea visible
            }
        });
    }
}


