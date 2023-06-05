package qa.guru.owner.homework.config;

@org.aeonbits.owner.Config.Sources({
        "classpath:${launchMethod}.properties"
})
public interface ForecastConfig extends org.aeonbits.owner.Config {
    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowserName();

    @Key("browserVersion")
    @DefaultValue("100")
    String getBrowserVersion();

    @Key("baseUrl")
    @DefaultValue("https://yandex.ru/pogoda/")
    String getBaseUrl();

    @Key("isRemoteLaunch")
    @DefaultValue("false")
    Boolean isRemoteLaunch();

    @Key("remoteUrl")
    String getRemoteUrl();
}
