package com.maria.epam.lab;

import com.maria.epam.lab.paper.BluePrintPaper;
import com.maria.epam.lab.paper.OfficePaper;
import com.maria.epam.lab.paper.PhotoPaper;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class Human {
    private Printer printer;
    private Xerox xerox;
    private VBox pane;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Label text1;
    private Label text2;


    public enum typeOfPaper {
        PhotoPaper,
        OfficePaper,
        BluePrintPaper;
    }

    public void print() {
        try {
            printer.print();
        } catch (Exception e) {
            System.out.println("no com.maria.epam.lab.paper");
        }

    }

    public void fillUpWithPaper(int count, typeOfPaper paper) {
        try {

            for (int i = 0; i < count; i++) {
                switch (paper) {
                    case PhotoPaper:
                        printer.addPaper(new PhotoPaper(10, 15), typeOfPaper.PhotoPaper);
                        break;
                    case OfficePaper:
                        printer.addPaper(new OfficePaper(15, 30), typeOfPaper.OfficePaper);
                        break;
                    case BluePrintPaper:
                        break;
                }

            }
        } catch (Exception e) {
            System.out.println("you can't mix com.maria.epam.lab.paper");
        }
    }

    public VBox getPane() {
        return pane;
    }

    public Human() {
        pane = new VBox();
        printer = new Printer();
        xerox = new Xerox();
        button1 = new Button("Print");
        button2 = new Button("Add sheet of photo com.maria.epam.lab.paper ");
        button3 = new Button("Add sheet of blueprint com.maria.epam.lab.paper ");
        button4 = new Button("Add sheet of office com.maria.epam.lab.paper ");
        button5 = new Button("Create copy ");
        text1 = new Label("com.maria.epam.lab.Printer log: ");
        text2 = new Label("com.maria.epam.lab.Xerox log: ");

        button1.setOnAction(e -> {
            try {
                printer.print();
            } catch (Exception ex) {

            }
        });
        button2.setOnAction(e -> {
            try {
                printer.addPaper(new PhotoPaper(30, 45), typeOfPaper.PhotoPaper);
            } catch (Exception ex) {

            }
        });
        button3.setOnAction(e -> {
            try {
                xerox.addPaper(new BluePrintPaper(20, 18), typeOfPaper.BluePrintPaper);
            } catch (Exception ex) {

            }
        });
        button4.setOnAction(e -> {
            try {
                printer.addPaper(new OfficePaper(20, 18), typeOfPaper.OfficePaper);
            } catch (Exception ex) {

            }
        });

        button5.setOnAction(e -> {
            try {
                xerox.print();
            } catch (Exception ex) {

            }
        });
        button1.setPrefWidth(200);
        button2.setPrefWidth(200);
        button3.setPrefWidth(200);
        button4.setPrefWidth(200);
        button5.setPrefWidth(200);

        
        pane.getChildren().addAll(button2, button4, button1, text1, printer.getLog());
        pane.getChildren().addAll(button3, button5, text2, xerox.getLog());
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(10);
    }
}
