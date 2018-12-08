public class Frenos{

	private boolean disco;

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
		this.disco=true;
	}
}
