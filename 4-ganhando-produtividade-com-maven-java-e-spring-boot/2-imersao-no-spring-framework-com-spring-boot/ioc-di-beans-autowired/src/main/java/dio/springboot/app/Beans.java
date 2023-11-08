package dio.springboot.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.google.gson.Gson;

// Configuration pois algumas versões possa exigir para não haver erros de injeção ao criar os Beans
@Configuration
public class Beans {
	@Bean 
	public Gson gson() {
		return new Gson();
	}
}
