package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.GestionPais;
import modelo.Pais;


public class vtnPais extends JInternalFrame implements ActionListener {

	private GestionPais gp;
	private Pais pais;

	private JTextField nombrePa;
	private JTextField presi;
	private JTextField idio;
	
	private JTextField nombrePro;
	private JTextField numHab;
	private JTextField altu;
	
	private JTextField nomCan;
	private JTextField nomAlc;

	

	

	public  vtnPais(GestionPais gp) {

		this.gp = gp;
		initComponents();
		// TODO Auto-generated constructor stub
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		setSize(500, 400);
		setTitle("Gestion Pais");
		setClosable(true);
		setResizable(true);

		getContentPane().setLayout(new FlowLayout());

		JPanel datosPais = new JPanel();
		datosPais.setBorder(BorderFactory.createTitledBorder("Datos del Pais"));
		datosPais.setLayout(new GridLayout(3, 2));
		datosPais.add(new JLabel("Nombre del Pais: "));
		datosPais.add(nombrePa = new JTextField(8));
		datosPais.add(new JLabel("Nombre del Presidente: "));
		datosPais.add(presi = new JTextField(8));
		datosPais.add(new JLabel("Idioma: "));
		datosPais.add(idio = new JTextField(8));
		
		
		
		JPanel datosProvincia= new JPanel();
		datosProvincia.setBorder(BorderFactory.createTitledBorder("Datos de la Provincia"));
		datosProvincia.setLayout(new GridLayout(3, 2));
		datosProvincia.add(new JLabel("Nombre : "));
		datosProvincia.add(nombrePro = new JTextField(8));
		datosProvincia.add(new JLabel("Numero de habitantes: "));
		datosProvincia.add(numHab = new JTextField(8));
		datosProvincia.add(new JLabel("Altura: "));
		datosProvincia.add(altu = new JTextField(8));
		
		JPanel datosCanton = new JPanel();
		datosCanton.setBorder(BorderFactory.createTitledBorder("Datos del Canton"));
		datosCanton.setLayout(new GridLayout(3, 2));
		datosCanton.add(new JLabel("Nombre: "));
		datosCanton.add(nomCan = new JTextField(8));
		datosCanton.add(new JLabel("Alcalde: "));
		datosCanton.add(nomAlc = new JTextField(8));
		

		JPanel botones = new JPanel();
		botones.setLayout(new FlowLayout());
		JButton btnGuardar = (new JButton("Guardar"));
		btnGuardar.setActionCommand("btnGuardar");
		btnGuardar.addActionListener(this);
		botones.add(btnGuardar);

		// cargadatos.add(new constraints);

		Container cp = getContentPane();
		cp.add(datosPais, BorderLayout.NORTH);
		cp.add(datosProvincia, BorderLayout.CENTER);
		cp.add(datosCanton,BorderLayout.SOUTH);
		cp.add(botones, BorderLayout.EAST);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comando = e.getActionCommand();
		switch (comando) {
		case "btnGuardar":
			//guardarDatosRevista();
			break;

		default:
			break;
		}

	}

	/*public void guardarDatosPais() {
		// TODO Auto-generated method stub
		String nombre = nom.getText();
		System.out.println(nombre);
		String idioma = idi.getText();
		System.out.println(idioma);
		String titulo=titu.getText();
		String pagInicio= pgi.getText();
		String pagFinal=pgf.getText();
		String nombreA=nomAut.getText();
		String nacionalidad=naci.getText();
		String fecNac=fnac.getText();
		

		try {
			if(gr.validadTextosVacios(nombre, idioma, titulo, pagInicio, pagFinal, nombreA, nacionalidad, fecNac)){
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
			fnac.setText("");}
			else{
				JOptionPane.showMessageDialog(this, "Algunos campos de texto se encuentran vacios", "Mensaje de información",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	
	
*/
}
