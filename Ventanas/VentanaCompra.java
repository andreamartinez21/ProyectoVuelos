package Ventanas;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCompra extends JFrame{

    private JPanel contentPane;

    private JPanel panel;
    private JPanel panelArriba;
    private JPanel panelMedio;
    private JPanel panelAbajo;
    
	public VentanaCompra() throws IOException {
    	
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
        panelMedio = new JPanel(new GridLayout(2, 1));
        panelMedio.setBackground(new Color(0, 0, 51));
        panelAbajo = new JPanel(new GridLayout(1, 2));
        panelAbajo.setBackground(new Color(0, 0, 51));

        contentPane.add(panel);

        // METER BORDES

        // radio button ida y vuelta

        JPanel panelRadioIdaVuelta = new JPanel();
        panelRadioIdaVuelta.setBackground(new Color(0, 0, 51));
        JRadioButton radioIdaVuelta = new JRadioButton("Ida y vuelta", true);
        radioIdaVuelta.setBackground(Color.WHITE);
        panelRadioIdaVuelta.add(radioIdaVuelta);

        panelMedio.add(panelRadioIdaVuelta);

        // radio button ida

        JPanel panelRadioIda = new JPanel();
        panelRadioIda.setBackground(new Color(0, 0, 51));
        JRadioButton radioIda = new JRadioButton("Ida", false);
        radioIda.setBackground(Color.WHITE);
        panelRadioIda.add(radioIda);

        panelMedio.add(panelRadioIda);

        if(radioIdaVuelta.isSelected() == true){
            radioIda.setSelected(false);
        } else if(radioIda.isSelected() == true){
            radioIdaVuelta.setSelected(false);
        }

        // combo origen

        JPanel panelComboOrigen = new JPanel();
        panelComboOrigen.setBackground(new Color(0, 0, 51));
        JComboBox comboOrigen = new JComboBox();
        comboOrigen.addItem("Málaga");
        comboOrigen.addItem("Malta");
        comboOrigen.addItem("Madrid");
        comboOrigen.addItem("Venecia");
        comboOrigen.addItem("Verona");
        comboOrigen.addItem("París");
        comboOrigen.addItem("Valencia");
        comboOrigen.setBackground(Color.WHITE);
        panelComboOrigen.add(comboOrigen);

        panelArriba.add(panelComboOrigen);

         // combo Destino

        JPanel panelComboDestino = new JPanel();
        panelComboDestino.setBackground(new Color(0, 0, 51));
        JComboBox comboDestino = new JComboBox();
        comboDestino.addItem("Málaga");
        comboDestino.addItem("Malta");
        comboDestino.addItem("Madrid");
        comboDestino.addItem("Venecia");
        comboDestino.addItem("Verona");
        comboDestino.addItem("París");
        comboDestino.addItem("Valencia");
        comboDestino.setBackground(Color.WHITE);
        panelComboDestino.add(comboDestino);

        panelArriba.add(panelComboDestino);

        radioIdaVuelta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				comboDestino.setVisible(true);
                radioIda.setSelected(false);
			}
		});
        radioIda.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				comboDestino.setVisible(false);
                radioIdaVuelta.setSelected(false);
			}
		});

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
                    if(VentanaInicio.var == 1){
                        new VentanaInicio();
                    } else if(VentanaInicio.var == 2){
                        new VentanaMenuPrincipal();
                    }
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        // botón siguiente

        JPanel panelBotonSiguiente = new JPanel();
        panelBotonSiguiente.setBackground(new Color(0, 0, 51));
        JButton botonSiguiente = new JButton("Siguiente");
        botonSiguiente.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        botonSiguiente.setBackground(Color.DARK_GRAY);
        botonSiguiente.setForeground(Color.WHITE);
        botonSiguiente.setPreferredSize(new Dimension(150, 30));
        panelBotonSiguiente.add(botonSiguiente);

        botonSiguiente.addActionListener(new ActionListener() {
				
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    new VentanaConfirmacionCompra();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        panelAbajo.add(panelBotonVolver);
        panelAbajo.add(panelBotonSiguiente);

        //

        panel.add(panelArriba, BorderLayout.NORTH);
        panel.add(panelMedio, BorderLayout.CENTER);
        panel.add(panelAbajo, BorderLayout.SOUTH);

        contentPane.setVisible(true);
        panel.setVisible(true);
    }

    public static void main(String[] args) throws IOException {
		new VentanaCompra();
	}
}