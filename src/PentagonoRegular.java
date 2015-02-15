
public class PentagonoRegular {  // crear la Clase del Pentagono
	int lado; // define la variable lado

	PentagonoRegular(int lado)
	{
		this.lado = lado; // asigna la variable lado.
	}
	
	int getLado()
	{
		return lado; // retorna la variable lado
	}
	
	void setLado(int lado)
	{
		this.lado = lado;  // assign la variable lado.
	}
	
	int getPerimetro()
	{
		return lado*5; // retorno del perimetro del Pentagono.
	}
}
