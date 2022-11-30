print ("Ingrese el valor de X")
x = float(input())
print ("Ingrese el valor de Y")
y = float(input())
valor1=()
valor2=()
if (x > 0):
    valor1="Positivo"
elif (x < 0):
    valor1="Negativo"
if (y > 0):
    valor2="Positivo"
elif (y < 0):
    valor2="Negativo"
if (valor1 == "Positivo") & (valor2 == "Positivo"):
    print("Sus coordenadas pertenecen al cuadrante 1")
elif (valor1 == "Negativo") & (valor2 == "Positivo"):
    print("Sus coordenadas pertenecen al cuadrante 2")
elif (valor1 == "Negativo") & (valor2 == "Negativo"):
    print("Sus coordenadas pertenecen al cuadrante 3")
elif (valor1 == "Positivo") & (valor2 == "Negativo"):
    print("Sus coordenadas pertenecen al cuadrante 4")