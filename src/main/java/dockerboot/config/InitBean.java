package dockerboot.config;

import dockerboot.db.model.Customer;
import dockerboot.db.repositories.CustomerRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * Developed by vdovgaliuc on 4/8/15.
 */
@Configuration
public class InitBean implements InitializingBean {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        customerRepository.save(new Customer("victor", "Dovgaliuc"));
    }

}
