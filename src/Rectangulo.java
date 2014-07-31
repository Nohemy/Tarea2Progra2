public class Rectangulo {
public int base;
public int altura;


Rectangulo(int base, int altura){
	this.base=base;
	this.altura=altura;
}
//Obtenemos la cantidad de la base de un rectangulo
int getBase()
{
	return base;
}
//Obtenemos la cantidad de la altura de un rectangulo
int getAltura()
{
	return altura;
}
//Obtenemos el area de un rectangulo multiplicando la base por la altura
//se obtiene la formula de http://www.ditutor.com/geometria/area_rectangulo.html
int getArea()
{
	return base*altura;
}
//Obtenemos el perimetro de un rectangulo multiplicando la base por 2 y sumando el resultado a la altura por 2
//se obtiene la formula de http://www.ditutor.com/geometria/perimetro_rectangulo.html
int getPerimetro()
{
	return ((base*2)+(altura*2));
}
//Devolvemos el resultado de la base
void setBase(int base)
{
	this.base=base;
}
//devolvemos el resultado de la altura
void setAltura(int altura){
	this.altura=altura;
}

}
