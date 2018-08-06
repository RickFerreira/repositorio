import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PlacaMaeBean {
	private PlacaMae placaMae;
	private ArrayList<PlacaMae> placasMaes;

	public PlacaMae getPlacaMae() {
		return placaMae;
	}

	public void setPlacaMae(PlacaMae placaMae) {
		this.placaMae = placaMae;
	}

	public ArrayList<PlacaMae> getPlacasMaes() {
		return placasMaes;
	}

	public void setPlacasMaes(ArrayList<PlacaMae> placasMaes) {
		this.placasMaes = placasMaes;
	}

}
