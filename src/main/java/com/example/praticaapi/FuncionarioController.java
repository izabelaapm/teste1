package com.example.praticaapi;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/funcionario")
public class FuncionarioController {

    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioController(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @GetMapping("/listarTodos")
    public List<Funcionario> listarTodos() {
        return this.funcionarioRepository.findAll();
    }

    @PostMapping("/inserir")
    public ResponseEntity<String> inserirFuncionario(@RequestBody Funcionario tr) {
        funcionarioRepository.save(tr);
        return ResponseEntity.ok("Funcionário adicionado!");
    }

//   @DeleteMapping("/excluir/{data}")
//    public List<Funcionario> excluirPorAdmissao(@PathVariable Timestamp data) {
//        funcionarioRepository.deleteByDataAdmissao(data);
//
//        return funcionarioRepository.findAll();
//    }

        @PutMapping("/atualizar/{id}")
    public ResponseEntity<String> atualizarFuncionario(@PathVariable Long id,
                                                   @RequestBody Funcionario funcionarioAtualizado) {
        Optional<Funcionario> FuncionarioExistente = funcionarioRepository.findById(id);
        if (FuncionarioExistente.isPresent()) {
            Funcionario funcionario = FuncionarioExistente.get();
            funcionario.setCargo(funcionarioAtualizado.getCargo());
            funcionario.setSalario(funcionarioAtualizado.getSalario());
            funcionario.setDepartamento(funcionarioAtualizado.getDepartamento());
            funcionarioRepository.save(funcionario);
            return ResponseEntity.ok("Funcionário atualizado com sucesso!");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/buscar/{id}")
    public List<Funcionario> buscarPorId(@PathVariable int id) {
        return funcionarioRepository.findById(id);
    }
}
