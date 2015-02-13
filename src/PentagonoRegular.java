
public class PentagonoRegular {
	int lado;

	PentagonoRegular(int lado)
	{
		this.lado = lado;
	}
	
	int getLado()
	{
		return lado;
	}
	
	void setLado(int lado)
	{
		this.lado = lado;
	}
	
	int getPerimetro()
	{
		return lado*5;
	}
}
