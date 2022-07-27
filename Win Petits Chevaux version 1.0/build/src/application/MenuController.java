package com.hayk.application;

import com.hayk.dessin.ConstructionPlateau;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {

    private Stage stageMenuController;
    private Scene scene;
    private Parent root;

    @FXML
    private AnchorPane fenetre;
    @FXML
    private Text titre;
    @FXML
    private Button jouerButton;
    @FXML
    private Button optionsButton;
    @FXML
    private Text annee1936;
    @FXML
    private ImageView cheval;
    @FXML
    private Button deuxJoueurs;
    @FXML
    private Button troisJoueurs;
    @FXML
    private Button quatreJoueurs;
    @FXML
    private Button retourMenu;
    @FXML
    private Text nombreJoueur;

    /**
     * Initialisation des objets.
     * @param location
     * The location used to resolve relative paths for the root object, or
     * {@code null} if the location is not known.
     *
     * @param resources
     * The resources used to localize the root object, or {@code null} if
     * the root object was not localized.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (Launcher.getLargeurScene() < 700)
            Launcher.setLargeurScene(700);

        if (Launcher.getHauteurScene() < 800)
            Launcher.setHauteurScene(800);

        fenetre.setPrefSize(Launcher.getLargeurScene(), Launcher.getHauteurScene());

        // Bouton jouer
        if (jouerButton != null) {
            jouerButton.setLayoutY(27.4285714 / 100 * fenetre.getPrefHeight() + 6.2 / 100 * (fenetre.getPrefWidth() / 2));
            jouerButton.setLayoutX(15.71422857 / 100 * fenetre.getPrefWidth());
            jouerButton.setPrefWidth(68.7142857 / 100 * fenetre.getPrefWidth());
            jouerButton.setPrefHeight(14.2857143 / 100 * fenetre.getPrefHeight());
            jouerButton.setFont(new Font("Wide latin", 2.1 / 100 * (fenetre.getPrefWidth()) + 2.1 / 100 * (fenetre.getPrefHeight())));
        }

        // Bouton options
        if (optionsButton != null) {
            optionsButton.setLayoutY(46.7142857 / 100 * fenetre.getPrefHeight() + 6.2 / 100 * (fenetre.getPrefWidth()));
            optionsButton.setLayoutX(15.71422857 / 100 * fenetre.getPrefWidth());
            optionsButton.setPrefWidth(68.7142857 / 100 * fenetre.getPrefWidth());
            optionsButton.setPrefHeight(14.2857143 / 100 * fenetre.getPrefHeight());
            optionsButton.setFont(new Font("Wide latin", 2.1 / 100 * (fenetre.getPrefWidth()) + 2.1 / 100 * (fenetre.getPrefHeight())));
        }

        // Text titre
        if (titre != null) {
            titre.setFont(new Font("Wide latin",3.5 / 100 * (fenetre.getPrefWidth() * 2)));
            titre.setLayoutX(6.0 / 100 * fenetre.getPrefWidth());
            titre.setLayoutY(17.6 / 100 * fenetre.getPrefHeight() + 3.5 / 100 * (fenetre.getPrefWidth()));
        }

        // Text annee 1936
        if (annee1936 != null) {
            annee1936.setLayoutX(34.5714286 / 100 * fenetre.getPrefWidth());
            annee1936.setLayoutY(80.2857143 / 100 * fenetre.getPrefHeight() + 3.5 / 100 * (fenetre.getPrefWidth()));
            annee1936.setFont(new Font("Wide latin",3.5 / 100 * (fenetre.getPrefWidth() * 2)));
        }

        // Image cheval
        if (cheval != null) {
            cheval.setFitHeight((70.7142857 / 100 * (fenetre.getPrefHeight())));
            cheval.setFitWidth((49.4285714 / 100 * (fenetre.getPrefWidth())));
            cheval.setLayoutX(45.1428571 / 100 * fenetre.getPrefWidth());
            cheval.setLayoutY(16.0 / 100 * fenetre.getPrefHeight());
        }

        // Bouton retour
        if (retourMenu != null) {
            retourMenu.setFont(new Font("Wide latin", 0.40 / 100 * (fenetre.getPrefWidth() * 2) + 0.40 / 100 * (fenetre.getPrefHeight() * 2)));
            retourMenu.setPrefHeight(5.14285714 / 100 * fenetre.getPrefHeight());
            retourMenu.setPrefWidth(12.5714286 / 100 * fenetre.getPrefWidth());
            retourMenu.setLayoutX(2.0 / 100 * fenetre.getPrefWidth());
            retourMenu.setLayoutY(2.0 / 100 * fenetre.getPrefHeight());
        }

        // Text nombre joueur
        if (nombreJoueur != null) {
            nombreJoueur.setLayoutX(10.2857143 / 100 * fenetre.getPrefWidth());
            nombreJoueur.setLayoutY(15.1428571 / 100 * fenetre.getPrefHeight() + 2.57142857 / 100 * fenetre.getPrefWidth());
            nombreJoueur.setFont(new Font("Wide latin", 2.57142857 / 100 * (fenetre.getPrefWidth() * 2)));
        }

        // Bouton 2 joueurs
        if (deuxJoueurs != null) {
            deuxJoueurs.setFont(new Font("Wide latin", 3.21428571 / 100 * (fenetre.getPrefWidth() * 2)));
            deuxJoueurs.setLayoutX(10.8571429 / 100 * fenetre.getPrefWidth());
            deuxJoueurs.setLayoutY(22.2857143 / 100 * fenetre.getPrefHeight());
            deuxJoueurs.setPrefWidth(80.0 / 100 * fenetre.getPrefWidth());
            deuxJoueurs.setPrefHeight(12.5714286 / 100 * fenetre.getPrefHeight());
        }

        // Bouton 3 joueurs
        if (troisJoueurs != null) {
            troisJoueurs.setFont(new Font("Wide latin", 3.21428571 / 100 * (fenetre.getPrefWidth() * 2)));
            troisJoueurs.setLayoutX(10.8571429 / 100 * fenetre.getPrefWidth());
            troisJoueurs.setLayoutY(43.7142857 / 100 * fenetre.getPrefHeight() + 3.21428571 / 100 * fenetre.getPrefWidth());
            troisJoueurs.setPrefWidth(80.0 / 100 * fenetre.getPrefWidth());
            troisJoueurs.setPrefHeight(12.5714286 / 100 * fenetre.getPrefHeight());
        }

        // Bouton 4 joueurs
        if (quatreJoueurs != null) {
            quatreJoueurs.setFont(new Font("Wide latin", 3.21428571 / 100 * (fenetre.getPrefWidth() * 2)));
            quatreJoueurs.setLayoutX(10.8571429 / 100 * fenetre.getPrefWidth());
            quatreJoueurs.setLayoutY(65.1428571 / 100 * fenetre.getPrefHeight() + 3.21428571 / 100 * fenetre.getPrefWidth()*2);
            quatreJoueurs.setPrefWidth(80.0 / 100 * fenetre.getPrefWidth());
            quatreJoueurs.setPrefHeight(12.5714286 / 100 * fenetre.getPrefHeight());
        }
    }

    /**
     * Mise à jour de l'écran en cas de changement de dimension.
     * @param event
     */
    public void responsiveFenetre(MouseEvent event) {
        // Bouton jouer
        if (jouerButton != null) {
            jouerButton.setLayoutY(27.4285714 / 100 * fenetre.getHeight() + 6.2 / 100 * (fenetre.getWidth() / 2));
            jouerButton.setLayoutX(15.71422857 / 100 * fenetre.getWidth());
            jouerButton.setPrefWidth(68.7142857 / 100 * fenetre.getWidth());
            jouerButton.setPrefHeight(14.2857143 / 100 * fenetre.getHeight());
            jouerButton.setFont(new Font("Wide latin", 2.1 / 100 * (fenetre.getWidth()) + 2.1 / 100 * (fenetre.getHeight())));
        }

        // Bouton options
        if (optionsButton != null) {
            optionsButton.setLayoutY(46.7142857 / 100 * fenetre.getHeight() + 6.2 / 100 * (fenetre.getWidth()));
            optionsButton.setLayoutX(15.71422857 / 100 * fenetre.getWidth());
            optionsButton.setPrefWidth(68.7142857 / 100 * fenetre.getWidth());
            optionsButton.setPrefHeight(14.2857143 / 100 * fenetre.getHeight());
            optionsButton.setFont(new Font("Wide latin", 2.1 / 100 * (fenetre.getWidth()) + 2.1 / 100 * (fenetre.getHeight())));
        }

        // Text titre
        if (titre != null) {
            titre.setFont(new Font("Wide latin",3.5 / 100 * (fenetre.getWidth() * 2)));
            titre.setLayoutX(6.0 / 100 * fenetre.getWidth());
            titre.setLayoutY(17.6 / 100 * fenetre.getHeight() + 3.5 / 100 * (fenetre.getWidth()));
        }

        // Text annee 1936
        if (annee1936 != null) {
            annee1936.setLayoutX(34.5714286 / 100 * fenetre.getWidth());
            annee1936.setLayoutY(80.2857143 / 100 * fenetre.getHeight() + 3.5 / 100 * (fenetre.getWidth()));
            annee1936.setFont(new Font("Wide latin",3.5 / 100 * (fenetre.getWidth() * 2)));
        }


        // Image cheval
        if (cheval != null) {
            cheval.setFitHeight((70.7142857 / 100 * (fenetre.getHeight())));
            cheval.setFitWidth((49.4285714 / 100 * (fenetre.getWidth())));
            cheval.setLayoutX(45.1428571 / 100 * fenetre.getWidth());
            cheval.setLayoutY(16.0 / 100 * fenetre.getHeight());
        }

        // Bouton retour
        if (retourMenu != null) {
            retourMenu.setFont(new Font("Wide latin", 0.40 / 100 * (fenetre.getWidth() * 2) + 0.40 / 100 * (fenetre.getHeight() * 2)));
            retourMenu.setPrefHeight(5.14285714 / 100 * fenetre.getHeight());
            retourMenu.setPrefWidth(12.5714286 / 100 * fenetre.getWidth());
            retourMenu.setLayoutX(2.0 / 100 * fenetre.getWidth());
            retourMenu.setLayoutY(2.0 / 100 * fenetre.getHeight());
        }

        // Text nombre joueur
        if (nombreJoueur != null) {
            nombreJoueur.setLayoutX(10.2857143 / 100 * fenetre.getWidth());
            nombreJoueur.setLayoutY(15.1428571 / 100 * fenetre.getHeight() + 2.57142857 / 100 * fenetre.getWidth());
            nombreJoueur.setFont(new Font("Wide latin", 2.57142857 / 100 * (fenetre.getWidth() * 2)));
        }

        // Bouton 2 joueurs
        if (deuxJoueurs != null) {
            deuxJoueurs.setFont(new Font("Wide latin", 3.21428571 / 100 * (fenetre.getWidth() * 2)));
            deuxJoueurs.setLayoutX(10.8571429 / 100 * fenetre.getWidth());
            deuxJoueurs.setLayoutY(22.2857143 / 100 * fenetre.getHeight());
            deuxJoueurs.setPrefWidth(80.0 / 100 * fenetre.getWidth());
            deuxJoueurs.setPrefHeight(12.5714286 / 100 * fenetre.getHeight());
        }

        // Bouton 3 joueurs
        if (troisJoueurs != null) {
            troisJoueurs.setFont(new Font("Wide latin", 3.21428571 / 100 * (fenetre.getWidth() * 2)));
            troisJoueurs.setLayoutX(10.8571429 / 100 * fenetre.getWidth());
            troisJoueurs.setLayoutY(43.7142857 / 100 * fenetre.getHeight() + 3.21428571 / 100 * fenetre.getWidth());
            troisJoueurs.setPrefWidth(80.0 / 100 * fenetre.getWidth());
            troisJoueurs.setPrefHeight(12.5714286 / 100 * fenetre.getHeight());
        }

        // Bouton 4 joueurs
        if (quatreJoueurs != null) {
            quatreJoueurs.setFont(new Font("Wide latin", 3.21428571 / 100 * (fenetre.getWidth() * 2)));
            quatreJoueurs.setLayoutX(10.8571429 / 100 * fenetre.getWidth());
            quatreJoueurs.setLayoutY(65.1428571 / 100 * fenetre.getHeight() + 3.21428571 / 100 * fenetre.getWidth()*2);
            quatreJoueurs.setPrefWidth(80.0 / 100 * fenetre.getWidth());
            quatreJoueurs.setPrefHeight(12.5714286 / 100 * fenetre.getHeight());
        }

        Launcher.setLargeurScene(fenetre.getWidth());
        Launcher.setHauteurScene(fenetre.getHeight());
    }

    /**
     * Redirection sur la page du choix du nombre de joueur.
     * @param event
     * @throws IOException
     */
    public void choixNombreJoueur(javafx.event.ActionEvent event) throws IOException {
        Launcher.getmP().stop();
        stageMenuController = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(Launcher.loadFXML("XML/ChoixNombreJoueur"));
        stageMenuController.setScene(scene);
        fenetre.setPrefSize(Launcher.getLargeurScene(), Launcher.getHauteurScene());
        stageMenuController.show();
    }

    /**
     * Retour au menu principal.
     * @param event
     * @throws IOException
     */
    public void retourMenu(javafx.event.ActionEvent event) throws IOException {
        Launcher.getmP().play();
        stageMenuController = (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("XML/Menu.fxml"));
        root = loader.load();
        scene = new Scene(root);
        stageMenuController.setScene(scene);
        stageMenuController.show();
    }

    /**
     * Création du plateau selon le nombre de joueur.
     * @param event
     * @throws IOException
     */
    public void plateau(javafx.event.ActionEvent event) throws IOException {
        stageMenuController = (Stage) ((Node)event.getSource()).getScene().getWindow();
        if (deuxJoueurs.isArmed()){
            ConstructionPlateau plateau = new ConstructionPlateau(stageMenuController);
        } else if (troisJoueurs.isArmed()) {
            ConstructionPlateau plateau = new ConstructionPlateau(stageMenuController);
        } else {
            ConstructionPlateau plateau = new ConstructionPlateau(stageMenuController);
        }
    }
}
