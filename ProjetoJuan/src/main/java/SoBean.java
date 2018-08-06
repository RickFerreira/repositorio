import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class SoBean {
	private So so;
	private ArrayList<So> sos;

	public So getSo() {
		return so;
	}

	public void setSo(So so) {
		this.so = so;
	}

	public ArrayList<So> getSos() {
		return sos;
	}

	public void setSos(ArrayList<So> sos) {
		this.sos = sos;
	}

}
