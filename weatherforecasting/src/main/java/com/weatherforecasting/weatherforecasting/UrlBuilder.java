package com.weatherforecasting.weatherforecasting;

public class UrlBuilder {
    private StringBuilder url;

    public UrlBuilder(String baseUrl) {
        this.url = new StringBuilder(baseUrl);
    }

    public UrlBuilder addQueryParam(String key, String value) {
        if (url.indexOf("?") > 0) {
            url.append("&");
        } else {
            url.append("?");
        }
        url.append(key).append("=").append(value);
        return this;
    }

    public String build() {
        return url.toString();
    }
}
