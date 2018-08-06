import java.util.ArrayList;

import javax.ejb.Remove;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class MontagemPcBean {
	private MontagemPC montagemPc;
	private ArrayList<MontagemPC> montagemPCs;

	public MontagemPcBean() {
		montagemPc = new MontagemPC();
		montagemPCs = new ArrayList<MontagemPC>();
	}

	public MontagemPC getMontagemPc() {
		return montagemPc;
	}

	public void setMontagemPc(MontagemPC montagemPc) {
		this.montagemPc = montagemPc;
	}

	public ArrayList<MontagemPC> getMontagemPCs() {
		return montagemPCs;
	}

	public void setMontagemPCs(ArrayList<MontagemPC> montagemPCs) {
		this.montagemPCs = montagemPCs;
	}

	private void addMontagem() {
		montagemPCs.add(montagemPc);
		montagemPc = new MontagemPC();
	}

	private void removeMontagem(Integer id) {
		montagemPCs.remove(montagemPc);
		return;

	}

	private void editaMontagem(Integer id) {
		
	}

}
