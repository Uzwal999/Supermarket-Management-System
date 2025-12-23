/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermarket;

import View.LoadingScreen;

/**
 *
 * @author Administrator
 */
public class Supermarket {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // Run the Loading Screen first
        // Since your LoadingScreen has the timer logic in its own main method, 
        // we can just call that or create an instance here.
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoadingScreen screen = new LoadingScreen();
                screen.setVisible(true);
                screen.setLocationRelativeTo(null); // Centers the splash screen
                
                // Trigger the loading logic
                startLoading(screen);
            }
        });
    }

    private static void startLoading(LoadingScreen screen) {
        new Thread(() -> {
            try {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(40);
                    final int value = i;
                    javax.swing.SwingUtilities.invokeLater(() -> {
                        screen.ProgressBar.setValue(value);
                        // We use the variable names from your provided code
                        // screen.Percentage.setText(value + "%"); 
                    });
                }
                javax.swing.SwingUtilities.invokeLater(() -> {
                    new View.Login().setVisible(true);
                    screen.dispose();
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
    
}
