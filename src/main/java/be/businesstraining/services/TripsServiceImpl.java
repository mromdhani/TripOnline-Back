package be.businesstraining.services;

import be.businesstraining.domain.Trip;
import be.businesstraining.repository.TripsRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Service
public  class TripsServiceImpl implements TripsService {

    private TripsRepository repository;

    @Override
    public Set<Trip> allTrip() {
        return new HashSet<>(repository.findAll());
    }

    @Override
    public Trip getTripById(Long id) {
        return   repository.findById(id).orElse(null);
    }
}
