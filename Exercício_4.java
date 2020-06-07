
public class Exercício_4 {

	public static void conta(int x, int y, String op) {
		
		if(op !="+" && op!="-" && op!="/" && op!="*") {
			System.out.printf("Operador inválido");}
		else if(op =="+") {
			int soma=x+y;
			System.out.printf("O resultado da soma é: " +soma);}
		else if(op =="-") {
			int sub=x-y;
			System.out.printf("O resultado da subtrção é: " +sub);}
		else if(op=="/") {
			int div=x/y;
			System.out.printf("O resultado da divisão é: " +div);}
		else if(op=="*") {
			int mult=x*y;
			System.out.printf("O resultadoda multiplicação é: " +mult);
		}
	}
	
	
	public static void main(String[] args) {
		
		conta(50,5, "/");
	}

}
