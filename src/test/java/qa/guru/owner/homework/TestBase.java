package qa.guru.owner.homework;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import qa.guru.owner.homework.config.ForecastConfig;


public class TestBase {
    @BeforeAll
    static void beforeAll() {
        ForecastConfig config = ConfigFactory.create(ForecastConfig.class, System.getProperties());
        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browser = config.getBrowserName();
        Configuration.browserVersion = config.getBrowserVersion();

        if (config.isRemoteLaunch()) {
            Configuration.remote = config.getRemoteUrl();
        }
    }
}
