package edu.upc.eetac.dsa.models;

public class Partida {
    private String IdJuego;
    private String IdJugador;
    private int puntos;
    private String fecha;

    public Partida(){}

    public Partida(String IdJuego, String IdJugador, int puntos, String fecha){
        this.IdJuego = IdJuego;
        this.IdJugador = IdJugador;
        this.puntos = puntos;
        this.fecha = fecha;
    }

    public String getIdJuego() {
        return this.IdJuego;
    }

    public void setIdJuego(String idJuego) {
        this.IdJuego = idJuego;
    }

    public String getIdJugador() {
        return this.IdJugador;
    }

    public void setIdJugador(String idJugador) {
        this.IdJugador = idJugador;
    }

    public int getPuntos() {
        return this.puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
