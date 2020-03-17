package streamstest.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerIntStreams {

	
	
	List<Integer> listaenteros= new ArrayList<Integer>( Arrays.asList(2, 
            2, 
            2));
	
	
	
	@PostMapping(value = "/intOperations/addDataToStreamInt")
	public ResponseEntity<String> addDataToStreamI(@RequestParam int numero) {
		listaenteros.add(numero);
		return new ResponseEntity<String>("Integer added successfully", HttpStatus.OK);
	}

	@PostMapping(value = "/intOperations/addDataToStreamString")
	public ResponseEntity<String> getMiminum() {

		return new ResponseEntity<String>("Minimum number is:", HttpStatus.OK);
	}

	@GetMapping(value = "/intOperations/getMaximus")
	public ResponseEntity<String> getMaximus() {

		return new ResponseEntity<String>("Maximus number is:", HttpStatus.OK);
	}

	@GetMapping(value = "/intOperations/getOrdered")
	public ResponseEntity<String> getOrdered() {

		return new ResponseEntity<String>("Ordered list", HttpStatus.OK);
	}
	
	@GetMapping(value = "/intOperations/getProm")
	public ResponseEntity<String> getAverage() {

		return new ResponseEntity<String>("Ordered list", HttpStatus.OK);
	}

}
