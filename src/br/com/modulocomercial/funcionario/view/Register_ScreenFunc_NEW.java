/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.modulocomercial.funcionario.view;


import br.com.modulocomercial.cliente.view.Profile_Screen_NEW;
import br.com.modulocomercial.funcionario.model.Funcionario;
import br.com.modulocomercial.infrastructure.service.FacadeInstance;
import br.com.modulocomercial.view.Principal_Screen_NEW;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Henrique
 */
public class Register_ScreenFunc_NEW extends javax.swing.JFrame {

    //String usuario 
    String usuario;    
//carega todos os clientes do banco de dados para verificar se não existem 2 logins iguais
    List<Funcionario> funcionario = FacadeInstance.getInstance().getAllFuncionarios();
//cria numeros aleatorios    
        Random num1 = new Random();
        Random num2 = new Random();
        
//construtor de cliente
    Funcionario user = new Funcionario();
    /**
     * Creates new form Register_ScreenFunc_N
     */
    public Register_ScreenFunc_NEW() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    //a funçao vai definir um login aleatorio para usuario com o padrao de xxxCLIxxx
    //logo em seguida vai verificar se esse login ja existe no banco de dados
    //se existir ela se chama novamente para gerar outro numero e fazer a checagem novamente
    //se der tudo certo ele retorna o usario 
    private String validaUsuario(){
    usuario=(100+num1.nextInt(900))+"FUC"+(100+num2.nextInt(900));
    for(int i = 0; i < funcionario.size(); i++){
        if(usuario.equals(funcionario.get(i).getUsuario())){
            usuario=validaUsuario();
        }    
    }
    return usuario;
    }
    
    
     //validaçoes()
    private boolean validaCampos(){
        
        
        if(txtName.getText().equals("")){
            JOptionPane.showMessageDialog(null,"The field Name cannot be blank");
            return false;
        }
        if(txtUsername.getText().equals("")){
            JOptionPane.showMessageDialog(null,"The  field Username cannot be blank");
            return false;
        }
        if(txtCpf.getText().equals("")){
            JOptionPane.showMessageDialog(null,"The field Cpf cannot be blank");
            return false;
        } 
        
        if(txtCpf.getText().length()!=11){
            JOptionPane.showMessageDialog(null,"Error invalid cpf ");
            return false;
        } 
       
        if(passPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null,"The field Password cannot be blank");
            return false;
        }
        
        return true;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelES = new javax.swing.JPanel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtName = new javax.swing.JFormattedTextField();
        txtUsername = new javax.swing.JFormattedTextField();
        cbxFunction = new javax.swing.JComboBox<>();
        jButtonRETURNES = new javax.swing.JButton();
        jButtonREGISTERES = new javax.swing.JButton();
        jLabelFunctionES = new javax.swing.JLabel();
        jLabelCPFES = new javax.swing.JLabel();
        jLabelPasswordES = new javax.swing.JLabel();
        jLabelUsernameES = new javax.swing.JLabel();
        jLabelNameES = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelEmployeeRegis = new javax.swing.JLabel();
        passPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelES.setBackground(new java.awt.Color(15, 27, 54));

        javax.swing.GroupLayout jPanelESLayout = new javax.swing.GroupLayout(jPanelES);
        jPanelES.setLayout(jPanelESLayout);
        jPanelESLayout.setHorizontalGroup(
            jPanelESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        jPanelESLayout.setVerticalGroup(
            jPanelESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        cbxFunction.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        cbxFunction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendedor", "Gerente" }));
        cbxFunction.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxFunction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFunctionActionPerformed(evt);
            }
        });

        jButtonRETURNES.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jButtonRETURNES.setForeground(new java.awt.Color(204, 0, 0));
        jButtonRETURNES.setText("RETURN");
        jButtonRETURNES.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRETURNES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRETURNESMouseClicked(evt);
            }
        });

        jButtonREGISTERES.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jButtonREGISTERES.setForeground(new java.awt.Color(0, 102, 153));
        jButtonREGISTERES.setText("REGISTER");
        jButtonREGISTERES.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonREGISTERES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonREGISTERESMouseClicked(evt);
            }
        });

        jLabelFunctionES.setFont(new java.awt.Font("Unispace", 0, 16)); // NOI18N
        jLabelFunctionES.setForeground(new java.awt.Color(15, 27, 54));
        jLabelFunctionES.setText("FUNCTION:");

        jLabelCPFES.setFont(new java.awt.Font("Unispace", 0, 16)); // NOI18N
        jLabelCPFES.setForeground(new java.awt.Color(15, 27, 54));
        jLabelCPFES.setText("CPF:");

        jLabelPasswordES.setFont(new java.awt.Font("Unispace", 0, 16)); // NOI18N
        jLabelPasswordES.setForeground(new java.awt.Color(15, 27, 54));
        jLabelPasswordES.setText("PASSWORD:");

        jLabelUsernameES.setFont(new java.awt.Font("Unispace", 0, 16)); // NOI18N
        jLabelUsernameES.setForeground(new java.awt.Color(15, 27, 54));
        jLabelUsernameES.setText("USERNAME:");

        jLabelNameES.setFont(new java.awt.Font("Unispace", 0, 16)); // NOI18N
        jLabelNameES.setForeground(new java.awt.Color(15, 27, 54));
        jLabelNameES.setText("NAME:");

        jPanel1.setBackground(new java.awt.Color(0, 32, 64));

        jLabelEmployeeRegis.setFont(new java.awt.Font("Impact", 0, 22)); // NOI18N
        jLabelEmployeeRegis.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmployeeRegis.setText("EMPLOYEE REGISTRATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEmployeeRegis)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEmployeeRegis)
                .addContainerGap(476, Short.MAX_VALUE))
        );

        passPassword.setPreferredSize(new java.awt.Dimension(220, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabelNameES)
                        .addGap(0, 0, 0)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabelCPFES, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabelFunctionES, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(cbxFunction, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jButtonREGISTERES, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonRETURNES, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelUsernameES, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPasswordES, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanelES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelNameES))
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUsernameES))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPasswordES)
                            .addComponent(passPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelCPFES))
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelFunctionES, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbxFunction, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonREGISTERES, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRETURNES, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void cbxFunctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFunctionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFunctionActionPerformed

    private void jButtonRETURNESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRETURNESMouseClicked
        Principal_Screen_NEW rgf = new Principal_Screen_NEW();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonRETURNESMouseClicked

    private void jButtonREGISTERESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonREGISTERESMouseClicked
        // TODO add your handling code here:
        String senha = String.valueOf(passPassword.getPassword());
        //verfica se os campos estao todos preenchidos
        if(validaCampos() == true){
            user.setNome(txtName.getText());
            user.setSenha(senha);
            user.setCpf(txtCpf.getText());
            user.setUsername(txtUsername.getText());
            user.setUsuario(validaUsuario());
            user.setCargo((String) cbxFunction.getSelectedItem());
        //mostra o login do cliente
            JOptionPane.showMessageDialog(null,"O login do funcionario é:" + usuario); 
        //salva o usuario
            user = FacadeInstance.getInstance().saveFuncionario(user);
            if (user != null) {
                this.funcionario.add(user);
                this.funcionario = FacadeInstance.getInstance().getAllFuncionarios();
                JOptionPane.showMessageDialog(null, "Funcionario salvo com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao salvar o Funcionario");
            }
            //limpa os campos
            txtName.setText("");
            txtUsername.setText("");
            txtCpf.setText("");
            passPassword.setText("");
        
            ProfileFunc_Screen_NEW rgf = new ProfileFunc_Screen_NEW();
            rgf.setVisible(true);
            rgf.pack();
            rgf.setLocationRelativeTo(null);
            rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonREGISTERESMouseClicked

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
            java.util.logging.Logger.getLogger(Register_ScreenFunc_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_ScreenFunc_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_ScreenFunc_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_ScreenFunc_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_ScreenFunc_NEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxFunction;
    private javax.swing.JButton jButtonREGISTERES;
    private javax.swing.JButton jButtonRETURNES;
    private javax.swing.JLabel jLabelCPFES;
    private javax.swing.JLabel jLabelEmployeeRegis;
    private javax.swing.JLabel jLabelFunctionES;
    private javax.swing.JLabel jLabelNameES;
    private javax.swing.JLabel jLabelPasswordES;
    private javax.swing.JLabel jLabelUsernameES;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelES;
    private javax.swing.JPasswordField passPassword;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtName;
    private javax.swing.JFormattedTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}