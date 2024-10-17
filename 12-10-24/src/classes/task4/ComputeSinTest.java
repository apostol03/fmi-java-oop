package classes.task4;

import javafx.application.Application;
import javafx.stage.Stage;

public class ComputeSinTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        ComputeSin computeSin = new ComputeSin();
        computeSin.makeTable();
    }
}
