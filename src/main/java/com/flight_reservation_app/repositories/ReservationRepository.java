package com.flight_reservation_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_reservation_app.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
