package com.hayk.jeu;

import com.hayk.application.Launcher;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Classe qui représente un cheval ou pion.
 */
public class Cheval {
    private Color couleur;
    private Circle cercle;
    private boolean pointArrive = false;

    /**
     * Constructeur du cheval.
     * @param root
     * @param cercle
     * @param couleur
     */
    public Cheval (Group root, Circle cercle, Color couleur) {
        this.cercle = cercle;
        cercle.setFill(couleur);
        root.getChildren().add(cercle);
    }

    /**
     * Récupération du pion sous forme de cercle.
     * @return
     */
    public Circle getCercle() {
        return cercle;
    }

    /**
     * Valeur booléenne qui indique si le cheval est arrivé.
     * @return
     */
    public boolean isPointArrive() {
        return pointArrive;
    }

    /**
     * Setter permettant le changement de la valeur booléenne si le cheval est arrivé.
     * @param pointArrive
     */
    public void setPointArrive(boolean pointArrive) {
        this.pointArrive = pointArrive;
    }
}