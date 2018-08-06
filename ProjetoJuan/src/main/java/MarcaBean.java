import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MarcaBean {
	private Marca marca;
	private ArrayList<Marca> marcas;

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public ArrayList<Marca> getMarcas() {
		return marcas;
	}

	public void setMarcas(ArrayList<Marca> marcas) {
		this.marcas = marcas;
	}

}
