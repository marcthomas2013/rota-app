package rota.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is responsible for holding the planned rota and presenting the
 * dates that need to be filled.
 * 
 * @author marcth
 */
public class RotaRequest {
	List<RotaItem> rotaItems = new ArrayList<RotaItem>();

	public RotaRequest(List<RotaItem> rotaItems) {
		super();
		this.rotaItems = rotaItems;
	}

	public List<RotaItem> getRotaItems() {
		return rotaItems;
	}

	public void setRotaItems(List<RotaItem> rotaItems) {
		this.rotaItems = rotaItems;
	}
}
