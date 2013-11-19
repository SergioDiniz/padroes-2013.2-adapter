
public class Cliente {
	
	public static void main(String[] args) {
		TomadaComum tomadaComum = new TomadaComum();
		PlugueComum plugueComum = new PlugueComum();
		plugueComum.conectar(tomadaComum);
		
		TomadaEuropeia tomadaEuropeia = new TomadaEuropeia();
		PlugueEuropeu plugueEuropeu = new PlugueEuropeu();
		plugueEuropeu.conectar(tomadaEuropeia);
		
		AdaptaTomadaEuropeia adapter1 = new AdaptaTomadaEuropeia();
		plugueComum.conectar(adapter1);
		
		AdaptaTomadaComum adapter2 = new AdaptaTomadaComum();
		plugueEuropeu.conectar(adapter2);
		
		
		
	}

}
