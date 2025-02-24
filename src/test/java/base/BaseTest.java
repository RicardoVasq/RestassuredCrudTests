package base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public static void setUp() {
        // Configuración común para todos los tests
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com"; // URL base de la API
        RestAssured.port = 80; // Puerto (si es necesario)
        RestAssured.basePath = "/api"; // Path común (si es necesario)
    }
}
