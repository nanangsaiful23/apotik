/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.Obat;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nanang saiful
 */
public class Inputtransaksi extends javax.swing.JFrame {

    /**
     * Creates new form Inputtransaksi
     */
    public Inputtransaksi() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        totalharga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        totalobat = new javax.swing.JTextField();
        idpmebeli = new javax.swing.JTextField();
        bayar = new javax.swing.JButton();
        home = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabletransaksi = new javax.swing.JTable();
        idobat = new javax.swing.JTextField();
        Jumlahobat = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Harga");

        totalharga.setEditable(false);
        totalharga.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jumlah Total Obat");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID Pembeli");

        totalobat.setEditable(false);
        totalobat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        idpmebeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpmebeliActionPerformed(evt);
            }
        });

        bayar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bayar.setText("Bayar");
        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });

        home.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\nanang saiful\\Desktop\\resizee.png")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("apotik As-syifa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel4))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel8))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(idpmebeli, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel7))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(totalobat, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(totalharga, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addGap(11, 11, 11)
                .addComponent(idpmebeli, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(totalobat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(totalharga, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabletransaksi.setBackground(new java.awt.Color(204, 255, 255));
        tabletransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(tabletransaksi);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 375, 343));

        idobat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idobatActionPerformed(evt);
            }
        });
        jPanel2.add(idobat, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 372, 104, 31));
        jPanel2.add(Jumlahobat, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 433, 104, 30));

        tambah.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        jPanel2.add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 501, -1, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Obat");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 373, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jumlah Obat");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 434, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeActionPerformed

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bayarActionPerformed

    private void idpmebeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpmebeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpmebeliActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahActionPerformed

    private void idobatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idobatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idobatActionPerformed

    public int getid(){
        if (idobat.getText().equals(""))
            return 0;
        else
        return Integer.parseInt(idobat.getText());
    }
    public int getjumlah(){
        if (Jumlahobat.getText().equals(""))
            return 0;
        else
        return Integer.parseInt((String)Jumlahobat.getText());
    }
    public int getharga(){
        return Integer.parseInt((String)totalharga.getText());
    }
    public int getidpembeli(){
        if (idpmebeli.getText().equals(""))
            return 0;
        else
        return  Integer.parseInt((String)idpmebeli.getText());
    }
    public int gettotal(){
        return Integer.parseInt((String) totalobat.getText());
    }
    public void setid( String s){
        idobat.setText(s);
    }
    public void setjumlah(String s){
        Jumlahobat.setText(s);
    }
    public void setharga(String s){
        totalharga.setText(s);
    }
    public void settotal(String s){
        totalobat.setText(s);
    }
    public JButton getbayar(){
    return bayar;
    };
    public JButton gettambah(){
    return tambah;
    }
    public JButton gethome(){
    return home;
    }
    public void addactionlistener(ActionListener e){
      bayar.addActionListener(e);
      tambah.addActionListener(e);
      home.addActionListener(e);
    }
    public void refresh(String s){
    idobat.setText(s);
    Jumlahobat.setText(s);
    }
    public void viewall(List<Obat> obats){
          String[] judul={
            "ID Obat","Nama Obat","Jenis Obat","Jumlah","Total Harga"
            };
      String[][] data=new String[obats.size()][5];
        for (int i = 0; i < obats.size(); i++) {
            String[] data1 = data[i];
            Obat o=obats.get(i);
            data[i][0]=String.valueOf(o.getIdobat());
            data[i][1]=String.valueOf(o.getNama());
            data[i][2]=String.valueOf(o.getJenisobat());
            data[i][3]=String.valueOf(o.getJumlah());
            data[i][4]=String.valueOf(o.getHarga());
            
        }
        tabletransaksi.setModel(new DefaultTableModel(data, judul));
    }
    public void allrefresh(String s){
        refresh(s);
        totalharga.setText("0");
        totalobat.setText("0");
        idpmebeli.setText(s);
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jumlahobat;
    private javax.swing.JButton bayar;
    private javax.swing.JButton home;
    private javax.swing.JTextField idobat;
    private javax.swing.JTextField idpmebeli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabletransaksi;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField totalharga;
    private javax.swing.JTextField totalobat;
    // End of variables declaration//GEN-END:variables
}
