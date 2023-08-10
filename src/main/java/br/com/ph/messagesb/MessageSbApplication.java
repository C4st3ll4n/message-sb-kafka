package br.com.ph.messagesb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MessageSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageSbApplication.class, args);
	}

}

@RestController
@RequestMapping("/kafka")
class HelloController{
	private MessageProducer service;

	public HelloController(MessageProducer service) {
		this.service = service;
	}

	@GetMapping("/{name}")
	public String hello(@PathVariable(name = "name") String name){
		service.sendMessage("Hello "+ name);
		return "OK";
	}
}



