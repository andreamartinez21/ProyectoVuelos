package Ventanas;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaVerViajes extends JFrame{

    private JPanel contentPane;

    private JPanel panel;
    private JPanel panelArriba;
    private JPanel panelAbajo;
    
	public VentanaVerViajes() throws IOException {

        String[] viajes = {"Bilbao - Málaga", "Bilbao - París", "Madrid - Londres", "Alicante - Valencia"};
    	
        setBackground(new Color(0, 0, 51));

        setTitle("Ver mis viajes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 350));
        setVisible(true);
        pack();

        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 51));
        setContentPane(contentPane);

        panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(0, 0, 51));
        panelArriba = new JPanel(new GridLayout(viajes.length, 1));
        panelArriba.setBackground(new Color(0, 0, 51));
        panelAbajo = new JPanel(new BorderLayout());
        panelAbajo.setBackground(new Color(0, 0, 51));

        contentPane.add(panel);

        // METER BORDES

        // labels viajes

        for (int i = 0; i < viajes.length; i++) {

            JPanel panelLabelIniciarSesion = new JPanel();
            panelLabelIniciarSesion.setBackground(new Color(0, 0, 51));
            JLabel labelIniciarSesion = new JLabel(viajes[i]);
            labelIniciarSesion.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
            labelIniciarSesion.setBackground(Color.DARK_GRAY);
            labelIniciarSesion.setForeground(Color.WHITE);
            labelIniciarSesion.setPreferredSize(new Dimension(190, 35));
            panelLabelIniciarSesion.add(labelIniciarSesion);

            panelArriba.add(panelLabelIniciarSesion);
        }

        // botón volver

        JPanel panelBotonVolver = new JPanel();
        panelBotonVolver.setBackground(new Color(0, 0, 51));
        JButton botonVolver = new JButton("Volver");
        botonVolver.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        botonVolver.setBackground(Color.DARK_GRAY);
        botonVolver.setForeground(Color.WHITE);
        botonVolver.setPreferredSize(new Dimension(160, 35));
        panelBotonVolver.add(botonVolver);

        botonVolver.addActionListener(new ActionListener() {
				
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    new VentanaMenuPrincipal();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        panelAbajo.add(panelBotonVolver);

        //

        panel.add(panelArriba, BorderLayout.NORTH);
        panel.add(panelAbajo, BorderLayout.SOUTH);

        contentPane.setVisible(true);
        panel.setVisible(true);
    }

    public static void main(String[] args) throws IOException {

		new VentanaVerViajes();
	}
}