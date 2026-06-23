package br.com.etechoracio.ingresso.controller;

import br.com.etechoracio.ingresso.dto.SessaoResponseDTO;
import br.com.etechoracio.ingresso.service.SessaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sessao")
@CrossOrigin("*")
public class SessaoController{

    @Autowired
    private SessaoService sessaoService;

    @GetMapping("/sessao/{id}")
    public List<SessaoResponseDTO> findById(){
        return sessaoService.findById();
    }

}