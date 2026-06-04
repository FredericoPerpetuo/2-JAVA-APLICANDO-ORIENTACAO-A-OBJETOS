package br.com.devfred.secao03.desafio02;


import br.com.devfred.secao03.desafio02.entities.CameraSeguranca;
import br.com.devfred.secao03.desafio02.entities.SensorTemperatura;

public class Main {
    public static void main(String[] args) {
        SensorTemperatura sensorTemperatura = new SensorTemperatura();
        System.out.println(sensorTemperatura.enviarSinal());
        System.out.println(sensorTemperatura.ajustarTemperatura());

        CameraSeguranca cameraSeguranca = new CameraSeguranca();
        System.out.println(cameraSeguranca.enviarSinal());
        System.out.println(cameraSeguranca.rotacionarCamera());
    }
}