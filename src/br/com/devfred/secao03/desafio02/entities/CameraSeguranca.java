package br.com.devfred.secao03.desafio02.entities;

public class CameraSeguranca extends Dispositivo{

    @Override
    public String enviarSinal(){
        return "Transmitindo video...";
    }

    public String rotacionarCamera(){
        return "Rotacionando câmera...";
    }
}
