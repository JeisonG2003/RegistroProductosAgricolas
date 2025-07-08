package com.mycompany.registroproductosagricolas;

/**
 * Clase que representa un producto agrícola.
 * Incluye constructores por defecto, parametrizados y sobrecargados.
 */
public class ProductoAgricola {
    private String nombre;
    private double precioPorKilo;
    private double cantidadKilos;

    // Constructor por defecto
    public ProductoAgricola() {
        this.nombre = "Desconocido";
        this.precioPorKilo = 0.0;
        this.cantidadKilos = 0.0;
    }

    // Constructor con un parámetro (sobrecarga)
    public ProductoAgricola(String nombre) {
        this.nombre = nombre;
        this.precioPorKilo = 0.0;
        this.cantidadKilos = 0.0;
    }

    // Constructor con todos los parámetros (sobrecarga)
    public ProductoAgricola(String nombre, double precioPorKilo, double cantidadKilos) {
        this.nombre = nombre;
        this.precioPorKilo = precioPorKilo;
        this.cantidadKilos = cantidadKilos;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioPorKilo() {
        return precioPorKilo;
    }

    public double getCantidadKilos() {
        return cantidadKilos;
    }

    public double calcularTotal() {
        return precioPorKilo * cantidadKilos;
    }

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio por kilo: $" + precioPorKilo);
        System.out.println("Cantidad: " + cantidadKilos + " kg");
        System.out.println("Total estimado: $" + calcularTotal());
        System.out.println("-------------------------------");
    }
}