public class EjercicioTema3 {
    public static void main(String[] args){

	// Primera parte
	int resultado = suma(1,2,3);
	System.out.println(resultado);

	// Segunda parte
	var miCoche = new coche();
	miCoche.AgregarPuertas();
	System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c){
	return a + b + c;
    }

}

class coche {
    public int puertas = 3;

    public void AgregarPuertas() {
	this.puertas++;
    }
}
