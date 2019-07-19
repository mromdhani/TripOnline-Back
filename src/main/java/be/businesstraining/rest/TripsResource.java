package be.businesstraining.rest;

import be.businesstraining.domain.Trip;
import be.businesstraining.services.TripsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/trips")
public class TripsResource {

    private TripsService service;

    public TripsResource(TripsService service) {
        this.service = service;
    }

    @GetMapping
    public Set<Trip> allTrips() {
        return service.allTrip();
    }
    @GetMapping("/{id}")
    public Trip getTripById(@PathVariable Long id) {
        return service.getTripById(id);
    }
}
