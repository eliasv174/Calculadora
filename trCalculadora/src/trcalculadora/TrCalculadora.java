package trcalculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class TrCalculadora extends javax.swing.JFrame {
    double PrimerNumero;
    double SegundoNumero;
    double Resultado;
    String Operador;

    public TrCalculadora()  {
        initComponents();
    }

    private void initComponents() {
        Pantalla = new javax.swing.JTextField();
        N1 = new javax.swing.JButton();
        N2 = new javax.swing.JButton();
        N3 = new javax.swing.JButton();
        N4 = new javax.swing.JButton();
        N5 = new javax.swing.JButton();
        N6 = new javax.swing.JButton();
        N7 = new javax.swing.JButton();
        N8 = new javax.swing.JButton();
        N9 = new javax.swing.JButton();
        N0 = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnDivi = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mAyuda = new javax.swing.JMenu();
        miManual = new javax.swing.JMenuItem();
        mMenu = new javax.swing.JMenu();
        miNuevo = new javax.swing.JMenuItem();
        miHistorial = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(350, 500));
        setMinimumSize(new java.awt.Dimension(350, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        Pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Pantalla.setBounds(30, 50, 240, 50);
        getContentPane().add(Pantalla);

        N1.setBackground(new java.awt.Color(0, 0, 0));
        N1.setFont(new java.awt.Font("Tahoma", 1, 24));
        N1.setForeground(new java.awt.Color(255, 255, 255));
        N1.setText("1");
        N1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                N1ActionPerformed(evt);
            }
        });
        getContentPane().add(N1);
        N1.setBounds(30, 290, 60, 50);

        N2.setBackground(new java.awt.Color(0, 0, 0));
        N2.setFont(new java.awt.Font("Tahoma", 1, 24));
        N2.setForeground(new java.awt.Color(255, 255, 255));
        N2.setText("2");
        N2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                N2ActionPerformed(evt);
            }
        });
        getContentPane().add(N2);
        N2.setBounds(100, 290, 60, 50);

        N3.setBackground(new java.awt.Color(0, 0, 0));
        N3.setFont(new java.awt.Font("Tahoma", 1, 24));
        N3.setForeground(new java.awt.Color(255, 255, 255));
        N3.setText("3");
        N3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                N3ActionPerformed(evt);
            }
        });
        getContentPane().add(N3);
        N3.setBounds(170, 290, 60, 50);

        N4.setBackground(new java.awt.Color(0, 0, 0));
        N4.setFont(new java.awt.Font("Tahoma", 1, 24));
        N4.setForeground(new java.awt.Color(255, 255, 255));
        N4.setText("4");
        N4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                N4ActionPerformed(evt);
            }
        });
        getContentPane().add(N4);
        N4.setBounds(30, 230, 60, 50);

        N5.setBackground(new java.awt.Color(0, 0, 0));
        N5.setFont(new java.awt.Font("Tahoma", 1, 24));
        N5.setForeground(new java.awt.Color(255, 255, 255));
        N5.setText("5");
        N5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                N5ActionPerformed(evt);
            }
        });
        getContentPane().add(N5);
        N5.setBounds(100, 230, 60, 50);

        N6.setBackground(new java.awt.Color(0, 0, 0));
        N6.setFont(new java.awt.Font("Tahoma", 1, 24));
        N6.setForeground(new java.awt.Color(255, 255, 255));
        N6.setText("6");
        N6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                N6ActionPerformed(evt);
            }
        });
        getContentPane().add(N6);
        N6.setBounds(170, 230, 60, 50);

        N7.setBackground(new java.awt.Color(0, 0, 0));
        N7.setFont(new java.awt.Font("Tahoma", 1, 24));
        N7.setForeground(new java.awt.Color(255, 255, 255));
        N7.setText("7");
        N7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                N7ActionPerformed(evt);
            }
        });
        getContentPane().add(N7);
        N7.setBounds(30, 170, 60, 50);

        N8.setBackground(new java.awt.Color(0, 0, 0));
        N8.setFont(new java.awt.Font("Tahoma", 1, 24));
        N8.setForeground(new java.awt.Color(255, 255, 255));
        N8.setText("8");
        N8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                N8ActionPerformed(evt);
            }
        });
        getContentPane().add(N8);
        N8.setBounds(100, 170, 60, 50);

        N9.setBackground(new java.awt.Color(0, 0, 0));
        N9.setFont(new java.awt.Font("Tahoma", 1, 24));
        N9.setForeground(new java.awt.Color(255, 255, 255));
        N9.setText("9");
        N9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                N9ActionPerformed(evt);
            }
        });
        getContentPane().add(N9);
        N9.setBounds(170, 170, 60, 50);

        N0.setBackground(new java.awt.Color(0, 0, 0));
        N0.setFont(new java.awt.Font("Tahoma", 1, 24));
        N0.setForeground(new java.awt.Color(255, 255, 255));
        N0.setText("0");
        N0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                N0ActionPerformed(evt);
            }
        });
        getContentPane().add(N0);
        N0.setBounds(30, 350, 60, 50);

        btnSuma.setBackground(new java.awt.Color(0, 204, 204));
        btnSuma.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnSuma.setForeground(new java.awt.Color(255, 255, 255));
        btnSuma.setText("+");
        btnSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSuma);
        btnSuma.setBounds(240, 340, 50, 60);

        btnResta.setBackground(new java.awt.Color(102, 102, 102));
        btnResta.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnResta.setText("-");
        btnResta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        getContentPane().add(btnResta);
        btnResta.setBounds(240, 300, 50, 30);

        btnDivi.setBackground(new java.awt.Color(102, 102, 102));
        btnDivi.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnDivi.setText("/");
        btnDivi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnDiviActionPerformed(evt);
            }
        });
        getContentPane().add(btnDivi);
        btnDivi.setBounds(240, 260, 50, 30);

        btnMulti.setBackground(new java.awt.Color(102, 102, 102));
        btnMulti.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnMulti.setText("*");
        btnMulti.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });
        getContentPane().add(btnMulti);
        btnMulti.setBounds(240, 220, 50, 30);

        btnPunto.setBackground(new java.awt.Color(0, 0, 0));
        btnPunto.setFont(new java.awt.Font("Tahoma", 1, 24));
        btnPunto.setForeground(new java.awt.Color(255, 255, 255));
        btnPunto.setText(".");
        btnPunto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPunto);
        btnPunto.setBounds(100, 350, 60, 50);

        btnIgual.setBackground(new java.awt.Color(0, 204, 204));
        btnIgual.setFont(new java.awt.Font("Tahoma", 1, 24));
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setText("=");
        btnIgual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        getContentPane().add(btnIgual);
        btnIgual.setBounds(170, 350, 60, 50);

        btnLimpiar.setBackground(new java.awt.Color(255, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("C");
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(30, 130, 80, 30);

        mAyuda.setText("Ayuda");

        miManual.setText("Manual de Usuario");
        miManual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                mostrarManualUsuario();
            }
        });
        mAyuda.add(miManual);

        jMenuBar1.add(mAyuda);

        mMenu.setText("Menu");

        miNuevo.setText("Nuevo");
        miNuevo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                miNuevoActionPerformed(evt);
            }
        });
        mMenu.add(miNuevo);

        miHistorial.setText("Historial");
        miHistorial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mMenu.add(miHistorial);

        jMenuBar1.add(mMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }

    private void PantallaActionPerformed(ActionEvent evt) {
    }

    private void N1ActionPerformed(ActionEvent evt) {
        Pantalla.setText(Pantalla.getText() + "1");
        Toolkit.getDefaultToolkit().beep();
    }

    private void N2ActionPerformed(ActionEvent evt) {
        Pantalla.setText(Pantalla.getText() + "2");
        Toolkit.getDefaultToolkit().beep();
    }

    private void N3ActionPerformed(ActionEvent evt) {
        Pantalla.setText(Pantalla.getText() + "3");
        Toolkit.getDefaultToolkit().beep();
    }

    private void N4ActionPerformed(ActionEvent evt) {
        Pantalla.setText(Pantalla.getText() + "4");
        Toolkit.getDefaultToolkit().beep();
    }

    private void N5ActionPerformed(ActionEvent evt) {
        Pantalla.setText(Pantalla.getText() + "5");
        Toolkit.getDefaultToolkit().beep();
    }

    private void N6ActionPerformed(ActionEvent evt) {
        Pantalla.setText(Pantalla.getText() + "6");
        Toolkit.getDefaultToolkit().beep();
    }

    private void N7ActionPerformed(ActionEvent evt) {
        Pantalla.setText(Pantalla.getText() + "7");
        Toolkit.getDefaultToolkit().beep();
    }

    private void N8ActionPerformed(ActionEvent evt) {
        Pantalla.setText(Pantalla.getText() + "8");
        Toolkit.getDefaultToolkit().beep();
    }

    private void N9ActionPerformed(ActionEvent evt) {
        Pantalla.setText(Pantalla.getText() + "9");
        Toolkit.getDefaultToolkit().beep();
    }

    private void N0ActionPerformed(ActionEvent evt) {
        Pantalla.setText(Pantalla.getText() + "0");
        Toolkit.getDefaultToolkit().beep();
    }

    private void btnSumaActionPerformed(ActionEvent evt) {
        PrimerNumero = Double.parseDouble(Pantalla.getText());
        Pantalla.setText("");
        Operador = "+";
        Toolkit.getDefaultToolkit().beep();
    }

    private void btnRestaActionPerformed(ActionEvent evt) {
        PrimerNumero = Double.parseDouble(Pantalla.getText());
        Pantalla.setText("");
        Operador = "-";
        Toolkit.getDefaultToolkit().beep();
    }

    private void btnMultiActionPerformed(ActionEvent evt) {
        PrimerNumero = Double.parseDouble(Pantalla.getText());
        Pantalla.setText("");
        Operador = "*";
        Toolkit.getDefaultToolkit().beep();
    }

    private void btnDiviActionPerformed(ActionEvent evt) {
        PrimerNumero = Double.parseDouble(Pantalla.getText());
        Pantalla.setText("");
        Operador = "/";
        Toolkit.getDefaultToolkit().beep();
    }

    private void btnIgualActionPerformed(ActionEvent evt) {
        SegundoNumero = Double.parseDouble(Pantalla.getText());

        switch (Operador) {
            case "+":
                Resultado = PrimerNumero + SegundoNumero;
                break;
            case "-":
                Resultado = PrimerNumero - SegundoNumero;
                break;
            case "*":
                Resultado = PrimerNumero * SegundoNumero;
                break;
            case "/":
                Resultado = PrimerNumero / SegundoNumero;
                break;
        }

        Pantalla.setText(Double.toString(Resultado));
        Toolkit.getDefaultToolkit().beep();
        registrarOperacion();
    }

    private void btnPuntoActionPerformed(ActionEvent evt) {
        String text = Pantalla.getText();
        if (!text.contains(".")) {
            Pantalla.setText(text + ".");
            Toolkit.getDefaultToolkit().beep();
        }
    }

    private void btnLimpiarActionPerformed(ActionEvent evt) {
        Pantalla.setText("");
        Toolkit.getDefaultToolkit().beep();
    }

    private void miNuevoActionPerformed(ActionEvent evt) {
        Pantalla.setText("");
        registrarOperacion("Nuevo");
    }

    private void jMenuItem2ActionPerformed(ActionEvent evt) {
        mostrarHistorial();
    }

    private void mostrarHistorial() {
        JFrame historialFrame = new JFrame("Historial");
        historialFrame.setSize(400, 300);
        historialFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JTextArea historialArea = new JTextArea();
        historialArea.setEditable(false);

        try {
            File file = new File("bitacoraCalculadora.txt");
            if (file.exists()) {
                historialArea.read(new java.io.FileReader(file), null);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        JScrollPane scrollPane = new JScrollPane(historialArea);
        historialFrame.getContentPane().add(scrollPane);
        historialFrame.setVisible(true);
    }

    private void mostrarManualUsuario() {
        JFrame manualFrame = new JFrame("Manual de Usuario");
        manualFrame.setSize(600, 400);
        manualFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JTextArea manualArea = new JTextArea();
        manualArea.setEditable(false);
        manualArea.setText("Manual de Usuario\n\n" +
                "1. Presiona los botones con numeros para ingresar los valores.\n" +
                "2. Usa los botones de operaciones (+, -, *, /) para seleccionar la operacion deseada.\n" +
                "3. Pulsa el boton '=' para obtener el resultado.\n" +
                "4. Usa el boton 'C' para limpiar la pantalla.\n" +
                "5. El boton '.' te permite ingresar decimales.\n\n" +
                "Desarrollado por Elias Villatoro.");

        JScrollPane scrollPane = new JScrollPane(manualArea);
        manualFrame.getContentPane().add(scrollPane);
        manualFrame.setVisible(true);
    }

    private void registrarOperacion() {
        registrarOperacion("");
    }

    private void registrarOperacion(String operacion) {
        try (FileWriter fw = new FileWriter("bitacoraCalculadora.txt", true);
             PrintWriter pw = new PrintWriter(fw)) {
            String operacionTexto = Pantalla.getText();
            if (operacion.isEmpty()) {
                operacionTexto = operacionTexto + " = " + Resultado;
            } else {
                operacionTexto = operacion + ": " + operacionTexto;
            }
            pw.println(operacionTexto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private javax.swing.JTextField Pantalla;
    private javax.swing.JButton N0;
    private javax.swing.JButton N1;
    private javax.swing.JButton N2;
    private javax.swing.JButton N3;
    private javax.swing.JButton N4;
    private javax.swing.JButton N5;
    private javax.swing.JButton N6;
    private javax.swing.JButton N7;
    private javax.swing.JButton N8;
    private javax.swing.JButton N9;
    private javax.swing.JButton btnDivi;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mAyuda;
    private javax.swing.JMenuItem miManual;
    private javax.swing.JMenu mMenu;
    private javax.swing.JMenuItem miHistorial;
    private javax.swing.JMenuItem miNuevo;
}