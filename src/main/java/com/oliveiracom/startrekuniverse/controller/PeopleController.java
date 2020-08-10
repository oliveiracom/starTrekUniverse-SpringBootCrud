package com.oliveiracom.startrekuniverse.controller;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import net.guides.springboot2.springboot2jpacrudexample.exception.ResourceNotFoundException;
import com.oliveiracom.startrekuniverse.model.People;
import com.oliveiracom.startrekuniverse.repository.PeopleRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class PeopleController {
	@Autowired
	private PeopleRepository PeopleRepository;

	@GetMapping("/Peoples")
	public List<People> getAllPeoples() {
		return PeopleRepository.findAll();
	}

	@GetMapping("/Peoples/{id}")
	public ResponseEntity<People> getPeopleById(@PathVariable(value = "id") Long PeopleId)
			throws ResourceNotFoundException {
		People People = PeopleRepository.findById(PeopleId)
				.orElseThrow(() -> new ResourceNotFoundException("People not found for this id :: " + PeopleId));
		return ResponseEntity.ok().body(People);
	}

	@PostMapping("/Peoples")
	public People createPeople(@Valid @RequestBody People People) {
		return peopleRepository.save(people);
	}

	@PutMapping("/peoples/{id}")
	public ResponseEntity<People> updatePeople(@PathVariable(value = "id") Long peopleId,
			@Valid @RequestBody People peopleDetails) throws ResourceNotFoundException {
		People people = peopleRepository.findById(peopleId)
				.orElseThrow(() -> new ResourceNotFoundException("People not found for this id :: " + peopleId));

		people.setEmailId(peopleDetails.getEmailId());
		people.setLastName(peopleDetails.getLastName());
		people.setFirstName(peopleDetails.getFirstName());
		final People updatedPeople = peopleRepository.save(people);
		return ResponseEntity.ok(updatedPeople);
	}

	@DeleteMapping("/peoples/{id}")
	public Map<String, Boolean> deletePeople(@PathVariable(value = "id") Long peopleId)
			throws ResourceNotFoundException {
		People people = peopleRepository.findById(peopleId)
				.orElseThrow(() -> new ResourceNotFoundException("People not found for this id :: " + peopleId));

		peopleRepository.delete(people);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
