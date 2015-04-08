package dockerboot;

import dockerboot.db.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerbootApplication {

    @Autowired
    CustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(DockerbootApplication.class, args);
    }


}
