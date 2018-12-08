public class Frenos{

	private boolean disco;
	private boolean frenando;
	public Frenos()
	{
		disco = true;
	}
	
	public Frenos(boolean disco)
	{
		this.disco = disco;
	}

	public void frenar()
	{
		this.frenando=true;
	}
	public void desfrenar()
	{
		this.frenando=true;
	}
}
