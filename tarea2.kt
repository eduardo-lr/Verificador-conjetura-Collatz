/* Esta funcion verifica la conjetura de Collatz: 

	1) dado un entero positivo n, si este es par lo dividimos entre dos, y si es impar lo multiplicamos por tres y sumamos uno
	2) repetimos este procedimiento una y otra vez 
	
La conjetura de Collatz afirma que este proceso siempre termina, y más aún, siempre se llega al número uno. La comunidad matemática aún está en busca de una demostración de esto. */

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

fun collatz(entero: Int) {
	println("Para el número ${entero} se verificó la conjetura de Collatz después de ${collatz(entero,0)} pasos") 
}

fun main() {
	collatz(1)
	collatz(2)
	collatz(12)
	collatz(27)
}
