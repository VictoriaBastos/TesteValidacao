package com.projeto.api.validacao.port.in;

import com.projeto.api.validacao.domain.Registro;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class RegistroDTO {

    @NotNull @NotEmpty
    private String password;

    @NotNull @NotEmpty
    private String email;

    public Registro toDomain() {
        return new Registro(this.password, this.email);
    }

}