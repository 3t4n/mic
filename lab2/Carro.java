public class Carro{
	
	private int año;
	private string nombre;
	private double float velocidad;
	private Motor motor;
	private Frenos frenos; 
	private Motor motor;

	public Carro()
	{
		año = 2018;
		nombre = Cadillac;
		velocidad = 200.00;
	}
	
	public Carro(int año, string nombre, double float velocidad, Frenos frenos, Motor motor)
	{
		this.año = año;
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.motor = new Motor();
		this.frenos = new Frenos();
	}

	public void frenar(int time)
	{
		this.frenos = 
