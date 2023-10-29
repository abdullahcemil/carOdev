package core;

public class DatabaseLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Data:"+ data);

    }

    public void log(double id1){
        System.out.println("Id:"+id1);
    };

    public void log(StringBuffer Model){
        System.out.println("Model:" + Model);

    }
}
