public class Carro{
	
	private int ano;
	private String nombre;
	private double velocidad;
	private Motor motor;
	private Frenos frenos; 

	public Carro()
	{
		ano = 2018;
		nombre = "Cadillac";
		velocidad = 200.00;
	}
	
	public Carro(int ano, String nombre, double  velocidad, Frenos frenos, Motor motor)
	{
		this.ano = ano;
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.motor = new Motor();
		this.frenos = new Frenos();
	}

	public void prender()
	{
		this.motor.prender();
	}
	public void apagar()
	{
		this.motor.apagar();
	}
	public void frenar(int time)
	{
		this.frenos.frenar();
	}
	public void frenar()
	{
		this.frenos.frenar();
	}
	@Override
	public String toString()
	{
		return "Vamo a conducir un " + this.nombre +  " modelo " + ano;
	}
}
