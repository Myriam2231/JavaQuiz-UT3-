
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {


       Scanner teclado= new Scanner(System.in);
       
       //variable
       int aciertos = 0;

        
    System.out.println("========== JAVAQUIZ ==========");
    System.out.println("Bienvenido a el concurso de preguntas sobre Java");
    System.out.println("Responde escribiendo 1, 2 o 3.");

    //inicio ronda1

    //pregunta1
    System.out.println("-----------------primera ronda---------------");

        System.out.println("Primera pregunta:¿Qué instrucción sirve para mostrar texto por pantalla? ");
        
        System.out.println("1) System.out.println  2) Scanner  3) int   ");
        System.out.print("Respuesta:");
        
         int respuesta1 = teclado.nextInt() ;

                if (respuesta1 == 1) {
                   System.out.println("¡Correcto!");
                   aciertos++;
                 }else{
                   System.out.println("incorrecto");
              }


        //pregunta2
    System.out.println("-----------------segunda ronda---------------");

        System.out.println("Segunda pregunta:¿Qué hace aciertos++?");
        System.out.println("1) Resta dos    2) Multiplica uno    3) Suma uno  ");
        
        System.out.print("Respuesta:");

         int respuesta2 = teclado.nextInt() ;

               if (respuesta2 == 3) {
                  System.out.println("¡Correcto!");
                  aciertos++;
                }else{
                    System.out.println("incorrecto");
               }

        //pregunta 3
    System.out.println("-----------------tercera ronda---------------");

        System.out.println("Tercera pregunta:¿Qué tipo de dato almacena verdadero o falso?");
        System.out.println(" 1) Boolean   2) String   3) int   ");
        
        System.out.print("Respuesta:");
         
             int respuesta3 = teclado.nextInt() ;

               if (respuesta3 == 1) {
                  System.out.println("¡Correcto!");
                  aciertos++;
                }else{
                   System.out.println("incorrecto");
              }

        //inicio ronda2



        //pregunta 1



        //pregunta2




        //pregunta3




        //resultado final































     teclado.close();
     
    }
}
