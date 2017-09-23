package metodosdeordenamiento;

public class Avanzado {
	private int dim;
	private double[] coord;
	
	public Avanzado(int n){
		dim = n;
		coord = new double[dim];
	}
	
	public void shell(){
		int flagIntercambio , h;
		double auxiliar;
		h = coord.length;
		while(h > 0){
			h = h / 2; 
			flagIntercambio = 1;
			while( flagIntercambio == 1){
				flagIntercambio = 0;
				for( int i = 0 ; i < h ; i++ ){
					for( int j = i , k = j+h ; k < coord.length ; j=k , k+=h ){
						if( coord[j] > coord[k] ){
							auxiliar = coord[j];
							coord[j] = coord[k];
							coord[k] = auxiliar;
							flagIntercambio = 1;
						}
					}
				}
			}
		}
	}
	
	public void quickSort(){
		
	}
	
	public void fusion(){
		
	}

	public double[] getCoord() {
		return coord;
	}

	public void setCoord(double[] coord) {
		this.coord = coord;
	}
}
