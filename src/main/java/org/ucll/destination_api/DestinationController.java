package org.ucll.destination_api;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class DestinationController {
	@Autowired
	private DestinationDb db;
	
	public DestinationController() {
		
	}
	
	@RequestMapping("/destination")
	public Destination destination(@RequestParam(value = "city", defaultValue = "Leuven") String city) {
		return db.getDestination(city);
	}

	@RequestMapping("/all")
	public Map<String, Destination> getDestinations() {
		return this.db.getDestinations();
	}
	
	
}
