package org.ucll.destination_api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class DestinationDb {
	private Map<String,Destination> destinations;
	public DestinationDb() {
		destinations = new HashMap<String, Destination>();
		Destination d1 = new Destination();
		Destination d2 = new Destination();
		d1.setCity("Leuven");
		d1.setDescription("Mooie studentenstad gelegen in Vlaams-Brabant.");
		d2.setCity("Brussels");
		d2.setDescription("Hoofdstad van België en Europa.");
		this.addDestination(d1);
		this.addDestination(d2);
	}
	public Map<String, Destination> getDestinations() {
		return destinations;
	}
	public void setDestinations(Map<String, Destination> destinations) {
		this.destinations = destinations;
	}
	
	public Destination getDestination(String City) {
		return this.getDestinations().get(City);
	}
	public void addDestination(Destination destination) {
		this.getDestinations().put(destination.getCity(), destination);
	}
	public List<Destination> getDestinationList(){
		return (ArrayList<Destination>) this.getDestinations().values();
	}

}
