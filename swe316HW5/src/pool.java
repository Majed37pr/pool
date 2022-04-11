import java.util.ArrayList;

public class pool {
	
	public static ArrayList<ServiceObject> array;
	public static int size;

	public pool(int s) {
		array = new ArrayList<ServiceObject>(0);
		size = s;
	}

	public ServiceObject getInstance() {

		int x = availability();
		if (x != -1) {
			array.get(x).myState = "UnAvailable";
			return array.get(x);
		}

		if (array.size() < size) {
			array.add(new ServiceObject("UnAvailable"));
			return array.get(array.size() - 1);
		} else {

		}
		return null;
	}

	public int availability() {

		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).myState == "Available")
				return i;
		}
		return -1;
	}

	public void releaseInstance(ServiceObject x) {
		array.get(array.indexOf(x)).myState = "Available";
	}

}
