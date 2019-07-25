package vehicle;

public class Engine {

    private String type;

    public Engine(String type){
        this.type = type;

    }

    public String turnOn(){
        return "Vroom";
    }

    public String turnOff(){
        return "Engine off";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
