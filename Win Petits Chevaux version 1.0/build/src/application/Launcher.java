package com.hayk.application;
import java.awt.*;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

/**
 * Fichier principal qui lance le menu.
 */
public class Launcher extends Application {
    private static final GraphicsDevice ECRAN_USER = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    private static final int largeurStage = ECRAN_USER.getDisplayMode().getWidth();
    private static final int hauteurStage = ECRAN_USER.getDisplayMode().getHeight();
    private static double largeurScene = largeurStage/3.0;
    private static double hauteurScene = hauteurStage/2.5;
    private static InterfaceFXObjectConstruction FXObjectConstructor = new InterfaceFXObjectConstruction();
    private static MediaPlayer mP;

    /**
     * Récupération du média player.
     * @return : Le media player
     */
    public static MediaPlayer getmP() {
        return mP;
    }

    /**
     * Récupération de la largeur de la scène.
     * @return : La largeur de la scène
     */
    public static double getLargeurScene() {
        return largeurScene;
    }

    /**
     * Récupération de la hauteur de la scène.
     * @return : La hauteur de la scène
     */
    public static double getHauteurScene() {
        return hauteurScene;
    }

    /**
     * Permet la modification de la largeur de la scène.
     * @param largeurScene
     */
    public static void setLargeurScene(double largeurScene){Launcher.largeurScene = largeurScene;}

    /**
     * Permet la modification de la hauteur de la scène.
     * @param hauteurScene
     */
    public static void setHauteurScene(double hauteurScene){Launcher.hauteurScene = hauteurScene;}

    /**
     * Récupération de l'usine de construction d'objets.
     * @return : Usine de construction
     */
    public static InterfaceFXObjectConstruction getFXObjectConstructor() {
        return FXObjectConstructor;
    }

    /**
     * Lancement du menu.
     * @param stage the primary stage for this application, onto which
     * the application scene can be set.
     * Applications may create other stages, if needed, but they will not be
     * primary stages.
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Scene sceneMenu = new Scene(loadFXML("XML/Menu"));
        mP = getFXObjectConstructor().media("Audio/MenuFlammeSon.mp3");
        mP.setVolume(0.5);

        stage.setMinWidth(716);
        stage.setMinHeight(839);
        stage.setScene(sceneMenu);
        stage.setTitle("Petits Chevaux");
        stage.getIcons().add(new Image(Launcher.class.getResourceAsStream("Images/ApplicationIcon.png")));
        stage.show();
    }

    /**
     * Permet le chargement d'un fichier FXML.
     * @param fxml : Nom du fichier FXML
     * @return : Le chargement du fichier FXML
     * @throws IOException
     */
    public static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Launcher.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /**
     * Fonction main qui lance le menu via le start().
     * @param args
     */
    public static void main(String[] args) {
        launch();
    }

}