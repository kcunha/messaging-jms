package hello.component;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import hello.model.Email;

//@Component
public class Receiver {

//	@JmsListener(destination = "${activemq.queuename}", containerFactory = "myActiveMQFactory")
	public void receiveMessage(Email email) {
		System.out.println("Received <" + email + ">");
	}

}
