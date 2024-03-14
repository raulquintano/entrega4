package operaciones;

import java.util.ArrayList;

public class Matematicas {

    //34 ¿Qué es un algoritmo?
    //Son un conjunto de instrucciones sistemáticas y previamente definidas que se utilizan para realizar una determinada 
    //tarea. Estas instrucciones están ordenadas y acotadas a manera de pasos a seguir para alcanzar un objetivo.

    //35 Algoritmos en Java

    public static int suma(int n)
    {
        int resultado = 0;
        for (int i = 1; i <= n; i++) {
            resultado += i;
        }
        return resultado;
    }

    public static int sumaR(int n)
    {
        if(n<=0)
        {
            return 0;
        }
        else
        {
            return n + suma(n-1);
        }
    }
    /* Codigo en C iterativo:
     * 
     *  int main() {
        int n, i, suma = 0;

        printf("Ingrese el valor de n: ");
        scanf("%d", &n);

        for (i = 1; i <= n; i++) {
            suma += i;
        }

        printf("La suma de los primeros %d números es: %d\n", n, suma);

        return 0;
        }

        Codigo en C recursivo:

            int sumaRecursiva(int n) {
            // Caso base: Si n es 0, la suma es 0
            if (n == 0) {
                return 0;
            } else {
                // Llamada recursiva para sumar los primeros n-1 números, y luego sumar n
                return n + sumaRecursiva(n - 1);
            }
        }

        int main() {
            int n;
            printf("Ingrese el valor de n: ");
            scanf("%d", &n);

            int resultado = sumaRecursiva(n);
            printf("La suma de los primeros %d números es: %d\n", n, resultado);

            return 0;
        }
     */

     //36 

     //37
     //Como el tiempo de ejecucion no varia con 't' porque es constante, la complejidad temporal es O(1)

     //38
     //Ambos tienen complejidad O(1), ya que devuelven un elemento en una única operación

     //39
     //Ambos tiene complejidad  O(n), ya que el tiempo de ejecución aumenta linealmente con el tamaño de entrada 'n'

     //40

     public static int factorial(int n) //Apartado 2 del ejercicio 11
    {
        int acumuladoF = 1;
        for(int i = 1; i<=n ; i++)
        {
            acumuladoF*=i;
        }
        return acumuladoF;
    }
    public static int pares1(int n) //Apartado 7 del ejercicio 11
    {
        int acumuladoS = 0;
        for(int i = 2; i <= n; i += 2)
        {
            acumuladoS+=i;

        }
        return acumuladoS;
    }
    
    //Ambos son de complejidad O(n), ya que dependen del valor de entrada 'n'

    //41

    public static int media(ArrayList<Integer> lista, int contador) //Apartado 5 ejercicio 2 (recursivo)
    {
        if(contador == 0)
        {
            return 0;
        }
        else
        {
            return lista.get(contador) + media(lista, contador + 1);
        }
    }
    //La complejidad será O(n), ya que dependerá del tamaño que se le adjudique al ArrayList

    //42
    // Será O(n^2), lo que significa que el tiempo de ejecución aumenta cuadráticamente con el tamaño del conjunto A(n)

    //43
    //Será de complejidad O(a*b), siendo 'a' las filas y 'b' las columnas

    //44
    public static boolean buscar(int e, int[] array) 
    {

        for (int i = 0; i < array.length; i++) 
        {

            if (array[i] == e) {
                return true;
            }
        }
        return false;
    }
    //En el peor caso sería O(n), en el mejor caso O(1), y en el caso promedio O(n)

    //45
    
    //46
    //Complejidad Temporal: O(2^n)
    //Complejidad Espacial: O(n)

    //47
    //Los resultados observados son consistentes con la complejidad temporal del algoritmo y el comportamiento
    //esperado de un algoritmo con complejidad O(n).

    //48
    //La complejidad temporal de este algoritmo es cuadrática, es decir, O(n^2). 
    //Esto se debe a que el número total de operaciones realizadas crece proporcionalmente al cuadrado del tamaño de la entrada n.
    //Y por ello su tiempo de ejecución crece tambien proporcionalmente

    //49
    //Significa que después de un cierto valor de n0, la función T(n) crece a un ritmo que no supera k veces el crecimiento de la función f(n)

    //50
    //1) k=3 y n0=2
    //2) 
    //3)

    //51
    //1) f(x)=1: Esta es una función constante, independiente del valor de x
    //2) f(x)=x: Esta función es una función lineal, a medida que x crece, f(x) crece también
    //3) f(x)=x^2: Esta función es una función cuadrática, a medida que x crece, f(x) aumenta de forma cuadrática
    //4) f(x)=log2(x): Es una curva que se acerca al eje x a medida que x crece, lo hace de manera más lenta que las funciones lineales o cuadráticas.
    //5) f(x)= 2^x: Esta función es una función exponencial, aumentado exponencialmente cada vez que x crece

    //52
    //La complejidad temporar es O(log(n))

    //53
    //En el caso de un ArrayList no ordenado, la complejidad en el caso peor de la inserción es O(1)
    //En el caso de un ArrayList ordenado, la complejidad en el caso peor de la inserción sería O(n)

    //54
    //1) log(n) = 100ns
    //2) n = 1000ns
    //3) n*log(n) = 10000ns
    //4) n^2 = 100000ns
    //5) n*8 = 10^17ns
    //6) 10^n = 10^1000000ns

    //55
    //Todavía no está completamente resuelto debido a la complejidad exponencial del juego y al gran número de posibles configuraciones del tablero.
}   