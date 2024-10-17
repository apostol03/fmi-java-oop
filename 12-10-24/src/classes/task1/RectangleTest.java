package classes.task1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class RectangleTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();

        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Rectangle Test");
        dialog.setHeaderText("Input data");
        dialog.setContentText("Enter rectangle width:");
        String text;
        text = dialog.showAndWait().get();
        double width = Double.parseDouble(text);

        dialog.setContentText("Enter rectangle height:");
        text = dialog.showAndWait().get();
        double height = Double.parseDouble(text);

        dialog.setContentText("Enter rectangle color:");
        String color = dialog.showAndWait().get();

        Rectangle rectangle = new Rectangle(width, height);
        Rectangle.setColor(color);

        Label label = new Label("");
        label.setText(Rectangle.getColor());
        group.getChildren().add(label);

//        Line line = new Line(scene.getWidth(), 0, 0, scene.getHeight());
//        group.getChildren().add(line);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Rectangle Test");
        alert.setHeaderText(null);

        String result = String.format("Area: %.3f\nPerimeter: %.0f", rectangle.getArea(), rectangle.getPerimeter());
        alert.setContentText(result);
        alert.showAndWait();
    }
}
