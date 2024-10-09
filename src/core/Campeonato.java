/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author Allison Ruiz
 */
public class Campeonato {
    private ArrayList<Juego> juegos;

    public Campeonato() {
        this.juegos = new ArrayList<>();
    }
    
    public void showResumen(){
        System.out.println("-------- Resultados --------");
        for(Juego juego : this.juegos){
            System.out.println("Jugador 1: " + juego.getJugador1());
            System.out.println("Jugador 2: " + juego.getJugador2());
            System.out.println("Juez: " + juego.getJuez());
            for(Set set : juego.getSets()){
                int i = 1;
                System.out.println("Set " + i + ": " + set.getPuntosJugador1() + " - " + set.getPuntosJugador2());
                i++;
            }
            System.out.println("Ganador: " + juego.getWinner() + "\n");
        }
        System.out.println("El ganador del campeonato es: " + this.juegos.get(this.juegos.size() - 1).getWinner().getNombre() + "\n");
    }
    
    public boolean addJuego(Juego juego){
        if(!this.juegos.contains(juego)){
            this.juegos.add(juego);
            return true;
        }
        return false;
    }

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }
    
    public Juego getJuego(int index){
        return this.juegos.get(index);
    }
}
