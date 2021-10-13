package Todo;

import java.awt.Component;
import java.text.DecimalFormat;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Vista extends javax.swing.JFrame {

    DefaultTableModel modelo;

    public Vista() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo = new DefaultTableModel();
        modelo.addColumn("iteracion");
        modelo.addColumn("xn");
        modelo.addColumn("yn");
        modelo.addColumn("zn");
        modelo.addColumn("wn");
        modelo.addColumn("error");
        this.tabla.setModel(modelo);
        Component[] componentes = this.getjPanel1().getComponents();
        for (int i = 0; i < componentes.length; i++) {
            if (componentes[i] instanceof JTextField) {
                componentes[i].setVisible(false);
            }
            if (componentes[i] instanceof JLabel) {
                componentes[i].setVisible(false);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        s1 = new javax.swing.JTextField();
        s2 = new javax.swing.JTextField();
        m11 = new javax.swing.JTextField();
        m12 = new javax.swing.JTextField();
        m21 = new javax.swing.JTextField();
        m22 = new javax.swing.JTextField();
        s3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        m13 = new javax.swing.JTextField();
        m23 = new javax.swing.JTextField();
        m33 = new javax.swing.JTextField();
        m31 = new javax.swing.JTextField();
        m32 = new javax.swing.JTextField();
        s4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        m14 = new javax.swing.JTextField();
        m24 = new javax.swing.JTextField();
        m34 = new javax.swing.JTextField();
        m44 = new javax.swing.JTextField();
        m43 = new javax.swing.JTextField();
        m42 = new javax.swing.JTextField();
        m41 = new javax.swing.JTextField();
        m45 = new javax.swing.JTextField();
        m52 = new javax.swing.JTextField();
        m53 = new javax.swing.JTextField();
        m54 = new javax.swing.JTextField();
        m55 = new javax.swing.JTextField();
        m51 = new javax.swing.JTextField();
        m35 = new javax.swing.JTextField();
        m25 = new javax.swing.JTextField();
        m15 = new javax.swing.JTextField();
        s5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        x1 = new javax.swing.JTextField();
        y1 = new javax.swing.JTextField();
        z1 = new javax.swing.JTextField();
        w1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        iteraciones = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gauss Seidel");
        setFocusable(false);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Garamond", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Matriz");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 180, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Todo/igual (1).jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Todo/igual (1).jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Garamond", 0, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Y");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 40, 30));

        jLabel12.setFont(new java.awt.Font("Garamond", 0, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("X");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 40, 30));

        s1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                s1KeyTyped(evt);
            }
        });
        jPanel1.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 40, 30));

        s2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                s2KeyTyped(evt);
            }
        });
        jPanel1.add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 40, 30));

        m11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m11KeyTyped(evt);
            }
        });
        jPanel1.add(m11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 40, 30));

        m12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m12KeyTyped(evt);
            }
        });
        jPanel1.add(m12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 40, 30));

        m21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m21KeyTyped(evt);
            }
        });
        jPanel1.add(m21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 40, 30));

        m22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m22KeyTyped(evt);
            }
        });
        jPanel1.add(m22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 40, 30));

        s3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                s3KeyTyped(evt);
            }
        });
        jPanel1.add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Todo/igual (1).jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Garamond", 0, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Z");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 40, 30));

        m13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m13KeyTyped(evt);
            }
        });
        jPanel1.add(m13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 40, 30));

        m23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m23KeyTyped(evt);
            }
        });
        jPanel1.add(m23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 40, 30));

        m33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m33KeyTyped(evt);
            }
        });
        jPanel1.add(m33, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 40, 30));

        m31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m31KeyTyped(evt);
            }
        });
        jPanel1.add(m31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 40, 30));

        m32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m32KeyTyped(evt);
            }
        });
        jPanel1.add(m32, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 40, 30));

        s4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                s4KeyTyped(evt);
            }
        });
        jPanel1.add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 40, 30));

        jLabel14.setFont(new java.awt.Font("Garamond", 0, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("W");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 40, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Todo/igual (1).jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        m14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m14KeyTyped(evt);
            }
        });
        jPanel1.add(m14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 40, 30));

        m24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m24KeyTyped(evt);
            }
        });
        jPanel1.add(m24, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 40, 30));

        m34.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m34KeyTyped(evt);
            }
        });
        jPanel1.add(m34, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 40, 30));

        m44.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m44KeyTyped(evt);
            }
        });
        jPanel1.add(m44, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 40, 30));

        m43.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m43KeyTyped(evt);
            }
        });
        jPanel1.add(m43, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 40, 30));

        m42.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m42KeyTyped(evt);
            }
        });
        jPanel1.add(m42, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 40, 30));

        m41.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m41KeyTyped(evt);
            }
        });
        jPanel1.add(m41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 40, 30));

        m45.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m45KeyTyped(evt);
            }
        });
        jPanel1.add(m45, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 40, 30));

        m52.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m52KeyTyped(evt);
            }
        });
        jPanel1.add(m52, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 40, 30));

        m53.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m53KeyTyped(evt);
            }
        });
        jPanel1.add(m53, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 40, 30));

        m54.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m54KeyTyped(evt);
            }
        });
        jPanel1.add(m54, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 40, 30));

        m55.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m55KeyTyped(evt);
            }
        });
        jPanel1.add(m55, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 40, 30));

        m51.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m51KeyTyped(evt);
            }
        });
        jPanel1.add(m51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 40, 30));

        m35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m35KeyTyped(evt);
            }
        });
        jPanel1.add(m35, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 40, 30));

        m25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m25KeyTyped(evt);
            }
        });
        jPanel1.add(m25, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 40, 30));

        m15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m15KeyTyped(evt);
            }
        });
        jPanel1.add(m15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 40, 30));

        s5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                s5KeyTyped(evt);
            }
        });
        jPanel1.add(s5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 40, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Todo/igual (1).jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Garamond", 0, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("T");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 40, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1ActionPerformed(evt);
            }
        });
        x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                x1KeyTyped(evt);
            }
        });

        y1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                y1KeyTyped(evt);
            }
        });

        z1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                z1KeyTyped(evt);
            }
        });

        w1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                w1KeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Garamond", 0, 16)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("X");

        jLabel15.setFont(new java.awt.Font("Garamond", 0, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Y");

        jLabel16.setFont(new java.awt.Font("Garamond", 0, 16)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("W");

        jLabel17.setFont(new java.awt.Font("Garamond", 0, 16)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Z");

        jLabel18.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Valores Iniciales");

        jLabel19.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Tamaño de Matriz");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija", "2", "3", "4", "5" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Garamond", 0, 16)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("T");

        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(w1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel18)
                    .addContainerGap(269, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(79, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)))
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "m", "xm", "ym", "zm", "wm", "error"
            }
        ));
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel7.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Numero de Iteraciones");

        iteraciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                iteracionesKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iteraciones, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("Resultado:");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int a = modelo.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
        DecimalFormat df = new DecimalFormat("#0.0000");

        if (this.getjComboBox2().getSelectedItem().equals("2")) {
            modelo = new DefaultTableModel();
            modelo.addColumn("iteracion");
            modelo.addColumn("xn");
            modelo.addColumn("yn");
            modelo.addColumn("error");
            this.tabla.setModel(modelo);

            double matriz[][] = {{Double.parseDouble(this.getM11().getText()), Double.parseDouble(this.getM12().getText())}, {Double.parseDouble(this.getM21().getText()), Double.parseDouble(this.getM22().getText())}};
            double vect[] = {Double.parseDouble(this.getS1().getText()), Double.parseDouble(this.getS2().getText())};
            double solu[] = {Double.parseDouble(this.getX1().getText()), Double.parseDouble(this.getY1().getText())};
            double itera = Double.parseDouble(this.getIteraciones().getText());
            double error = 100;

            for (int i = 0; i < itera; i++) {
                Gauss_Seidel ob = new Gauss_Seidel(solu, vect, Double.parseDouble(this.getIteraciones().getText()), matriz, error);
                solu = ob.gaussSeidel((String) this.getjComboBox2().getSelectedItem());
                String[] soluc = {i + 1 + "", String.valueOf(solu[0]), String.valueOf(solu[1]), String.valueOf(solu[2])};
                modelo.addRow(soluc);
            }
            this.jTextField1.setText("Resultado: X= " + df.format(solu[0]) + " Y= " + df.format(solu[1]));
        } else if (this.getjComboBox2().getSelectedItem().equals("3")) {
            modelo = new DefaultTableModel();
            modelo.addColumn("iteracion");
            modelo.addColumn("xn");
            modelo.addColumn("yn");
            modelo.addColumn("zn");
            modelo.addColumn("error");
            this.tabla.setModel(modelo);
            double matriz[][] = {{Double.parseDouble(this.getM11().getText()), Double.parseDouble(this.getM12().getText()), Double.parseDouble(this.getM13().getText())}, {Double.parseDouble(this.getM21().getText()), Double.parseDouble(this.getM22().getText()), Double.parseDouble(this.getM23().getText())}, {Double.parseDouble(this.getM31().getText()), Double.parseDouble(this.getM32().getText()), Double.parseDouble(this.getM33().getText())}};
            double solu[] = {Double.parseDouble(this.getX1().getText()), Double.parseDouble(this.getY1().getText()), Double.parseDouble(this.getZ1().getText())};
            double vect[] = {Double.parseDouble(this.getS1().getText()), Double.parseDouble(this.getS2().getText()), Double.parseDouble(this.getS3().getText())};
            double itera = Double.parseDouble(this.getIteraciones().getText());
            double error = 100;

            for (int i = 0; i < itera; i++) {
                Gauss_Seidel ob = new Gauss_Seidel(solu, vect, Double.parseDouble(this.getIteraciones().getText()), matriz, error);
                solu = ob.gaussSeidel((String) this.getjComboBox2().getSelectedItem());
                String[] soluc = {i + 1 + "", String.valueOf(solu[0]), String.valueOf(solu[1]), String.valueOf(solu[2]), String.valueOf(solu[3])};
                modelo.addRow(soluc);
            }
            this.jTextField1.setText("Resultado: X= " + df.format(solu[0]) + " Y= " + df.format(solu[1]) + " Z= " + df.format(solu[2]));
        } else if (this.getjComboBox2().getSelectedItem().equals("4")) {
            double matriz[][] = {{Double.parseDouble(this.getM11().getText()), Double.parseDouble(this.getM12().getText()), Double.parseDouble(this.getM13().getText()), Double.parseDouble(this.getM14().getText())}, {Double.parseDouble(this.getM21().getText()), Double.parseDouble(this.getM22().getText()), Double.parseDouble(this.getM23().getText()), Double.parseDouble(this.getM24().getText())}, {Double.parseDouble(this.getM31().getText()), Double.parseDouble(this.getM32().getText()), Double.parseDouble(this.getM33().getText()), Double.parseDouble(this.getM34().getText())}, {Double.parseDouble(this.getM41().getText()), Double.parseDouble(this.getM42().getText()), Double.parseDouble(this.getM43().getText()), Double.parseDouble(this.getM44().getText())}};
            double solu[] = {Double.parseDouble(this.getX1().getText()), Double.parseDouble(this.getY1().getText()), Double.parseDouble(this.getZ1().getText()), Double.parseDouble(this.getW1().getText())};
            double vect[] = {Double.parseDouble(this.getS1().getText()), Double.parseDouble(this.getS2().getText()), Double.parseDouble(this.getS3().getText()), Double.parseDouble(this.getS4().getText())};
            double itera = Double.parseDouble(this.getIteraciones().getText());
            double error = 100;

            for (int i = 0; i < itera; i++) {
                Gauss_Seidel ob = new Gauss_Seidel(solu, vect, Double.parseDouble(this.getIteraciones().getText()), matriz, error);
                solu = ob.gaussSeidel((String) this.getjComboBox2().getSelectedItem());
                String[] soluc = {i + 1 + "", String.valueOf(solu[0]), String.valueOf(solu[1]), String.valueOf(solu[2]), String.valueOf(solu[3]), String.valueOf(solu[4])};
                modelo.addRow(soluc);
            }
            this.jTextField1.setText("Resultado: X= " + df.format(solu[0]) + " Y= " + df.format(solu[1]) + " Z= " + df.format(solu[2]) + " W= " + df.format(solu[3]));
        } else if (this.getjComboBox2().getSelectedItem().equals("5")) {
            modelo = new DefaultTableModel();
            modelo.addColumn("iteracion");
            modelo.addColumn("xn");
            modelo.addColumn("yn");
            modelo.addColumn("zn");
            modelo.addColumn("wn");
            modelo.addColumn("tn");
            modelo.addColumn("error");
            this.tabla.setModel(modelo);
            double matriz[][] = {{Double.parseDouble(this.getM11().getText()), Double.parseDouble(this.getM12().getText()), Double.parseDouble(this.getM13().getText()), Double.parseDouble(this.getM14().getText()), Double.parseDouble(this.getM15().getText())}, {Double.parseDouble(this.getM21().getText()), Double.parseDouble(this.getM22().getText()), Double.parseDouble(this.getM23().getText()), Double.parseDouble(this.getM24().getText()), Double.parseDouble(this.getM25().getText())}, {Double.parseDouble(this.getM31().getText()), Double.parseDouble(this.getM32().getText()), Double.parseDouble(this.getM33().getText()), Double.parseDouble(this.getM34().getText()), Double.parseDouble(this.getM35().getText())}, {Double.parseDouble(this.getM41().getText()), Double.parseDouble(this.getM42().getText()), Double.parseDouble(this.getM43().getText()), Double.parseDouble(this.getM44().getText()), Double.parseDouble(this.getM45().getText())}, {Double.parseDouble(this.getM51().getText()), Double.parseDouble(this.getM52().getText()), Double.parseDouble(this.getM53().getText()), Double.parseDouble(this.getM54().getText()), Double.parseDouble(this.getM55().getText())}};
            double solu[] = {Double.parseDouble(this.getX1().getText()), Double.parseDouble(this.getY1().getText()), Double.parseDouble(this.getZ1().getText()), Double.parseDouble(this.getW1().getText()), Double.parseDouble(this.getT1().getText())};
            double vect[] = {Double.parseDouble(this.getS1().getText()), Double.parseDouble(this.getS2().getText()), Double.parseDouble(this.getS3().getText()), Double.parseDouble(this.getS4().getText()), Double.parseDouble(this.getS5().getText())};
            double itera = Double.parseDouble(this.getIteraciones().getText());
            double error = 100;

            for (int i = 0; i < itera; i++) {
                Gauss_Seidel ob = new Gauss_Seidel(solu, vect, Double.parseDouble(this.getIteraciones().getText()), matriz, error);
                solu = ob.gaussSeidel((String) this.getjComboBox2().getSelectedItem());
                String[] soluc = {i + 1 + "", String.valueOf(solu[0]), String.valueOf(solu[1]), String.valueOf(solu[2]), String.valueOf(solu[3]), String.valueOf(solu[4]), String.valueOf(solu[5])};
                modelo.addRow(soluc);
            }
            this.jTextField1.setText("Resultado: X= " + df.format(solu[0]) + " Y= " + df.format(solu[1]) + " Z= " + df.format(solu[2]) + " W= " + df.format(solu[3]) + " T= " + df.format(solu[4]));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public JTextField getM15() {
        return m15;
    }

    public void setM15(JTextField m15) {
        this.m15 = m15;
    }

    public JTextField getM25() {
        return m25;
    }

    public void setM25(JTextField m25) {
        this.m25 = m25;
    }

    public JTextField getM35() {
        return m35;
    }

    public void setM35(JTextField m35) {
        this.m35 = m35;
    }

    public JTextField getM45() {
        return m45;
    }

    public void setM45(JTextField m45) {
        this.m45 = m45;
    }

    public JTextField getM51() {
        return m51;
    }

    public void setM51(JTextField m51) {
        this.m51 = m51;
    }

    public JTextField getM52() {
        return m52;
    }

    public void setM52(JTextField m52) {
        this.m52 = m52;
    }

    public JTextField getM53() {
        return m53;
    }

    public void setM53(JTextField m53) {
        this.m53 = m53;
    }

    public JTextField getM54() {
        return m54;
    }

    public void setM54(JTextField m54) {
        this.m54 = m54;
    }

    public JTextField getM55() {
        return m55;
    }

    public void setM55(JTextField m55) {
        this.m55 = m55;
    }

    public JTextField getS5() {
        return s5;
    }

    public void setS5(JTextField s5) {
        this.s5 = s5;
    }

    public JTextField getT1() {
        return t1;
    }

    public void setT1(JTextField t1) {
        this.t1 = t1;
    }

    private void x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1ActionPerformed

    }//GEN-LAST:event_x1ActionPerformed

    private void m11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m11KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_m11KeyTyped

    private void m12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m12KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_m12KeyTyped

    private void m13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m13KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_m13KeyTyped

    private void m14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m14KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_m14KeyTyped

    private void m21KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m21KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_m21KeyTyped

    private void m22KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m22KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_m22KeyTyped

    private void m23KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m23KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_m23KeyTyped

    private void m24KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m24KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_m24KeyTyped

    private void m31KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m31KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_m31KeyTyped

    private void m32KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m32KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_m32KeyTyped

    private void m33KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m33KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_m33KeyTyped

    private void m34KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m34KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_m34KeyTyped

    private void m41KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m41KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_m41KeyTyped

    private void m42KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m42KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_m42KeyTyped

    private void m43KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m43KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_m43KeyTyped

    private void m44KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m44KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_m44KeyTyped

    private void s1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_s1KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_s1KeyTyped

    private void s2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_s2KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_s2KeyTyped

    private void s3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_s3KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_s3KeyTyped

    private void s4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_s4KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_s4KeyTyped

    private void iteracionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iteracionesKeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_iteracionesKeyTyped

    private void x1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x1KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_x1KeyTyped

    private void y1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y1KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_y1KeyTyped

    private void z1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_z1KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_z1KeyTyped

    private void w1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_w1KeyTyped
        char validar = evt.getKeyChar();
        if ((validar < '0' || validar > '9') && (validar < '-' || validar > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_w1KeyTyped

    private void m45KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m45KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_m45KeyTyped

    private void m52KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m52KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_m52KeyTyped

    private void m53KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m53KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_m53KeyTyped

    private void m54KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m54KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_m54KeyTyped

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void m55KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m55KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_m55KeyTyped

    private void m51KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m51KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_m51KeyTyped

    private void m35KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m35KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_m35KeyTyped

    private void m25KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m25KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_m25KeyTyped

    private void m15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m15KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_m15KeyTyped

    private void s5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_s5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_s5KeyTyped

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        Component[] componentes = this.getjPanel1().getComponents();
        for (int i = 0; i < componentes.length; i++) {
            if (componentes[i] instanceof JTextField) {
                componentes[i].setVisible(false);
            }
            if (componentes[i] instanceof JLabel) {
                componentes[i].setVisible(false);
            }
        }

        int component = Integer.parseInt((String) this.getjComboBox2().getSelectedItem());
        String component1 = (String) this.getjComboBox2().getSelectedItem();
        switch (component1) {
            case "2":
                component = 11;
                break;
            case "3":
                component = 19;
                break;
            case "4":
                component = 29;
                break;
            case "5":
                component = 41;
                break;
        }
        Component[] Componentes = this.getjPanel1().getComponents();
        for (int i = 0; i < component; i++) {
            if (Componentes[i] instanceof JTextField) {
                Componentes[i].setVisible(true);
            }
            if (Componentes[i] instanceof JLabel) {
                Componentes[i].setVisible(true);
            }
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_t1KeyTyped

    public boolean validarDiago(double matriz[][]) {

        if (Math.abs(matriz[0][0]) >= Math.abs(matriz[0][1]) + Math.abs(matriz[0][2]) + Math.abs(matriz[0][3]) && Math.abs(matriz[1][1]) >= Math.abs(matriz[1][0]) + Math.abs(matriz[1][2]) + Math.abs(matriz[1][3]) && Math.abs(matriz[2][2]) >= Math.abs(matriz[2][0]) + Math.abs(matriz[2][1]) + Math.abs(matriz[2][3]) && Math.abs(matriz[3][3]) >= Math.abs(matriz[3][0]) + Math.abs(matriz[3][1]) + Math.abs(matriz[3][2])) {
            return true;
        }

        return false;

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    public JComboBox<String> getjComboBox2() {
        return jComboBox2;
    }

    public void setjComboBox2(JComboBox<String> jComboBox2) {
        this.jComboBox2 = jComboBox2;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultTableModel modelo) {
        this.modelo = modelo;
    }

    public JTextField getIteraciones() {
        return iteraciones;
    }

    public void setIteraciones(JTextField iteraciones) {
        this.iteraciones = iteraciones;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JTextField getM11() {
        return m11;
    }

    public void setM11(JTextField m11) {
        this.m11 = m11;
    }

    public JTextField getM12() {
        return m12;
    }

    public void setM12(JTextField m12) {
        this.m12 = m12;
    }

    public JTextField getM13() {
        return m13;
    }

    public void setM13(JTextField m13) {
        this.m13 = m13;
    }

    public JTextField getM14() {
        return m14;
    }

    public void setM14(JTextField m14) {
        this.m14 = m14;
    }

    public JTextField getM21() {
        return m21;
    }

    public void setM21(JTextField m21) {
        this.m21 = m21;
    }

    public JTextField getM22() {
        return m22;
    }

    public void setM22(JTextField m22) {
        this.m22 = m22;
    }

    public JTextField getM23() {
        return m23;
    }

    public void setM23(JTextField m23) {
        this.m23 = m23;
    }

    public JTextField getM24() {
        return m24;
    }

    public void setM24(JTextField m24) {
        this.m24 = m24;
    }

    public JTextField getM31() {
        return m31;
    }

    public void setM31(JTextField m31) {
        this.m31 = m31;
    }

    public JTextField getM32() {
        return m32;
    }

    public void setM32(JTextField m32) {
        this.m32 = m32;
    }

    public JTextField getM33() {
        return m33;
    }

    public void setM33(JTextField m33) {
        this.m33 = m33;
    }

    public JTextField getM34() {
        return m34;
    }

    public void setM34(JTextField m34) {
        this.m34 = m34;
    }

    public JTextField getM41() {
        return m41;
    }

    public void setM41(JTextField m41) {
        this.m41 = m41;
    }

    public JTextField getM42() {
        return m42;
    }

    public void setM42(JTextField m42) {
        this.m42 = m42;
    }

    public JTextField getM43() {
        return m43;
    }

    public void setM43(JTextField m43) {
        this.m43 = m43;
    }

    public JTextField getM44() {
        return m44;
    }

    public void setM44(JTextField m44) {
        this.m44 = m44;
    }

    public JTextField getS1() {
        return s1;
    }

    public void setS1(JTextField s1) {
        this.s1 = s1;
    }

    public JTextField getS2() {
        return s2;
    }

    public void setS2(JTextField s2) {
        this.s2 = s2;
    }

    public JTextField getS3() {
        return s3;
    }

    public void setS3(JTextField s3) {
        this.s3 = s3;
    }

    public JTextField getS4() {
        return s4;
    }

    public void setS4(JTextField s4) {
        this.s4 = s4;
    }

    public JTextField getW1() {
        return w1;
    }

    public void setW1(JTextField w1) {
        this.w1 = w1;
    }

    public JTextField getX1() {
        return x1;
    }

    public void setX1(JTextField x1) {
        this.x1 = x1;
    }

    public JTextField getY1() {
        return y1;
    }

    public void setY1(JTextField y1) {
        this.y1 = y1;
    }

    public JTextField getZ1() {
        return z1;
    }

    public void setZ1(JTextField z1) {
        this.z1 = z1;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField iteraciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField m11;
    private javax.swing.JTextField m12;
    private javax.swing.JTextField m13;
    private javax.swing.JTextField m14;
    private javax.swing.JTextField m15;
    private javax.swing.JTextField m21;
    private javax.swing.JTextField m22;
    private javax.swing.JTextField m23;
    private javax.swing.JTextField m24;
    private javax.swing.JTextField m25;
    private javax.swing.JTextField m31;
    private javax.swing.JTextField m32;
    private javax.swing.JTextField m33;
    private javax.swing.JTextField m34;
    private javax.swing.JTextField m35;
    private javax.swing.JTextField m41;
    private javax.swing.JTextField m42;
    private javax.swing.JTextField m43;
    private javax.swing.JTextField m44;
    private javax.swing.JTextField m45;
    private javax.swing.JTextField m51;
    private javax.swing.JTextField m52;
    private javax.swing.JTextField m53;
    private javax.swing.JTextField m54;
    private javax.swing.JTextField m55;
    private javax.swing.JTextField s1;
    private javax.swing.JTextField s2;
    private javax.swing.JTextField s3;
    private javax.swing.JTextField s4;
    private javax.swing.JTextField s5;
    private javax.swing.JTextField t1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField w1;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField y1;
    private javax.swing.JTextField z1;
    // End of variables declaration//GEN-END:variables
}
