package be.businesstraining.repository;

import be.businesstraining.domain.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

public interface TripsRepository
        extends JpaRepository<Trip,Long> {

}
