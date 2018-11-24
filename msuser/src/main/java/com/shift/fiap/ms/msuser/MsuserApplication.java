package com.shift.fiap.ms.msuser;

import javax.ws.rs.core.MediaType;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
public class MsuserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsuserApplication.class, args);
	}
}

class User {
	
	private String nome;
	private int idade;

	public User(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "User [nome=" + nome + ", idade=" + idade + "]";
	}
	
	
}
@RestController
@RequestMapping("/user")
class UserController {
	
	@GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON)
	public User get(@PathVariable int id) {
		User user = new User("Sammer " + id, 33);
		return user;
	}	
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
	public ResponseEntity<String> post(@RequestBody User user) {
		return ResponseEntity.ok(user.toString());
	}
	
}
