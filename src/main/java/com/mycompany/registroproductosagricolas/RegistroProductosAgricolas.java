package com.mycompany.registroproductosagricolas;


public class RegistroProductosAgricolas {

    public static void main(String[] args) {

        // Crear objetos con diferentes constructores
        ProductoAgricola producto1 = new ProductoAgricola();
        ProductoAgricola producto2 = new ProductoAgricola("Cacao");
        ProductoAgricola producto3 = new ProductoAgricola("Arroz", 0.80, 200);

        // Mostrar información
        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
        producto3.mostrarInformacion();
    }
}