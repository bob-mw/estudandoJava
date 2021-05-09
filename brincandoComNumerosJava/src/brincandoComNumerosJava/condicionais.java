package brincandoComNumerosJava;

public class condicionais {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int num = 17;
		int qnt = 2;
		if (num >= 18) {
			System.out.println("você tem mais de 18 anos");
		}
			
		else {
			if (qnt > 1) System.out.println("ok");
			System.out.println("você tem menos de 18 anos");
		}
		if (num > 10) System.out.println("sem chaves");
	}
}
