import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.miguel.model.Averias;

public class ModuloDiagnostico {
	
@Test	
	// Lista de averias de la bicicleta     
	static List<Averias> averias; 
	static Averias Nuemro_Averia;
	static Averias Nombre_Averia;

	private static void procesoAveria(){	
		
		Nuemro_Averia=new Averias("1234");
		Nombre_Averia=new Averias("Rueda Pinchada");
		
	}
	
	
	@SuppressWarnings("unchecked")
	private static void RegistroAveria(){
		
		averias = (List<Averias>) new Averias("0012");
		((Averias) averias).getNuemro_Averia();
		((Averias) averias).getNombre_Averia();
		assertEquals(Nombre_Averia.getNombre_Averia()getNuemro_Averia());
		
	}
	
}
