/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.persona;

import core.Juego;
import java.util.ArrayList;

/**
 *
 * @author Allison Ruiz
 */
public class Jugador extends Persona{
    private int sueldo;
    private ArrayList<Juego> juegos;

    public Jugador(String nombre, int sueldo) {
        super(nombre);
        this.sueldo = sueldo;
        this.juegos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }
    
    
    public boolean addJuego(Juego juego){
        if(!this.juegos.contains(juego)){
            this.juegos.add(juego);
            return true;
        }
        return false;
    }
}
