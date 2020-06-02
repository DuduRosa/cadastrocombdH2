package br.edu.usj.ads.lpii.cadastrodecontatos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerDados {

    @Autowired
    CrudRepositorio repositorio;

    @PostMapping(value = "/index")
    public ModelAndView postMethodName(@RequestParam String nome, @RequestParam String telefone,
            @RequestParam String cpf, @RequestParam String email, @RequestParam String data) {

        Dados contato = new Dados();
        contato.setNome(nome);
        contato.setTelefone(telefone);
        contato.setCpf(cpf);
        contato.setEmail(email);
        contato.setData(data);
        repositorio.save(contato);

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("dados", repositorio.findAll());

        return modelAndView;
    }

}