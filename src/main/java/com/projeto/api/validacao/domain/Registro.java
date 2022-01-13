package com.projeto.api.validacao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Registro {
    private String password;
    private String email;
}