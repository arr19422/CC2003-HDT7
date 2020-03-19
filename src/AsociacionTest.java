import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class AsociacionTest {

	@Test
    void insertar() {
        Asociacion asc= new Asociacion();
        assertEquals(asc.dog.getIzq(),null);
    }

    @Test
    void buscar() {
    	Asociacion asc= new Asociacion();
        Map<String,String> map=new LinkedHashMap<>();
        map.put("*dog*", "perro");
        map.put("*homework*", "tarea");
        map.put("*house*", "casa");
        map.put("*woman*", "mujer");
        map.put("*town*", "pueblo");
        map.put("*yes*", "si");
        assertEquals(asc.inOrder(asc.house), map);
    }
    
}
