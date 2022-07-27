package com.hayk.jeu;

import com.hayk.application.Launcher;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Classe joueur possédant 4 chevaux.
 */
public class Joueur {
    private Cheval[] pions = new Cheval[4];
    private int positionJoueur = 0;
    public static int totalJoueur;
    private String colorPion;

    /**
     * Constructeur de joueur, max = 4.
     * @param root
     */
    public Joueur (Group root){
        if (totalJoueur == 4){
            totalJoueur = 0;
        }

        Circle[]circlePion = new Circle[4];
        if (totalJoueur == 0){
            circlePion[0] = Launcher.getFXObjectConstructor().circle(21.4285714 / 100 * Launcher.getLargeurScene(), 13.5 / 100 * Launcher.getHauteurScene(), 2.85714286 / 100 * Launcher.getLargeurScene());
            circlePion[1] = Launcher.getFXObjectConstructor().circle(21.4285714 / 100 * Launcher.getLargeurScene(), 26.5 / 100 * Launcher.getHauteurScene(), 2.85714286 / 100 * Launcher.getLargeurScene());
            circlePion[2] = Launcher.getFXObjectConstructor().circle(33.0 / 100 * Launcher.getLargeurScene(), 13.5 / 100 * Launcher.getHauteurScene(), 2.85714286 / 100 * Launcher.getLargeurScene());
            circlePion[3] = Launcher.getFXObjectConstructor().circle(33.0 / 100 * Launcher.getLargeurScene(), 26.5 / 100 * Launcher.getHauteurScene(), 2.85714286 / 100 * Launcher.getLargeurScene());
            colorPion = "Yellow";
        }
        else if (totalJoueur == 1){
            circlePion[0] = Launcher.getFXObjectConstructor().circle(21.4285714 / 100 * Launcher.getLargeurScene(), 59.0 / 100 * Launcher.getHauteurScene(), 2.85714286 / 100 * Launcher.getLargeurScene());
            circlePion[1] = Launcher.getFXObjectConstructor().circle(21.4285714 / 100 * Launcher.getLargeurScene(), 72.0 / 100 * Launcher.getHauteurScene(), 2.85714286 / 100 * Launcher.getLargeurScene());
            circlePion[2] = Launcher.getFXObjectConstructor().circle(33.0 / 100 * Launcher.getLargeurScene(), 59.0 / 100 * Launcher.getHauteurScene(), 2.85714286 / 100 * Launcher.getLargeurScene());
            circlePion[3] = Launcher.getFXObjectConstructor().circle(33.0 / 100 * Launcher.getLargeurScene(), 72.0 / 100 * Launcher.getHauteurScene(), 2.85714286 / 100 * Launcher.getLargeurScene());
            colorPion = "Red";
        }
        else if (totalJoueur == 2){
            circlePion[0] = Launcher.getFXObjectConstructor().circle(67.0 / 100 * Launcher.getLargeurScene(), 13.5 / 100 * Launcher.getHauteurScene(), 2.85714286 / 100 * Launcher.getLargeurScene());
            circlePion[1] = Launcher.getFXObjectConstructor().circle(67.0 / 100 * Launcher.getLargeurScene(), 26.5 / 100 * Launcher.getHauteurScene(), 2.85714286 / 100 * Launcher.getLargeurScene());
            circlePion[2] = Launcher.getFXObjectConstructor().circle(79.0 / 100 * Launcher.getLargeurScene(), 13.5 / 100 * Launcher.getHauteurScene(), 2.85714286 / 100 * Launcher.getLargeurScene());
            circlePion[3] = Launcher.getFXObjectConstructor().circle(79.0 / 100 * Launcher.getLargeurScene(), 26.5 / 100 * Launcher.getHauteurScene(), 2.85714286 / 100 * Launcher.getLargeurScene());
            colorPion = "Green";
        }
        else if (totalJoueur == 3){
            circlePion[0] = Launcher.getFXObjectConstructor().circle(67.0 / 100 * Launcher.getLargeurScene(), 59.0 / 100 * Launcher.getHauteurScene(), 2.85714286 / 100 * Launcher.getLargeurScene());
            circlePion[1] = Launcher.getFXObjectConstructor().circle(67.0 / 100 * Launcher.getLargeurScene(), 72.0 / 100 * Launcher.getHauteurScene(), 2.85714286 / 100 * Launcher.getLargeurScene());
            circlePion[2] = Launcher.getFXObjectConstructor().circle(79.0 / 100 * Launcher.getLargeurScene(), 59.0 / 100 * Launcher.getHauteurScene(), 2.85714286 / 100 * Launcher.getLargeurScene());
            circlePion[3] = Launcher.getFXObjectConstructor().circle(79.0 / 100 * Launcher.getLargeurScene(), 72.0 / 100 * Launcher.getHauteurScene(), 2.85714286 / 100 * Launcher.getLargeurScene());
            colorPion = "Blue";
        }

        pions[0] = new Cheval(root, circlePion[0], Color.BLACK);
        ImageView chevalImage1 = new ImageView(new Image(Cheval.class.getResource("Images/PlayChevalPionImage" + colorPion + ".png").toString()));
        chevalImage1.setLayoutY(circlePion[0].getLayoutY() - circlePion[0].getRadius());
        chevalImage1.setLayoutX(circlePion[0].getLayoutX() - circlePion[0].getRadius());
        chevalImage1.setFitWidth(circlePion[0].getRadius() * 2);
        chevalImage1.setFitHeight(circlePion[0].getRadius() * 2);


        pions[1] = new Cheval(root, circlePion[1], Color.BLACK);
        ImageView chevalImage2 = new ImageView(new Image(Cheval.class.getResource("Images/PlayChevalPionImage" + colorPion + ".png").toString()));
        chevalImage2.setLayoutY(circlePion[1].getLayoutY() - circlePion[1].getRadius());
        chevalImage2.setLayoutX(circlePion[1].getLayoutX() - circlePion[1].getRadius());
        chevalImage2.setFitWidth(circlePion[1].getRadius() * 2);
        chevalImage2.setFitHeight(circlePion[1].getRadius() * 2);

        pions[2] = new Cheval(root, circlePion[2], Color.BLACK);
        ImageView chevalImage3 = new ImageView(new Image(Cheval.class.getResource("Images/PlayChevalPionImage" + colorPion + ".png").toString()));
        chevalImage3.setLayoutY(circlePion[2].getLayoutY() - circlePion[2].getRadius());
        chevalImage3.setLayoutX(circlePion[2].getLayoutX() - circlePion[2].getRadius());
        chevalImage3.setFitWidth(circlePion[2].getRadius() * 2);
        chevalImage3.setFitHeight(circlePion[2].getRadius() * 2);

        pions[3] = new Cheval(root, circlePion[3], Color.BLACK);
        ImageView chevalImage4 = new ImageView(new Image(Cheval.class.getResource("Images/PlayChevalPionImage" + colorPion + ".png").toString()));
        chevalImage4.setLayoutY(circlePion[3].getLayoutY() - circlePion[3].getRadius());
        chevalImage4.setLayoutX(circlePion[3].getLayoutX() - circlePion[3].getRadius());
        chevalImage4.setFitWidth(circlePion[3].getRadius() * 2);
        chevalImage4.setFitHeight(circlePion[3].getRadius() * 2);


        root.getChildren().addAll(chevalImage1, chevalImage2, chevalImage3, chevalImage4);
        totalJoueur++;
    }


    /**
     * Valeur booléenne indiquant si le joueur est arrivé.
     * @return
     */
    public boolean is_JoueurArrive() {
        if (positionJoueur != 0)
            return true;
        return false;
    }

    /**
     * Accès aux chevaux du joueur.
     * @return
     */
    public Cheval[] getPions (){
        return pions;
    }

    /**
     * Accès à la position du joueur, par défaut = 0.
     * @return
     */
    public int getPositionJoueur () {
        return positionJoueur;
    }
}
