package youse.springbootvalidacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import org.testng.annotations.Test;
import youse.springbootvalidacao.model.ClienteModel;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SpringBootValidacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootValidacaoApplication.class, args);
	}


	@Test
	public void consumerAPI(){
		RestTemplate template = new RestTemplate();

		Map<String, String> params = new HashMap<String, String>();
		params.put("nome", "exmaple");
		params.put("cpf", "000.000.000-00");
		params.put("email", "example@gmail.com");
		params.put("placaCarro", "abc1234");
		ResponseEntity<ClienteModel> entity = template.postForEntity("http://localhost:8080/api/cliente/salvar",params,
				ClienteModel.class);

		System.out.println(entity);

	}


}
