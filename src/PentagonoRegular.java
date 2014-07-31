public class PentagonoRegular {
	
int lado;

PentagonoRegular (int lado){
	this.lado=lado;
	
}
//Obtenemos la cantidad del lado del pentagono
int getLado()
{
	return lado;
}
//Obtenemos el perimetro del pentagono multiplicando el lado por 5
//http://www.vitutor.net/2/1/4.html
int getPerimetro()
{
	return lado*5;
}
//Devolvemos el valor final del lado de un pentagono
void setLado(int lado){
	this.lado=lado;
}
	

}
