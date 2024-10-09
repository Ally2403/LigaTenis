/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.persona.Juez;
import core.persona.Jugador;
import java.util.ArrayList;

/**
 *
 * @author Allison Ruiz
 */
public class LigaTenis {
    private ArrayList<Campeonato> campeonatos;
    private ArrayList<Juez> jueces;
    private ArrayList<Jugador> jugadores;

    public LigaTenis() {
        this.campeonatos = new ArrayList<>();
        this.jueces =  new ArrayList<>();
        this.jugadores =  new ArrayList<>();
    }
    
    public void calcSetsGanadosJugadoresCampeonato(int index){
        ArrayList<Jugador> jugadores = new ArrayList<>();
        for(Campeonato campeonato : this.campeonatos){
            int index1 = 0;
            if(index1 == index){
                for(Juego juego : campeonato.getJuegos()){
                    if(!jugadores.contains(juego.getJugador1())){
                        jugadores.add(juego.getJugador1());
                    }
                    if(!jugadores.contains(juego.getJugador2())){
                        jugadores.add(juego.getJugador2());
                    }
                }
            }else{
                index1++;
            }
        }
        for(Jugador jugador : jugadores){
            int setsGanados = 0;
            for(Juego juego : jugador.getJuegos()){
                for(Set set : juego.getSets()){
                    if(juego.getJugador1() == jugador){
                        if(set.getPuntosJugador1() > set.getPuntosJugador2()){
                            setsGanados++;
                        }
                    }else{
                        if(set.getPuntosJugador1() < set.getPuntosJugador2()){
                            setsGanados++;
                        }
                    }
                }
            }
            System.out.println("El jugador: " + jugador.getNombre() + " gano " + setsGanados + " sets en el campeonato");
        }
    }
    
    public boolean addCampeonato(Campeonato campeonato){
        if(!this.campeonatos.contains(campeonato)){
            this.campeonatos.add(campeonato);
            return true;
        }
        return false;
    }
    
    public boolean addJuez(Juez juez){
        if(!this.jueces.contains(juez)){
            this.jueces.add(juez);
            return true;
        }
        return false;
    }
    
    public boolean addJugador(Jugador jugador){
        if(!this.jugadores.contains(jugador)){
            this.jugadores.add(jugador);
            return true;
        }
        return false;
    }
    
    public Campeonato getCampeonato(int index){
        return this.campeonatos.get(index);
    }
    
    public Jugador getJugador(int index){
        return this.jugadores.get(index);
    }
    
    public Juez getJuez(int index){
        return this.jueces.get(index);
    }
}
