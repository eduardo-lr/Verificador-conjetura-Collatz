# Verificador de la conjetura de Collatz.

Este programa verifica la [Conjetura de Collatz]:

  - Dado un entero positivo _n_, si este es par lo dividimos entre dos, y si     es impar lo multiplicamos por tres y sumamos uno.
  - Repetimos este procedimiento una y otra vez.

La conjetura de Collatz afirma que este proceso siempre termina, y más aún,siempre se llega al número uno. La comunidad matemática aún está en busca de una demostración de esto.

El programa contiene algunos casos de prueba y no es interactivo. Está escrito en el lenguaje de programación [Kotlin] y para usarlo sólo se requiere tener instalada la [Máquina virtual de Java] (JVM). Para ejecutar el programa en Linux basta con descargar el archivo _collatz.jar_, abrir la terminal en la ubicación de este archivo y ejecutar:

```sh
java -jar collatz.jar
```

La salida del programa es la siguiente:

```sh
Para el número 1 se verificó la conjetura de Collatz después de 0 pasos
Para el número 2 se verificó la conjetura de Collatz después de 1 pasos
Para el número 12 se verificó la conjetura de Collatz después de 9 pasos
Para el número 27 se verificó la conjetura de Collatz después de 111 pasos
Para el número 77031 se verificó la conjetura de Collatz después de 350 pasos
```

Este programa se realizó como parte del [Curso básico de Kotlin para Android: Fundamentos de 0 a 100].

[Conjetura de Collatz]: <https://es.wikipedia.org/wiki/Conjetura_de_Collatz>
[Kotlin]: <https://kotlinlang.org/>
[Máquina virtual de Java]: <https://www.java.com/es/download/help/whatis_java.html>
[Curso básico de Kotlin para Android: Fundamentos de 0 a 100]: <https://www.udemy.com/course/fundamentos-de-kotlin-android/>
