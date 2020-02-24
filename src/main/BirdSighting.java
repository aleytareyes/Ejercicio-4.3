package main;


public class BirdSighting {
    private String specie;
    private int seen;
    private int day;
    private String fecha;
    
    public BirdSighting(){
        this.specie = "robin";
        this.seen= 1;
        this.day = 1;
    }
    public BirdSighting(String specie, int seen, int day){
        this.specie = specie;
        this.seen = seen;
        this.day = day;
    }
    public String getSspecie() {
        return this.specie;
    }
    public int getSeen() {
        return this.seen;
    }
    public String getDay() {
        if(this.day >= 1 && this.day<= 31 ){
            fecha = "Enero";
            this.day = this.day - 0;
        }
        else if(this.day >= 32 && this.day<= 59 ){
            fecha = "Febrero";
            this.day = this.day - 31;
        }
        else if(this.day >= 60 && this.day<= 90 ){
            fecha = "Marzo";
            this.day = this.day - 59;
        }
        else if(this.day >= 91 && this.day<= 120 ){
            fecha = "Abril";
            this.day = this.day - 90;
        }
        else if(this.day >= 121 && this.day<= 151 ){
            fecha = "Mayo";
            this.day = this.day - 120;
        }
        else if(this.day >= 152 && this.day<= 181 ){
            fecha = "Junio";
            this.day = this.day - 151;
        }
        else if(this.day >= 182 && this.day<= 212 ){
            fecha = "Julio";
            this.day = this.day - 181;
        }
        else if(this.day >= 213 && this.day<= 243  ){
            fecha = "Agosto";
            this.day = this.day - 212;
        }
        else if(this.day >= 243 && this.day<= 273  ){
            fecha = "septiembre";
            this.day = this.day - 243;
        }
        else if(this.day >= 274 && this.day<= 304  ){
            fecha = "Octubre";
            this.day = this.day - 273;
        }
        else if(this.day >= 305 && this.day<= 334  ){
            fecha = "Noviembre";
            this.day = this.day - 304;
        }
        else if(this.day >= 335 && this.day<= 365  ){
            fecha = "Diembre";
            this.day = this.day- 334;
        }
        return fecha + " " + this.day;
    }
    
}
