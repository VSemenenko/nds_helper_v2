package ru.vsemenenko.nds_helper_v2.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("app.config.query-company-info")
public class CompanyInfoConfig {
    private String ifnsURL;
    private String ifnsUrlPath;
    private String ifnsAPIkey;
    private String fiasUrl;
    private String fiasURLPath;
    private String fiasContentType;
    private String fiasLimit;
    private String fiasWithParent;
}
