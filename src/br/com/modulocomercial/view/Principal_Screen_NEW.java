package br.com.modulocomercial.view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author joanb
 */

import javax.swing.JFrame;
import br.com.modulocomercial.cliente.view.Register_ScreenUser_NEW;
import br.com.modulocomercial.funcionario.view.Register_ScreenFunc_NEW;
import br.com.modulocomercial.funcionario.model.Funcionario;
import br.com.modulocomercial.cliente.model.Cliente;
import br.com.modulocomercial.cliente.view.Profile_Screen_NEW;
import br.com.modulocomercial.funcionario.view.ProfileFunc_Screen_NEW;
import br.com.modulocomercial.infrastructure.service.FacadeInstance;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal_Screen_NEW extends javax.swing.JFrame {
    
         
         public static Funcionario funcio;
         public static Cliente clien;

    /**
     * Creates new form Tela_Principal
     */
    public Principal_Screen_NEW() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    
    
    private Funcionario validarLoginEmployee() {
        List<Funcionario> users = FacadeInstance.getInstance().getAllFuncionarios();
        String senha = new String(jPasswordFieldPassLS.getPassword());
        String login = this.jtxtLoginLS.getText();
        
        Funcionario user = new Funcionario();
        user.setSenha(senha);
        user.setUsuario(login);
        for (Funcionario func : users) {
            if (func.getUsuario().equals(user.getUsuario()) && func.getSenha().equals(user.getSenha())) {
                return func;
            }
        }
    
        return null;
    }
    
    private void makeLoginEmployee() {
        Funcionario trabalhador = this.validarLoginEmployee();
        if (trabalhador == null) {
            // errro
            JOptionPane.showMessageDialog(null, "Erro, usuário invalido");

        } else {
            funcio = trabalhador;
            JOptionPane.showMessageDialog(null, "Bem Vindo(a) " + trabalhador.getUsername(), "Sucesso!",
                    JOptionPane.INFORMATION_MESSAGE);

            ProfileFunc_Screen_NEW psr = new ProfileFunc_Screen_NEW();
            psr.setVisible(true);
            psr.pack();
            psr.setLocationRelativeTo(null);
            psr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose(); 
            this.setVisible(false);
        }
    }
    
     private Cliente validarLoginUser() {
        List<Cliente> users = FacadeInstance.getInstance().getAllClientes();
        String senha = new String(jPasswordFieldPassLS.getPassword());
        String login = this.jtxtLoginLS.getText();
        
        Cliente user = new Cliente();
        user.setSenha(senha);
        user.setLogin(login);
        for (Cliente cli : users) {
            if (cli.getLogin().equals(user.getLogin()) && cli.getSenha().equals(user.getSenha())) {
                return cli;
            }
        }
    
        return null;
    }
     
    private void makeLoginUser() {
        Cliente user = this.validarLoginUser();
         
        if (user == null) {
            // erro
            JOptionPane.showMessageDialog(null, "Erro, Cliente invalido");

        } else {
            clien = user;
            JOptionPane.showMessageDialog(null, "Bem Vindo(a) " + user.getUserNome(), "Sucesso!",
                    JOptionPane.INFORMATION_MESSAGE);

            Profile_Screen_NEW psr = new Profile_Screen_NEW();
            psr.setVisible(true);
            psr.pack();
            psr.setLocationRelativeTo(null);
            psr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose(); 
            this.setVisible(false);
        }
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenu1 = new javax.swing.JMenu();
        jPanelNLS = new javax.swing.JPanel();
        jPanelLS = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelMD = new javax.swing.JLabel();
        jtxtLoginLS = new javax.swing.JFormattedTextField();
        jPasswordFieldPassLS = new javax.swing.JPasswordField();
        jLoginButtonLS = new javax.swing.JButton();
        jCancelButtonLS = new javax.swing.JButton();
        jCheckBoxEmployee = new javax.swing.JCheckBox();
        jCheckBoxUser = new javax.swing.JCheckBox();
        jLabelPasswordLS = new javax.swing.JLabel();
        jLabelUsernameLS = new javax.swing.JLabel();
        jLabelNEWRegister = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login Screen");
        setMinimumSize(new java.awt.Dimension(800, 548));
        getContentPane().setLayout(null);

        jPanelNLS.setBackground(new java.awt.Color(244, 245, 241));
        jPanelNLS.setForeground(new java.awt.Color(204, 204, 204));
        jPanelNLS.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanelNLS.setMinimumSize(new java.awt.Dimension(600, 400));
        jPanelNLS.setPreferredSize(new java.awt.Dimension(600, 470));
        jPanelNLS.setLayout(null);

        jPanelLS.setBackground(new java.awt.Color(15, 27, 54));

        javax.swing.GroupLayout jPanelLSLayout = new javax.swing.GroupLayout(jPanelLS);
        jPanelLS.setLayout(jPanelLSLayout);
        jPanelLSLayout.setHorizontalGroup(
            jPanelLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        jPanelLSLayout.setVerticalGroup(
            jPanelLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        jPanelNLS.add(jPanelLS);
        jPanelLS.setBounds(240, 40, 560, 110);

        jPanel1.setBackground(new java.awt.Color(0, 32, 64));
        jPanel1.setLayout(null);

        jLabelMD.setFont(new java.awt.Font("Impact", 0, 22)); // NOI18N
        jLabelMD.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMD.setText("MÓDULO COMERCIAL");
        jPanel1.add(jLabelMD);
        jLabelMD.setBounds(10, 10, 174, 28);

        jPanelNLS.add(jPanel1);
        jPanel1.setBounds(10, 10, 230, 510);

        jtxtLoginLS.setBackground(new java.awt.Color(255, 255, 255));
        jtxtLoginLS.setForeground(new java.awt.Color(0, 0, 0));
        jtxtLoginLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtLoginLSActionPerformed(evt);
            }
        });
        jPanelNLS.add(jtxtLoginLS);
        jtxtLoginLS.setBounds(440, 190, 169, 32);

        jPasswordFieldPassLS.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordFieldPassLS.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordFieldPassLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPassLSActionPerformed(evt);
            }
        });
        jPanelNLS.add(jPasswordFieldPassLS);
        jPasswordFieldPassLS.setBounds(440, 270, 170, 30);

        jLoginButtonLS.setBackground(new java.awt.Color(255, 255, 255));
        jLoginButtonLS.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLoginButtonLS.setForeground(new java.awt.Color(0, 102, 153));
        jLoginButtonLS.setText("LOGIN");
        jLoginButtonLS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLoginButtonLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginButtonLSActionPerformed(evt);
            }
        });
        jPanelNLS.add(jLoginButtonLS);
        jLoginButtonLS.setBounds(440, 330, 80, 32);

        jCancelButtonLS.setBackground(new java.awt.Color(255, 255, 255));
        jCancelButtonLS.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jCancelButtonLS.setForeground(new java.awt.Color(204, 0, 0));
        jCancelButtonLS.setText("CANCEL");
        jCancelButtonLS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCancelButtonLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelButtonLSActionPerformed(evt);
            }
        });
        jPanelNLS.add(jCancelButtonLS);
        jCancelButtonLS.setBounds(530, 330, 80, 32);

        jCheckBoxEmployee.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jCheckBoxEmployee.setForeground(new java.awt.Color(15, 27, 54));
        jCheckBoxEmployee.setText("EMPLOYEE");
        jCheckBoxEmployee.setBorder(null);
        jCheckBoxEmployee.setContentAreaFilled(false);
        jCheckBoxEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBoxEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxEmployeeMouseClicked(evt);
            }
        });
        jCheckBoxEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxEmployeeActionPerformed(evt);
            }
        });
        jPanelNLS.add(jCheckBoxEmployee);
        jCheckBoxEmployee.setBounds(400, 450, 100, 20);

        jCheckBoxUser.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jCheckBoxUser.setForeground(new java.awt.Color(15, 27, 54));
        jCheckBoxUser.setText("USER");
        jCheckBoxUser.setContentAreaFilled(false);
        jCheckBoxUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBoxUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxUserMouseClicked(evt);
            }
        });
        jCheckBoxUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUserActionPerformed(evt);
            }
        });
        jPanelNLS.add(jCheckBoxUser);
        jCheckBoxUser.setBounds(600, 450, 70, 20);

        jLabelPasswordLS.setBackground(new java.awt.Color(0, 51, 102));
        jLabelPasswordLS.setForeground(new java.awt.Color(0, 51, 102));
        jLabelPasswordLS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/modulocomercial/imagens/115716_lock_unlock_password_secure_security_icon.png"))); // NOI18N
        jPanelNLS.add(jLabelPasswordLS);
        jLabelPasswordLS.setBounds(400, 260, 30, 40);

        jLabelUsernameLS.setBackground(new java.awt.Color(0, 51, 102));
        jLabelUsernameLS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/modulocomercial/imagens/5340287_man_people_person_user_users_icon (1).png"))); // NOI18N
        jPanelNLS.add(jLabelUsernameLS);
        jLabelUsernameLS.setBounds(400, 190, 30, 30);

        jLabelNEWRegister.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNEWRegister.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabelNEWRegister.setForeground(new java.awt.Color(15, 27, 54));
        jLabelNEWRegister.setText("CLICK HERE FOR CREATE A NEW ACCOUNT:");
        jLabelNEWRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelNEWRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNEWRegisterMouseClicked(evt);
            }
        });
        jPanelNLS.add(jLabelNEWRegister);
        jLabelNEWRegister.setBounds(400, 420, 260, 21);

        getContentPane().add(jPanelNLS);
        jPanelNLS.setBounds(-10, -10, 800, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtLoginLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtLoginLSActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jtxtLoginLSActionPerformed

    private void jCancelButtonLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelButtonLSActionPerformed
        // TODO add your handling code here:
        
       jtxtLoginLS.setText("");
       jPasswordFieldPassLS.setText("");
    }//GEN-LAST:event_jCancelButtonLSActionPerformed

    private void jLabelNEWRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNEWRegisterMouseClicked

        
    }//GEN-LAST:event_jLabelNEWRegisterMouseClicked

    private void jPasswordFieldPassLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPassLSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPassLSActionPerformed

    private void jLoginButtonLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginButtonLSActionPerformed
        // TODO add your handling code here:
         String login=this.jtxtLoginLS.getText();
        //verifica se e usuario ou cliente por meio do codigo de login
       if(login.contains("CLI")){
           this.makeLoginUser();
       }    
       else if(login.contains("FUC")){
            this.makeLoginEmployee();
       }
       else {
           JOptionPane.showMessageDialog(null,"Nome de usario invalido");
       }
    }//GEN-LAST:event_jLoginButtonLSActionPerformed

    private void jCheckBoxEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxEmployeeActionPerformed

    private void jCheckBoxUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxUserActionPerformed

    private void jCheckBoxEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxEmployeeMouseClicked
        Register_ScreenFunc_NEW rgf = new Register_ScreenFunc_NEW();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jCheckBoxEmployeeMouseClicked

    private void jCheckBoxUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxUserMouseClicked
        Register_ScreenUser_NEW rgf = new Register_ScreenUser_NEW();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();                    
    }//GEN-LAST:event_jCheckBoxUserMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal_Screen_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_Screen_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_Screen_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_Screen_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_Screen_NEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCancelButtonLS;
    private javax.swing.JCheckBox jCheckBoxEmployee;
    private javax.swing.JCheckBox jCheckBoxUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelMD;
    private javax.swing.JLabel jLabelNEWRegister;
    private javax.swing.JLabel jLabelPasswordLS;
    private javax.swing.JLabel jLabelUsernameLS;
    private javax.swing.JButton jLoginButtonLS;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLS;
    private javax.swing.JPanel jPanelNLS;
    private javax.swing.JPasswordField jPasswordFieldPassLS;
    private javax.swing.JFormattedTextField jtxtLoginLS;
    // End of variables declaration//GEN-END:variables
}