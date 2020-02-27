package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CirculoTeste {

    @Test
    public void criarObjetoCirculo() {
        Circulo c1 = new Circulo();
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributos() {
        Circulo c1 = new Circulo ();
        c1.PI = 3.14159;
        c1.raio = 6.0;
        assertNotNull(c1.PI);
        assertNotNull(c1.raio);
    }
    @Test
    public void metodoCalcularArea() {

        Circulo c1 = new Circulo ();
        c1.PI = 3.14159;
        c1.raio = 6.0;
        Double valorEsperado = 113.09723999999999;
        Double valorObtido = c1.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro() {
        Circulo c1 = new Circulo();
        c1.PI = 3.14159;
        c1.raio = 6.0;
        Double valorEsperado = 37.699079999999995;
        Double valorObtido = c1.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }
}