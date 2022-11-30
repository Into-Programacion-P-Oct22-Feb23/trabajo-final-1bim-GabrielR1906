contador = 2
suma = 0
print("Ingrese un número par:")
numero = int(input())
if numero <= contador:
    print("error")
if numero % 2 == 0:
    while contador <= numero:
        suma = suma + contador
        contador = contador + 2
    print("La suma de los números pares del 2 hasta el número ingresado es:")
    print(suma)
else:
    print("Ese número no es par")
