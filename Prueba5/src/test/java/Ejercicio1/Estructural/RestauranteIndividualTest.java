package Ejercicio1.Estructural;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestauranteIndividualTest {

    @Test
    public void testDescribir() {
        // Preparar
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        RestauranteIndividual restaurante = new RestauranteIndividual("Restaurante Prueba");

        // Ejecutar
        restaurante.describir();

        // Verificar
        String expectedOutput  = "Restaurante Prueba" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
