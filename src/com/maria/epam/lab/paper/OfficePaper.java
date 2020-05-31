package com.maria.epam.lab.paper;

public class OfficePaper extends Paper {
   public OfficePaper(int h, int w){
        height = h;
        width = w;
        content = "";
    }
    @Override
    public void writeContent(String newContent) {
        System.out.println("Print: text");
        content = newContent;
    }
}
