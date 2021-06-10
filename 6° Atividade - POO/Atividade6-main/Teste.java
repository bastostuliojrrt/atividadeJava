package atividade6;

public class Teste {
	
public static void main(String[] args) {
		
		Carro c1 = new Carro(15);
		
		System.out.println("----Civic-----");
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		
		Ferrari c2 = new Ferrari(400);
		c2.ligarTurbo();
		c2.ligarAr();
		c2.ativarCilindro();
		 
		System.out.println();
		System.out.println("-----Ferrari-----");
		c2.acelerar();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
		
		
		
	}
	
	
	
	
	
	
	
}


