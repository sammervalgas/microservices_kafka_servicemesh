package br.com.svalgas.controller;

import br.com.svalgas.model.Aluno;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @GetMapping(path = "{id}", produces = {MediaType.APPLICATION_JSON})
    public ResponseEntity<Aluno> findById(@PathVariable int id) {
        Aluno aluno = new Aluno("Sammer Valgas", 34);
        return  ResponseEntity.ok(aluno);
    }

    @GetMapping(path = "list", produces = {MediaType.APPLICATION_JSON})
    public ResponseEntity<List<Aluno>> findAll() {
        return ResponseEntity.ok(Arrays.asList(new Aluno("SammerV",33), new Aluno("Dayane",30)));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<Aluno> create(@RequestBody Aluno aluno) {
        return ResponseEntity.ok(aluno);
    }

    @DeleteMapping("{idAluno}")
    public String delete(@PathVariable int idAluno) {
        return "User " + idAluno + " deleted successfully ! ";
    }

    @PutMapping("{idAluno}")
    public String update(@PathVariable int idAluno, @RequestBody Aluno alunoAtualizado) {
        return "User " + idAluno + " updated successfully ! ";
    }

}
