package mathvecmat;

public class MatrizMath {
	
	private int fila;
	private int columna;
	private double [][] coord; 
	
	public MatrizMath(int n, int m){
		fila=n;
		columna=m;
		coord = new double[fila][columna];
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public double[][] getCoord() {
		return coord;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + columna;
		result = prime * result + fila;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MatrizMath other = (MatrizMath) obj;
		if (columna != other.columna)
			return false;
		if (fila != other.fila)
			return false;
		return true;
	}
	
	public MatrizMath sumarMatriz(MatrizMath mat) throws DistDimException{
		if(this.equals(mat) == false){
			throw new DistDimException("Distinta Dimension");
		}
		MatrizMath aux = new MatrizMath(fila,columna);
		for(int i=0; i<fila ; i++){
			for(int j=0; j<columna ; j++){
				aux.coord[i][j]=coord[i][j] + mat.coord[i][j];
			}
		}
		return aux;
	}
	
	public MatrizMath restarMatriz(MatrizMath mat) throws DistDimException{
		if(this.equals(mat) == false){
			throw new DistDimException("Distinta Dimension");
		}
		MatrizMath aux = new MatrizMath(fila,columna);
		for(int i=0; i<fila ; i++){
			for(int j=0; j<columna ; j++){
				aux.coord[i][j]=coord[i][j] - mat.coord[i][j];
			}
		}
		return aux;
	}
	
	public void inicializarMatriz(){
		for(int i=0;i<fila;i++)
			for(int j=0;j<columna;j++)
				coord[i][j]=0;
	}
	
	public MatrizMath productoMatriz(MatrizMath mat)throws DistDimException{
		if(columna != mat.fila)
			throw new DistDimException("No se pueden multiplicar las matrices");
		MatrizMath resultado = new MatrizMath(fila,mat.columna);
		double temporal=0;
		for(int i=0 ; i<fila ; i++){
			for(int j=0 ; j<mat.columna ; j++){
				for(int k=0 ; k<columna ; k++){
					temporal+= coord[i][k] * mat.coord[j][k];
					resultado.coord[i][j]=temporal;
				}
			}
		}
		return resultado;
	}
	
	public MatrizMath productoPorVector(VectorMath vec) throws DistDimException{
		if(columna != vec.getDim())
			throw new DistDimException("Distintas dimensiones");
		MatrizMath resultado = new MatrizMath(vec.getDim(),1);
		double temporal = 0;
		for( int i=0 ; i<fila ; i++)
			for( int j=0 ; j<columna ; j++){
				temporal+= coord[i][j] * vec.getCoord()[j];
				resultado.coord[i][0]=temporal;
			}
		return resultado;
	}
	
	public MatrizMath productoPorConstante(float n){
		MatrizMath resultado = new MatrizMath(fila,columna);
		for(int i=0 ; i<fila ; i++)
			for(int j=0 ; j<columna ; j++)
				resultado.coord[i][j]= coord[i][j] * n;
		return resultado;
	}
	
	public double determinante(){
		double det=0;
		
		return det;
	}
}
