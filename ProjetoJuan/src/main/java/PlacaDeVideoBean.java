import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PlacaDeVideoBean {
	private PlacaDeVideo placaDeVideo;
	private ArrayList<PlacaDeVideo> placasDeVideos;

	public PlacaDeVideo getPlacaDeVideo() {
		return placaDeVideo;
	}

	public void setPlacaDeVideo(PlacaDeVideo placaDeVideo) {
		this.placaDeVideo = placaDeVideo;
	}

	public ArrayList<PlacaDeVideo> getPlacasDeVideos() {
		return placasDeVideos;
	}

	public void setPlacasDeVideos(ArrayList<PlacaDeVideo> placasDeVideos) {
		this.placasDeVideos = placasDeVideos;
	}

}
