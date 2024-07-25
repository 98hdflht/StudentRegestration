// Quincy Yarbrough
// 7/22/2024
// student registration program to set a temporary password and welcome message

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class StudentRegistration extends Application {

    private TextField fName;
    private TextField lName;
    private TextField yearOfBirth;
    private TextField tempPassword;
    private Label welcome;

    @Override
    public void start(Stage primaryStage) {

        // set up the grid
        primaryStage.setTitle("Student Registration");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setHgap(10);
        grid.setVgap(10);
        Scene scene = new Scene(grid);

        // first name label and field
        grid.add(new Label("First Name: "), 0, 0);
        fName = new TextField();
        grid.add(fName, 1, 0);

        // last name label and field
        grid.add(new Label("Last Name: "), 0, 1);
        lName = new TextField();
        grid.add(lName, 1, 1);

        // year of birth label and field
        grid.add(new Label("Year of Birth: "), 0, 2);
        yearOfBirth = new TextField();
        grid.add(yearOfBirth, 1, 2);

        // temp password label and output
        grid.add(new Label("Temporary Password: "), 0, 3);
        tempPassword = new TextField();
        tempPassword.setEditable(false);
        grid.add(tempPassword, 1, 3);

        // welcome message
        welcome = new Label("");
        grid.add(welcome, 0, 4, 2, 1);

        // both buttons
        Button registerButton = new Button("Register");
        registerButton.setOnAction(event -> registerButtonClicked());
        Button exitButton = new Button("Exit");
        exitButton.setOnAction(event -> exitButtonClicked());
        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().add(registerButton);
        buttonBox.getChildren().add(exitButton);
        buttonBox.setAlignment(Pos.BOTTOM_RIGHT);
        grid.add(buttonBox, 0, 5, 2, 1);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void registerButtonClicked() {

        // check if all fields are filled out
        if (fName.getText().isEmpty() || lName.getText().isEmpty() || yearOfBirth.getText().isEmpty()){
            welcome.setText("Please enter first name, last name, and year of birth.");
            return;
        }
        // output the password and welcome messages
        String firstName = fName.getText();
        String lastName = lName.getText();
        int birthYear = Integer.parseInt(yearOfBirth.getText());
        String password = firstName + "*" + birthYear;
        tempPassword.setText(password);
        String output = "Welcome " + firstName + " " + lastName + "!";
        welcome.setText(output);
    }

    // exit button
    private void exitButtonClicked() {
        System.exit(0);
    }

    // start the program
    public static void main(String[] args) {
        launch(args);
    }
}