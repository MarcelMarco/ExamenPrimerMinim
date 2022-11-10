package edu.upc.eetac.dsa;

import edu.upc.eetac.dsa.models.Game;
import edu.upc.eetac.dsa.models.User;
import edu.upc.eetac.dsa.models.Partida;
import org.apache.log4j.Logger;
import java.util.*;

public class GameManagerImpl implements GameManager{
    private static GameManager instance;
    List<Game> games;
    Map<String, User> users;
    Map<String, Partida> partidaactual;


    final static Logger logger = Logger.getLogger(GameManagerImpl.class);

    public static GameManager getInstance() {
        if (instance==null) instance = new GameManagerImpl();
        return instance;
    }

    public GameManagerImpl(){
        this.games = new ArrayList<>();
        this.users = new HashMap<>();
        this.partidaactual = new HashMap<>();
    }

    @Override
    public void addGame(String IdGame, String descripcion, int niveles) {
        this.games.add(new Game(IdGame,descripcion, niveles));
    }

    @Override
    public void addUser(String IdUser) {
        this.users.put(IdUser,new User(IdUser));
    }

    @Override
    public void addPartidaActual(String IdJuego, String IdUsuario) {
        this.partidaactual.put(IdUsuario, new Partida(IdJuego, IdUsuario,50, "XX/XX/XXXX"));
    }

//    @Override
//    public void addJuegosUser(String IdUser, String IdGame) {
//        this.users.get(IdUser).setPartidasJugadas(IdGame);
//    }

//    @Override
//    public List<PartidaActual> partidasUser(String IdUser) {
//        return this.users.get(IdUser).getPartidasJugadas();
//    }

    @Override
    public int numUsers() {
        return users.size();
    }

    @Override
    public int numGames() {
        return games.size();
    }

    @Override
    public void NextLevel(String IdUser, int puntos, String fecha) {
    }

    @Override
    public int consultarPuntos(String IdUser) {
        return this.partidaactual.get(IdUser).getPuntos();
    }
}
