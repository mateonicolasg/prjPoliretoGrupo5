/*  Copyright (C) 2K23, patmic_trainer
 *  pat_mic@hotmail.com
 *  Version 2.0
 */

# patmic_POLIRETOS

Es hora de saber hasta donde puedes llegar, para lo cual debes cumplir con:

- Al iniciar el programa se debe presentar nombre del grupo
- Al iniciar el programa se debe presentar los integrantes del grupo:  apellido.nombre
- Solicitar el numero de términos/niveles/palabra a generar y pasarlo como parámetro
- Usar for, doWhile, while para la realizacion de cada serie
- El nombre de cada método debe ser su NombreGrupo
- La solucion debe estar bajo el contexto Orientado a Objetos O.O.


>> Series numericas:

### Edison vera
    S5:  2	 3	 5 	 7	 11	 13	 17	 19	 23	 29	 31	...
	S6:  1  4   9   16  25  36  49  64 ....
### Estefano Santacruz
    S7:  1  4  7  10  13  16  19  22  25  ...
    S8:  3, 8, 13, 18, 23, 28, 33, 38, ...

>> Series de caracteres: 

    S3:  ++	 +++ +++++ +++++++ +++++++++++ +++++++++++++ ...    David Unaucho

>> Figuras: se debe pedir tamaño/niveles

    F1:     * * * * *
            *       *
            *       *  
            *       *           David Unaucho
            * * * * *

    F2:     * + * + *
            +       +           David Unaucho
            *       *   
            +       +
            * + * + *

	F7: 
            ___
                |___
                    |___
                        |___
                            |___            Edison Vera
    
    F8:
                            ___
                        ___|
                    ___|                    Edison Vera
                ___|
            ___|

	F9:
                            ___   
                        ___|   |___
                    ___|	   	   |___
                ___|		   		   |___
            ___|			   			   |___     

	F10:
            _+_
                |_-_
                    |_+_                        
                        |_-_
                            |_+_
                                |

    F11:
            | _ 
               | _ _
                    | _ _ _
                           | _ _ _ _            
                                    | _ _ _ _ _
                   
	F12:
            ...
            123456789
            12345678
            1234567
            123456
            12345
            1234
            123
            12                  Edison Vera
            1

	F13:
            1
            12
            123
            1234
            12345               Edison Vera
            123456
            1234567
            12345678
            123456789
            ...

    F14:
                        1
                      1    1
                    1    2    1
                  1    3    3    1
               1    4    6    4    1            Estefano Santacruz
             1   5   10    10    5   1
            ....

	F15: 
            1
            1	1
            1	2	1
            1   3   3    1                      Estefano Santacruz
            1   4   6    4    1
            1   5   10   10   5   1
            ....

>> Cadena de caracteres:

	C01)    Pedir una frase y contador las vocales. 
            Ejemplo, frase: ballena                     David Unaucho
                    salida: tiene 3 vocales

	C02)    Pedir una frase y contador las letras.  
            Ejemplo, frase : ballena                    David Unaucho
                    salida: tiene 4 letras

	C03)    Pedir una frase y una vocal, eliminar la vocal ingresada de la frase. 
            Ejemplo, frase: ballena azul  
                    vocal : a                           Edison Vera
                    salida: b ll n   z l

	C04)    Pedir una frase y una letra, eliminar la letra ingresada de la frase. 
            Ejemplo, frase: ballena azul  
                    letra : l                           
                    salida: ba  ena azu 
	
	C08)    Anagramas de palabras. 
            Se forman cuando se utilizan todas las letras de una palabra pero modificando el orden.
            Mostrar una palabra de un conjunto y solicita que ingrese el Anagramas de esa palabra.
            Si falla a la tercera mostrar la respuesta
                Ejemplo, palabra : delira                                                               Estefano Santacruz
                         salida  : lidera 
            conjunto = {delira, lidera, Ballena: llenaba, Alondra, Ladrona, España, apañes, Enrique, quieren}

>> Arrays

    A01)    Crear una array para cada palabra de su nombre e ingrese el porcentaje de carga para cada palabra.
            Ejemplo:    Pancracia Carmeliana Altamirano Perez 
            
            Ingrese el porcentaje de carga: 100 75 50 25
            Pancracia Carmeliana Altamirano Perez 

            [==============>] 100% Pancracia                                                David Unaucho
            [==========>    ]  75% Carmeli
            [=======>       ]  50% Altam
            [===>           ]  25% Pe

    A02)    Crear una matriz solicitando el tamaño y caracter para almacenar la iniciales de su nombre y apellido y presentar la matriz
            Ejemplo:    Mi nombre es Patricio Paccha => PP    
            Ingrese el tamaño: 5
            Ingrese caracter : *

            *****   *****      
            *   *   *   *                                       
            *****   *****      
            *       *                               
            *       *  


    A03)    Dibujar un plano de coordenadas positivo y graficar f(x) = 2x usando como caracteres las letras de su nombre
            Ejemplo:    patmic

            6 |            c
            5 |          i
            4 |        m
            3 |      t
            2 |    a                            Edison Vera
            1 |  p
            0 |______________________
            

    A04)    Crear un matriz donde forme una X con su nombre y apellido

            P                           P
                a                   a
                    t           c
                        r   c
                        h   i                   Estefano Santacruz
                    a           c
                                    i
                                        o

    A05)    Crear un matriz cuadrada del tamaño de su nombre, colocar cada letra de sus nombres completos de forma randomica/aleatorio.
            En el caso que conincidan las posiciones poner un *. 
            Para visulizar el proceso usar un delay 

            P                           P
                a                   a
                M   *   i   h   c   e   l               
                        r   c
                        h   i
            A   n   *   a   *   *   a   r
                                    i
                                        o

>> Loading, Usar el delay para animar      
    L08) Pedir el nombre y apellidos y realizar la carga mostrando letra a letra hasta el 100% 
        [Patricio            ] 50%                      Estefano Santacruz

	L09) Pedir y mostrar el nombre completo, mostrando solo una letra en la misma linea 0% hasta 100% 
		Ejemplo: Patricio Paccha
          t                 15%
		 	r				20%
		        o       	50%                         Estefano Santacruz
		               a    100%

	L10) Desplazar la figura a la derecha y regresar
           \|||/
           (> <)       
        ooO-(_)-Ooo                                     David Unaucho

>> Recursion
    R01) crear un metodo recursivo para obtener factorial(n)  Edison Vera
    R05) crear un metodo recursivo para obtener la conteoProgregresivoHasta(n) / imprimir el avance   
    R06) crear un metodo recursivo para obtener la conteoRegresivo(n)  hasta 0 / imprimir el avance     Estefano Santacruz
    
    Extra si usa memoria retenida en la recursiones 
