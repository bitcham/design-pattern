package singleton;

public class Settings {

    //private static final Settings INSTANCE = new Settings();
    //private static Settings instance;
    //private static volatile Settings instance;

    private Settings() {
    }

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    /*public static synchronized Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
   }*/

//    public static Settings getInstance(){
//        if(instance == null){
//            synchronized (Settings.class){
//                if(instance == null){
//                    instance = new Settings();
//                }
//            }
//        }
//        return instance;
//    }


    /*public static Settings getInstance() {
        return INSTANCE;
    }*/
}
