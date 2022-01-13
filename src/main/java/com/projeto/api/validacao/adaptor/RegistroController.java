package com.projeto.api.validacao.adaptor;

import com.projeto.api.validacao.domain.Registro;
import com.projeto.api.validacao.domain.RegistroService;
import com.projeto.api.validacao.port.in.RegistroDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@Slf4j
@RestController
@RequestMapping("/usuario")
public class RegistroController {

    @Autowired
    private RegistroService registroService;

    @PostMapping("/registro")
    public ResponseEntity<Boolean> registrarUsuario(@RequestBody RegistroDTO registroDTO){

        Registro registro = registroDTO.toDomain();
        boolean novoRegistro = registroService.adicionarRegistro(registro);
        if(novoRegistro) return ResponseEntity.ok().body(novoRegistro);
        return ResponseEntity.badRequest().body(novoRegistro);
    }

    //funcionando
//    @PostMapping("/registro")
//    public boolean registrarUsuario(@RequestBody RegistroDTO registroDTO){
//        Registro novoRegistro = registroDTO.toDomain();
//        return registroService.adicionarRegistro(novoRegistro);
    }
