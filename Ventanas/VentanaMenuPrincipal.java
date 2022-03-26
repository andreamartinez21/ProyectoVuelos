package Ventanas;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaMenuPrincipal extends JFrame{

    private JPanel contentPane;

    private JPanel panel;
    private JPanel panelArriba;
    private JPanel panelMedio;
    private JPanel panelAbajo;
    
	public VentanaMenuPrincipal() throws IOException {
    	
        setBackground(new Color(0, 0, 51));

        setTitle("Menú principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 350));
        setVisible(true);
        pack();

        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 51));
        setContentPane(contentPane);

        panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(0, 0, 51));
        panelArriba = new JPanel(new BorderLayout());
        panelArriba.setBackground(new Color(0, 0, 51));
        panelMedio = new JPanel(new GridLayout(3, 1));
        panelMedio.setBackground(new Color(0, 0, 51));
        panelAbajo = new JPanel(new BorderLayout());
        panelAbajo.setBackground(new Color(0, 0, 51));

        contentPane.add(panel);

        // panel

        // METER BORDES

        // label nombre usuario

        JPanel panelLabelNombreUsuario = new JPanel();
        panelLabelNombreUsuario.setBackground(new Color(0, 0, 51));
        JLabel labelNombreUsuario = new JLabel("ANDREA MARTÍNEZ:");
        labelNombreUsuario.setForeground(Color.WHITE);
        panelLabelNombreUsuario.add(labelNombreUsuario);

        panelArriba.add(panelLabelNombreUsuario);

        // botón comprar billetes

        JPanel panelBotonComprarBilletes = new JPanel();
        panelBotonComprarBilletes.setBackground(new Color(0, 0, 51));
        JButton botonComprarBilletes = new JButton("Comprar billetes");
        botonComprarBilletes.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        botonComprarBilletes.setBackground(Color.DARK_GRAY);
        botonComprarBilletes.setForeground(Color.WHITE);
        botonComprarBilletes.setPreferredSize(new Dimension(190, 35));
        panelBotonComprarBilletes.add(botonComprarBilletes);

        botonComprarBilletes.addActionListener(new ActionListener() {
				
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    new VentanaCompra();
                    VentanaInicio.var = 2;
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        panelMedio.add(panelBotonComprarBilletes);

        // botón perfil

        JPanel panelBotonPerfil = new JPanel();
        panelBotonPerfil.setBackground(new Color(0, 0, 51));
        JButton botonPerfil = new JButton("Perfil");
        botonPerfil.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        botonPerfil.setBackground(Color.DARK_GRAY);
        botonPerfil.setForeground(Color.WHITE);
        botonPerfil.setPreferredSize(new Dimension(160, 35));
        panelBotonPerfil.add(botonPerfil);

        botonPerfil.addActionListener(new ActionListener() {
				
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    new VentanaPerfil();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        panelMedio.add(panelBotonPerfil);

        // botón mis viajes

        JPanel panelBotonMisViajes = new JPanel();
        panelBotonMisViajes.setBackground(new Color(0, 0, 51));
        JButton botonMisViajes = new JButton("Mis viajes");
        botonMisViajes.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        botonMisViajes.setBackground(Color.DARK_GRAY);
        botonMisViajes.setForeground(Color.WHITE);
        botonMisViajes.setPreferredSize(new Dimension(160, 35));
        panelBotonMisViajes.add(botonMisViajes);

        botonMisViajes.addActionListener(new ActionListener() {
				
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    new VentanaVerViajes();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        panelMedio.add(panelBotonMisViajes);

        // botón cerrar sesión

        JPanel panelBotonCerrarSesion = new JPanel();
        panelBotonCerrarSesion.setBackground(new Color(0, 0, 51));
        JButton botonCerrarSesion = new JButton("Cerrar sesión");
        botonCerrarSesion.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        botonCerrarSesion.setBackground(Color.DARK_GRAY);
        botonCerrarSesion.setForeground(Color.WHITE);
        botonCerrarSesion.setPreferredSize(new Dimension(130, 30));
        panelBotonCerrarSesion.add(botonCerrarSesion);

        botonCerrarSesion.addActionListener(new ActionListener() {
				
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

        panelAbajo.add(panelBotonCerrarSesion);

        //

        panel.add(panelArriba, BorderLayout.NORTH);
        panel.add(panelMedio, BorderLayout.CENTER);
        panel.add(panelAbajo, BorderLayout. SOUTH);

        contentPane.setVisible(true);
        panel.setVisible(true);
    }

    public static void main(String[] args) throws IOException {
		new VentanaMenuPrincipal();
	}
}