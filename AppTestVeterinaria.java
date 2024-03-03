package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTestVeterinaria {
    private static final Logger LOG = Logger.getLogger(AppTestVeterinaria.class.getName());

    /* 
     * caso de prueba de veterinaria
    */

    @Test
    public void datosCompletos() {
        LOG.info("iniciando test datosCompletos");

        Veterinaria veterinaria = new Veterinaria("chispas", "canino", "criollo", (byte) 5, "hembra", "chocolate", 16); 
        
        assertEquals("chispas", veterinaria.nombre());
        assertEquals("canino", veterinaria.especie());
        assertEquals("criollo", veterinaria.raza());
        assertEquals(5, veterinaria.edad());
        assertEquals("hembra", veterinaria.genero());
        assertEquals("chocolate", veterinaria.color());
        assertEquals(16, veterinaria.peso());

        LOG.info("finalizando test datosCompletos");

    }

    /*
     * prueba para verificar que los datos de la veterinaria no esten nulos
     */

    @Test
    public void datosNulos(){
        LOG.info("iniciando test datosNulos");
        assertThrows(Throwable.class, () -> new Veterinaria(null, null, null, (byte)0, null, null, 0));
        LOG.info("finalizando test datosNulos");
    }
    
    /*
     * prueba para verificar que los datos de la veterinaria no esten vacios
     */

    @Test
    public void datosVacios(){
        LOG.info("iniciando test datosVacios");
        assertThrows(Throwable.class, () -> new Veterinaria("", "", "", (byte)0, "", "", 0));
        LOG.info("finalizando test datosVacios");
    } 

    /*
     * prueba para verificar que la edad no sea negativa
     */

    @Test
    public void edadNegativa(){
        LOG.info("iniciando test edadNegativa");
        assertThrows(Throwable.class, () -> new Veterinaria("chispas", "canino", "criollo", (byte)-5, "hembra", "chocolate", 16));
        LOG.info("finalizando test edadNegativa");
    }

    /*
     * prueba para verificar que el peso no sea negativa
     */

    @Test
    public void pesoNegativo(){
        LOG.info("iniciando test pesoNegativo");
        assertThrows(Throwable.class, () -> new Veterinaria("chispas", "canino", "criollo", (byte)5, "hembra", "chocolate", -16));
        LOG.info("finalizacion test pesoNegativo");
    }

}
