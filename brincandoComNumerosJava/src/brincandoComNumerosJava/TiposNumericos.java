package brincandoComNumerosJava;

public class TiposNumericos {
	public static void main(String[] args) {
		
		int inteiro = 999999999;
		
		System.out.println(inteiro + ": Numeros inteiros (Coportam até 32bit)");
		
		long longo = 999999999999999999L;
		
		System.out.println(longo +":  Acima de 64bit");
		
		short curto  = 9999;
		
		System.out.println(curto +":  até 2131");
		
		byte b  = 127;
		
		System.out.println(b +":  até 127");
		
		double valor1 = 0.1;
		double valor2 = 0.2;
		
		double total = valor1 + valor2;
		
		System.out.println(total);
		
		float flutuante = 12.2f;
		
		System.out.println(flutuante);
		
		
	}
}
