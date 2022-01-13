package com.projeto.api.validacao.adaptor;

import com.projeto.api.validacao.domain.Registro;
import com.projeto.api.validacao.port.in.RegistroDTO;
import com.projeto.api.validacao.port.in.RegistroPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/usuario")
public class RegistroController {

    @Autowired
    private RegistroPort registroPort;

    @PostMapping("/registro")
    public ResponseEntity<Boolean> registrarUsuario(@RequestBody RegistroDTO registroDTO) {

        boolean novoRegistro = registroPort.adicionarRegistro(registroDTO.toDomain());

        if (novoRegistro) ResponseEntity.ok().body(novoRegistro);

        return ResponseEntity.badRequest().body(novoRegistro);
    }
}