cantidad = int(input("Ingrese la cantidad de trajes: "))
precio = float(input("Ingrese el precio unitario de los trajes: $"))
subtotal = cantidad * precio
descuento = 0
total = subtotal
if cantidad == 1:
    descuento = (subtotal * 20) / 100
    total = subtotal - descuento
elif cantidad == 2:
    descuento = (subtotal * 25) / 100
    total = subtotal - descuento
elif cantidad == 3:
    descuento = (subtotal * 40) / 100
    total = subtotal - descuento
elif cantidad > 3:
    descuento = (subtotal * 50) / 100
    total = subtotal - descuento
print(f"El subtotal por pagar es: ${subtotal}\nEl descuento es: ${descuento}\nEl total por pagar es: "
      f"${total}")
