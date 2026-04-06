package ru.cherkesova;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void hello_shouldReturnHelloWorld() {
        HelloController controller = new HelloController();

        String result = controller.hello();

        assertEquals("Hello", result);
    }
}