package de.atat072.notenprogramm.main;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;

public class Notenprogramm extends Game {

    public static Notenprogramm INSTANCE;
    public static Calculator C;

    public Notenprogramm(){
        INSTANCE = this;
        C= new Calculator();
        //just for testing
        ArrayList<Integer> test1 = new ArrayList<>();
        test1.add(8);
        test1.add(11);
        test1.add(10);
        test1.add(14);
        System.out.println(C.total(test1,true));
    }

    @Override
    public void create (){
        //setScreen(new LoginScreen());
    }
}
