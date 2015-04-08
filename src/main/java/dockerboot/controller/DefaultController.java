package dockerboot.controller;

import dockerboot.db.model.Customer;
import dockerboot.db.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Developed by vdovgaliuc on 4/8/15.
 */
@RestController
public class DefaultController {
    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }

    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping("/customers")
    public ResponseEntity<?> customers() {
        return new ResponseEntity<Object>(customerRepository.findAll(), HttpStatus.OK);
    }

    @RequestMapping("/add-customer")
    public ResponseEntity<?> custmersAdd(){
        customerRepository.save(new Customer("victor", "Dovgaliuc"));
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }
}
