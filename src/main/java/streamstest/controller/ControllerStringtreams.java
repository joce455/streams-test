package streamstest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerStringtreams {

	List<String> listaString = new ArrayList<String>();

	@PostMapping(value = "/stringOperations/addDataToStreamStringa")
	public ResponseEntity<String> addDataToStreamS(@RequestParam String letra) {
		listaString.add(letra);
		return new ResponseEntity<String>("String added successfully", HttpStatus.OK);
	}

	@GetMapping(value = "/stringOperations/getOrderedByAlph")
	public ResponseEntity<String> getOrderedByAlph() {

		return new ResponseEntity<String>("List with alphabetical order", HttpStatus.OK);
	}

	@GetMapping(value = "/stringOperations/getLongWord")
	public ResponseEntity<String> getLongWord() {
		return new ResponseEntity<String>("long word in list", HttpStatus.OK);
	}

	@GetMapping(value = "/stringOperations/addDataToStreamString")
	public ResponseEntity<String> getAllOnUpperCase() {

		return new ResponseEntity<String>("List with uppercase", HttpStatus.OK);
	}
}
