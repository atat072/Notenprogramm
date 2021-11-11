package de.atat072.notenprogramm.main;

import com.badlogic.gdx.Game;
import de.atat072.notenprogramm.screens.LoginScreen;

public class Notenprogramm extends Game {

    public static Notenprogramm INSTANCE;

    public Notenprogramm(){
        INSTANCE = this;
    }
    @Override
    public void create (){
        setScreen(new LoginScreen());
    }
}
