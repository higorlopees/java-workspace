
public class Time {
	private int hora, minuto, segundo;

	public void setTime(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public String exibirHoraUniversal() {
		String h, m, s;

		h = (this.hora < 10) ? "0" + Integer.toString(this.hora) : Integer.toString(this.hora);
		m = (this.minuto < 10) ? "0" + Integer.toString(this.minuto) : Integer.toString(this.minuto);
		s = (this.segundo < 10) ? "0" + Integer.toString(this.segundo) : Integer.toString(this.segundo);

		return h + ":" + m + ":" + s;
	}

	public String exibirHoraPadrao() {
		String h, m, s, sufix;
		int hAux;

		hAux = (this.hora > 12) ? this.hora - 12 : (this.hora == 0) ? 12 : this.hora;
		sufix = (this.hora > 12) ? "PM" : (this.hora == 0) ? "AM" : "PM";
		h = (hAux < 10) ? "0" + Integer.toString(hAux) : Integer.toString(hAux);
		m = (this.minuto < 10) ? "0" + Integer.toString(this.minuto) : Integer.toString(this.minuto);
		s = (this.segundo < 10) ? "0" + Integer.toString(this.segundo) : Integer.toString(this.segundo);

		return h + ":" + m + ":" + s + " " + sufix;
	}
}
