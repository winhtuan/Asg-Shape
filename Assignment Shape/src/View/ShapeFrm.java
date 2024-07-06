package View;

import Form.FormCircle;
import Form.FormSquare;
import Form.FormWindow;
import Form.FormSphere;
import Form.FormCube;
import Form.FormTetrahedron;
import Form.FormTriangle;
import Swing.EventNavigationBar;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ShapeFrm extends javax.swing.JFrame {

    public ShapeFrm() {
        initComponents();
        getContentPane().setBackground(new Color(240, 240, 240));
        ImageIcon icon = new ImageIcon(getClass().getResource("/Icon/Logo.png"));
        this.setIconImage(icon.getImage());
        
        navigationBar.addItem(new ImageIcon(getClass().getResource("/Icon/Circle.png")));
        navigationBar.addItem(new ImageIcon(getClass().getResource("/Icon/Square.png")));
        navigationBar.addItem(new ImageIcon(getClass().getResource("/Icon/Triangle.png")));
        navigationBar.addItem(new ImageIcon(getClass().getResource("/Icon/Window.png")));
        navigationBar.addItem(new ImageIcon(getClass().getResource("/Icon/Sphere.png")));
        navigationBar.addItem(new ImageIcon(getClass().getResource("/Icon/Cube.png")));
        navigationBar.addItem(new ImageIcon(getClass().getResource("/Icon/Tetrahedron.png")));
        navigationBar.addEvent(new EventNavigationBar() {
            @Override
            public void beforeSelected(int index) {
                if (index == 0) {
                    panelTransaction1.display(new FormCircle(), navigationBar.getAnimator());
                } else if (index == 1) {
                    panelTransaction1.display(new FormSquare(), navigationBar.getAnimator());
                } else if (index == 2) {
                    panelTransaction1.display(new FormTriangle(), navigationBar.getAnimator());
                } else if (index == 3) {
                    panelTransaction1.display(new FormWindow(), navigationBar.getAnimator());
                } else if (index == 4) {
                    panelTransaction1.display(new FormSphere(), navigationBar.getAnimator());
                } else if (index == 5) {
                    panelTransaction1.display(new FormCube(), navigationBar.getAnimator());
                } else if (index == 6) {
                    panelTransaction1.display(new FormTetrahedron(), navigationBar.getAnimator());
                }
            }
            @Override
            public void afterSelected(int index) {

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navigationBar = new Swing.NavigationBar();
        panelTransaction1 = new Transitions.PanelTransitions();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout navigationBarLayout = new javax.swing.GroupLayout(navigationBar);
        navigationBar.setLayout(navigationBarLayout);
        navigationBarLayout.setHorizontalGroup(
            navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        navigationBarLayout.setVerticalGroup(
            navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navigationBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTransaction1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelTransaction1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(navigationBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        navigationBar.initSelectedIndex(3);
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShapeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShapeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShapeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShapeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShapeFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.NavigationBar navigationBar;
    private Transitions.PanelTransitions panelTransaction1;
    // End of variables declaration//GEN-END:variables
}
