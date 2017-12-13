package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.GestionRevista;
import modelo.Revista;

public class vtnRevista extends JInternalFrame implements ActionListener {
	private GestionRevista gr;
	private Revista revista;

	private JTextField nom;
	private JTextField idi;

	private JTextField pgf;
	private JTextField pgi;
	private JTextField titu;

	private JTextField fnac;
	private JTextField naci;
	private JTextField nomAut;

	public vtnRevista(GestionRevista gr) {

		this.gr = gr;
		initComponents();
		// TODO Auto-generated constructor stub
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		setSize(500, 400);
		setTitle("Gestion Revista");
		setClosable(true);
		setResizable(true);

		getContentPane().setLayout(new FlowLayout());

		JPanel datosRevista = new JPanel();
		datosRevista.setBorder(BorderFactory.createTitledBorder("Datos de la Revista"));
		datosRevista.setLayout(new GridLayout(3, 2));
		datosRevista.add(new JLabel("Nombre de la Revista: "));
		datosRevista.add(nom = new JTextField(8));
		datosRevista.add(new JLabel("Idioma de la Revista: "));
		datosRevista.add(idi = new JTextField(8));

		JPanel datosArticulo = new JPanel();
		datosArticulo.setBorder(BorderFactory.createTitledBorder("Datos del articulo"));
		datosArticulo.setLayout(new GridLayout(3, 2));
		datosArticulo.add(new JLabel("Titulo: "));
		datosArticulo.add(titu = new JTextField(8));
		datosArticulo.add(new JLabel("Pagina de inicio: "));
		datosArticulo.add(pgi = new JTextField(8));
		datosArticulo.add(new JLabel("Pagina final: "));
		datosArticulo.add(pgf = new JTextField(8));

		JPanel datosAutor = new JPanel();
		datosAutor.setBorder(BorderFactory.createTitledBorder("Datos del Autor"));
		datosAutor.setLayout(new GridLayout(3, 2));
		datosAutor.add(new JLabel("Nombre: "));
		datosAutor.add(nomAut = new JTextField(8));
		datosAutor.add(new JLabel("Naconalidad: "));
		datosAutor.add(naci = new JTextField(8));
		datosAutor.add(new JLabel("Fecha de Nacimiento: "));
		datosAutor.add(fnac = new JTextField(8));

		JPanel botones = new JPanel();
		botones.setLayout(new FlowLayout());
		JButton btnGuardar = (new JButton("Guardar"));
		btnGuardar.setActionCommand("btnGuardar");
		btnGuardar.addActionListener(this);
		botones.add(btnGuardar);

		// cargadatos.add(new constraints);

		Container cp = getContentPane();
		cp.add(datosRevista, BorderLayout.NORTH);
		cp.add(datosArticulo, BorderLayout.CENTER);
		cp.add(datosAutor, BorderLayout.SOUTH);
		cp.add(botones, BorderLayout.EAST);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comando = e.getActionCommand();
		switch (comando) {
		case "btnGuardar":
			guardarDatosRevista();
			break;

		default:
			break;
		}

	}

	public void guardarDatosRevista() {
		// TODO Auto-generated method stub
		String nombre = nom.getText();
		System.out.println(nombre);
		String idioma = idi.getText();
		System.out.println(idioma);
		String titulo = titu.getText();
		String pagInicio = pgi.getText();
		String pagFinal = pgf.getText();
		String nombreA = nomAut.getText();
		String nacionalidad = naci.getText();
		String fecNac = fnac.getText();

		try {
			if (gr.validadTextosVacios(nombre, idioma, titulo, pagInicio, pagFinal, nombreA, nacionalidad, fecNac)) {
				if (gr.validarRepeticion(nombre, titulo, nombreA)) {
					gr.agregarRevista(nombre, idioma, titulo, pagInicio, pagFinal, nombreA, nacionalidad, fecNac);
					JOptionPane.showMessageDialog(this, "Revista registrada", "Mensaje de información",
							JOptionPane.INFORMATION_MESSAGE);

					nom.setText("");
					idi.setText("");
					titu.setText("");
					pgi.setText("");
					pgf.setText("");
					nomAut.setText("");
					naci.setText("");
					fnac.setText("");
				} else{
					JOptionPane.showMessageDialog(this, "Datos repetidos ",
							"Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
				}
			}else {
					JOptionPane.showMessageDialog(this, "Algunos campos de texto se encuentran vacios",
							"Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
