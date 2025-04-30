package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SpringLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class consultar_articulo extends JFrame {
	
	int obtenerIndiceComboArticulo() {
	return cboArticulo.getSelectedIndex() ;
	}
	
	void obtenerDatosArticulos() {
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
	private JTextField txtStock;
	private JTextField txtFondo;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JComboBox cboArticulo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					consultar_articulo frame = new consultar_articulo();
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
	public consultar_articulo() {
		setTitle("CONSULTAR ARTICULO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 615, 293);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{84, 359, 45, 85, 0};
		gbl_contentPane.rowHeights = new int[]{27, 21, 20, 19, 19, 19, 19, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel(" Consultar Articulo:");
		lblNewLabel.setFont(new Font("Lucida Console", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblArticulo = new JLabel("Articulo");
		lblArticulo.setFont(new Font("Lucida Console", Font.BOLD, 12));
		GridBagConstraints gbc_lblArticulo = new GridBagConstraints();
		gbc_lblArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblArticulo.gridx = 0;
		gbc_lblArticulo.gridy = 1;
		contentPane.add(lblArticulo, gbc_lblArticulo);
		
		cboArticulo = new JComboBox();
		cboArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				obtenerDatosArticulos();
			}
		});
		cboArticulo.setFont(new Font("Lucida Console", Font.BOLD, 12));
		cboArticulo.setModel(new DefaultComboBoxModel(new String[] {"Laptop Lenovo IdeaPad 5", "Smartphone Samsung Galaxy S23", "Monitor LG UltraGear 27GN800-B", "Tablet Apple iPad 9a Gen (2022)", "Impresora Multifunción HP DeskJet Ink Advantage", "Consola de videojuegos\tPlayStation 5 Standard", "Smartwatch  Apple Watch Series 9", "Auriculares Diadema\t Sony WH-1000XM5"}));
		GridBagConstraints gbc_cboArticulo = new GridBagConstraints();
		gbc_cboArticulo.fill = GridBagConstraints.BOTH;
		gbc_cboArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_cboArticulo.gridx = 1;
		gbc_cboArticulo.gridy = 1;
		contentPane.add(cboArticulo, gbc_cboArticulo);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setFont(new Font("Lucida Console", Font.BOLD, 12));
		GridBagConstraints gbc_btnCerrar = new GridBagConstraints();
		gbc_btnCerrar.anchor = GridBagConstraints.NORTH;
		gbc_btnCerrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCerrar.insets = new Insets(0, 0, 5, 0);
		gbc_btnCerrar.gridx = 3;
		gbc_btnCerrar.gridy = 1;
		contentPane.add(btnCerrar, gbc_btnCerrar);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Lucida Console", Font.BOLD, 12));
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.NORTH;
		gbc_lblPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 0;
		gbc_lblPrecio.gridy = 2;
		contentPane.add(lblPrecio, gbc_lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Lucida Console", Font.BOLD, 12));
		txtPrecio.setEnabled(false);
		txtPrecio.setColumns(10);
		GridBagConstraints gbc_txtPrecio = new GridBagConstraints();
		gbc_txtPrecio.anchor = GridBagConstraints.SOUTH;
		gbc_txtPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecio.gridx = 1;
		gbc_txtPrecio.gridy = 2;
		contentPane.add(txtPrecio, gbc_txtPrecio);
		
		JLabel lblFondo = new JLabel("Fondo");
		lblFondo.setFont(new Font("Lucida Console", Font.BOLD, 12));
		GridBagConstraints gbc_lblFondo = new GridBagConstraints();
		gbc_lblFondo.anchor = GridBagConstraints.WEST;
		gbc_lblFondo.insets = new Insets(0, 0, 5, 5);
		gbc_lblFondo.gridx = 0;
		gbc_lblFondo.gridy = 3;
		contentPane.add(lblFondo, gbc_lblFondo);
		
		txtFondo = new JTextField();
		txtFondo.setFont(new Font("Lucida Console", Font.BOLD, 12));
		txtFondo.setEnabled(false);
		txtFondo.setColumns(10);
		GridBagConstraints gbc_txtFondo = new GridBagConstraints();
		gbc_txtFondo.anchor = GridBagConstraints.NORTH;
		gbc_txtFondo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFondo.insets = new Insets(0, 0, 5, 5);
		gbc_txtFondo.gridx = 1;
		gbc_txtFondo.gridy = 3;
		contentPane.add(txtFondo, gbc_txtFondo);
		
		JLabel lblAncho = new JLabel("Ancho");
		lblAncho.setFont(new Font("Lucida Console", Font.BOLD, 12));
		GridBagConstraints gbc_lblAncho = new GridBagConstraints();
		gbc_lblAncho.anchor = GridBagConstraints.WEST;
		gbc_lblAncho.insets = new Insets(0, 0, 5, 5);
		gbc_lblAncho.gridx = 0;
		gbc_lblAncho.gridy = 4;
		contentPane.add(lblAncho, gbc_lblAncho);
		
		txtAncho = new JTextField();
		txtAncho.setFont(new Font("Lucida Console", Font.BOLD, 12));
		txtAncho.setEnabled(false);
		txtAncho.setColumns(10);
		GridBagConstraints gbc_txtAncho = new GridBagConstraints();
		gbc_txtAncho.anchor = GridBagConstraints.NORTH;
		gbc_txtAncho.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAncho.insets = new Insets(0, 0, 5, 5);
		gbc_txtAncho.gridx = 1;
		gbc_txtAncho.gridy = 4;
		contentPane.add(txtAncho, gbc_txtAncho);
		
		JLabel lblAlto = new JLabel("Alto");
		lblAlto.setFont(new Font("Lucida Console", Font.BOLD, 12));
		GridBagConstraints gbc_lblAlto = new GridBagConstraints();
		gbc_lblAlto.anchor = GridBagConstraints.WEST;
		gbc_lblAlto.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlto.gridx = 0;
		gbc_lblAlto.gridy = 5;
		contentPane.add(lblAlto, gbc_lblAlto);
		
		txtAlto = new JTextField();
		txtAlto.setFont(new Font("Lucida Console", Font.BOLD, 12));
		txtAlto.setEnabled(false);
		txtAlto.setColumns(10);
		GridBagConstraints gbc_txtAlto = new GridBagConstraints();
		gbc_txtAlto.anchor = GridBagConstraints.NORTH;
		gbc_txtAlto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAlto.insets = new Insets(0, 0, 5, 5);
		gbc_txtAlto.gridx = 1;
		gbc_txtAlto.gridy = 5;
		contentPane.add(txtAlto, gbc_txtAlto);
		
		JLabel lblStock = new JLabel("Stock");
		lblStock.setFont(new Font("Lucida Console", Font.BOLD, 12));
		GridBagConstraints gbc_lblStock = new GridBagConstraints();
		gbc_lblStock.anchor = GridBagConstraints.WEST;
		gbc_lblStock.insets = new Insets(0, 0, 0, 5);
		gbc_lblStock.gridx = 0;
		gbc_lblStock.gridy = 6;
		contentPane.add(lblStock, gbc_lblStock);
		
		txtStock = new JTextField();
		txtStock.setFont(new Font("Lucida Console", Font.BOLD, 12));
		txtStock.setEnabled(false);
		txtStock.setColumns(10);
		GridBagConstraints gbc_txtStock = new GridBagConstraints();
		gbc_txtStock.anchor = GridBagConstraints.NORTH;
		gbc_txtStock.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtStock.insets = new Insets(0, 0, 0, 5);
		gbc_txtStock.gridx = 1;
		gbc_txtStock.gridy = 6;
		contentPane.add(txtStock, gbc_txtStock);
	}
}
