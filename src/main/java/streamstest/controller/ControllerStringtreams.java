package streamstest.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerStringtreams {

	List<String> listaString = new ArrayList<String>(Arrays.asList("arbol", "vaca", "alfabeto", "zorro", "barco"));

	@PostMapping(value = "/stringOperations/addDataToStreamStringa")
	public ResponseEntity<String> addDataToStreamS(@RequestParam String palabra) {
		listaString.add(palabra);
		return new ResponseEntity<String>("String added successfully", HttpStatus.OK);
	}

	@GetMapping(value = "/stringOperations/getOrderedByAlph")
	public ResponseEntity<String> getOrderedByAlph() {
		return new ResponseEntity<String>("List with alphabetical order:\t"
				+ listaString.stream().sorted(String::compareTo).collect(Collectors.toList()), HttpStatus.OK);
	}

	@GetMapping(value = "/stringOperations/addDataToStreamString")
	public ResponseEntity<String> getAllOnUpperCase() {

		return new ResponseEntity<String>("" + "List with uppercase: "
				+ listaString.stream().map(x -> x.toUpperCase()).collect(Collectors.toList()), HttpStatus.OK);
	}
}
