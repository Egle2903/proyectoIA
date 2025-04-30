package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class listar_articulos extends JFrame {
	
	void imprimir() {
		txtS.setText("");
		txtS.append("----------------------------------\n");
		txtS.append("Listado General de Articulos de la tienda: \n");
		txtS.append("\n");
		
		txtS.append("Primer Articulo  : \n\n");
		txtS.append("Articulo         :     " + ventas_menu.articulo0 + "\n");
		txtS.append("Precio           :     " + ventas_menu.precio0 + "\n");
		txtS.append("Fondo            :     " + ventas_menu.fondo0 + "\n");
		txtS.append("Ancho            :     " + ventas_menu.ancho0 + "\n");
		txtS.append("Alto             :     " + ventas_menu.alto0 + "\n");
		txtS.append("Stock            :     " + ventas_menu.stock0 + "\n\n");
		
		txtS.append("Segundo Articulo : \n\n");
		txtS.append("Articulo         :     " + ventas_menu.articulo1 + "\n");
		txtS.append("Precio           :     " + ventas_menu.precio1 + "\n");
		txtS.append("Fondo            :     " + ventas_menu.fondo1 + "\n");
		txtS.append("Ancho            :     " + ventas_menu.ancho1 + "\n");
		txtS.append("Alto             :     " + ventas_menu.alto1 + "\n");
		txtS.append("Stock            :     " + ventas_menu.stock1 + "\n\n");
		
		
		txtS.append("Tercer Articulo  : \n\n");
		txtS.append("Articulo         :     " + ventas_menu.articulo2 + "\n");
		txtS.append("Precio           :     " + ventas_menu.precio2 + "\n");
		txtS.append("Fondo            :     " + ventas_menu.fondo2 + "\n");
		txtS.append("Ancho            :     " + ventas_menu.ancho2 + "\n");
		txtS.append("Alto             :     " + ventas_menu.alto2 + "\n");
		txtS.append("Stock            :     " + ventas_menu.stock2 + "\n\n");
		
		txtS.append("Cuarto Articulo  : \n\n");
		txtS.append("Articulo         :     " + ventas_menu.articulo3 + "\n");
		txtS.append("Precio           :     " + ventas_menu.precio3 + "\n");
		txtS.append("Fondo            :     " + ventas_menu.fondo3 + "\n");
		txtS.append("Ancho            :     " + ventas_menu.ancho3 + "\n");
		txtS.append("Alto             :     " + ventas_menu.alto3 + "\n");
		txtS.append("Stock            :     " + ventas_menu.stock3 + "\n\n");
		
		txtS.append("Quinto Articulo  : \n\n");
		txtS.append("Articulo         :     " + ventas_menu.articulo4 + "\n");
		txtS.append("Precio           :     " + ventas_menu.precio4 + "\n");
		txtS.append("Fondo            :     " + ventas_menu.fondo4 + "\n");
		txtS.append("Ancho            :     " + ventas_menu.ancho4 + "\n");
		txtS.append("Alto             :     " + ventas_menu.alto4 + "\n");
		txtS.append("Stock            :     " + ventas_menu.stock4 + "\n\n");
		
		txtS.append("Sexto Articulo   : \n\n");
		txtS.append("Articulo         :     " + ventas_menu.articulo5 + "\n");
		txtS.append("Precio           :     " + ventas_menu.precio5 + "\n");
		txtS.append("Fondo            :     " + ventas_menu.fondo5 + "\n");
		txtS.append("Ancho            :     " + ventas_menu.ancho5 + "\n");
		txtS.append("Alto             :     " + ventas_menu.alto5 + "\n");
		txtS.append("Stock            :     " + ventas_menu.stock5 + "\n\n");
		
		txtS.append("Séptimo Articulo : \n\n");
		txtS.append("Articulo         :     " + ventas_menu.articulo6 + "\n");
		txtS.append("Precio           :     " + ventas_menu.precio6 + "\n");
		txtS.append("Fondo            :     " + ventas_menu.fondo6 + "\n");
		txtS.append("Ancho            :     " + ventas_menu.ancho6 + "\n");
		txtS.append("Alto             :     " + ventas_menu.alto6 + "\n");
		txtS.append("Stock            :     " + ventas_menu.stock6 + "\n\n");
		
		txtS.append("Octavo Articulo  : \n\n");
		txtS.append("Articulo         :     " + ventas_menu.articulo7 + "\n");
		txtS.append("Precio           :     " + ventas_menu.precio7 + "\n");
		txtS.append("Fondo            :     " + ventas_menu.fondo7 + "\n");
		txtS.append("Ancho            :     " + ventas_menu.ancho7 + "\n");
		txtS.append("Alto             :     " + ventas_menu.alto7 + "\n");
		txtS.append("Stock            :     " + ventas_menu.stock7 + "\n\n");
	}

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea txtS;
	private JButton btnCerrar;
	private JButton btnListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listar_articulos frame = new listar_articulos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public listar_articulos() {
		setTitle("LISTADO DE ARTICULOS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 768, 647);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Listar Articulos");
		lblNewLabel.setFont(new Font("Lucida Console", Font.BOLD, 12));
		lblNewLabel.setBounds(24, 26, 193, 30);
		contentPane.add(lblNewLabel);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Lucida Console", Font.BOLD, 12));
		txtS.setBounds(10, 72, 734, 510);
		contentPane.add(txtS);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Lucida Console", Font.BOLD, 12));
		btnCerrar.setBounds(163, 589, 85, 21);
		contentPane.add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnListar.setFont(new Font("Lucida Console", Font.BOLD, 12));
		btnListar.setBounds(500, 592, 85, 21);
		contentPane.add(btnListar);
	}
}
