package org.example;

public class Categoria {
    private String nombre;
    private int numeroCuposMaximos;
    private double popularidadEstimada;

    public Categoria(String nombre, int numeroCuposMaximos, double popularidadEstimada) {
        this.nombre = nombre;
        this.numeroCuposMaximos = numeroCuposMaximos;
        this.popularidadEstimada = popularidadEstimada;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: "+getNombre());
        System.out.println("Numero de cupos maximos: "+getNumeroCuposMaximos());
        System.out.println("Popularidad estimada: "+getPopularidadEstimada());
        // TODO: Completar lógica método (imprimir los atributos de la categoría)
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getNumeroCuposMaximos() { return numeroCuposMaximos; }
    public void setNumeroCuposMaximos(int numeroCuposMaximos) { this.numeroCuposMaximos = numeroCuposMaximos; }
    public double getPopularidadEstimada() { return popularidadEstimada; }
    public void setPopularidadEstimada(double popularidadEstimada) { this.popularidadEstimada = popularidadEstimada; }
}
