package org.example;

import java.util.ArrayList;
import java.util.List;

public class Agrupacion {
    private String nombreGrupo;
    private List<Persona> miembros; // Relación de agregación (acepta Cosplayers y Artistas por Polimorfismo)
    private Categoria categoriaPrincipal;

    public Agrupacion(String nombreGrupo, Categoria categoriaPrincipal) {
        this.nombreGrupo = nombreGrupo;
        this.categoriaPrincipal = categoriaPrincipal;
        this.miembros = new ArrayList<>();
    }

    public void agregarMiembro(Persona persona) {
        miembros.add(persona);
        System.out.println("Miembro agregado");
        // TODO: Completar lógica método
    }

    public void eliminarMiembro(Persona persona) {
        if (miembros.remove(persona)){
            System.out.println("Miembro eliminado");
        }else System.out.println("No hay nadie");


        // TODO: Completar lógica método
    }

    public void mostrarInformacion() {
        System.out.println("Categoria: "+categoriaPrincipal.getNombre());
        for (Persona c : miembros){
            System.out.println(c.getNombre());

        }
        // TODO: Completar lógica método (detalles del grupo, su categoría y recorrer la lista de miembros)
    }

    // Getters y Setters
    public String getNombreGrupo() { return nombreGrupo; }
    public void setNombreGrupo(String nombreGrupo) { this.nombreGrupo = nombreGrupo; }
    public List<Persona> getMiembros() { return miembros; }
    public Categoria getCategoriaPrincipal() { return categoriaPrincipal; }
    public void setCategoriaPrincipal(Categoria categoriaPrincipal) { this.categoriaPrincipal = categoriaPrincipal; }
}
