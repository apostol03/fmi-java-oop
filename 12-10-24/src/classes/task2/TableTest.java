package classes.task2;

import javafx.application.Application;
import javafx.stage.Stage;


public class TableTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Table table = new Table(1, 101, 100);
        table.makeTable();
    }
}
