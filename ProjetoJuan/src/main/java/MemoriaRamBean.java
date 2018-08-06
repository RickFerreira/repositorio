import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MemoriaRamBean {
	private MemoriaRam memoriaRam;
	private ArrayList<MemoriaRam> memoriaRams;

	public MemoriaRam getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(MemoriaRam memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public ArrayList<MemoriaRam> getMemoriaRams() {
		return memoriaRams;
	}

	public void setMemoriaRams(ArrayList<MemoriaRam> memoriaRams) {
		this.memoriaRams = memoriaRams;
	}

}
