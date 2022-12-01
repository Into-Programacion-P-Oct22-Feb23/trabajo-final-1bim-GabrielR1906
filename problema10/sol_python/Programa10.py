suma = 0
contador = 0
bandera = True
media = 0
salida = ""
numero = 0
while bandera == True:
    print("Ingrese un numero")
    numero = float(input())
    suma = suma+numero
    contador = contador+1
    print("Si deseas dejar de ingresar numeros escribe (S,Si,si,s o salir)")
    salida = (input())
    if (salida == "S"):
        bandera=False
    if (salida == "Si"):
        bandera=False
    if (salida == "s"):
        bandera=False
    if (salida == "si"):
        bandera=False
    if (salida == "salir"):
        bandera=False
media= suma/contador
print("La medida es")
print(media)




