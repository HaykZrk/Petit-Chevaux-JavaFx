
package com.hayk.application;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.net.URISyntaxException;

/**
 * Constructeur ou usine de consqtruction d'objects graphique personalisé.
 */
public class InterfaceFXObjectConstruction {

    /**
     * Retourne un média avec le fichier mp3 assigné.
     * @param soundMenu : Chemin du fichier audio
     * @return : MediaPlayer
     * @throws URISyntaxException
     */
    public MediaPlayer media (String soundMenu) throws URISyntaxException {
        Media media = new Media(InterfaceFXObjectConstruction.class.getResource(soundMenu).toURI().toString());
        MediaPlayer mP = new MediaPlayer(media);
        mP.setAutoPlay(true);
        return mP;
    }
}
