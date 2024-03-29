package edu.java.bot.utils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.validator.routines.UrlValidator;
import static org.springframework.util.ResourceUtils.toURL;

@Slf4j
@UtilityClass
public class URLChecker {
    private static final int HTTP_OK = 200;
    private final String[] schemas = {"http", "https"};
    private final UrlValidator urlValidator = new UrlValidator(schemas);

    public boolean isValid(String text) {
        if (urlValidator.isValid(text)) {
            HttpURLConnection connection = null;
            try {
                URL u = toURL(text);
                connection = (HttpURLConnection) u.openConnection();
                connection.setRequestMethod("HEAD");
                int code = connection.getResponseCode();
                return code == HTTP_OK;
            } catch (IOException e) {
                log.info("incorrect URL: " + text);
            } finally {
                if (connection != null) {
                    connection.disconnect();
                }
            }
        }
        return false;
    }
}
