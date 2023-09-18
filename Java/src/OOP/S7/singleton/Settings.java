package OOP.S7.singleton;

public class Settings {

    private static Settings instance;

    public static Settings getInstance() {
        if (instance == null){
            instance = new Settings();
            //TODO: инициализация состояния объекта
        }
        return instance;
    }

    private String param1;
    private String param2;
    private String param3;

    public String getParam1() {
        return param1;
    }

    public String getParam2() {
        return param2;
    }

    public String getParam3() {
        return param3;
    }

    private Settings() {
    }

    private Settings(String param1, String param2, String param3) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }
}
