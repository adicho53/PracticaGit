package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Interfaz extends JFrame implements ActionListener {
	
	public Interfaz() {
		initComponents();
	}
	
	

	public void initComponents() {
		// TODO Auto-generated method stub
		
		setSize(400, 300);
		setTitle("Gestion de Datos");
		
		
		
		getContentPane().setLayout(new BorderLayout());
		JDesktopPane escritorio = new JDesktopPane();
		getContentPane().add(escritorio, BorderLayout.CENTER);

		// Seccion de ventanas
		JMenuBar barraMenu = new JMenuBar();
		JMenu mnu = new JMenu("Menu");

		JMenuItem mnuRevista = new JMenuItem("Revista");
		mnuRevista.addActionListener(this);
		mnuRevista.setActionCommand("mnuRevista");
		mnu.add(mnuRevista);

		JMenuItem mnuPais = new JMenuItem("Pais");
		mnuPais.addActionListener(this);
		mnuPais.setActionCommand("mnuPais");
		mnu.add(mnuPais);
		
		JMenuItem mnuEmpresa = new JMenuItem("Empresa");
		mnuEmpresa.addActionListener(this);
		mnuEmpresa.setActionCommand("mnuEmpresa");
		mnu.add(mnuEmpresa);
		
		JMenuItem mnuCompetencia = new JMenuItem("Competencia");
		mnuCompetencia.addActionListener(this);
		mnuCompetencia.setActionCommand("mnuCompetencia");
		mnu.add(mnuCompetencia);
		
		JMenuItem mnuEquipo = new JMenuItem("Equipo");
		mnuEquipo.addActionListener(this);
		mnuEquipo.setActionCommand("mnuEquipo");
		mnu.add(mnuEquipo);
		
		JMenuItem mnuMedico = new JMenuItem("Medico");
		mnuMedico.addActionListener(this);
		mnuMedico.setActionCommand("mnuMedico");
		mnu.add(mnuMedico);
		
		barraMenu.add(mnu);
		
		setJMenuBar(barraMenu);
		
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
