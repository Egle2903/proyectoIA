package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToggleButton;

public class modificar_articulo extends JFrame {
	
	int obtenerIndiceComboArticulo() {
		return cboArticulo.getSelectedIndex() ;
		}
	
		void editarCajas(boolean opcion) {
			txtPrecio.setEnabled(opcion);
			txtFondo.setEnabled(opcion);
			txtAncho.setEnabled(opcion);
			txtAlto.setEnabled(opcion);
			txtStock.setEnabled(opcion);
		}
		
		
		void obtenerDatosArticulos() {
			editarCajas(true);
			if (obtenerIndiceComboArticulo() == 0) {
				txtPrecio.setText(Double.toString(ventas_menu.precio0));
				txtFondo.setText(Double.toString(ventas_menu.fondo0));
				txtAncho.setText(Double.toString(ventas_menu.ancho0));
				txtAlto.setText(Double.toString(ventas_menu.alto0));
				txtStock.setText(Integer.toString(ventas_menu.stock0));
			}
			
			if (obtenerIndiceComboArticulo() == 1) {
				txtPrecio.setText(Double.toString(ventas_menu.precio1));
				txtFondo.setText(Double.toString(ventas_menu.fondo1));
				txtAncho.setText(Double.toString(ventas_menu.ancho1));
				txtAlto.setText(Double.toString(ventas_menu.alto1));
				txtStock.setText(Integer.toString(ventas_menu.stock1));
			}
			
			if (obtenerIndiceComboArticulo() == 2) {
				txtPrecio.setText(Double.toString(ventas_menu.precio2));
				txtFondo.setText(Double.toString(ventas_menu.fondo2));
				txtAncho.setText(Double.toString(ventas_menu.ancho2));
				txtAlto.setText(Double.toString(ventas_menu.alto2));
				txtStock.setText(Integer.toString(ventas_menu.stock2));
			}
			
			if (obtenerIndiceComboArticulo() == 3) {
				txtPrecio.setText(Double.toString(ventas_menu.precio3));
				txtFondo.setText(Double.toString(ventas_menu.fondo3));
				txtAncho.setText(Double.toString(ventas_menu.ancho3));
				txtAlto.setText(Double.toString(ventas_menu.alto3));
				txtStock.setText(Integer.toString(ventas_menu.stock3));
			}
			
			if (obtenerIndiceComboArticulo() == 4) {
				txtPrecio.setText(Double.toString(ventas_menu.precio4));
				txtFondo.setText(Double.toString(ventas_menu.fondo4));
				txtAncho.setText(Double.toString(ventas_menu.ancho4));
				txtAlto.setText(Double.toString(ventas_menu.alto4));
				txtStock.setText(Integer.toString(ventas_menu.stock4));
			}
			
			if (obtenerIndiceComboArticulo() == 5) {
				txtPrecio.setText(Double.toString(ventas_menu.precio5));
				txtFondo.setText(Double.toString(ventas_menu.fondo5));
				txtAncho.setText(Double.toString(ventas_menu.ancho5));
				txtAlto.setText(Double.toString(ventas_menu.alto5));
				txtStock.setText(Integer.toString(ventas_menu.stock5));
			}
			
			if (obtenerIndiceComboArticulo() == 6) {
				txtPrecio.setText(Double.toString(ventas_menu.precio6));
				txtFondo.setText(Double.toString(ventas_menu.fondo6));
				txtAncho.setText(Double.toString(ventas_menu.ancho6));
				txtAlto.setText(Double.toString(ventas_menu.alto6));
				txtStock.setText(Integer.toString(ventas_menu.stock6));
			}
			
			if (obtenerIndiceComboArticulo() == 7) {
				txtPrecio.setText(Double.toString(ventas_menu.precio7));
				txtFondo.setText(Double.toString(ventas_menu.fondo7));
				txtAncho.setText(Double.toString(ventas_menu.ancho7));
				txtAlto.setText(Double.toString(ventas_menu.alto7));
				txtStock.setText(Integer.toString(ventas_menu.stock7));
			}
			
		}

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrecio;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtStock;
	private JTextField txtAncho;
	private JComboBox cboArticulo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modificar_articulo frame = new modificar_articulo();
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
	public modificar_articulo() {
		setTitle("MODIFICAR ARTICULO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 718, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MODIFICAR ARTICULO:");
		lblNewLabel.setBounds(5, 5, 144, 23);
		lblNewLabel.setFont(new Font("Lucida Console", Font.BOLD, 12));
		contentPane.add(lblNewLabel);
		
		JLabel lblArticulo = new JLabel("Articulo");
		lblArticulo.setBounds(5, 37, 88, 13);
		lblArticulo.setFont(new Font("Lucida Console", Font.BOLD, 12));
		contentPane.add(lblArticulo);
		
		cboArticulo = new JComboBox();
		cboArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				obtenerDatosArticulos();
			}
		});
		cboArticulo.setModel(new DefaultComboBoxModel(new String[] {"Laptop Lenovo IdeaPad 5", "Smartphone Samsung Galaxy S23", "Monitor LG UltraGear 27GN800-B", "Tablet Apple iPad 9a Gen (2022)", "Impresora Multifunción HP DeskJet Ink Advantage", "Consola de videojuegos\tPlayStation 5 Standard", "Smartwatch  Apple Watch Series 9", "Auriculares Diadema\t Sony WH-1000XM5"}));
		cboArticulo.setBounds(98, 33, 343, 21);
		cboArticulo.setFont(new Font("Lucida Console", Font.BOLD, 12));
		contentPane.add(cboArticulo);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(481, 33, 85, 21);
		btnCerrar.setFont(new Font("Lucida Console", Font.BOLD, 12));
		contentPane.add(btnCerrar);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(5, 63, 88, 13);
		lblPrecio.setFont(new Font("Lucida Console", Font.BOLD, 12));
		contentPane.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(98, 59, 343, 19);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JButton btnGrabar = new JButton("Guardar");
		btnGrabar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				if (obtenerIndiceComboArticulo ()==0) {
					ventas_menu.precio0 = Double.parseDouble(txtPrecio.getText());
					ventas_menu.fondo0 = Double.parseDouble(txtFondo.getText());
					ventas_menu.alto0 = Double.parseDouble(txtAncho.getText());
					ventas_menu.ancho0 = Double.parseDouble(txtAlto.getText());
					ventas_menu.stock0 = Integer.parseInt(txtStock.getText());
					
				}
				
				if (obtenerIndiceComboArticulo ()==1) {
					ventas_menu.precio1 = Double.parseDouble(txtPrecio.getText());
					ventas_menu.fondo1 = Double.parseDouble(txtFondo.getText());
					ventas_menu.alto1 = Double.parseDouble(txtAncho.getText());
					ventas_menu.ancho1 = Double.parseDouble(txtAlto.getText());
					ventas_menu.stock1 = Integer.parseInt(txtStock.getText());
				}
				
				if (obtenerIndiceComboArticulo ()==2) {
					ventas_menu.precio2 = Double.parseDouble(txtPrecio.getText());
					ventas_menu.fondo2 = Double.parseDouble(txtFondo.getText());
					ventas_menu.alto2 = Double.parseDouble(txtAncho.getText());
					ventas_menu.ancho2 = Double.parseDouble(txtAlto.getText());
					ventas_menu.stock2 = Integer.parseInt(txtStock.getText());
				}
				
				if (obtenerIndiceComboArticulo ()==3) {
					ventas_menu.precio3 = Double.parseDouble(txtPrecio.getText());
					ventas_menu.fondo3 = Double.parseDouble(txtFondo.getText());
					ventas_menu.alto3 = Double.parseDouble(txtAncho.getText());
					ventas_menu.ancho3 = Double.parseDouble(txtAlto.getText());
					ventas_menu.stock3 = Integer.parseInt(txtStock.getText());
				}
				
				if (obtenerIndiceComboArticulo ()==4) {
					ventas_menu.precio4 = Double.parseDouble(txtPrecio.getText());
					ventas_menu.fondo4 = Double.parseDouble(txtFondo.getText());
					ventas_menu.alto4 = Double.parseDouble(txtAncho.getText());
					ventas_menu.ancho4 = Double.parseDouble(txtAlto.getText());
					ventas_menu.stock4 = Integer.parseInt(txtStock.getText());
				}
				if (obtenerIndiceComboArticulo ()==5) {
					ventas_menu.precio5 = Double.parseDouble(txtPrecio.getText());
					ventas_menu.fondo5 = Double.parseDouble(txtFondo.getText());
					ventas_menu.alto5 = Double.parseDouble(txtAncho.getText());
					ventas_menu.ancho5 = Double.parseDouble(txtAlto.getText());
					ventas_menu.stock5 = Integer.parseInt(txtStock.getText());
	
				}
				if (obtenerIndiceComboArticulo ()==6) {
					ventas_menu.precio6 = Double.parseDouble(txtPrecio.getText());
					ventas_menu.fondo6 = Double.parseDouble(txtFondo.getText());
					ventas_menu.alto6 = Double.parseDouble(txtAncho.getText());
					ventas_menu.ancho6 = Double.parseDouble(txtAlto.getText());
					ventas_menu.stock6 = Integer.parseInt(txtStock.getText());
	
				}
				if (obtenerIndiceComboArticulo ()==7) {
					ventas_menu.precio7 = Double.parseDouble(txtPrecio.getText());
					ventas_menu.fondo7 = Double.parseDouble(txtFondo.getText());
					ventas_menu.alto7 = Double.parseDouble(txtAncho.getText());
					ventas_menu.ancho7 = Double.parseDouble(txtAlto.getText());
					ventas_menu.stock7 = Integer.parseInt(txtStock.getText());
	
				}
				
				editarCajas(false);
			}
		});
		btnGrabar.setBounds(481, 59, 85, 21);
		btnGrabar.setFont(new Font("Lucida Console", Font.BOLD, 12));
		contentPane.add(btnGrabar);
		
		JLabel lblAncho = new JLabel("Ancho");
		lblAncho.setBounds(5, 86, 83, 13);
		lblAncho.setFont(new Font("Lucida Console", Font.BOLD, 12));
		contentPane.add(lblAncho);
		
		txtAncho = new JTextField();
		txtAncho.setBounds(98, 85, 343, 19);
		contentPane.add(txtAncho);
		txtAncho.setColumns(10);
		
		JLabel lblAlto = new JLabel("Alto");
		lblAlto.setBounds(5, 112, 64, 13);
		lblAlto.setFont(new Font("Lucida Console", Font.BOLD, 12));
		contentPane.add(lblAlto);
		
		txtAlto = new JTextField();
		txtAlto.setBounds(98, 109, 343, 19);
		contentPane.add(txtAlto);
		txtAlto.setColumns(10);
		
		JLabel lblFondo = new JLabel("Fondo");
		lblFondo.setBounds(5, 136, 38, 13);
		lblFondo.setFont(new Font("Lucida Console", Font.BOLD, 12));
		contentPane.add(lblFondo);
		
		txtFondo = new JTextField();
		txtFondo.setBounds(98, 133, 343, 19);
		contentPane.add(txtFondo);
		txtFondo.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Stock");
		lblNewLabel_6.setBounds(5, 160, 38, 13);
		lblNewLabel_6.setFont(new Font("Lucida Console", Font.BOLD, 12));
		contentPane.add(lblNewLabel_6);
		
		txtStock = new JTextField();
		txtStock.setBounds(98, 157, 343, 19);
		contentPane.add(txtStock);
		txtStock.setColumns(10);
	}
}
