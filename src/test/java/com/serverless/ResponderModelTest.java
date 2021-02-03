package com.serverless;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ResponderModelTest {

    @Test
    public void  sumaDe1Mas14Test(){
        ResponderModel responder = new ResponderModel();
        String pregunta = "what is 1 plus 14";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("15");
    }

}
