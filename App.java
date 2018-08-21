
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Par<String, Double> AlunoNota = new Par<>();
		AlunoNota.setTipo1("Nome:ldsakjs \n");
		AlunoNota.setTipo2(10d);
		System.out.println(AlunoNota.getTipo1() + AlunoNota.getTipo2().toString());

	}

}
