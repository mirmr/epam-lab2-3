package com.maria.epam.lab;

import com.maria.epam.lab.paper.Paper;

public class Xerox extends Printer {

    public String scanBuffer;
    @Override
    public void print() throws Exception {
        if(type!= Human.typeOfPaper.BluePrintPaper){
            log.setText("error");
            throw new Exception();
        }
        if(paper.isEmpty()){
            log.setText("error");
            throw new Exception();
        }

        creatCopy();
    }

    @Override
    public void addPaper(Paper value, Human.typeOfPaper type1) throws Exception {
        if(type1 != Human.typeOfPaper.BluePrintPaper){
            log.setText("error");
            throw new Exception();
        }
        paper.add(value);
        log.setText("add blueprint com.maria.epam.lab.paper");
    }



    private void creatCopy(){
        log.setText("you have copied text");
        paper.get(0).writeContent( " content: copy ");
        paper.remove(paper.get(0));
    }

    public  Xerox(){
        super();
        log.setText("created printer");
        type = Human.typeOfPaper.BluePrintPaper;
    }
}
