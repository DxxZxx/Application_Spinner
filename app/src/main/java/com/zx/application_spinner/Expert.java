package com.zx.application_spinner;

import java.util.ArrayList;
import java.util.List;

public class Expert {
    List<String> getColor(String color){
        List<String> col = new ArrayList<>();
        if(color.equals("one")){
            col.add("blue");
            col.add("red");
        }else {
            col.add("pink");
            col.add("yellow");
        }
       return col;
    }
}
