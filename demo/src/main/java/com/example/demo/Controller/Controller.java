package com.example.demo.Controller;

import com.example.demo.entity.Funcionario;
import com.example.demo.entity.FuncionarioDTO;
import com.example.demo.entity.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/funcionarios/v1")
public class Controller {
    @Autowired
    Repository resposity;

    @PostMapping
    public Funcionario create(@RequestBody Funcionario funcionario) {
        Funcionario funcionario1Saved = resposity.save(funcionario);
        return funcionario1Saved;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Funcionario> funcionario(@PathVariable Long id) {
        Optional<Funcionario> funcionarioReturned = resposity.findById(id);
        return funcionarioReturned;
    }

    @DeleteMapping("/{id}") //Deleta tal cliente atraves do id
    public String deleteClienteById(@PathVariable Long id) {
        try {

            Optional<Funcionario> cliente = Optional.of(resposity.getById(id));
            if (cliente.isPresent()) {
                resposity.deleteById(id);
                return "Funcionario de " + id + "deletado com sucesso! ";
            } else {
                throw new Exception("Funcinario inexistente");   //throw significa jogar
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "O funcionario de " + id + " não existe para ser deletado! ";
        }

    }

    @GetMapping //Puxa todos os cliente
    public List<Funcionario> clienteList() {
        return resposity.findAll();
    }

    @PutMapping("/{id}/{salario}")
    public String updateClienteById(@RequestBody Funcionario funcionario, @PathVariable Long id) {
        Optional<Funcionario> velhoFuncionario = resposity.findById(id);

        Funcionario funcionarioAtualizado = velhoFuncionario.get();
        funcionarioAtualizado.setSalario(funcionario.getSalario());
        resposity.save(funcionarioAtualizado);
        return "Funcionario atualizado com sucesso";

    }
}
