
public class Exercício_3 {
	
	public static void main(String[] args) {
		
		media(7,5,3,10);
		
	}
public static void media(double n1, double n2, double n3, double n4) {
	
	double media=((n1+n2+n3+n4)/4);
	
	if(media<7) {
		System.out.println("Nota do Aluno: " +media);
		System.out.println("Reprovado");	
	}else {
		System.out.println("Nota do Aluno: " +media);
		System.out.println("Aprovado");
	}
			
}
}
