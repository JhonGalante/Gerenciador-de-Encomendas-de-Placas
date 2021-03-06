/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.DadosClientes;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.Cliente;
import model.CorFrase;
import model.CorPlaca;
import model.Encomenda;

/**
 *
 * @author jhona
 */
public class GuiAdicionarEncomenda extends javax.swing.JDialog {

    /**
     * Creates new form GuiAdicionarEncomenda
     */
    private Encomenda encomenda = new Encomenda();;
    private Boolean alterando = false; //Set true in case of modifying a object
    private Boolean justView = false; //Set true in case of just view a object data
    private LocalDate dia;
    private DadosClientes dadosClientes = new DadosClientes();
    
    
    public GuiAdicionarEncomenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CboClientes = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoAltura = new javax.swing.JTextField();
        campoLargura = new javax.swing.JTextField();
        campoFrase = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CboCorPlaca = new javax.swing.JComboBox<>();
        CboCorFrase = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        campoPrazo = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        campoValorTotal = new javax.swing.JTextField();
        titleWindow = new javax.swing.JLabel();
        campoValorSinal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Cliente");

        CboClientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tamanho"));

        jLabel2.setText("Altura");

        jLabel3.setText("Largura");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoAltura)
                    .addComponent(campoLargura))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel5.setText("Frase");

        jLabel6.setText("Cor da Placa");

        jLabel7.setText("Cor da Frase");

        CboCorPlaca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CboCorFrase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Prazo de Entrega");

        campoPrazo.setEditable(false);
        try {
            campoPrazo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("**/**/****")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel9.setText("Valor de Sinal");

        jLabel10.setText("Valor Total");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        campoValorTotal.setEditable(false);

        titleWindow.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        titleWindow.setText("Cadastro");

        campoValorSinal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoValorSinalFocusGained(evt);
            }
        });
        campoValorSinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoValorSinalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(CboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(12, 12, 12)
                        .addComponent(campoFrase, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(34, 34, 34)
                        .addComponent(CboCorPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(32, 32, 32)
                        .addComponent(CboCorFrase, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addComponent(campoValorSinal))))
                .addGap(0, 23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(titleWindow)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(titleWindow)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addComponent(CboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5))
                    .addComponent(campoFrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6))
                    .addComponent(CboCorPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7))
                    .addComponent(CboCorFrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8))
                    .addComponent(campoPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoValorSinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel10))
                    .addComponent(campoValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnSalvar)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        if(!alterando){
            
            encomenda.setPrazoEntrega(dia);
        }
        encomenda.setCliente((Cliente) CboClientes.getSelectedItem());
        calcularValorServico();
        encomenda.setCorPlaca((CorPlaca) CboCorPlaca.getSelectedItem());
        encomenda.setCorFrase((CorFrase)CboCorFrase.getSelectedItem());
        Double valorSinal = Double.parseDouble(campoValorSinal.getText());
        if(valorSinal > encomenda.getValorServico()/2){
            encomenda.setValorSinal(Double.parseDouble(campoValorSinal.getText()));
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "O valor do sinal deve ser pelo menos 50% do valor do serviço");
        }    
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            // TODO add your handling code here:
            preencherCbos();
        } catch (Exception ex) {
            Logger.getLogger(GuiAdicionarEncomenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(justView){
            preencherCampos();
            //Block editable field in case of just view
            campoAltura.setEditable(false);
            campoLargura.setEditable(false);
            campoFrase.setEditable(false);
            campoPrazo.setEditable(false);
            campoValorSinal.setEditable(false);
            campoValorTotal.setEditable(false);
            CboClientes.setEnabled(false);
            CboCorPlaca.setEnabled(false);
            CboCorFrase.setEnabled(false);
            titleWindow.setText("Dados");
        }
        
        else if(alterando){
            preencherCampos();
        }
        else{
            campoPrazo.setText(dia.format(DateTimeFormatter.ofPattern("d/MM/yyyy")));
        }
    }//GEN-LAST:event_formWindowOpened

    private void campoValorSinalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoValorSinalFocusGained
        // TODO add your handling code here:
        calcularValorServico();
        campoValorTotal.setText(encomenda.getValorServico().toString());
    }//GEN-LAST:event_campoValorSinalFocusGained

    private void campoValorSinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoValorSinalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValorSinalMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
        //"Destroy" the object in case of the "save" button wasn't clicked
        if(encomenda.getCliente() == null){
            encomenda = null;
        }
    }//GEN-LAST:event_formWindowClosing
 
    public Encomenda getEncomenda() {
        return encomenda;
    }

    public void setEncomenda(Encomenda encomenda) {
        this.encomenda = encomenda;
    }

    public void setAlterando(Boolean alterando) {
        this.alterando = alterando;
    }

    public void setJustView(Boolean justView) {
        this.justView = justView;
    }


    public JButton getBtnSalvar() {
        return btnSalvar;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    
    
    
    
    private void preencherCbos() throws Exception{
        //Fill the Client's ComboBox
        CboClientes.removeAllItems();
        
        for(Cliente cliente: dadosClientes.getList()){
            CboClientes.addItem(cliente);
        }
        
        //Fill the Phrase's color ComboBox
        CboCorFrase.setModel(new javax.swing.DefaultComboBoxModel(CorFrase.values()));
        
        //Fill the Placa's color ComboBox
        CboCorPlaca.setModel(new javax.swing.DefaultComboBoxModel(CorPlaca.values()));
        
    }
    
    //Fill the fields with the data's object in case of already exists
    private void preencherCampos(){
        CboClientes.setSelectedItem(encomenda.getCliente());
        CboCorPlaca.setSelectedItem(encomenda.getCorPlaca());
        CboCorFrase.setSelectedItem(encomenda.getCorFrase());
        campoAltura.setText(encomenda.getAltura().toString());
        campoLargura.setText(encomenda.getLargura().toString());
        campoFrase.setText(encomenda.getFraseEscrita());
        campoPrazo.setText(encomenda.getPrazoEntrega().format(DateTimeFormatter.ofPattern("d/MM/yyyy")));
        campoValorSinal.setText(encomenda.getValorSinal().toString());
        campoValorTotal.setText(encomenda.getValorServico().toString());
    }
    
    private void calcularValorServico(){
        encomenda.setAltura(Double.parseDouble(campoAltura.getText()));
        encomenda.setLargura(Double.parseDouble(campoLargura.getText()));
        encomenda.setFraseEscrita(campoFrase.getText());
        encomenda.setValorServico();
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CboClientes;
    private javax.swing.JComboBox<String> CboCorFrase;
    private javax.swing.JComboBox<String> CboCorPlaca;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField campoAltura;
    private javax.swing.JTextField campoFrase;
    private javax.swing.JTextField campoLargura;
    private javax.swing.JFormattedTextField campoPrazo;
    private javax.swing.JTextField campoValorSinal;
    private javax.swing.JTextField campoValorTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titleWindow;
    // End of variables declaration//GEN-END:variables
}
