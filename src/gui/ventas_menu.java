package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventas_menu extends JFrame {
	
	//Nuestra Base de Datos 
	
	//Datos mínimos de nuestro primer artículo 
	
	//Primer Articulo 
	public static String articulo0 = "Laptop Lenovo IdeaPad 5";
	public static double precio0 = 2500;
	public static double fondo0  = 22.0;
	public static double ancho0  = 35.0;
	public static double alto0   = 2.0;
	public static int stock0     = 120;
	
	
	//Segundo Articulo 
	public static String articulo1 = "Smartphone Samsung Galaxy S23";
	public static double precio1     = 3500;
	public static double fondo1      = 0.8;
	public static double ancho1      = 7.6;
	public static double alto1       = 15.8;
	public static int stock1         = 68;
	
	//Tercer Articulo 
	public static String articulo2 = "Monitor LG UltraGear 27GN800-B";
	public static double precio2  = 1500;
	public static double fondo2   = 23.0;
	public static double ancho2   = 61.4;
	public static double alto2    = 45.4;
	public static int stock2      = 98;
	
	
	//Cuarto Articulo 
	public static String articulo3 = "Tablet Apple iPad 9a Gen (2022)";
	public static double precio3 = 2000;
	public static double fondo3  = 0.7;
	public static double ancho3  = 17.4;
	public static double alto3   = 25.0;
	public static int stock3     = 82;
	
	//Quinto Articulo 
	public static String articulo4 = "Impresora Multifunción HP DeskJet Ink Advantage";
	public static double precio4                = 600;
	public static double fondo4					= 34.0;
	public static double ancho4					= 42.0;
	public static double alto4					= 15.0;
	public static int stock4 					= 74;
	
	
	//Sexto Articulo 
	public static String articulo5 = "Smartwatch Apple Watch Series 9";
	public static double precio5                = 2000;
	public static double fondo5					= 1.3;
	public static double ancho5					= 4.1;
	public static double alto5					= 4.5;
	public static int stock5 					= 74;

		
	//Septimo Articulo 
	public static String articulo6 = "Consola De Videojuegos PlayStation 5 Standard";
	public static double precio6                = 3200;
	public static double fondo6					= 26.0;
	public static double ancho6				    = 39.0;
	public static double alto6					= 10.4;
	public static int stock6					= 74;
	
		
	//Octavo Articulo 
	public static String articulo7 = "Auriculares Diadema Sony WH-1000XM5";
	public static double precio7                = 1500;
	public static double fondo7					= 8.0;
	public static double ancho7					= 21.0;
	public static double alto7					= 26.0;
	public static int stock7 					= 74;
	
	
	public static String[] misArticulos = {articulo0, articulo1, articulo2,
			articulo3, articulo4 , articulo5,articulo6,articulo7  };
	
	//Porcentajes de descuento
	public static double porcentaje0 = 0.10;
	public static double porcentaje1 = 0.12;
	public static double porcentaje2 = 0.15;
	public static double porcentaje3 = 0.08;
	public static double porcentaje4 = 0.1;
	public static double porcentaje5 = 0.1;
	public static double porcentaje6 = 0.5;
	public static double porcentaje7 = 0.7;
	
	
	//Obsequios 
	public static String obsequio0 = "Mouse inalámbrico";
	public static String obsequio1 = "Audífonos Bluetooth";
	public static String obsequio2 = "Base ajustable";
	public static String obsequio3 = "Funda protectora";
	public static String obsequio4 = "cartuchos extra";
	public static String obsequio5 = "Correa extra";
	public static String obsequio6 = "Un juego gratuito";
	public static String obsequio7 = "Estuche rígido";
			
	
	

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventas_menu frame = new ventas_menu();
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
	public ventas_menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 992, 725);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Cierra el formulario pincipal y las demas ventanas
				System.exit(0);;
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Mantenimiento");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Consultar Articulo");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				consultar_articulo ca = new consultar_articulo();
				ca.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Modificar Artículo");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				modificar_articulo ma = new modificar_articulo();
				ma.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Listar Artículos");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				listar_articulos la = new listar_articulos();
				la.setVisible(true);
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_2 = new JMenu(" Ventas");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Vender");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventas v = new ventas();
				v.setVisible(true);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Generar reporte");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				generar_reportes gr = new generar_reportes();
				gr.setVisible(true);
				
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_3 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Acerca de la Tienda");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				acerca_de_la_tienda at = new acerca_de_la_tienda();
				at.setVisible(true);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_6);
		getContentPane().setLayout(null);
	}
}
