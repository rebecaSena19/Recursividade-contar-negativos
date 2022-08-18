//feito em conjunto com outra aluna 

package controller;

public class Recursnumnegat {

	public Recursnumnegat () {

		super();
	}
	//ponto de parada
	public int vetNegativos (int[] vet, int cont ) {
		if (cont == 0) {
			return 0;
		}
    //função do termo anterior
		if (vet[cont - 1] < 0) {
			return 1+vetNegativos (vet, cont - 1);
		}
		return vetNegativos ( vet, cont - 1);
	}
}
