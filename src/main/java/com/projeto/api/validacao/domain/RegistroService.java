package com.projeto.api.validacao.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RegistroService {

    public boolean adicionarRegistro(Registro registro) {

    return false;
    }
}

//          FUNCIONANDO caracteresSuficientes
//            String senha = registro.getPassword();
//            boolean caracteresSuficientes = false;
//            if (senha.length() >= 9) caracteresSuficientes = true;
//            return caracteresSuficientes;

        //FUNCIONANDO contemDigito
//        String senha = registro.getPassword();
//        boolean contemDigito = false;
//        for (int i = 0; i < senha.length(); i++) {
//            char letra = senha.charAt(i);
//            if (Character.isDigit(letra)) contemDigito = true;}
//            return contemDigito;

        //FUNCIONANDO contemMinusculaeMaiuscula
//         boolean contemMinuscula = false;
//         boolean contemMaiuscula = false;
//         boolean contemMaiusculaMinuscula = false;
//         String senha = registro.getPassword();
//         for (int i = 0; i < senha.length(); i++) {
//                    char letra = senha.charAt(i);
//
//                    if (Character.isLowerCase(letra)) {
//                        contemMinuscula = true;
//                    }
//                    if (Character.isUpperCase(letra)) {
//                        contemMaiuscula = true;
//                    }
//         }
//        if(contemMaiuscula && contemMinuscula) {
//            contemMaiusculaMinuscula = true;
//        }
//        return contemMaiusculaMinuscula;
//    }
//}

//FUNCIONANDO naoContemEspacamento
//        boolean naoContemEspacamento = true;
//        String senha = registro.getPassword();
//        for (int i = 0; i < senha.length(); i++) {
//            char letra = senha.charAt(i);
//            if (Character.isSpaceChar(letra)) {
//                naoContemEspacamento = false;
//                }
//            }
//        return naoContemEspacamento;

    //FUNCIONANDO contemCaractereEspecial
//    boolean contemCaractereEspecial = false;
//    String senha = registro.getPassword();
//        for (int i = 0; i < senha.length(); i++) {
//        char letra = senha.charAt(i);
//        String specialChars = "!@#$%^&*()-+";
//        for (int j = 0; j < specialChars.length(); j++) {
//        char special = specialChars.charAt(j);
//        if (letra == special) {
//        contemCaractereEspecial = true;
//        }
//        }
//        }
//        return contemCaractereEspecial;





//        boolean naoContemRepeticao = false;
