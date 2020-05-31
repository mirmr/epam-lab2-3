package com.maria.epam.lab.paper;

public class BluePrintPaper extends Paper {

    public BluePrintPaper(int w, int h){

    }
    @Override
    public void writeContent(String newContent) {
        content = "Blue print: " + newContent;
    }
}
