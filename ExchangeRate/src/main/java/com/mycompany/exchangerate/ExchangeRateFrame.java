package com.mycompany.exchangerate;

import java.util.Map;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class ExchangeRateFrame extends javax.swing.JFrame {
      
    public ExchangeRateFrame() {
        initComponents();                  
    }
           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Getir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_ExchangeRate = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tree_Currency = new javax.swing.JTree();
        jLabel3 = new javax.swing.JLabel();
        cbx_Others = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exchange Rate ");
        setResizable(false);

        jPanel1.setLayout(null);

        btn_Getir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_Getir.setIcon(new javax.swing.ImageIcon("C:\\Users\\volkanPC\\Desktop\\ExchangeRate\\src\\main\\java\\src\\icon-button.png")); // NOI18N
        btn_Getir.setText("  Getir");
        btn_Getir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GetirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Getir);
        btn_Getir.setBounds(413, 139, 133, 41);

        table_ExchangeRate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table_ExchangeRate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "TRY", "USD", "EUR", "Diğer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_ExchangeRate);
        if (table_ExchangeRate.getColumnModel().getColumnCount() > 0) {
            table_ExchangeRate.getColumnModel().getColumn(0).setResizable(false);
            table_ExchangeRate.getColumnModel().getColumn(1).setResizable(false);
            table_ExchangeRate.getColumnModel().getColumn(2).setResizable(false);
            table_ExchangeRate.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(206, 66, 452, 48);

        jLabel2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GÜNCEL DÖVİZ KURU (EXCHANGE RATE)");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(246, 17, 352, 31);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Ülke Para Birimleri");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Avrupa");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("EUR");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("TRY");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("BGN");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("CHF");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("CZK");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("DKK");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("EGP");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("GBP");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("HRK");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("HUF");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ISK");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("NOK");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("NZD");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("PLN");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("RON");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("RUB");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("SEK");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("UAH");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Kuzey Amerika");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("USD");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("MXN");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("CAD");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("BSD");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("DOP");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("GTQ");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("PAB");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Güney Amerika");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ARS");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("BRL");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("CLP");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("COP");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("PYG");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("PEN");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("UYU");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ZAR");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Asya");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("CNY");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("AED");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("HKD");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("IDR");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ILS");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("INR");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("JPY");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("KZT");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("KRW");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("MYR");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("PHP");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("PKR");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("SAR");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("SGD");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("THB");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("TWD");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Okyanusya");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("AUD");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("FJD");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        tree_Currency.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(tree_Currency);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(16, 12, 170, 188);

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Listeden seçtiğiniz birimin TRY,USD,EUR dışında bir birime çevrilmesini istiyorsanız lütfen aşağıdan seçiniz.");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(198, 120, 465, 13);

        cbx_Others.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbx_Others.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AED", "ARS", "AUD", "BGN", "BRL", "BSD", "CAD", "CHF", "CLP", "CNY", "COP", "CZK", "DKK", "DOP", "EGP", "FJD", "GBP", "GTQ", "HKD", "HRK", "HUF", "IDR", "ILS", "INR", "ISK", "JPY", "KRW", "KZT", "MXN", "MYR", "NOK", "NZD", "PAB", "PEN", "PHP", "PKR", "PLN", "PYG", "RON", "RUB", "SAR", "SEK", "SGD", "THB", "TWD", "UAH", "UYU", "ZAR" }));
        jPanel1.add(cbx_Others);
        cbx_Others.setBounds(311, 149, 70, 21);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\volkanPC\\Desktop\\ExchangeRate\\src\\main\\java\\src\\background.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 670, 210);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void btn_GetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GetirActionPerformed

        //ExchangeRateClient sınıfısından rateClient adında nesne üretiyoruz.
        ExchangeRateClient rateClient = new ExchangeRateClient();
        /*jTree'den seçili node'un ismini çekiyoruz ardından çektiğimiz node ismini getRate fonksiyonuna
        parametre olarak yolluyoruz. Böylece yolladığımız parametreye göre bize geri veri döndürecek.*/
        DefaultMutableTreeNode node = (DefaultMutableTreeNode)tree_Currency.getLastSelectedPathComponent();
        Map<String,String> currencyMap  = rateClient.getRate(node.getUserObject().toString());
        
        //jComboBox içerisinden seçili veriyi çekerek SelectedCurrency değişkenine atıyoruz.
        String SelectedCurrency = cbx_Others.getSelectedItem().toString();
        
        //jTable nesnesinin sütunlarındaki başlıkları belirliyoruz.
        String[] columns = {"TRY","USD","EUR",SelectedCurrency};
        /*jTable'ın satırlarına parse ederek kullanmaya hazır hale getirdiğimiz verilerden kullanacaklarımızı
        filtreleyerek getiriyoruz.*/
        Object[][] data = {{currencyMap.get("TRY"),currencyMap.get("USD"),currencyMap.get("EUR"),currencyMap.get(SelectedCurrency)}};
        DefaultTableModel model = new DefaultTableModel(data,columns);
        table_ExchangeRate.setModel(model);
    }//GEN-LAST:event_btn_GetirActionPerformed

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
            java.util.logging.Logger.getLogger(ExchangeRateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExchangeRateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExchangeRateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExchangeRateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExchangeRateFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Getir;
    private javax.swing.JComboBox<String> cbx_Others;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_ExchangeRate;
    private javax.swing.JTree tree_Currency;
    // End of variables declaration//GEN-END:variables
}
