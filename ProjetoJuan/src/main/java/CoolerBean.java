import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CoolerBean {
	private Cooler cooler;
	private ArrayList<Cooler> coolers;

	public CoolerBean() {
		cooler = new Cooler();
		coolers = new ArrayList<Cooler>();
	}

	public Cooler getCooler() {
		return cooler;
	}

	public void setCooler(Cooler cooler) {
		this.cooler = cooler;
	}

	public ArrayList<Cooler> getCoolers() {
		return coolers;
	}

	public void setCoolers(ArrayList<Cooler> coolers) {
		this.coolers = coolers;
	}

}
