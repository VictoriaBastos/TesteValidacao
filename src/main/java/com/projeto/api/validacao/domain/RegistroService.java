package com.projeto.api.validacao.domain;

import com.projeto.api.validacao.port.in.RegistroPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RegistroService implements RegistroPort {

    @Override
    public boolean adicionarRegistro(Registro registro) {

        String senha = registro.getPassword();
        String caractereEspecial = "!@#$%^&*()-+";

        boolean tamanhoSuficiente = false;
        if (senha.length() >= 9) {
            tamanhoSuficiente = true;
        }

        boolean contemDigito = false;
        boolean contemMinuscula = false;
        boolean contemMaiuscula = false;
        boolean contemCaractereEspecial = false;
        boolean naoContemEspacamento = true;

        for (int i = 0; i < senha.length(); i++) {
            char ch = senha.charAt(i);
            if (Character.isDigit(ch)) {
                contemDigito = true;
            }
            if (Character.isLowerCase(ch)) {
                contemMinuscula = true;
            }
            if (Character.isUpperCase(ch)) {
                contemMaiuscula = true;
            }
            if (Character.isSpaceChar(ch)) {
                naoContemEspacamento = false;
            }

            for (int j = 0; j < caractereEspecial.length(); j++) {
                char special = caractereEspecial.charAt(j);
                if (ch == special) {
                    contemCaractereEspecial = true;
                }
            }
        }

        if (tamanhoSuficiente &&
                contemDigito &&
                contemMinuscula &&
                contemMaiuscula &&
                naoContemEspacamento &&
                contemCaractereEspecial) {
            return true;
        }
        return false;
    }
}
