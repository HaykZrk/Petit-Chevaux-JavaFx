package com.hayk.dessin;

import com.hayk.application.Launcher;
import com.hayk.jeu.Joueur;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Construction du plateau du jeu.
 */
public class ConstructionPlateau {
    private Group root;
    private Stage stage;

    /**
     * Constructeur du plateau.
     * @param stage
     */
    public ConstructionPlateau(Stage stage) {
        this.stage = stage;
        root = new Group();
        constrcutionEcurie();
        constructionChemin();

        ImageView playChevalImage = Launcher.getFXObjectConstructor().image("Images/PlayChevalImage.png",
                                                                            49.4285714 / 100 * Launcher.getLargeurScene(),
                                                                            1.0 / 100 * Launcher.getHauteurScene(),
                                                                         50.0 / 100 * Launcher.getLargeurScene(),
                                                                         85.1742857 / 100 * Launcher.getHauteurScene(),
                                                                         180, 0, 90, 0,
                                                                         0.2);

        ImageView playChevalImage2 = Launcher.getFXObjectConstructor().image("Images/PlayChevalImage.png",
                                                                            0,
                                                                            1.0 / 100 * Launcher.getHauteurScene(),
                                                                            50.0 / 100 * Launcher.getLargeurScene(),
                                                                            85.1742857 / 100 * Launcher.getHauteurScene(),
                                                                            0, 0, 0, 0,
                                                                            0.2);

        boutonAbandon();
        root.getChildren().addAll(playChevalImage, playChevalImage2);
        Joueur j1 = new Joueur(root);
        Joueur j2 = new Joueur(root);
        Joueur j3 = new Joueur(root);
        Joueur j4 = new Joueur(root);

        Scene scenePlateau = new Scene(root, Launcher.getLargeurScene(), Launcher.getHauteurScene());
        stage.setScene(scenePlateau);
        stage.show();
    }

    /**
     * Construction du chemin du plateau.
     */
    public void constructionChemin () {
        double width = (Launcher.getLargeurScene() - 14.2857143 / 100 * Launcher.getLargeurScene() - 25.7142857 / 100 * Launcher.getLargeurScene() - 10) -
                       (14.2857143 / 100 * Launcher.getLargeurScene() + 25.7142857 / 100 * Launcher.getLargeurScene() + 10);
        width = width / 3;

        double height = (Launcher.getHauteurScene() - 14.2857143 / 100 * Launcher.getHauteurScene() - 7.14285714 / 100 * Launcher.getHauteurScene() - 25.7142857 / 100 * Launcher.getHauteurScene()) -
                        (7.14285714 / 100 * Launcher.getHauteurScene() + 25.7142857 / 100 * Launcher.getHauteurScene());
        height = height - 4.28571429 / 100 * Launcher.getHauteurScene() * 3;
        height = height / 2;

        for (int i = 0; i < 7; i++){
            Rectangle passageJaune = Launcher.getFXObjectConstructor().rectangle(
                    14.2857143 / 100 * Launcher.getLargeurScene() + 25.7142857 / 100 * Launcher.getLargeurScene() + 10,
                    7.14285714 / 100 * Launcher.getHauteurScene() + 4.28571429 / 100 * Launcher.getHauteurScene() * i,
                    width,
                    4.28571429 / 100 * Launcher.getHauteurScene(),
                    Color.YELLOW
            );
            root.getChildren().add(passageJaune);
        }

        for (int i = 0; i < 8; i++){
            Rectangle passageJaune;
            if (i == 7){
                passageJaune = Launcher.getFXObjectConstructor().rectangle(
                        14.2857143 / 100 * Launcher.getLargeurScene() + 25.7142857 / 100 * Launcher.getLargeurScene() + 10 + width,
                        7.14285714 / 100 * Launcher.getHauteurScene() + 4.28571429 / 100 * Launcher.getHauteurScene() * i,
                        width,
                        height,
                        Color.GREEN
                );
            }
            else {
                passageJaune = Launcher.getFXObjectConstructor().rectangle(
                        14.2857143 / 100 * Launcher.getLargeurScene() + 25.7142857 / 100 * Launcher.getLargeurScene() + 10 + width,
                        7.14285714 / 100 * Launcher.getHauteurScene() + 4.28571429 / 100 * Launcher.getHauteurScene() * i,
                        width,
                        4.28571429 / 100 * Launcher.getHauteurScene(),
                        Color.GREEN
                );
            }
            root.getChildren().add(passageJaune);
        }

        for (int i = 1; i < 7; i++){
            Rectangle passageJaune = Launcher.getFXObjectConstructor().rectangle(
                    14.2857143 / 100 * Launcher.getLargeurScene() + 25.7142857 / 100 * Launcher.getLargeurScene() + 10 + width*2,
                    7.14285714 / 100 * Launcher.getHauteurScene() + 4.28571429 / 100 * Launcher.getHauteurScene() * i,
                    width,
                    4.28571429 / 100 * Launcher.getHauteurScene(),
                    Color.GREEN
            );
            root.getChildren().add(passageJaune);
        }

        for (int i = 1; i < 7; i++){
            Rectangle passageRouge = Launcher.getFXObjectConstructor().rectangle(
                    14.2857143 / 100 * Launcher.getLargeurScene() + 25.7142857 / 100 * Launcher.getLargeurScene() + 10,
                    Launcher.getHauteurScene() - 14.2857143 / 100 * Launcher.getHauteurScene() - 7.14285714 / 100 * Launcher.getHauteurScene() -
                            25.7142857 / 100 * Launcher.getHauteurScene() + 25.7142857 / 100 * Launcher.getHauteurScene()
                            - 4.28571429 / 100 * Launcher.getHauteurScene() * (i+1),
                    width,
                    4.28571429 / 100 * Launcher.getHauteurScene(),
                    Color.DARKRED
            );
            root.getChildren().add(passageRouge);
        }

        for (int i = 0; i < 8; i++){
            Rectangle passageRouge;
            if (i == 7) {
                passageRouge = Launcher.getFXObjectConstructor().rectangle(
                        14.2857143 / 100 * Launcher.getLargeurScene() + 25.7142857 / 100 * Launcher.getLargeurScene() + 10 + width,
                        Launcher.getHauteurScene() - 14.2857143 / 100 * Launcher.getHauteurScene() - 7.14285714 / 100 * Launcher.getHauteurScene() -
                                25.7142857 / 100 * Launcher.getHauteurScene() + 25.7142857 / 100 * Launcher.getHauteurScene() -
                                4.28571429 / 100 * Launcher.getHauteurScene() * (7) - height,
                        width,
                        height,
                        Color.DARKRED
                );
            }
            else {
                passageRouge = Launcher.getFXObjectConstructor().rectangle(
                        14.2857143 / 100 * Launcher.getLargeurScene() + 25.7142857 / 100 * Launcher.getLargeurScene() + 10 + width,
                        Launcher.getHauteurScene() - 14.2857143 / 100 * Launcher.getHauteurScene() - 7.14285714 / 100 * Launcher.getHauteurScene() -
                                25.7142857 / 100 * Launcher.getHauteurScene() + 25.7142857 / 100 * Launcher.getHauteurScene() -
                                4.28571429 / 100 * Launcher.getHauteurScene() * (i+1),
                        width,
                        4.28571429 / 100 * Launcher.getHauteurScene(),
                        Color.DARKRED
                );
            }

            root.getChildren().add(passageRouge);
        }

        for (int i = 0; i < 7; i++){
            Rectangle passageRouge = Launcher.getFXObjectConstructor().rectangle(
                    14.2857143 / 100 * Launcher.getLargeurScene() + 25.7142857 / 100 * Launcher.getLargeurScene() + 10 + width*2,
                    Launcher.getHauteurScene() - 14.2857143 / 100 * Launcher.getHauteurScene() - 7.14285714 / 100 * Launcher.getHauteurScene() -
                            25.7142857 / 100 * Launcher.getHauteurScene() + 25.7142857 / 100 * Launcher.getHauteurScene() -
                            4.28571429 / 100 * Launcher.getHauteurScene() * (i+1),
                    width,
                    4.28571429 / 100 * Launcher.getHauteurScene(),
                    Color.BLUE
            );
            root.getChildren().add(passageRouge);
        }

        for (int i = 1; i < 6; i++){
            Rectangle passageJauneRouge = Launcher.getFXObjectConstructor().rectangle(
                    14.2857143 / 100 * Launcher.getLargeurScene() + 25.7142857 / 100 * Launcher.getLargeurScene() / 6 * i,
                    7.14285714 / 100 * Launcher.getHauteurScene() + 25.7142857 / 100 * Launcher.getHauteurScene(),
                    25.7142857 / 100 * Launcher.getLargeurScene() / 6,
                    4.28571429 / 100 * Launcher.getHauteurScene(),
                    Color.YELLOW
            );
            root.getChildren().add(passageJauneRouge);
        }

        for (int i = 0; i < 6; i++){
            Rectangle passageJauneRouge = Launcher.getFXObjectConstructor().rectangle(
                    14.2857143 / 100 * Launcher.getLargeurScene() + 25.7142857 / 100 * Launcher.getLargeurScene() / 6 * i,
                    Launcher.getHauteurScene() - 14.2857143 / 100 * Launcher.getHauteurScene() - 7.14285714 / 100 * Launcher.getHauteurScene() -
                            25.7142857 / 100 * Launcher.getHauteurScene() - 4.28571429 / 100 * Launcher.getHauteurScene(),
                    25.7142857 / 100 * Launcher.getLargeurScene() / 6,
                    4.28571429 / 100 * Launcher.getHauteurScene(),
                    Color.DARKRED
            );
            root.getChildren().add(passageJauneRouge);
        }

        for (int i = 0; i < 7; i++){
            Rectangle passageJauneRouge;
            if (i == 6) {
                passageJauneRouge = Launcher.getFXObjectConstructor().rectangle(
                        14.2857143 / 100 * Launcher.getLargeurScene() + 25.7142857 / 100 * Launcher.getLargeurScene() / 6 * i + 10,
                        7.14285714 / 100 * Launcher.getHauteurScene() + 25.7142857 / 100 * Launcher.getHauteurScene() + height + 4.28571429 / 100 * Launcher.getHauteurScene(),
                        width,
                        4.28571429 / 100 * Launcher.getHauteurScene(),
                        Color.YELLOW
                );
            }
            else {
                passageJauneRouge = Launcher.getFXObjectConstructor().rectangle(
                        14.2857143 / 100 * Launcher.getLargeurScene() + 25.7142857 / 100 * Launcher.getLargeurScene() / 6 * i,
                        7.14285714 / 100 * Launcher.getHauteurScene() + 25.7142857 / 100 * Launcher.getHauteurScene() + height + 4.28571429 / 100 * Launcher.getHauteurScene(),
                        25.7142857 / 100 * Launcher.getLargeurScene() / 6,
                        4.28571429 / 100 * Launcher.getHauteurScene(),
                        Color.YELLOW
                );
            }
            root.getChildren().add(passageJauneRouge);
        }

        for (int i = 0; i < 6; i++){
            Rectangle passageJauneRouge = Launcher.getFXObjectConstructor().rectangle(
                    Launcher.getLargeurScene() - 14.2857143 / 100 * Launcher.getLargeurScene() -
                            25.7142857 / 100 * Launcher.getLargeurScene() + i * 25.7142857 / 100 * Launcher.getLargeurScene() / 6,
                    7.14285714 / 100 * Launcher.getHauteurScene() + 25.7142857 / 100 * Launcher.getHauteurScene(),
                    25.7142857 / 100 * Launcher.getLargeurScene() / 6,
                    4.28571429 / 100 * Launcher.getHauteurScene(),
                    Color.GREEN
            );
            root.getChildren().add(passageJauneRouge);
        }

        for (int i = 0; i < 5; i++){
            Rectangle passageJauneRouge = Launcher.getFXObjectConstructor().rectangle(
                    Launcher.getLargeurScene() - 14.2857143 / 100 * Launcher.getLargeurScene() - 25.7142857 / 100 * Launcher.getLargeurScene() +
                            i * 25.7142857 / 100 * Launcher.getLargeurScene() / 6,
                    Launcher.getHauteurScene() - 14.2857143 / 100 * Launcher.getHauteurScene() - 7.14285714 / 100 * Launcher.getHauteurScene() -
                            25.7142857 / 100 * Launcher.getHauteurScene() - 4.28571429 / 100 * Launcher.getHauteurScene(),
                    25.7142857 / 100 * Launcher.getLargeurScene() / 6,
                    4.28571429 / 100 * Launcher.getHauteurScene(),
                    Color.BLUE
            );
            root.getChildren().add(passageJauneRouge);
        }

        for (int i = 0; i < 7; i++){
            Rectangle passageJauneRouge;
            if (i == 6) {
                passageJauneRouge = Launcher.getFXObjectConstructor().rectangle(
                        (Launcher.getLargeurScene() - 14.2857143 / 100 * Launcher.getLargeurScene() - 25.7142857 / 100 * Launcher.getLargeurScene()) - 10 - width,
                        7.14285714 / 100 * Launcher.getHauteurScene() + 25.7142857 / 100 * Launcher.getHauteurScene() + height + 4.28571429 / 100 * Launcher.getHauteurScene(),
                        width,
                        4.28571429 / 100 * Launcher.getHauteurScene(),
                        Color.BLUE
                );
            }
            else {
                passageJauneRouge = Launcher.getFXObjectConstructor().rectangle(
                        Launcher.getLargeurScene() - 14.2857143 / 100 * Launcher.getLargeurScene() -
                                25.7142857 / 100 * Launcher.getLargeurScene() + i * 25.7142857 / 100 * Launcher.getLargeurScene() / 6,
                        7.14285714 / 100 * Launcher.getHauteurScene() + 25.7142857 / 100 * Launcher.getHauteurScene() + height + 4.28571429 / 100 * Launcher.getHauteurScene(),
                        25.7142857 / 100 * Launcher.getLargeurScene() / 6,
                        4.28571429 / 100 * Launcher.getHauteurScene(),
                        Color.BLUE
                );
            }
            root.getChildren().add(passageJauneRouge);
        }
    }

    /**
     *  Constrcution des écuries.
     */
    public void constrcutionEcurie () {
        Rectangle[] ecurie = new Rectangle[4];

        ecurie[0] = Launcher.getFXObjectConstructor().rectangle(
                14.2857143 / 100 * Launcher.getLargeurScene(),
                7.14285714 / 100 * Launcher.getHauteurScene(),
                25.7142857 / 100 * Launcher.getLargeurScene(),
                25.7142857 / 100 * Launcher.getHauteurScene(),
                Color.YELLOW
        );

        ecurie[1] = Launcher.getFXObjectConstructor().rectangle(
                Launcher.getLargeurScene() - 14.2857143 / 100 * Launcher.getLargeurScene() - 25.7142857 / 100 * Launcher.getLargeurScene(),
                7.14285714 / 100 * Launcher.getHauteurScene(),
                25.7142857 / 100 * Launcher.getLargeurScene(),
                25.7142857 / 100 * Launcher.getHauteurScene(),
                Color.GREEN
        );

        ecurie[2] = Launcher.getFXObjectConstructor().rectangle(
                14.2857143 / 100 * Launcher.getLargeurScene(),
                Launcher.getHauteurScene() - 14.2857143 / 100 * Launcher.getHauteurScene() - 7.14285714 / 100 * Launcher.getHauteurScene() -
                        25.7142857 / 100 * Launcher.getHauteurScene(),
                25.7142857 / 100 * Launcher.getLargeurScene(),
                25.7142857 / 100 * Launcher.getHauteurScene(),
                Color.DARKRED
        );

        ecurie[3] = Launcher.getFXObjectConstructor().rectangle(
                Launcher.getLargeurScene() - 14.2857143 / 100 * Launcher.getLargeurScene() - 25.7142857 / 100 * Launcher.getLargeurScene(),
                Launcher.getHauteurScene() - 14.2857143 / 100 * Launcher.getHauteurScene() - 7.14285714 / 100 * Launcher.getHauteurScene() -
                        25.7142857 / 100 * Launcher.getHauteurScene(),
                25.7142857 / 100 * Launcher.getLargeurScene(),
                25.7142857 / 100 * Launcher.getHauteurScene(),
                Color.BLUE
        );

        root.getChildren().addAll(ecurie[0], ecurie[1], ecurie[2], ecurie[3]);
    }

    /**
     * Construction du bouton d'abandon.
     */
    public void boutonAbandon () {
        Rectangle abandon = Launcher.getFXObjectConstructor().rectangle(
                0,
                85.7142857 / 100 * Launcher.getHauteurScene(),
                Launcher.getLargeurScene(),
                14.2857143 / 100 * Launcher.getHauteurScene(),
                Color.GRAY
        );

        Button buttonAbandon = Launcher.getFXObjectConstructor().button(
                0,
                85.7142857 / 100 * Launcher.getHauteurScene(),
                32.8571429 / 100 * Launcher.getLargeurScene(),
                14.2857143 / 100 * Launcher.getHauteurScene(),
                1.8/100 * Launcher.getLargeurScene(),
                Color.DIMGRAY,
                "Abandonner"
        );

        buttonAbandon.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Scene sceneMenu = null;
                try {
                    sceneMenu = new Scene(Launcher.loadFXML("XML/ChoixNombreJoueur"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                stage.setScene(sceneMenu);
                stage.show();
            }
        });
        root.getChildren().addAll(abandon, buttonAbandon);
    }


}
