
public class Rectangulo {  // Definicion de la clase del Rectangulo
int altura, base; // creacion de las variables altura y base
	
	Rectangulo(int base, int altura) // asignar las variables base y altura
	{
		this.base = base;
		this.altura = altura;		
	}
	
	int getAltura() // funcion Altura
	{
		return altura; // retorno de la altura
	}
	int getBase() // funcion Base
	{
		return base; // retorno de la base
	}
	
	void setAltura(int altura)  // asignar variable altura
	{
		this.altura = altura; // asignar altura
	}
	void setBase(int base) // asignar variables Base
	{
		this.base = base;  // asignar base
	}
	
	int getPerimetro()  // Fucnion Perimetro
	{
		return (2*(altura+base)); // formula de Perimetro de un Rectagunlo, donde la base mas la altura * 2.
	}
	int getArea()  // funcion Area
	{
		return (altura*base); // area del Rectangulo encontrado al multiplicar altura por base
	}
}
