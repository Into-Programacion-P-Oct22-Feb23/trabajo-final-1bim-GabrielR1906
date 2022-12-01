contador = 1
mensaje = ""
mensaje2 = ""
print("Ingrese una medida (N) en número de metros:")
medida = float(input())
while contador < medida:
    cm = float(contador) * 100
    pulgada = float(cm) / 2.54
    pie = float(pulgada) / 12
    yardas = float(pie) / 3
    if contador <= 9:
        mensaje = "%s %d       %.2f    %.2f\t    %.2f\n" % (mensaje, contador, yardas, pulgada, pie)
    contador = contador + 1
    if contador >= 10:
        mensaje2 = "%s %d\t\t %.2f\t %.2f     %.2f\n" % (mensaje2, contador, yardas, pulgada, pie)
print("Metros\tYardas\tPulgadas\tPies\n" + mensaje + mensaje2)
