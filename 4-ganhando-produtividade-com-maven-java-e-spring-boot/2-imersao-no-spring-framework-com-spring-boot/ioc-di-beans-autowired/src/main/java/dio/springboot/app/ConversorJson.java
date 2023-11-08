package dio.springboot.app;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

// Components são componentes que serão instânciados na aplicação, usa-se quando possui acesso ao código fonte
@Component
public class ConversorJson {
	@Autowired
	private Gson gson;
	//	private Gson gson = new Gson();
	
	public ViaCepResponse converter(String json) {
		ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
		return response;
	}
}
