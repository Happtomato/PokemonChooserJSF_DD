package com.example.projekt;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Objects;

@Named(value = "beanKlasse")
@SessionScoped
public class Auswahl implements Serializable {

        private String hair;
        private String eyes;
        private String skin;

        public String getHair() {
            return hair;
        }
        public String getFinal(){
            if(Objects.equals(skin, "h")){
                skin = "Helle Haut";
            }
            else{
                skin = "Dunkle Haut";
            }
            if(Objects.equals(hair, "b")){
                hair = "Blonde Haare";
            }
            else{
                hair = "Schwarze Haare";
            }
            if(Objects.equals(eyes, "g")){
                eyes = "Grüne Augen";
            }
            else{
                eyes = "Blaue Augen";
            }
            return "Deine Auswahl: " + hair + ", " + eyes + ", " + skin;
        }

        public void setHair(String hair) {
            this.hair = hair.substring(0,1);
        }

        public String getEyes() {
            return eyes;
        }

        public void setEyes(String eyes) {
            this.eyes = eyes;
        }

        public String getSkin() {
            return skin;
        }

        public void setSkin(String skin) {
            this.skin = skin;
        }

    }
