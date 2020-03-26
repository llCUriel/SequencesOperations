package project15;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Ventana extends javax.swing.JFrame {

    private LinkedList secUno;

    private LinkedList secDos;

    private int Origen_Uno;

    private int Origen_Dos;

    private Grafica m;

    private Operacion operaciones;

    private Sonido sonido = new Sonido();

    public Ventana() {

        initComponents();

        m = new Grafica();

        operaciones = new Operacion();

        establecerCondicionesIniciales();
    }

    public LinkedList convertirCadenaALista(String str) {
        LinkedList lista = new LinkedList();
        Pattern p = Pattern.compile("-?(\\d+(?:\\.\\d+)?)");
        Matcher m = p.matcher(str);
        while (m.find()) {
            lista.add(m.group());
        }
        return lista;
    }

    private void mostrarImagen(String liga, JLabel dondeImprimir) {
        Image ImagenSeleccionada = Toolkit.getDefaultToolkit().getImage(liga).getScaledInstance(dondeImprimir.getWidth(), dondeImprimir.getHeight(), 0);
        ImageIcon ImagenEscalada = new ImageIcon(ImagenSeleccionada);
        dondeImprimir.setIcon(ImagenEscalada);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
        jSeparator3 = new javax.swing.JSeparator();
        main = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        secuenciaUno = new org.edisoncor.gui.textField.TextFieldRoundImage();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric4 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric5 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric6 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric7 = new org.edisoncor.gui.label.LabelMetric();
        secuenciaDos = new org.edisoncor.gui.textField.TextFieldRoundImage();
        labelMetric8 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric9 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric10 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric11 = new org.edisoncor.gui.label.LabelMetric();
        operacionARealizar = new org.edisoncor.gui.comboBox.ComboBoxRound();
        cadenaParametros = new org.edisoncor.gui.label.LabelMetric();
        buttonAqua1 = new org.edisoncor.gui.button.ButtonAqua();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        parametro = new org.edisoncor.gui.textField.TextFieldRoundImage();
        origenUno = new org.edisoncor.gui.textField.TextFieldRoundImage();
        origenDos = new org.edisoncor.gui.textField.TextFieldRoundImage();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tabbedPaneHeader1 = new org.edisoncor.gui.tabbedPane.TabbedPaneHeader();
        entradaUnoX = new javax.swing.JLabel();
        entradaDosY = new javax.swing.JLabel();
        entradaS = new javax.swing.JLabel();
        operacionT = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        labelMetric3.setText("X(n) =");

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainMouseEntered(evt);
            }
        });

        header.setBackground(new java.awt.Color(0, 0, 0));
        header.setPreferredSize(new java.awt.Dimension(838, 200));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));

        secuenciaUno.setText(" ");
        secuenciaUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                secuenciaUnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                secuenciaUnoMouseExited(evt);
            }
        });

        labelMetric1.setText("X(n) =");

        labelMetric4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetric4.setText("Operaciones de procesamiento");
        labelMetric4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        labelMetric5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMetric5.setText("Ingrese las dos secuencias a operar:");

        labelMetric6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetric6.setText("Secuencias");

        labelMetric7.setText("Origen");

        secuenciaDos.setText(" ");
        secuenciaDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                secuenciaDosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                secuenciaDosMouseExited(evt);
            }
        });

        labelMetric8.setText("Y(n) =");

        labelMetric9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetric9.setText("de secuencias");
        labelMetric9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        labelMetric10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMetric10.setText("Seleccione la operación que desea realizar:");

        labelMetric11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMetric11.setText("Operación:");

        operacionARealizar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Suma", "Resta", "Multiplicación", "Ampliación", "Atenuación", "Desplazamiento en tiempo discreto", "Reflejo en tiempo discreto", "Diezmación", "Interpolación", "Convolución discreta" }));
        operacionARealizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                operacionARealizarMouseEntered(evt);
            }
        });
        operacionARealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operacionARealizarActionPerformed(evt);
            }
        });

        cadenaParametros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cadenaParametros.setText("-");

        buttonAqua1.setBackground(new java.awt.Color(51, 51, 51));
        buttonAqua1.setText("Mostrar resultado");
        buttonAqua1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        buttonAqua1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAqua1MouseEntered(evt);
            }
        });
        buttonAqua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAqua1ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));

        parametro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parametroActionPerformed(evt);
            }
        });

        origenUno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        origenUno.setText("0");
        origenUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origenUnoActionPerformed(evt);
            }
        });

        origenDos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        origenDos.setText("0");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelMetric10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, headerLayout.createSequentialGroup()
                                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, headerLayout.createSequentialGroup()
                                        .addComponent(labelMetric11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(operacionARealizar, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(labelMetric4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                        .addComponent(labelMetric9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, headerLayout.createSequentialGroup()
                                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(labelMetric5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, headerLayout.createSequentialGroup()
                                                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(labelMetric8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(secuenciaUno, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(labelMetric6, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(secuenciaDos, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(origenUno, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(origenDos, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(labelMetric7, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jSeparator2)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(141, 141, 141)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parametro, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadenaParametros, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(buttonAqua1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMetric4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMetric9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(labelMetric5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(secuenciaUno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(origenUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(secuenciaDos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(origenDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelMetric10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMetric11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(operacionARealizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(cadenaParametros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(parametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(buttonAqua1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(575, 575, 575))))
        );

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tabbedPaneHeader1.setBackground(new java.awt.Color(51, 102, 255));
        tabbedPaneHeader1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabbedPaneHeader1.setMaximumSize(new java.awt.Dimension(816, 272));
        tabbedPaneHeader1.setMinimumSize(new java.awt.Dimension(816, 272));
        tabbedPaneHeader1.setPreferredSize(new java.awt.Dimension(816, 272));
        tabbedPaneHeader1.addTab("X(n)", entradaUnoX);
        tabbedPaneHeader1.addTab("Y(n)", entradaDosY);
        tabbedPaneHeader1.addTab("Salida", entradaS);

        operacionT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        operacionT.setForeground(new java.awt.Color(0, 0, 0));
        operacionT.setText("S(n) =                   = ");

        resultado.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        resultado.setForeground(new java.awt.Color(0, 0, 0));
        resultado.setText("-");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Gráfica:");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Resultado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabbedPaneHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(operacionT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(operacionT)
                .addGap(18, 18, 18)
                .addComponent(resultado)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(tabbedPaneHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 479, Short.MAX_VALUE)
            .addComponent(jLabel3)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private int xx;
    private int xy;

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_headerMouseDragged

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void buttonAqua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAqua1ActionPerformed
        try {
            try {
                try {
                    sonido.emitirSonidoClick();
                    String liga;
                    int origenSalida = 0;
                    String elementoOrigen = "";
                    int operacion = operacionARealizar.getSelectedIndex();
                    switch (operacion) {
                        case 0:
                            LinkedList suma = operaciones.operarSecuencias(secUno, secDos, Origen_Uno, Origen_Dos, 0);
                            origenSalida = Integer.parseInt(suma.getLast().toString());
                            elementoOrigen = suma.get(origenSalida).toString();
                            suma.removeLast();
                            liga = m.obtenerGrafica(suma, origenSalida, "S");
                            mostrarImagen(liga, entradaS);
                            operacionT.setText("S(n) = X(n) + Y(n) = ");
                            resultado.setText(suma.toString());
                            break;
                        case 1:
                            LinkedList resta = operaciones.operarSecuencias(secUno, secDos, Origen_Uno, Origen_Dos, 1);
                            origenSalida = Integer.parseInt(resta.getLast().toString());
                            elementoOrigen = resta.get(origenSalida).toString();
                            resta.removeLast();
                            liga = m.obtenerGrafica(resta, origenSalida, "S");
                            mostrarImagen(liga, entradaS);
                            operacionT.setText("S(n) = X(n) - Y(n) = ");
                            resultado.setText(resta.toString());
                            break;
                        case 2:
                            LinkedList multiplicacion = operaciones.operarSecuencias(secUno, secDos, Origen_Uno, Origen_Dos, 2);
                            origenSalida = Integer.parseInt(multiplicacion.getLast().toString());
                            elementoOrigen = multiplicacion.get(origenSalida).toString();
                            multiplicacion.removeLast();
                            liga = m.obtenerGrafica(multiplicacion, origenSalida, "S");
                            mostrarImagen(liga, entradaS);
                            operacionT.setText("S(n) = X(n) x Y(n) = ");
                            resultado.setText(operaciones.multiplicacionDeSecuencias(secUno, secDos, Origen_Uno, Origen_Dos).toString());
                            break;
                        case 3:
                            String factorAm = parametro.getText().trim();
                            LinkedList ampliacion = operaciones.amplificarSecuencia(secUno, Double.parseDouble(factorAm));
                            origenSalida = Origen_Uno;
                            elementoOrigen = ampliacion.get(origenSalida).toString();
                            liga = m.obtenerGrafica(ampliacion, origenSalida, "S");
                            mostrarImagen(liga, entradaS);
                            operacionT.setText("S(n) = " + factorAm + " X(n) = ");
                            resultado.setText(ampliacion.toString());
                            break;
                        case 4:
                            String factorAt = parametro.getText().trim();
                            LinkedList atenuacion = operaciones.amplificarSecuencia(secUno, 1 / Double.parseDouble(factorAt));
                            origenSalida = Origen_Uno;
                            elementoOrigen = atenuacion.get(origenSalida).toString();
                            liga = m.obtenerGrafica(atenuacion, origenSalida, "S");
                            mostrarImagen(liga, entradaS);
                            operacionT.setText("S(n) = (1/" + factorAt + ") X(n) = ");
                            resultado.setText(atenuacion.toString());
                            break;
                        case 5:
                            double unidadesADesplazar = Double.parseDouble(parametro.getText());
                            origenSalida = Origen_Uno + (int) unidadesADesplazar - 1;
                            //elementoOrigen = secUno.get(origenSalida).toString();
                            liga = m.obtenerGrafica(secUno, origenSalida, "S");
                            mostrarImagen(liga, entradaS);
                            operacionT.setText("S(n) = X(n-" + unidadesADesplazar + ") = ");
                            resultado.setText(secUno.toString());
                            break;
                        case 6:
                            LinkedList inversionEnElTD = operaciones.reflejarEnTiempoDiscreto(secUno);
                            origenSalida = (inversionEnElTD.size() - 1) - Origen_Uno;
                            elementoOrigen = inversionEnElTD.get(origenSalida).toString();
                            liga = m.obtenerGrafica(inversionEnElTD, origenSalida, "S");
                            mostrarImagen(liga, entradaS);
                            operacionT.setText("S(n) = X(-n) = ");
                            resultado.setText(inversionEnElTD.toString());
                            break;
                        case 7:
                            String k = parametro.getText().trim();
                            LinkedList diezmacion = operaciones.diezmacion(secUno, Double.parseDouble(k),Origen_Uno);
                            origenSalida = (int)diezmacion.getLast(); //recupero punto origen salida
                            //System.out.println(origenSalida);
                            diezmacion.removeLast(); //borro el punto final (origen saldida)
                            elementoOrigen = diezmacion.get(origenSalida).toString();
                            liga = m.obtenerGrafica(diezmacion, origenSalida, "S");
                            mostrarImagen(liga, entradaS);
                            operacionT.setText("S(n) = "  + " X("+k+"n) = ");
                            resultado.setText(diezmacion.toString());
                            break;
                        case 8:
                            String k1 = parametro.getText().trim();
                            LinkedList inter = operaciones.interpolacion(secUno, Double.parseDouble(k1),Origen_Uno);                            
                            origenSalida = (int)inter.getLast(); //recupero punto origen salida                            
                            inter.removeLast(); //borro el punto final(origen salida)
                            elementoOrigen = inter.get(origenSalida).toString();
                            liga = m.obtenerGrafica(inter, origenSalida, "S");
                            mostrarImagen(liga, entradaS);
                            operacionT.setText("S(n) = "  + " X(n/"+k1+") = ");
                            resultado.setText(inter.toString());
                            break;
                        case 9:
                            System.out.println("Convolución discreta");
                            System.out.println(secUno.toString());
                            System.out.println(secDos.toString());
                            LinkedList conv =operaciones.convolucionDiscreta(secUno,secDos,Origen_Uno,Origen_Dos);
                            origenSalida = Origen_Uno + Origen_Dos;
                            elementoOrigen = conv.get(origenSalida).toString();
                            liga = m.obtenerGrafica(conv, origenSalida, "S");
                            mostrarImagen(liga, entradaS);
                            operacionT.setText("S(n) = "  + " X(n)*H(n) = ");
                            resultado.setText(conv.toString());
                            break;

                        default:
                            System.out.println("Ocurrió un error");

                    }
                } catch (NumberFormatException ec) {
                    sonido.emitirSonidoWindows();
                    System.out.println("number format");
                    mostrarMensajeDeError();
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("index out");
                sonido.emitirSonidoWindows();
                mostrarMensajeDeError();
            }
        } catch (IOException ex) {
            System.out.println("IoException");
            sonido.emitirSonidoWindows();
            mostrarMensajeDeError();
        }
    }//GEN-LAST:event_buttonAqua1ActionPerformed
    public void mostrarMensajeDeError() {
        UIManager UI = new UIManager();
        UI.put("OptionPane.background", Color.white);
        UI.put("Panel.background", Color.white);
        JOptionPane.showMessageDialog(null, "Cadena no válida", "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    private void secuenciaUnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secuenciaUnoMouseExited
        mostrarGraficaUno();
    }//GEN-LAST:event_secuenciaUnoMouseExited

    public void mostrarGraficaUno() {
        try {
            try {
                
                String secuenciaU = secuenciaUno.getText().trim();
                LinkedList secuenciaUno = convertirCadenaALista(secuenciaU);
                int indiceDelOrigen = Integer.parseInt(origenUno.getText());
                String liga = m.obtenerGrafica(secuenciaUno, indiceDelOrigen, "X");
                mostrarImagen(liga, entradaUnoX);
                this.secUno = secuenciaUno;
                this.Origen_Uno = indiceDelOrigen;
            } catch (NumberFormatException er) {
                System.out.println("number format");
                mostrarMensajeDeError();
            }
        } catch (IOException ex) {
            System.out.println("IoException");
            mostrarMensajeDeError();
        }
    }
    private void secuenciaDosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secuenciaDosMouseExited
        mostrarGraficaDos();
     }//GEN-LAST:event_secuenciaDosMouseExited

    public void mostrarGraficaDos() {
        try {
            try {
                String secuenciaD = secuenciaDos.getText().trim();
                LinkedList secuenciaDos = convertirCadenaALista(secuenciaD);
                int indiceDelOrigen = Integer.parseInt(origenDos.getText());
                String liga = m.obtenerGrafica(secuenciaDos, indiceDelOrigen, "Y");
                mostrarImagen(liga, entradaDosY);
                this.secDos = secuenciaDos;
                this.Origen_Dos = indiceDelOrigen;
            } catch (NumberFormatException er) {
                System.out.println("number format");
                mostrarMensajeDeError();
            }
        } catch (IOException ex) {
            System.out.println("IOException");
            mostrarMensajeDeError();
        }
    }
    private void operacionARealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operacionARealizarActionPerformed
        int operacion = operacionARealizar.getSelectedIndex();
        if (operacion == 0 || operacion == 1 || operacion == 2) {
            establecerCondicionesIniciales();
        } else if (operacion == 3 || operacion == 4 || operacion == 5 || operacion == 6 || operacion == 7 || operacion == 8) {

            String mensaje = "";

            if (operacion == 3) {
                mensaje = "Ingrese el factor por el que se va amplificar:";
                cambiarFondoEntradas(1);
            } else if (operacion == 4) {
                mensaje = "Ingrese el factor por el que se va atenuar:";
                cambiarFondoEntradas(1);
            } else if (operacion == 5) {
                mensaje = "Ingrese las unidades a desplazar S(n) = X(n-n0)";
                cambiarFondoEntradas(1);
            } else if (operacion == 6) {
                mensaje = "lll";
                cambiarFondoEntradas(2);
                parametro.setEnabled(false);
            }
            else if (operacion == 7) {
                mensaje = "Ingrese el factor por el que se va a Diezmar";
                cambiarFondoEntradas(2);
                parametro.setEnabled(false);
            }else if (operacion == 8) {
                mensaje = "Ingrese el factor por el que se va a interpolar";
                cambiarFondoEntradas(2);
                parametro.setEnabled(false);
            }
            else {
                System.out.println("Función aún no implementada");
            }
            cadenaParametros.setText(mensaje);
            cadenaParametros.setEnabled(true);
            parametro.setEnabled(true);
            secuenciaDos.setEnabled(false);
            origenDos.setEnabled(false);
        }


    }//GEN-LAST:event_operacionARealizarActionPerformed

    private void mainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMouseEntered
        //   mostrarGraficaUno();
        //   mostrarGraficaDos();
    }//GEN-LAST:event_mainMouseEntered

    private void buttonAqua1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAqua1MouseEntered
        sonido.emitirSonidoEncimaDeIcono();
    }//GEN-LAST:event_buttonAqua1MouseEntered

    private void secuenciaUnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secuenciaUnoMouseEntered
        sonido.emitirSonidoEncimaDeIcono();
    }//GEN-LAST:event_secuenciaUnoMouseEntered

    private void secuenciaDosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secuenciaDosMouseEntered
        sonido.emitirSonidoEncimaDeIcono();
    }//GEN-LAST:event_secuenciaDosMouseEntered

    private void operacionARealizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_operacionARealizarMouseEntered
        sonido.emitirSonidoEncimaDeIcono();
    }//GEN-LAST:event_operacionARealizarMouseEntered

    private void origenUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origenUnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_origenUnoActionPerformed

    private void parametroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parametroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parametroActionPerformed

    public void cambiarFondoEntradas(int tipo) {
        int r = 167, g = 250, b = 203;
        if (tipo == 0) {
            secuenciaUno.setBackground(new Color(r, g, b));
            secuenciaDos.setBackground(new Color(r, g, b));
        } else if (tipo == 1) {
            secuenciaUno.setBackground(new Color(r, g, b));
            secuenciaDos.setBackground(Color.white);
            parametro.setBackground(new Color(r, g, b));
        } else {
            secuenciaUno.setBackground(new Color(r, g, b));
            secuenciaDos.setBackground(Color.white);
            parametro.setBackground(Color.white);
        }
    }

    public void establecerCondicionesIniciales() {
        cadenaParametros.setText("-");
        cadenaParametros.setEnabled(false);
        parametro.setEnabled(false);
        secuenciaDos.setEnabled(true);
        origenDos.setEnabled(true);
        mostrarImagen("src/Imagenes/Xn.jpg", entradaUnoX);
        mostrarImagen("src/Imagenes/Yn.jpg", entradaDosY);
        mostrarImagen("src/Imagenes/Sn.jpg", entradaS);
        cambiarFondoEntradas(0);
    }

    public void setLblColor(JLabel lbl) {
        lbl.setBackground(new Color(0, 150, 62));
    }

    public void resetLblColor(JLabel lbl) {
        lbl.setBackground(new Color(1, 198, 83));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAqua buttonAqua1;
    private org.edisoncor.gui.label.LabelMetric cadenaParametros;
    private javax.swing.JLabel entradaDosY;
    private javax.swing.JLabel entradaS;
    private javax.swing.JLabel entradaUnoX;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric10;
    private org.edisoncor.gui.label.LabelMetric labelMetric11;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private org.edisoncor.gui.label.LabelMetric labelMetric4;
    private org.edisoncor.gui.label.LabelMetric labelMetric5;
    private org.edisoncor.gui.label.LabelMetric labelMetric6;
    private org.edisoncor.gui.label.LabelMetric labelMetric7;
    private org.edisoncor.gui.label.LabelMetric labelMetric8;
    private org.edisoncor.gui.label.LabelMetric labelMetric9;
    private javax.swing.JPanel main;
    private org.edisoncor.gui.comboBox.ComboBoxRound operacionARealizar;
    private javax.swing.JLabel operacionT;
    private org.edisoncor.gui.textField.TextFieldRoundImage origenDos;
    private org.edisoncor.gui.textField.TextFieldRoundImage origenUno;
    private org.edisoncor.gui.textField.TextFieldRoundImage parametro;
    private javax.swing.JLabel resultado;
    private org.edisoncor.gui.textField.TextFieldRoundImage secuenciaDos;
    private org.edisoncor.gui.textField.TextFieldRoundImage secuenciaUno;
    private org.edisoncor.gui.tabbedPane.TabbedPaneHeader tabbedPaneHeader1;
    // End of variables declaration//GEN-END:variables
}
