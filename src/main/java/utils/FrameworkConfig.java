package utils;

import org.aeonbits.owner.Config;
@Config.Sources({"file:${user.dir}/src/test/resources/config/config.properties"})
public interface FrameworkConfig extends Config {


    //String environment();

    @Key("qa.userName")
    String userName();
    @Key("qa.url")
    String url();

}
