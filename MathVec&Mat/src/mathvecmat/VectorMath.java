package mathvecmat;

import java.util.Arrays;

public class VectorMath {
	private int dim;
	private double[] coord;
	public VectorMath(int n){
		dim=n;
		coord = new double[n];
	}
	public VectorMath sumarVector(VectorMath vec) throws DistDimException {
		if (dim != vec.dim)
			throw new DistDimException(" Distinta Dimension ");
		VectorMath aux = new VectorMath(dim);
		for (int i=0; i<dim; i++)
			aux.coord[i]=this.coord[i]+vec.coord[i];
		return aux;
	}
	
	public VectorMath restaVector(VectorMath vec) throws DistDimException {
		if (dim != vec.dim)
			throw new DistDimException(" Distinta Dimension ");
		VectorMath aux = new VectorMath(dim);
		for (int i=0; i<dim; i++)
			aux.coord[i]=this.coord[i]-vec.coord[i];
		return aux;
	}
	
	public Double productoVector(VectorMath vec) throws DistDimException{
		if (dim != vec.dim)
			throw new DistDimException(" Distinta Dimension ");
		double resultado=0;
		for(int i = 0 ; i<dim ; i++){
			resultado+=this.coord[i]*vec.coord[i];
		}
		return resultado;
	}
	
	public VectorMath productoMatriz(MatrizMath mat) throws DistDimException{
		if (dim != mat.getFila())
			throw new DistDimException(" Distinta Dimension ");
		VectorMath aux = new VectorMath(dim);
		for(int i=0;i < mat.getColumna();i++){
			aux.coord[i] = 0;
			for(int j=0;j < mat.getFila();j++){
				aux.coord[i]+= this.coord[j]*mat.getCoord()[i][j]; 
			}
		}
		return aux;
	}
	
	public VectorMath productoPorReal(double n){
		VectorMath aux = new VectorMath(dim);
		for(int i=0;i<dim;i++){
			aux.coord[i]=this.coord[i]*n;
		}
		return aux;
	}
	
	public double normaVector2(){
		double resultado = 0;
		for(int i=0; i<dim; i++){
			resultado += Math.pow(coord[i], 2); 
		}
		
		return Math.sqrt(resultado);
	}
	
	public double normaVector1(){
		double resultado = 0;
		for(int i=0; i< dim; i++){
			resultado += Math.pow(coord[i], 1);
		}
		return Math.abs(resultado);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(coord);
		result = prime * result + dim;
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
		VectorMath other = (VectorMath) obj;
		if (!Arrays.equals(coord, other.coord))
			return false;
		if (dim != other.dim)
			return false;
		return true;
	}
	
	public Object clone(){
		VectorMath aux = new VectorMath(dim);
		for(int i=0 ; i<dim ; i++){
			aux.coord[i]=coord[i];
		}
		return aux;
	}
	
	public int getDim() {
		return dim;
	}
	
	public double[] getCoord() {
		return coord;
	}
	
	public void setCoord(double[] coord) {
		this.coord = coord;
	}
		
}
