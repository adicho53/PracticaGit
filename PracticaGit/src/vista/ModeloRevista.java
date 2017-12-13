package vista;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import modelo.Revista;
import modelo.Articulo;
import modelo.Autor;

//public class ModeloRevista extends AbstractTableModel {

	/*public String []columnas ={"Revista","Articulo","Autor"};
	public Class[] columnasTipos={ String.class, String.class, String.class};
	
	private List<Revista>datos;
	private List<Articulo>datos1;
	private List<Autor>datos2;
	
	public ModeloRevista(){
		super();
		datos= new ArrayList<Revista>();
		datos1 = new ArrayList<Articulo>();
		datos2= new ArrayList<Autor>();
	}
	
	public ModeloRevista(List<Revista>datos,List<Articulo>datos1,List<Autor>datos2){
		super();
		this.datos=datos;
		this.datos1=datos1;
		this.datos2=datos2;
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnas.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return datos.size();
	
	}
	
	/*public void setValueAt(Object value, int row, int col){
		Revista dato=(Revista)(datos.get(row));
		Articulo dato1=(Articulo)(datos1.get(row));
		switch(col){
		case 0:
			dato.setNombre((String) value);
			break;
		case 1:
			dato
			break;
		case 2:
			dato.setNacionalidad((String) value);
			break;
			default:
			break;
		}
	}
	

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}*/

//}
