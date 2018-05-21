import java.util.HashMap;
import java.util.Map;


public class Feature {

	Map<CoOrds, Boolean> map;
	int featureValue = 0;

	Feature(Map<CoOrds, Boolean> map) {
		this.map = new HashMap(map);
	}

	public void calculateFeatureValue(Image image) {
		int sum = 0;
		for (CoOrds c : map.keySet()) {
			if (image.getImageArray()[c.x][c.y] == 0 && !map.get(c)) {//if this CoOrd is false and pixel in imageis false
				sum++;
			}
		}
		if (sum >= 3) {
			featureValue = 1;
		}
		else
			featureValue=0;

	}

	public Map<CoOrds, Boolean> getMap() {
		return map;
	}
}