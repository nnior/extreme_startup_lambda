package com.serverless;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ResponderModelTest {

    @Test
    public void  cualEsSuNombreTest() {
        ResponderModel responder = new ResponderModel();
        String pregunta = "what is your name";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("Los Tres Mosqueteros");
    }

    @Test
    public void  sumaDe1Mas14Test() {
        ResponderModel responder = new ResponderModel();
        String pregunta = "what is 1 plus 14";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("15");
    }

    @Test
    public void  cualEsElNumeroMayor(){
        ResponderModel responder = new ResponderModel();
        String pregunta = "which of the following numbers is the largest: 67, 35";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("67");
    }

    @Test
    public void  cualEsElNumeroMayor4(){
        ResponderModel responder = new ResponderModel();
        String pregunta = "which of the following numbers is the largest: 55, 119, 291, 24";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("291");
    }

}
