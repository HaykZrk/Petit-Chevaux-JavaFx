package com.hayk.application;

import javafx.geometry.Point3D;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

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

    /**
     * Création d'un rectangle via les coordonnées, largeur, hauteur et couleur.
     * @param X : Coordonnée X
     * @param Y : Coordonnée Y
     * @param width : Largeur
     * @param height : Hauteur
     * @param color : Couleur
     * @return : Rectangle
     */
    public Rectangle rectangle (double X, double Y, double width, double height, Color color) {
        Rectangle rectangle = new Rectangle();
        rectangle.setX(X);
        rectangle.setY(Y);
        rectangle.setWidth(width);
        rectangle.setHeight(height);
        rectangle.setFill(color);
        rectangle.setOpacity(0.95);
        rectangle.setStroke(Color.BLACK);
        return rectangle;
    }

    /**
     * Création d'un bouton via les coordonnées, largeur, hauteur, taille de police, couleur et titre.
     * @param X
     * @param Y
     * @param width
     * @param height
     * @param fontSize
     * @param color
     * @param title
     * @return
     */
    public Button button (double X, double Y, double width, double height,
                          double fontSize, Color color, String title) {
        Button button = new Button(title);
        button.setLayoutX(X);
        button.setLayoutY(Y);
        button.setFont(new Font("Wide Latin", fontSize));
        button.setPrefSize(width, height);
        button.setBackground(Background.fill(color));
        button.setCursor(Cursor.HAND);
        return button;
    }

    /**
     * Création d'un cercle via les coordonnées et le rayon.
     * @param X
     * @param Y
     * @param r
     * @return
     */
    public Circle circle (double X, double Y, double r){
        Circle circle = new Circle();
        circle.setLayoutX(X);
        circle.setLayoutY(Y);
        circle.setRadius(r);
        return circle;
    }

    public ImageView image (String img,
                            double x, double y,
                            double width, double height,
                            double rotate, double rotationAxisX, double rotationAxisY, double rotationAxisZ,
                            double opacity) {

        ImageView image = new ImageView(new Image(getClass().getResource(img).toString()));
        image.setLayoutX(x);
        image.setLayoutY(y);
        image.setFitWidth(width);
        image.setFitHeight(height);
        image.setRotate(rotate);
        image.setRotationAxis(new Point3D(rotationAxisX, rotationAxisY, rotationAxisZ));
        image.setOpacity(opacity);
        return image;
    }


}
