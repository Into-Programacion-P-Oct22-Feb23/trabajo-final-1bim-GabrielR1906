print("Ingrese el nombre del empleado:")
nombre = input()
print("Ingrese el tipo de empleado:")
tipo = int(input("tipo: "))
print("Ingrese el número de horas trabajadas:")
horas = float(input())
print("Ingrese la cuota que se paga por hora:")
cuota = float(input())

if horas > 40:
    horas_extras = horas - 40
    if tipo == 1:
        horas_extras = (horas_extras * cuota) * 1.5
    elif tipo == 2:
        horas_extras = (horas_extras * cuota) * 2
    elif tipo == 3:
        horas_extras = (horas_extras * cuota) * 2.5
    elif tipo == 4:
        horas_extras = (horas_extras * cuota) * 3
    horas = 40 * cuota
    total = horas + horas_extras
else:
    total = cuota * horas
print(f"Nombre: {nombre}\nEl sueldo por pagar es: ${total}")
