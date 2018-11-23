package br.com.fiap.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.MediaType;

@SpringBootApplication
public class ProdutoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutoServiceApplication.class, args);
	}
}

class Product {
	private int id;
	private String nome;
	private String tipo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Product{" +
				"id=" + id +
				", nome='" + nome + '\'' +
				", tipo='" + tipo + '\'' +
				'}';
	}
}


@RestController
@RequestMapping("v1/product")
class ProductController {

	@GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON)
	public String find(@PathVariable int id) {
		return  "Showing an id " + id;
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON)
	public void create(@RequestBody  Product product) {
		System.out.println("Produto criado com sucesso: Produto: " + toString());
	}

}