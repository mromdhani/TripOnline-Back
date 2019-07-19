package be.businesstraining.services;

import be.businesstraining.domain.Trip;

import java.util.Set;

public interface TripsService {

    Set<Trip> allTrip();
    Trip getTripById(Long id);
}
