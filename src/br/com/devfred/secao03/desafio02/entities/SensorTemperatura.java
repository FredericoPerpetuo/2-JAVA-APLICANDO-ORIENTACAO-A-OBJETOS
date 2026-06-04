package br.com.devfred.secao03.desafio02.entities;

public class SensorTemperatura extends Dispositivo{

    @Override
    public String enviarSinal(){
        return "Eviando dados temperatura...";
    }

    public String ajustarTemperatura(){
        return "Ajustando temperatura...";
    }
}
