package com.internshala.connectfour;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    private Controller controller;
    @Override
    public void start(Stage primaryStage) throws Exception{
       FXMLLoader loader = new FXMLLoader(getClass().getResource("game.fxml"));
        GridPane rootGridPane = loader.load();

        controller = loader.getController();
        controller.createPlayground();

        MenuBar menuBar = createmenu();
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());

        Pane menuPane = (Pane) rootGridPane.getChildren().get(0);
        menuPane.getChildren().add(menuBar);

        Scene scene = new Scene(rootGridPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Connect Four");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private MenuBar createmenu() {
        // file menu
        Menu filemenu = new Menu("File");
        MenuItem newGame = new MenuItem("New Game");
        newGame.setOnAction(event -> controller.resetGame());

        MenuItem resetGame = new MenuItem("Reset Game");
        resetGame.setOnAction(event -> controller.resetGame());

        SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();
        MenuItem exitGame = new MenuItem("Exit Game");
        exitGame.setOnAction(event -> exitgame());

        filemenu.getItems().addAll(newGame,resetGame,separatorMenuItem,exitGame);

        // Help menu
        Menu helpmenu = new Menu("Help");
        MenuItem aboutGame = new MenuItem("About Connect4");
        aboutGame.setOnAction(event -> aboutConnect4());

        SeparatorMenuItem separator = new SeparatorMenuItem();
        MenuItem aboutMe = new MenuItem("About Me");
        aboutMe.setOnAction(event -> aboutme());

        helpmenu.getItems().addAll(aboutGame, separator, aboutMe);


        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(filemenu,helpmenu);

      return menuBar;
    }

    private void aboutme() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About The Developer");
        alert.setHeaderText("Sushmita Kumari");
        alert.setContentText("Hello, I am Sushmita Kumari, a student of Shri\n" +
                "Shankaracharya Group of Institutions. I created this game\n" +
                "as my mini project by learning CORE JAVA\n" +
                "FROM INTERNSHALA. This game helped me in\n" +
                " implementing the basics and advanced\n" +
                "concepts of CORE JAVA!");
        alert.show();

    }

    private void aboutConnect4() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About Connect Four");
        alert.setHeaderText("How to Play?");
        alert.setContentText(
                "Connect Four is a two-player connection game in which\n" +
                        "the players first choose a color and then take turns\n" +
                        "dropping colored discs from the top into a ten-column,\n" +
                        "eight-row vertically suspended grid. The pieces fall straight\n" +
                        "down, occupying the next available space within the column.\n" +
                        "The objective of the game is to be the first to form a horizontal,\n" +
                        "vertical, or diagonal line of four of one's own discs.\n" +
                        "Connect Four is a solved game. The first player can\n" +
                        "always win by playing the right moves."
        );

        alert.show();

    }

    private void exitgame() {
        Platform.exit();
        System.exit(0);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
