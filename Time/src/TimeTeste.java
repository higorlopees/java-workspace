
public class TimeTeste {
	public static void main(String[] args) {
		Time t = new Time();

		t.setTime(9, 5, 2);

		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
	}
}
