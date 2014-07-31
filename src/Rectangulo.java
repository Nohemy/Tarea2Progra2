public class Rectangulo {
public int base;
public int altura;


Rectangulo(int base, int altura){
	this.base=base;
	this.altura=altura;
}

int getBase()
{
	return base;
}
int getAltura()
{
	return altura;
}
int getArea()
{
	return base*altura;
}
int getPerimetro()
{
	return ((base*2)+(altura*2));
}
void setBase(int base)
{
	this.base=base;
}
void setAltura(int altura){
	this.altura=altura;
}

}