package streamstest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class StreamsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamsTestApplication.class, args);
		
		
		List<Integer> listaString= new ArrayList<Integer>();
		listaString.add(2);
		listaString.add(1);
		listaString.add(4);
		listaString.add(5);
		listaString.add(1);
		listaString.add(5);
		listaString.add(8);
		listaString.add(9);
		
		System.out.println(listaString.stream().min(Integer::compare).get());
		
		listaString.stream().sorted().forEach(System.out::println);
		
		
	}

}
