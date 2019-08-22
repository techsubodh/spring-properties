package com.subu.spring.properties.springproperties.config;

import com.subu.spring.properties.springproperties.model.Credentials;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

/**
 * Created by 195920 on 8/21/2019.
 */
//We use @Configuration so that Spring creates a Spring bean in the application context.
@Configuration
//We also use @PropertySource to define the location of our properties file.
// Otherwise, Spring uses the default location (classpath:application.properties)
@PropertySource("classpath:configprops.properties")
@PropertySource("classpath:student.properties")
@ConfigurationProperties(prefix = "mail")
public class ConfigProperties {

    private String hostName;
    private int port;
    private String from;

    private List<String> defaultRecipients;
    private Map<String, String> additionalHeaders;
    private Credentials credentials;

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public List<String> getDefaultRecipients() {
        return defaultRecipients;
    }

    public void setDefaultRecipients(List<String> defaultRecipients) {
        this.defaultRecipients = defaultRecipients;
    }

    public Map<String, String> getAdditionalHeaders() {
        return additionalHeaders;
    }

    public void setAdditionalHeaders(Map<String, String> additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public String toString() {
        return "ConfigProperties{" +
                "hostName='" + hostName + '\'' +
                ", port=" + port +
                ", from='" + from + '\'' +
                ", defaultRecipients=" + defaultRecipients +
                ", additionalHeaders=" + additionalHeaders +
                ", credentials=" + credentials +
                '}';
    }
}
