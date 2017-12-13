package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
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

import controlador.GestionRevista;

public class vtnRevista extends JInternalFrame implements ActionListener{
	
	private JTextField nom;
	private JTextField idi;
	private JTextField num;
	
	private JTextField pgf;
	private JTextField pgi;
	private JTextField titu;
	
	private JTextField fnac;
	private JTextField naci;
	private JTextField nomAut;
	
	private GestionRevista gr;
	
	public  vtnRevista(GestionRevista gr) {
		super();
		this.gr=gr;
		initComponents();
		// TODO Auto-generated constructor stub
	}
	

	private void initComponents() {
		// TODO Auto-generated method stub
		 setSize(500,400);
		 setTitle("Gestion Revista");
		 setClosable(true);
		 setResizable(true);
		 
		 getContentPane().setLayout(new FlowLayout());
		 
		 JPanel datosRevista = new JPanel();
		 datosRevista.setBorder(BorderFactory.createTitledBorder("Datos de la Revista"));
		 datosRevista.setLayout(new GridLayout(3,2));
		 datosRevista.add(new JLabel("Nombre de la Revista: "));
		 datosRevista.add(nom=new JTextField(8));
		 datosRevista.add(new JLabel("Idioma de la Revista: "));
		 datosRevista.add(idi=new JTextField(8));
		 datosRevista.add(new JLabel("Numero de pagina: "));
		 datosRevista.add(num=new JTextField(8));
		 
		
			JPanel botones = new JPanel();
		    botones.setLayout(new FlowLayout());
		    JButton btnGuardar = (new JButton("Guardar"));
		    btnGuardar.setActionCommand("btnGuardar");
		    btnGuardar.addActionListener(this);
		    botones.add(btnGuardar);
			
			//cargadatos.add(new constraints);
			
			Container cp = getContentPane();
			cp.add(datosRevista,BorderLayout.NORTH);
			cp.add(botones, BorderLayout.EAST);
		 
		 
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comando = e.getActionCommand();
		switch (comando) {
		case "btnGuardar":
			guardarRevista();
			break;

		default:
			break;
		}
		
	}


	public void guardarRevista() {
		// TODO Auto-generated method stub
		String nombre = nom.getText();
		System.out.println(nombre);
		String idioma= idi.getText();
		System.out.println(idioma);
		
		try {
			gr.agregarRevista(nombre, idioma);
			JOptionPane.showMessageDialog(this, "Revista registrada", "Mensaje de información",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
