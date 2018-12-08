public class Motor{

	private int cilindros;
	private boolean gasolina;
	private int potencia;
	private boolean prendido;

	public Motor()
	{
		cilindros = 1;
		gasolina = true;
		potencia = 100;
		prendido = false;
	}
	public Motor(int cilindros,boolean gasolina, int potencia, boolean prendido)
	{
		this.cilindros= cilindros;
		this.gasolina = gasolina;
		this.potencia = potencia;
		this.prendido=prendido;
	}

	public void prender()
	{
		this.prendido=true;
	}
	public void apagar()
	{
		this.prendido=false;
	}

}
