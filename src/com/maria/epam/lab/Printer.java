package com.maria.epam.lab;

import com.maria.epam.lab.paper.Paper;
import javafx.scene.control.Label;

import java.util.LinkedList;
import java.util.List;

public class Printer {
    protected Human.typeOfPaper type;
    protected List<Paper> paper;
    protected Label log;

    public Printer(){
         paper = new LinkedList<Paper>();
        log = new Label("Created printer ");
    }

    public Label getLog() {
        return log;
    }

    private void printText(){
        log.setText("you have printed text");
        paper.get(0).writeContent( " content: text ");
        paper.remove(paper.get(0));
    }

    private void printImage(){
        log.setText("you have printed image");
        paper.get(0).writeContent( " content: image ");
        paper.remove(paper.get(0));

    }

    public void print() throws Exception {
        if(paper.isEmpty()){
            log.setText("error");
            throw new Exception();
        }

        switch (type){
            case PhotoPaper:
                printImage();
                break;
            case OfficePaper:
                printText();
                break;
            default:
                log.setText("error");
                throw new Exception();
        }
    }

    public void addPaper(Paper value, Human.typeOfPaper type1) throws Exception {
        if(type1 == Human.typeOfPaper.BluePrintPaper){
            log.setText("error");
            throw new Exception();
        }
        if(paper.isEmpty()){
            type = type1;
        }
        else if(type != type1){
            log.setText("error");
            throw new Exception();

        }
        paper.add(value);
        switch (type){
            case OfficePaper:
                log.setText("added sheet of office com.maria.epam.lab.paper");
                break;
            case PhotoPaper:
                log.setText("added sheet of photo com.maria.epam.lab.paper");
                break;

        }

    }

}
