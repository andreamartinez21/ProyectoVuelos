package Ventanas;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRegistro extends JFrame{

    private JPanel contentPane;

    private JPanel panel;
    private JPanel panelArriba;
    private JPanel panelAbajo;
    
	public VentanaRegistro() throws IOException {
    	
        setBackground(new Color(0, 0, 51));

        setTitle("Registro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 350));
        setVisible(true);
        pack();

        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 51));
        setContentPane(contentPane);

        panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(0, 0, 51));
        panelArriba = new JPanel(new GridLayout(2, 2));
        panelArriba.setBackground(new Color(0, 0, 51));
        panelAbajo = new JPanel(new GridLayout(1, 2));
        panelAbajo.setBackground(new Color(0, 0, 51));

        contentPane.add(panel);

        // panel

        // METER BORDES

        // label ombre

        JPanel panelLabelNombre = new JPanel();
        panelLabelNombre.setBackground(new Color(0, 0, 51));
        JLabel labelNombre = new JLabel("Nombre: ");
        labelNombre.setForeground(Color.WHITE);
        panelLabelNombre.add(labelNombre);

        JPanel panelTextoNombre = new JPanel(); 
        panelTextoNombre.setBackground(new Color(0, 0, 51));
        JTextField textoNombre = new JTextField();
        textoNombre.setPreferredSize(new Dimension(150, 25));
        panelTextoNombre.add(textoNombre);

        panelArriba.add(panelLabelNombre);
        panelArriba.add(panelTextoNombre);

        // label rrimer apellido

        JPanel panelLabelPrimerApellido = new JPanel();
        panelLabelPrimerApellido.setBackground(new Color(0, 0, 51));
        JLabel labelPrimerApellido = new JLabel("Primer apellido: ");
        labelPrimerApellido.setForeground(Color.WHITE);
        panelLabelPrimerApellido.add(labelPrimerApellido);

        JPanel panelTextoPrimerApellido = new JPanel(); 
        panelTextoPrimerApellido.setBackground(new Color(0, 0, 51));
        JPasswordField textoPrimerApellido = new JPasswordField();
        textoPrimerApellido.setPreferredSize(new Dimension(150, 25));
        panelTextoPrimerApellido.add(textoPrimerApellido);

        panelArriba.add(panelLabelPrimerApellido);
        panelArriba.add(panelTextoPrimerApellido);

        // botón volver

        JPanel panelBotonVolver = new JPanel();
        panelBotonVolver.setBackground(new Color(0, 0, 51));
        JButton botonVolver = new JButton("Volver");
        botonVolver.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        botonVolver.setBackground(Color.DARK_GRAY);
        botonVolver.setForeground(Color.WHITE);
        botonVolver.setPreferredSize(new Dimension(150, 30));
        panelBotonVolver.add(botonVolver);

        botonVolver.addActionListener(new ActionListener() {
				
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    new VentanaInicio();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        // botón registrarme

        JPanel panelBotonRegistrarme = new JPanel();
        panelBotonRegistrarme.setBackground(new Color(0, 0, 51));
        JButton botonRegistrarme = new JButton("Registrarme");
        botonRegistrarme.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        botonRegistrarme.setBackground(Color.DARK_GRAY);
        botonRegistrarme.setForeground(Color.WHITE);
        botonRegistrarme.setPreferredSize(new Dimension(150, 30));
        panelBotonRegistrarme.add(botonRegistrarme);

        botonRegistrarme.addActionListener(new ActionListener() {
				
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    new VentanaInicio();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        // PONER UN COMENTARIO DE REGISTRO REALIZADO CON ÉXITO
        // Y OTRO DE USUARIO YA REGISTRADO

        panelAbajo.add(panelBotonVolver);
        panelAbajo.add(panelBotonRegistrarme);

        //

        panel.add(panelArriba, BorderLayout.NORTH);
        panel.add(panelAbajo, BorderLayout. SOUTH);

        contentPane.setVisible(true);
        panel.setVisible(true);
    }

    public static void main(String[] args) throws IOException {
		new VentanaRegistro();
	}
}
