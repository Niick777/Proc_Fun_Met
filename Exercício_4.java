
public class Exerc�cio_4 {

	public static void conta(int x, int y, String op) {
		
		if(op !="+" && op!="-" && op!="/" && op!="*") {
			System.out.printf("Operador inv�lido");}
		else if(op =="+") {
			int soma=x+y;
			System.out.printf("O resultado da soma �: " +soma);}
		else if(op =="-") {
			int sub=x-y;
			System.out.printf("O resultado da subtr��o �: " +sub);}
		else if(op=="/") {
			int div=x/y;
			System.out.printf("O resultado da divis�o �: " +div);}
		else if(op=="*") {
			int mult=x*y;
			System.out.printf("O resultadoda multiplica��o �: " +mult);
		}
	}
	
	
	public static void main(String[] args) {
		
		conta(50,5, "/");
	}

}
