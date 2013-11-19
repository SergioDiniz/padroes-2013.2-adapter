
public class PlugueComum implements PlugueDoisPinos{

	@Override
	public void conectar(TomadaDoisPinos tomada) {
		tomada.fornecerEnergia();
	}

}
