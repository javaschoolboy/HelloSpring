package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.domain.Person;
import spring.service.PersonService;

@RestController
@RequestMapping("/api")
public class RestSimpleController {

    @Autowired
    PersonService personService;

}
