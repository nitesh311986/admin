package pages;

public class Constant {
    public static  String ENVIRONMENT=System.getProperty("environment");

    public static String url;
    static {
        if(ENVIRONMENT.equals("UTS-UK2QA")){
            url="http://52.32.106.250:7779/";
        } else if (ENVIRONMENT.equals("UTS-UK2Stage")) {
            url="http://52.32.106.250:8889/";
        }
        else if (ENVIRONMENT.equals("UTS-UK2production")) {
            url="https://fitlocal2.britishpetinsurance.co.uk:94/";
        }
    }
}
