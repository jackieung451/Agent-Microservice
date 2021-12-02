package com.jack.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jack.springcloud.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
