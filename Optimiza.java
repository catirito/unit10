package unit10;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/**
 * Clase para optimizar/refactorizar
 * @version 1
 * */
public class Optimiza {
	
	Scanner entrada = new Scanner(System.in);
	
	
	/**
	 * Método que te solicita por pantalla dos números y te muestra
	 * si el primero es mayor, menor o igual
	 * */
	public void funcion1(){
		
		int numero1, numero2;
		
		out.println("Introduce el primer entero:");
		numero1 = entrada.nextInt();
		out.println("Introduce otro entero:");
		numero2 = entrada.nextInt();
		//Comprobamos si los números son distintos y mostramos por pantalla
		if (numero1 != numero2){
			out.println(numero1 + "!=" + numero2);
			//Comprobamos si el primer número es menos que el segundo y mostramos
			if (numero1 < numero2)
				out.println(numero1 + "<" + numero2);
		}else
			//si son iguales
			out.println(numero1 + "==" + numero2);
	}
	
	
	/**
	 * Método que te solicita por pantalla un año, y te indica si es bisiesto o no
	 * */	
	public void funcion2(){
        int anyo;
        //boolean esBisiesto=false;
        out.println("Introduce un año");
        //Scanner entrada = new Scanner(System.in);
        anyo = entrada.nextInt();
        /*Aqui se comprueba si el año es divisible y se cambia el valor dependiendo del resultado*/
        if ((anyo%4==0 && anyo%100!=0) || anyo%400==0){
            out.println("El año es bisiesto");
        } else 
            out.println("El año no es bisiesto");
        
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
        int aux = 0;
        int media=0;
        //Scanner entrada = new Scanner(System.in);
        for (int i = 0; i<TOTAL_ALUMNOS; i++)
        {
            out.println("Introduce la nota "+ (i+1));
            notas[i] = entrada.nextInt();
            aux += notas[i];
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
        
        
        out.println("Notam max: "+max);
        
        out.println("Nota min: "+min);
        
        media=aux/TOTAL_ALUMNOS;
        out.println("Nota media: "+media);
        
        Arrays.sort(notas);  // ordena de menor a mayor
        
        for (int i=TOTAL_ALUMNOS-1; i>=0; i--) 
            out.println(notas[i]);
        
	}
	
	
	/**
	 * Método que te solicita una cantidad de segundos y debes desglosar
	 * el número de horas, minutos y segundos que se compone esa cifra
	 * */	
	public void funcion4(){
        //Scanner entrada = new Scanner(System.in);
        out.print("Introduce los segundos: ");
        int seconds = entrada.nextInt();
        int result=seconds;
        int horas=0;
        int segundos=0;
        int minutos=0;
        
        horas = seconds/3600;
        seconds = seconds%3600;
        minutos = seconds/60;
        segundos = seconds%60;
        
        out.println(result+" segundos equivalen a "+horas+" horas "+minutos+" minutos "
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
	    
	    //Scanner entrada=new Scanner(System.in); 
	    
	    out.print("Ingrese el valor de a: ");
	    a = entrada.nextDouble();
	    out.print("Ingrese el valor de b: ");
	    b = entrada.nextDouble();
	    out.print("Ingrese el valor de c: ");
	    c = entrada.nextDouble();
	    
	    discriminante=b*b-4*a*c;
	    //tendra dos raices reales
	    if(discriminante>0){
	        x1=(-b+Math.sqrt(discriminante))/(2*a);
	        x2=(-b-Math.sqrt(discriminante))/(2*a);
	        out.println("las dos raices resultantes de la ecuacion de segundo grado");
	        out.println(a +"x2"+ b +"x"+ c);
	        out.println("la primera es :"+x1);
	        out.println("la segunda es :"+x2);       
	        
	    }
	    //no tiene soluciones reales seran imaginarias
	    else if(discriminante<0){
	        solreal=-b/2*a;
	        solimag =(Math.sqrt(-discriminante))/(2*a);
	        out.println("las dos raices resultantes de la ecuacion de segundo grado");
	        out.println(a +"x2"+ b +"x"+ c);
	        out.println("la primera es :"+solreal+"+i"+solimag );
	        out.println("la segunda es :"+solreal+"-i"+solimag);  
	        
	    }
	    //seran las soluciones iguales
	    else{
	        x1=x2=-b/2*a;
	        out.println("las dos raices resultantes de la ecuacion de segundo grado");
	        out.println(a +"x2"+ b +"x"+ c);
	        out.println("las dos raices son iguales :"+ x1 +  x2  );
	     
	    }
	}
	
	public static void main(String[] args){
		//out.println("bla");
		Optimiza o = new Optimiza();
		//o.funcion1();
		//o.funcion2();
		//o.funcion3();
		//o.funcion4();
		o.opcional();
	}
	
}
