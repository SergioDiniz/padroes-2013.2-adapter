
public class PlugueEuropeu implements PlugueTresPinos {

	@Override
	public void conectar(TomadaTresPinos tomada) {
		tomada.fornecerEnergia();
		
	}

}
