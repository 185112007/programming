package _029_collection_yapilari.ex_03;

import java.util.HashMap;
import java.util.Map;

public class MapUygulamasi {

	private static class City{
		private String name;
		private int area;
		
		public City(String city, int area) {
			this.name = city;
			this.area = area;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + area;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			City other = (City) obj;
			if (area != other.area)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		
	}
	
	public static void main(String[] args) {
		
		Map<String, City> map = new HashMap<String, City>();
		map.put("Ankara", new City("Ankara", 2516));
		map.put("Istanbul", new City("Istanbul", 5343));
		map.put("Izmir", new City("Izmir",855));
		
	}

}
