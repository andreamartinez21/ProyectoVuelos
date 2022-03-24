package Ventanas;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPerfil extends JFrame{

    private JPanel contentPane;

    private JPanel panel;
    private JPanel panelArriba;
    private JPanel panelAbajo;
    
	public VentanaPerfil() throws IOException {
    	
        setBackground(new Color(0, 0, 51));

        setTitle("Perfil");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 350));
        setVisible(true);
        pack();

        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 51));
        setContentPane(contentPane);

        panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(0, 0, 51));
        panelArriba = new JPanel(new GridLayout(2, 3));
        panelArriba.setBackground(new Color(0, 0, 51));
        panelAbajo = new JPanel(new BorderLayout());
        panelAbajo.setBackground(new Color(0, 0, 51));

        contentPane.add(panel);

        // panel

        // METER BORDES
        // CREAR LOS BOTONES EDITAR CON UN IF

        // label nombre

        JPanel panelLabelNombre = new JPanel();
        panelLabelNombre.setBackground(new Color(0, 0, 51));
        JLabel labelNombre = new JLabel("Nombre: ");
        labelNombre.setForeground(Color.WHITE);
        panelLabelNombre.add(labelNombre);

        // texto nombre
        // CAMBIAR TODO A LABELS

        JPanel panelTextoNombre = new JPanel(); 
        panelTextoNombre.setBackground(new Color(0, 0, 51));
        JLabel textoNombre = new JLabel("Andrea");
        textoNombre.setPreferredSize(new Dimension(150, 25));
        panelTextoNombre.add(textoNombre);

        panelArriba.add(panelLabelNombre);
        panelArriba.add(panelTextoNombre);

        // botón editar

        JPanel panelBotonEditar = new JPanel();
        panelBotonEditar.setBackground(new Color(0, 0, 51));
        JButton botonEditar = new JButton("Editar");
        botonEditar.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        botonEditar.setBackground(Color.DARK_GRAY);
        botonEditar.setForeground(Color.WHITE);
        botonEditar.setPreferredSize(new Dimension(100, 20));
        panelBotonEditar.add(botonEditar);

        panelArriba.add(panelBotonEditar);

        // label primer apellido

        JPanel panelLabelPrimerApellido = new JPanel();
        panelLabelPrimerApellido.setBackground(new Color(0, 0, 51));
        JLabel labelPrimerApellido = new JLabel("Primer apellido: ");
        labelPrimerApellido.setForeground(Color.WHITE);
        panelLabelPrimerApellido.add(labelPrimerApellido);

        // texto primer apellido

        JPanel panelTextoPrimerApellido = new JPanel(); 
        panelTextoPrimerApellido.setBackground(new Color(0, 0, 51));
        JLabel textoPrimerApellido = new JLabel("Martínez");
        textoPrimerApellido.setPreferredSize(new Dimension(150, 25));
        panelTextoPrimerApellido.add(textoPrimerApellido);

        panelArriba.add(panelLabelPrimerApellido);
        panelArriba.add(panelTextoPrimerApellido);

        // botón editar2

        JPanel panelBotonEditar2 = new JPanel();
        panelBotonEditar2.setBackground(new Color(0, 0, 51));
        JButton botonEditar2 = new JButton("Editar");
        botonEditar2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        botonEditar2.setBackground(Color.DARK_GRAY);
        botonEditar2.setForeground(Color.WHITE);
        botonEditar2.setPreferredSize(new Dimension(100, 20));
        panelBotonEditar2.add(botonEditar2);
        
        panelArriba.add(panelBotonEditar2);

        // // label segundo apellido

        // JPanel panelLabelSegundoApellido = new JPanel();
        // panelLabelSegundoApellido.setBackground(new Color(0, 0, 51));
        // JLabel labelSegundoApellido = new JLabel("Segundo apellido: ");
        // labelSegundoApellido.setForeground(Color.WHITE);
        // panelLabelSegundoApellido.add(labelSegundoApellido);

        // // texto segundo apellido

        // JPanel panelTextoSegundoApellido = new JPanel(); 
        // panelTextoSegundoApellido.setBackground(new Color(0, 0, 51));
        // JPasswordField textoSegundoApellido = new JPasswordField();
        // textoSegundoApellido.setPreferredSize(new Dimension(150, 25));
        // panelTextoSegundoApellido.add(textoSegundoApellido);

        // panelArriba.add(panelLabelSegundoApellido);
        // panelArriba.add(panelTextoSegundoApellido);

        // // botón editar3

        // JPanel panelBotonEditar3 = new JPanel();
        // panelBotonEditar3.setBackground(new Color(0, 0, 51));
        // JButton botonEditar3 = new JButton("Editar");
        // botonEditar3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        // botonEditar3.setBackground(Color.DARK_GRAY);
        // botonEditar3.setForeground(Color.WHITE);
        // botonEditar3.setPreferredSize(new Dimension(100, 20));
        // panelBotonEditar2.add(botonEditar3);
        
        // panelArriba.add(panelBotonEditar3);

        // // label número de teléfono

        // JPanel panelLabelNumeroTelefono = new JPanel();
        // panelLabelNumeroTelefono.setBackground(new Color(0, 0, 51));
        // JLabel labelNumeroTelefono = new JLabel("Número de teléfono: ");
        // labelNumeroTelefono.setForeground(Color.WHITE);
        // panelLabelNumeroTelefono.add(labelNumeroTelefono);

        // // texto número de teléfono

        // JPanel panelTextoNumeroTelefono = new JPanel(); 
        // panelTextoNumeroTelefono.setBackground(new Color(0, 0, 51));
        // JPasswordField textoNumeroTelefono = new JPasswordField();
        // textoNumeroTelefono.setPreferredSize(new Dimension(150, 25));
        // panelTextoNumeroTelefono.add(textoNumeroTelefono);

        // panelArriba.add(panelLabelNumeroTelefono);
        // panelArriba.add(panelTextoNumeroTelefono);

        // // botón editar4

        // JPanel panelBotonEditar4 = new JPanel();
        // panelBotonEditar4.setBackground(new Color(0, 0, 51));
        // JButton botonEditar4 = new JButton("Editar");
        // botonEditar4.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        // botonEditar4.setBackground(Color.DARK_GRAY);
        // botonEditar4.setForeground(Color.WHITE);
        // botonEditar4.setPreferredSize(new Dimension(100, 20));
        // panelBotonEditar2.add(botonEditar4);
        
        // panelArriba.add(panelBotonEditar4);

        // botón volver

        JPanel panelBotonVolver = new JPanel();
        panelBotonVolver.setBackground(new Color(0, 0, 51));
        JButton botonVolver = new JButton("Volver");
        botonVolver.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        botonVolver.setBackground(Color.DARK_GRAY);
        botonVolver.setForeground(Color.WHITE);
        botonVolver.setPreferredSize(new Dimension(140, 30));
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
        panel.add(panelAbajo, BorderLayout. SOUTH);

        contentPane.setVisible(true);
        panel.setVisible(true);
    }

    public static void main(String[] args) throws IOException {
		new VentanaPerfil();
	}
}