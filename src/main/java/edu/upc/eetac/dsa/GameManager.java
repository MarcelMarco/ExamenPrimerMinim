package edu.upc.eetac.dsa;

public interface GameManager {
    public void addGame(String IdGame, String descripcion, int niveles);
    public void addUser(String IdUser);
    public void addPartidaActual(String IdJuego, String IdUsuario);
    //public void addJuegosUser(String IdUser, String IdGame);
    //public List<Game> partidasUser(String IdUser);
    public int numUsers();
    public int numGames();
    public void NextLevel(String IdUser,int puntos, String fecha);
    public int consultarPuntos(String IdUser);

}
