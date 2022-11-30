cadena_final = ""
contador = 1
numerador = 1
suma = 0
while contador <= 100:
    suma = suma + float(numerador) / contador
    cadena_final = "%s+ %d/%d " %(cadena_final, numerador, contador)
    contador = contador + 1
cadena_final = "%s\nSuma Total: %d\n" %(cadena_final, suma)
print(cadena_final)
