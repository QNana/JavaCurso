package salud;
import edu.femxa.val.imc.*;

public class SaludMain {
	
public static void main(String[] args) {
	Persona persona= null;
	persona= new Persona(60d, 1.5d);
	double imc_numerico=IMC.calcula(persona);
	TipoIMC tipo=TipoIMC.traduceIMC(imc_numerico);
	System.err.println(tipo);
}
}
