package org.example;

public class Artista extends Persona implements Interactivable {
    private String marcaTableta;
    private int cantidadArtbooksPublicados;

    public Artista(String nombre, String paisOrigen, int edad, String marcaTableta, int cantidadArtbooksPublicados) {
        super(nombre, paisOrigen, edad);
        this.marcaTableta = marcaTableta;
        this.cantidadArtbooksPublicados = cantidadArtbooksPublicados;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: "+getNombre()+" - Pais: "+getPaisOrigen()+" -  Edad: "+getEdad()+" años");

        System.out.println("Tableta: "+getMarcaTableta()+" -  Artbooks: "+getCantidadArtbooksPublicados());
        // TODO: Completar lógica método (imprimir datos base de Persona y específicos de Artista)
    }

    @Override
    public void realizarPresentacion() {
        System.out.println("Hoy se presenta "+getNombre());
        System.out.println("Con la tableta "+marcaTableta);
        System.out.println("Con una cantidad de "+cantidadArtbooksPublicados+" artbooks publicados");
        // TODO: Completar lógica método (simular presentación, mostrar portafolio y artbooks)
    }

    // Getters y Setters
    public String getMarcaTableta() { return marcaTableta; }
    public void setMarcaTableta(String marcaTableta) { this.marcaTableta = marcaTableta; }
    public int getCantidadArtbooksPublicados() { return cantidadArtbooksPublicados; }
    public void setCantidadArtbooksPublicados(int cantidadArtbooksPublicados) { this.cantidadArtbooksPublicados = cantidadArtbooksPublicados; }
}
