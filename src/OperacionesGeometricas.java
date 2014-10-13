import java.util.Scanner;

import com.zubiri.geometria.Circulo;
import com.zubiri.geometria.Rectangulo;



public class OperacionesGeometricas {

	public static void main(String[] args) {

	
 		Scanner tecla1=new Scanner(System.in);
 		String opcion=" ";
		char caracter=' ';//declaracion de la variable tipo CHAR
 		
 		System.out.println("Elige una figura geometrica:");
 		System.out.println("a) Circulo");
 		System.out.println("b) Rectangulo");
 		System.out.println("x) Salir");
 		
 		opcion=tecla1.next();//recoger SRING por teclado
 		caracter=opcion.charAt(0);//recoger el primer CARACTER del STRING y guardar en variable "caracter"
 
// 		while (!opcion.equalsIgnoreCase("x")){
		while ((caracter!='x')||(caracter!='X')){

// 		  if ((opcion.equalsIgnoreCase("a"))||(opcion.equalsIgnoreCase("b"))||(opcion.equalsIgnoreCase("x"))){
 		  if ((caracter=='a')||(caracter=='A')||(caracter=='b')||(caracter=='B')||(caracter=='x')||(caracter=='X')){

// 			if (opcion.equalsIgnoreCase("a"))
 			if ((caracter=='a')||(caracter=='A')){
 				double radio=0;

 				System.out.println("Circulo");
 				System.out.println("Introduce el radio:");
 				radio=tecla1.nextDouble();
 
 				Circulo c1=new Circulo(radio);
 
 				System.out.println("Area: "+c1.calculaArea());
 				System.out.println("Perimetro: "+c1.calculaPerimetro());
 			}
// 			if (opcion.equalsIgnoreCase("b")){
 			if ((caracter=='b')||(caracter=='B')){

 				double base=0; double altura=0;

 				System.out.println("Rectangulo");
 				System.out.println("Introduce la base:");
 				base=tecla1.nextDouble();

 				System.out.println("Introduce la altura:");
 				altura=tecla1.nextDouble();
 
 				Rectangulo r1=new Rectangulo(base,altura);
 
 				System.out.println("Area: "+r1.calculaArea());
 				System.out.println("Perimetro: "+r1.calculaPerimetro());
 			}
			
			//para que termine WHILE, en el caso de CHAR
			if ((caracter=='x')||(caracter=='X')){
				System.out.println("Salir, programa terminado");
				System.exit(0);
			}

 
 		  }else{
 			System.out.println("Opcion no valida");
 		  }
 
 		  System.out.println("Quieres hacer otra operacion?");
   		  System.out.println("a) Circulo");
 		  System.out.println("b) Rectangulo");
 		  System.out.println("x) Salir");
 		  
 		  opcion=tecla1.next();
		  caracter=opcion.charAt(0);
 		  
 		}//fin while

//el siguiente codigo Funciona con STRING, con CHAR NO FUNCIONA 		
// 		if (opcion.equalsIgnoreCase("x")){
/* 		if ((caracter=='x')||(caracter=='X')){

 			System.out.println("Salir, programa terminado");
 			System.exit(0);
 		}*/
 

	}//main

}//clase

