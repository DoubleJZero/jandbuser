package jandbuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * SpringBootApplication
 *
 * <pre>
 * 코드 히스토리 (필요시 변경사항 기록)
 * </pre>
 *
 * @author JandB
 * @since 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaAuditing
public class JandbuserApplication {

	public static void main(String[] args) {
		SpringApplication.run(JandbuserApplication.class, args);
	}

}
