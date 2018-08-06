import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class DiscoBean {
	private Disco disco;
	private ArrayList<Disco> discos;

	public DiscoBean() {
		disco = new Disco();
		discos = new ArrayList<Disco>();
	}

	public Disco getDisco() {
		return disco;
	}

	public void setDisco(Disco disco) {
		this.disco = disco;
	}

	public ArrayList<Disco> getDiscos() {
		return discos;
	}

	public void setDiscos(ArrayList<Disco> discos) {
		this.discos = discos;
	}

}
