
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {


       Scanner teclado= new Scanner(System.in);
       
       //variable
       int aciertos = 0;

        
    System.out.println(CYAN +" ========== JAVAQUIZ =========="+RESET);
    System.out.println("Bienvenido a el concurso de preguntas sobre Java");
    System.out.println("Responde escribiendo 1, 2 o 3.");

    //inicio ronda1

    //pregunta1
    System.out.println("-----------------Primera ronda---------------");

        System.out.println("Primera pregunta:¿Qué instrucción sirve para mostrar texto por pantalla? ");
        
        System.out.println("1) System.out.println  2) Scanner  3) int   ");
        System.out.print("Respuesta:");
        
         int respuesta1 = teclado.nextInt() ;

                if (respuesta1 == 1) {
                   System.out.println(VERDE +"¡Correcto!"+RESET);
                   aciertos++;
                 }else{
                   System.out.println(ROJO+"incorrecto"+RESET);
              }


        //pregunta2
    System.out.println("-----------------Segunda ronda---------------");

        System.out.println("Segunda pregunta:¿Qué hace aciertos++?");
        System.out.println("1) Resta dos    2) Multiplica uno    3) Suma uno  ");
        
        System.out.print("Respuesta:");

         int respuesta2 = teclado.nextInt() ;

               if (respuesta2 == 3) {
                  System.out.println(VERDE+"¡Correcto!"+RESET);
                  aciertos++;
                }else{
                    System.out.println(ROJO+"incorrecto"+RESET);
               }

        //pregunta 3
    System.out.println("-----------------Tercera ronda---------------");

        System.out.println("Tercera pregunta:¿Qué tipo de dato almacena verdadero o falso?");
        System.out.println(" 1) Boolean   2) String   3) int   ");
        
        System.out.print("Respuesta:");
         
             int respuesta3 = teclado.nextInt() ;

               if (respuesta3 == 1) {
                  System.out.println(VERDE+"¡Correcto!"+RESET);
                  aciertos++;
                }else{
                   System.out.println(ROJO+"incorrecto"+RESET);
              }

        //inicio ronda2



        //pregunta 1
    System.out.println("-----------------Cuarta ronda---------------");
    System.out.println("Cuarta pregunta: ¿Cuál es el prefijo que usamos para declarar una constante?");
    System.out.println(" 1) String   2) final   3) static");
    System.out.print("Respuesta: ");

    int respuesta4 = teclado.nextInt();
    if (respuesta4 == 2){
        System.out.println(VERDE+"¡Correcto!"+RESET);
        aciertos++;
        }else{
            System.out.println(ROJO+"incorrecto"+RESET);
    }

        //pregunta2
    System.out.println("-----------------Quinta ronda---------------");
    System.out.println("Quinta pregunta: ¿Qué bucle normalmente recorre un array multidimensional?");
    System.out.println(" 1) int    2) while   3) for");
    System.out.print("Respuesta: ");

    int respuesta5 = teclado.nextInt();
    if (respuesta5 == 3){
        System.out.println(VERDE+"¡Correcto!"+RESET);
        aciertos++;
        }else{
            System.out.println(ROJO+"incorrecto"+RESET);
    }   
        //pregunta3
    System.out.println("-----------------Sexta ronda---------------");
    System.out.println("Sexta pregunta: ¿Cuál de estos NO es un dato primitivo?");
    System.out.println(" 1) long     2) String   3) char ");
    System.out.print("Respuesta: ");

    int respuesta6 = teclado.nextInt();
    if (respuesta6 == 2){
        System.out.println(VERDE+"¡Correcto!"+RESET);
        aciertos++;
        }else{
            System.out.println(ROJO+"incorrecto"+RESET);
    }  
//añadimos mas preguntas



    System.out.println("-----------------Septima ronda---------------");
    System.out.println("Séptima pregunta: ¿Qué comando permite descargar un repositorio remoto por primera vez?");
    System.out.println(" 1) git init     2) git clone   3) git all . ");
    System.out.print("Respuesta: ");

    int respuesta7 = teclado.nextInt();
    if (respuesta7 == 1){
        System.out.println(VERDE+"¡Correcto!"+RESET);
        aciertos++;
        }else{
            System.out.println(ROJO+"incorrecto"+RESET);

        }


    System.out.println("-----------------Octava ronda---------------");
    System.out.println("Octava pregunta: ¿Qué comando se utiliza para guardar cambios en el historial de Git?");
    System.out.println(" 1) git push    2) git pull   3) git commit ");
    System.out.print("Respuesta: ");

    int respuesta8 = teclado.nextInt();
    if (respuesta8 == 3){
        System.out.println(VERDE+"¡Correcto!"+RESET);
        aciertos++;
        }else{
            System.out.println(ROJO+"incorrecto"+RESET);

        }
    // MÁS PREGUNTAS
    System.out.println("-----------------Novena ronda---------------");
    System.out.println("Novena pregunta: ¿Qué se debe escribir para salir de un switch?");
    System.out.println(" 1) break    2) main   3) double ");
    System.out.print("Respuesta: ");

    int respuesta9 = teclado.nextInt();
    if (respuesta9 == 1){
        System.out.println(VERDE+"¡Correcto!"+RESET);
        aciertos++;
        }else{
            System.out.println(ROJO+"incorrecto"+RESET);
    }

    System.out.println("-----------------Décima ronda---------------");
    System.out.println("Décima pregunta: ¿Qué bucle se debe usar cuando una estructura pide ejecutarse al menos una vez hasta que se cumpla 'x' condición?");
    System.out.println(" 1) return     2) do while   3) for ");
    System.out.print("Respuesta: ");

    int respuesta10 = teclado.nextInt();
    if (respuesta10 == 2){
        System.out.println(VERDE+"¡Correcto!"+RESET);
        aciertos++;
        }else{
            System.out.println(ROJO+"incorrecto"+RESET);
    }  

         //resultado final
    System.out.println("Respuestas correctas: " + aciertos + " de 10");
    System.out.println("Fin del concurso.");

     teclado.close();
    
    }
    
    




//color rojo y verde Y RESET 
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String CYAN = "\u001B[36m";
}
