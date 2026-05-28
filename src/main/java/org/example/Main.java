package org.example;


public class Main {
    public static void main(String[] args) {
        // 1. Instancias de objetos
        // Deben de cambiar estos objetos, creen los propios suyos, estos estan de referencia.

        Categoria comicsCat = new Categoria("Cómics y Marvel/DC", 45, 9.2);
        Categoria rpgCat = new Categoria("Videojuegos RPG y Fantasía", 35, 8.9);
        Categoria peliculasCat = new Categoria("Cine de Ciencia Ficción", 25, 7.5);

        Cosplayer bruce = new Cosplayer("Bruce Wayne", "Estados Unidos", 32, 8, EstiloCosplay.COMICS);
        Cosplayer geralt = new Cosplayer("Geralt de Rivia", "Polonia", 40, 15, EstiloCosplay.VIDEOJUEGOS);
        Cosplayer luke = new Cosplayer("Luke Skywalker", "Tatooine", 23, 3, EstiloCosplay.PELICULAS);

        Artista stan = new Artista("Stan Lee", "Estados Unidos", 95, "Wacom Cintiq Pro 24", 50);
        Artista yoji = new Artista("Yoji Shinkawa", "Japón", 54, "iPad Pro & Apple Pencil", 12);

        Agrupacion ligaDeLaJusticia = new Agrupacion("Liga de la Justicia de Chile", comicsCat);

        Panel panelRPG = new Panel(rpgCat, "19:00 hrs");

        // --- SECCIÓN DE PRUEBAS ---
        // Ej: agregar personas a categorías, meter miembros a la agrupación, montar el panel y llamar a mostrarInformacion().

        bruce.agregarCategoria(comicsCat);
        System.out.println("");
        geralt.agregarCategoria(rpgCat);
        System.out.println("");

        ligaDeLaJusticia.agregarMiembro(bruce);
        System.out.println("");
        ligaDeLaJusticia.agregarMiembro(stan);
        System.out.println("");
        panelRPG.agregarPanelista(geralt);
        System.out.println("");
        panelRPG.agregarPanelista(yoji);
        System.out.println("");
        panelRPG.mostrarInformacion();
        System.out.println("");
        bruce.realizarPresentacion();
        System.out.println("");
        yoji.realizarPresentacion();
    }
}