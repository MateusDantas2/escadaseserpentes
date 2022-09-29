package br.com.softblue.jogo;

import br.com.softblue.jogo.core.Game;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Application {

    public static void main(String[] args) throws IOException {

        Game game = new Game();

        game.play();

    }
}