
import java.util.Scanner;
/**
 * Clase para optimizar/refactorizar
 * @version 1
 * */
public class Optimiza {
	/**
	 * Método que te solicita por pantalla dos números y te muestra
	 * si el primero es mayor, menor o igual
	 * */
	public void funcion1(){
		
		Scanner entrada = new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Introduce el primer entero:");
		numero1 = entrada.nextInt();
		System.out.println("Introduce otro entero:");
		numero2 = entrada.nextInt();
		//Comprobamos si los números son distintos y mostramos por pantalla
		if (numero1 != numero2)
			System.out.println(numero1 + "!=" + numero2);
		//Comprobamos si los números son distintos y mostramos por pantalla
		if (numero1 == numero2)
			System.out.println(numero1 + "==" + numero2);
		//Comprobamos si el primer número es menos que el segundo y mostramos
		if (numero1 < numero2)
			System.out.println(numero1 + "<" + numero2);
	}
	/**
	 * Método que te solicita por pantalla un año, y te indica si es bisiesto o no
	 * */	
	public void funcion2(){
		int anyo;
		boolean esBisiesto=false;
		System.out.println("Introduce un numero");
		Scanner entrada = new Scanner(System.in);
		anyo = entrada.nextInt();
		/*Aqui se comprueba si el año es divisible y se cambia el valor dependiendo del resultado*/
		if (anyo%4==0){
			esBisiesto = true;
		} else if (anyo%100==0){
			esBisiesto = false;
		}
		if(anyo%400==0){
			esBisiesto = true;
		}
		if (esBisiesto==true){
			System.out.println("El año es bisiesto");
		} else System.out.println("El año no es bisiesto");
	}
	/**
	 * Método que te solicita por pantalla 10 notas y te muestra las notas
	 * ordenadas, además de la nota mayor, menor y la media
	 * */	
	public void funcion3(){
		final int TOTAL_ALUMNOS = 10;
		int[] notas = new int [TOTAL_ALUMNOS];
		int max=0;
		int min=0;
		int aux;
		int media=0;
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i<10; i++)
		{
			System.out.println("Introduce la primera nota");
			notas[i] = entrada.nextInt();
			
			if (i == 0)
			{
				min = notas[i];
				max = notas [i];
			}
			
			if (notas[i]>max) {
				max=notas[i];
			}
			
			else if (notas[i]<min) {
				min=notas[i];
			}     
		}
		
	 
		for (int i = 0; i < 10; i++) {
			media+=notas[i];
			 
			for (int j = 0; j < 10; j++) {
			
				if (notas[i] > notas[j]) {
					aux=notas[i];
					notas[i]=notas[j];
					notas[j]=aux;
				
				}
		}
			
		}
		
		System.out.print("Notam max: ");
		System.out.println(max);
		System.out.print("Nota min: ");
		System.out.println(min);
		System.out.print("Nota media: ");
		media=media/10;
		System.out.println(media);
		for (int i = 0; i < 10; i++) {
			
			System.out.println(notas[i]);
		}
	}
	/**
	 * Método que te solicita una cantidad de segundos y debes desglosar
	 * el número de horas, minutos y segundos que se compone esa cifra
	 * */	
	public void funcion4(){
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce los segundos: ");
		int seconds = entrada.nextInt();
		int result=seconds;
		int horas=0;
		int segundos=0;
		int minutos=0;
		do {
			if (seconds>=3600) {
				horas++;
				seconds-=3600;
			}else if (seconds>=60) {
				minutos++;
				seconds-=60;
			}
			else{
				segundos++;
				seconds--;
			}
		} while (seconds!=0);
		System.out.print(result+" segundos equivalen a "+horas+" horas "+minutos+" minutos "
				+segundos+ " segundos.");
	}
	/**
	 * Método a refactorizar (OPTATIVO): este método se encarga de solicitar 3 valores
	 * y mostrar el resultado de resolver la raíz cuadrada
	 * */	
	public void opcional(){
	    //declaracion de variables
	    double x1;  //raiz 
	    double x2;  //raiz
	    double a,b,c; //coeficientes reales
	    double discriminante; //discriminante 
	    double solreal;  //parte real de las raices  imaginarias
	    double solimag ; //parte imaginaria de las raices imagimarias
	    
	    Scanner entrada=new Scanner(System.in); 
	    
	    System.out.print("Ingrese el valor de a: ");
	    a = entrada.nextDouble();
	    System.out.print("Ingrese el valor de b: ");
	    b = entrada.nextDouble();
	    System.out.print("Ingrese el valor de c: ");
	    c = entrada.nextDouble();
	    
	    discriminante=b*b-4*a*c;
	    //tendra dos raices reales
	    if(discriminante>0){
	        x1=(-b+Math.sqrt(discriminante))/(2*a);
		x2=(-b-Math.sqrt(discriminante))/(2*a);
	        System.out.println("las dos raices resultantes de la ecuacion de segundo grado");
	        System.out.println(a +"x2"+ b +"x"+ c);
	        System.out.println("la primera es :"+x1);
	        System.out.println("la segunda es :"+x2);       
	        
	    }
	    //no tiene soluciones reales seran imaginarias
	    else if(discriminante<0){
	        solreal=-b/2*a;
	        solimag =(Math.sqrt(-discriminante))/(2*a);
	         System.out.println("las dos raices resultantes de la ecuacion de segundo grado");
	        System.out.println(a +"x2"+ b +"x"+ c);
	        System.out.println("la primera es :"+solreal+"+i"+solimag );
	        System.out.println("la segunda es :"+solreal+"-i"+solimag);  
	        
	    }
	    //seran las soluciones iguales
	    else{
	        x1=x2=-b/2*a;
	         System.out.println("las dos raices resultantes de la ecuacion de segundo grado");
	        System.out.println(a +"x2"+ b +"x"+ c);
	        System.out.println("las dos raices son iguales :"+ x1 +  x2  );
	     
	    }
	}
	
	public static void main(String[] args){
		System.out.println("bla");
	}
	
}
