import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaBancariaTest {
    
    private CuentaBancaria cuenta;

    @BeforeEach
    public void setUp() {
        cuenta = new CuentaBancaria("Isaac Rivera", "507232755", 1000.0);
    }

    @Test
    public void testIngresar() {

        cuenta.ingresar(500.0);

        assertEquals(1500.0, cuenta.getSaldo(), "El saldo después de ingresar $500 debería ser $1500");
    }

    @Test
    public void testRetirar() {
    
        cuenta.retirar(300.0);
      
        assertEquals(700.0, cuenta.getSaldo(), "El saldo después de retirar $300 debería ser $700");
    }
}