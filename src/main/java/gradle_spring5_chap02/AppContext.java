package gradle_spring5_chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class AppContext {

	@Configuration
	public class APPContext {

		@Bean
		public Greeter greeter() {
			Greeter g = new Greeter();
			g.setFormet("%s, 안녕하세요!");
			return g;
		}

	}

}
