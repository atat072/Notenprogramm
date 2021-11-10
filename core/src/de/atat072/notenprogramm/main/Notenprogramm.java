package de.atat072.notenprogramm.main;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

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
