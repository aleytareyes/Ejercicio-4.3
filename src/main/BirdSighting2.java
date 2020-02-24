
package main;

public class BirdSighting2 {
    private String specie;
    private int seen;
    private int day;
    private String th;
    private BirdSighting2(String specie, int seen, int day){
        this.specie = specie;
        this.seen = seen;
        this.day = day;
    }
    public BirdSighting2(){
        this("Carpintero", 23, 130);
    }
    public String getEspecie() {
        return this.specie;
    }
    public int getVistazo() {
        return this.seen;
    }
    public String getDay() {
        if(this.day >= 1 && this.day<= 31 ){
            th = "Enero";
            this.day = this.day - 0;
        }
        else if(this.day >= 32 && this.day<= 59 ){
            th = "Febrero";
            this.day = this.day - 31;
        }
        else if(this.day >= 60 && this.day<= 90 ){
            th = "Marzo";
            this.day = this.day - 59;
        }
        else if(this.day >= 91 && this.day<= 120 ){
            th = "Abril";
            this.day = this.day - 90;
        }
        else if(this.day >= 121 && this.day<= 151 ){
            th = "Mayo";
            this.day = this.day - 120;
        }
        else if(this.day >= 152 && this.day<= 181 ){
            th = "Junio";
            this.day = this.day - 151;
        }
        else if(this.day >= 182 && this.day<= 212 ){
            th = "Julio";
            this.day = this.day - 181;
        }
        else if(this.day >= 213 && this.day<= 243  ){
            th = "Agosto";
            this.day = this.day - 212;
        }
        else if(this.day >= 243 && this.day<= 273  ){
            th = "septiembre";
            this.day = this.day - 243;
        }
        else if(this.day >= 274 && this.day<= 304  ){
            th = "Octubre";
            this.day = this.day - 273;
        }
        else if(this.day >= 305 && this.day<= 334  ){
            th = "Noviembre";
            this.day = this.day - 304;
        }
        else if(this.day >= 335 && this.day<= 365  ){
            th = "Diembre";
            this.day = this.day - 334;
        }
        return th +" " + this.day;
    }
}
