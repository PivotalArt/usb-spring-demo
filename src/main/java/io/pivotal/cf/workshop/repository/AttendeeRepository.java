package io.pivotal.cf.workshop.repository;

import org.springframework.data.repository.CrudRepository;

import io.pivotal.cf.workshop.entity.Attendee;

/**
 * JPA repository for the Attendee entity.
 * @author Brian Jimerson
 *
 */
public interface AttendeeRepository extends CrudRepository<Attendee, Long> {

}
