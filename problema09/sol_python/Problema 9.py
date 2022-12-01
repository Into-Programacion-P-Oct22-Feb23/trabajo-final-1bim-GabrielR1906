a = 0
b = 0
contador = 0
mensaje = ""
mas = "+"
menos = "-"
resultado = 0

while (contador <= 3):
    contador = contador+1
    a = a+12
    b = b+11
    resultado = resultado+float(a)-b
    if (b == 44):
        mas = ""
    mensaje = "%s%d%s%d%s" % (mensaje, a, menos, b, mas)

print("S1= "+mensaje)
print(f"El resultado es: ",resultado)
