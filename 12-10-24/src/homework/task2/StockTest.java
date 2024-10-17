package homework.task2;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class StockTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        TextInputDialog dialog = new TextInputDialog();

        dialog.setTitle("Stock Test");
        dialog.setHeaderText("Input data");

        dialog.setContentText("Enter stock symbol:");
        String symbol = dialog.showAndWait().orElse(null);

        dialog.setContentText("Enter stock name:");
        String name = dialog.showAndWait().orElse(null);

        dialog.setContentText("Enter stock previous closing price:");
        String previousClosingPrice = dialog.showAndWait().get();
        double pcp = Double.parseDouble(previousClosingPrice);

        dialog.setContentText("Enter stock current price:");
        String currentPrice = dialog.showAndWait().get();
        double cp = Double.parseDouble(currentPrice);

        Stock stock = new Stock(symbol, name);
        stock.setPreviousClosingPrice(pcp);
        stock.setCurrentPrice(cp);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Stock Test");

        String result = String.format("Stock: %s\nName: %s\nPrevious closing price: %.2f\nCurrent trading price: %.2f\nPercentage change: %.1f",
                stock.getSymbol(), stock.getName(), stock.getPreviousClosingPrice(), stock.getCurrentPrice(), stock.changePercent());
        alert.setContentText(result);
        alert.showAndWait();
    }
}