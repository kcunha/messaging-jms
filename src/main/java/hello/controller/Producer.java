package hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hello.model.Email;

import javax.jms.Queue;

@RestController
public class Producer {

    @Autowired
    private Queue queue;

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping(path = "/publish", consumes = "application/json", produces = "application/json")
    public void publish(@RequestBody Email email){
        jmsTemplate.convertAndSend(queue, email);
    }
}