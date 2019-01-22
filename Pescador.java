import java.util.Scanner;

public class Pescador {

	public static void main(String[] args) {
		
		int peso, multa = 4, excesso, valorTotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o peso de peixes que pescou:");
		peso = leia.nextInt();
		
		
		if (peso > 50) {
			excesso = peso - 50;
			valorTotal = (excesso * 4) + 50;
			System.out.println("Houve um excesso de: " + excesso);
			System.out.println("O valor total a ser pago será: " + valorTotal);
		} else {
			System.out.println("Peso de peixes dentro dos conformes");
		}
		
		
		

	}

}
