package luchadoresjaponeses;

public class Luchador {
	private int peso;
	private int altura;
	 public Luchador(int p , int a){
		 peso=p;
		 altura=a;
	 }
	 
	 public boolean domina(Luchador obj){
		 if(this.peso > obj.peso && this.altura > obj.altura){
			 return true;
		 }
		 else if(this.peso == obj.peso && this.altura > obj.altura){
			 return true;
		 }
		 else if(this.altura == obj.altura && this.peso > obj.peso){
			 return true;
		 }
		 return false;
	 }
}
