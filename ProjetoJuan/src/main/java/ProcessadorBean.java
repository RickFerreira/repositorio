import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ProcessadorBean {
	private Processador processador;
	private ArrayList<Processador> processadores;

	public Processador getProcessador() {
		return processador;
	}

	public void setProcessador(Processador processador) {
		this.processador = processador;
	}

	public ArrayList<Processador> getProcessadores() {
		return processadores;
	}

	public void setProcessadores(ArrayList<Processador> processadores) {
		this.processadores = processadores;
	}

}
