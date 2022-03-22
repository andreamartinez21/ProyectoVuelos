package Ventanas;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class VentanaInicioSesion extends JFrame{

    private JPanel contentPane;

    private JPanel panel;
    private JPanel panelArriba;
    private JPanel panelMedio;
    private JPanel panelAbajo;
    
	public VentanaInicioSesion() throws IOException {
    	
        setBackground(new Color(0, 0, 51));

        setTitle("Inicio de sesión");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 350));
        setVisible(true);
        pack();

        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 51));
        setContentPane(contentPane);

        panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(0, 0, 51));
        panelArriba = new JPanel(new GridLayout(1, 2));
        panelArriba.setBackground(new Color(0, 0, 51));
        panelMedio = new JPanel(new GridLayout(1, 2));
        panelMedio.setBackground(new Color(0, 0, 51));
        panelAbajo = new JPanel(new BorderLayout());
        panelAbajo.setBackground(new Color(0, 0, 51));

        contentPane.add(panel);

        // panel

        // METER BORDES

        // label usuario

        JPanel panelLabelUsuario = new JPanel();
        panelLabelUsuario.setBackground(new Color(0, 0, 51));
        JLabel labelUsuario = new JLabel("Usuario: ");
        labelUsuario.setForeground(Color.WHITE);
        panelLabelUsuario.add(labelUsuario);

        JPanel panelTextoUsuario = new JPanel(); 
        panelTextoUsuario.setBackground(new Color(0, 0, 51));
        JTextField textoUsuario = new JTextField();
        textoUsuario.setPreferredSize(new Dimension(150, 25));
        panelTextoUsuario.add(textoUsuario);

        panelArriba.add(panelLabelUsuario);
        panelArriba.add(panelTextoUsuario);

        // label contraseña

        JPanel panelLabelContrasenya = new JPanel();
        panelLabelContrasenya.setBackground(new Color(0, 0, 51));
        JLabel labelContrasenya = new JLabel("Contraseña: ");
        labelContrasenya.setForeground(Color.WHITE);
        panelLabelContrasenya.add(labelContrasenya);

        JPanel panelTextoContrasenya = new JPanel(); 
        panelTextoContrasenya.setBackground(new Color(0, 0, 51));
        JTextField textoContrasenya = new JTextField();
        textoContrasenya.setPreferredSize(new Dimension(150, 25));
        panelTextoContrasenya.add(textoContrasenya);

        panelMedio.add(panelLabelContrasenya);
        panelMedio.add(panelTextoContrasenya);

        // botón acceder

        JPanel panelBotonAcceder = new JPanel();
        panelBotonAcceder.setBackground(new Color(0, 0, 51));
        JButton botonAcceder = new JButton("Acceder");
        botonAcceder.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        botonAcceder.setBackground(Color.DARK_GRAY);
        botonAcceder.setForeground(Color.WHITE);
        botonAcceder.setPreferredSize(new Dimension(160, 35));
        panelBotonAcceder.add(botonAcceder);

        panelAbajo.add(panelBotonAcceder);

        //

        panel.add(panelArriba, BorderLayout.NORTH);
        panel.add(panelMedio, BorderLayout.CENTER);
        panel.add(panelAbajo, BorderLayout. SOUTH);

        contentPane.setVisible(true);
        panel.setVisible(true);
    }

    public static void main(String[] args) throws IOException {
		new VentanaInicioSesion();
	}
}
