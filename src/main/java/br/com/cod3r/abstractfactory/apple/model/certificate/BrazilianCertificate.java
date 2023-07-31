package br.com.cod3r.abstractfactory.apple.model.certificate;

public class BrazilianCertificate implements Certificate {

    public String applyCertification() {
        return "\t- Calibrando as regras brasileiras\n\t- Aplicando o Selo da Anatel";
    }

}