/** 
* Este programa verifica la conjetura de Collatz: 
*
*	1) dado un entero positivo n, si este es par lo dividimos entre dos, y si es impar lo multiplicamos por tres y sumamos uno
*	2) repetimos este procedimiento una y otra vez 
*	
* La conjetura de Collatz afirma que este proceso siempre termina, y más aún, siempre se llega al número uno. 
* La comunidad matemática aún está en busca de una demostración de esto.
*
* @author Eduardo Lara Ramirez.
*/

/**
* Esta funcion regresa en numero de pasos para el cual se cumple la conjetura de Collatz.
* @param entero el numero con el que inicia el algoritmo de la conjetura.
* @param paso el numero de iteracion al momento de llamar al algoritmo.
* @return el numero de pasos hasta que se llega al uno.
*/
fun collatz(entero: Int, paso: Int): Int {
	if (entero == 1)  
		return(paso)
	else {
		var n: Int = entero
		if (n%2 == 0)
			n = n/2	
		else 
			n = 3*n+1
		return(collatz(n, paso+1))
	}
}

/**
* Esta funcion no imprime en pantalla despues de cuantos pasos se verifico la conjetura.
* @param entero el numero con el que se ejecuta el algoritmo.
*/
fun collatz(entero: Int) {
	println("Para el número ${entero} se verificó la conjetura de Collatz después de ${collatz(entero,0)} pasos") 
}

/**
* Algunos ejemplos.
*/
fun main() {
	collatz(1)
	collatz(2)
	collatz(12)
	collatz(27)
	collatz(77031)
}
