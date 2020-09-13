package com.oliveiracom.startrekuniverse.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oliveiracom.startrekuniverse.model.People;
import com.oliveiracom.startrekuniverse.repository.PeopleRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class PeopleController {
	@Autowired
	private PeopleRepository PeopleRepository;

	@GetMapping("/People")
	public List<People> getAllPeople() {
		return PeopleRepository.findAll();
	}

	/*@GetMapping("/Peoples/{id}")import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
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
	}*/
}
