package edu.upc.eetac.dsa.models;

import java.util.LinkedList;
import java.util.List;

public class User {
    private String IdUser;
    List<Partida> PartidasJugadas;
    LinkedList<Partida> Partida;

    public User(){}

    public User(String Id){
        this.IdUser = Id;
        this.PartidasJugadas = new LinkedList<>();
        this.Partida = new LinkedList<>();
    }

    public String getIdUser() {
        return this.IdUser;
    }

    public void setIdUser(String idUser) {
        this.IdUser = idUser;
    }

    public List<Partida> getPartidasJugadas(){
        return this.PartidasJugadas;
    }

    public void setPartidasJugadas(List<Partida> PartidasJugadas){
        this.PartidasJugadas = PartidasJugadas;
    }

    public List<Partida> getPartidasActual(){
        return this.Partida;
    }

    public void setPartidaActual(LinkedList<Partida> Partida){
        this.Partida = Partida;
    }
}
