package com.example.projekt;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "controller")
@RequestScoped
public class Controller {

    public String changeEyes() {
        return "augenfarbe.xhtml";
    }

    public String changeHair() {
        return "haare.xhtml";
    }
    public String showFinal(){
        return "final.xhtml";
    }
}