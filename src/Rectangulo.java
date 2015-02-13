
public class Rectangulo {
int altura, base;
	
	Rectangulo(int base, int altura)
	{
		this.base = base;
		this.altura = altura;		
	}
	
	int getAltura()
	{
		return altura;
	}
	int getBase()
	{
		return base;
	}
	
	void setAltura(int altura)
	{
		this.altura = altura;
	}
	void setBase(int base)
	{
		this.base = base;
	}
	
	int getPerimetro()
	{
		return (2*(altura+base));
	}
	int getArea()
	{
		return (altura*base);
	}
}
