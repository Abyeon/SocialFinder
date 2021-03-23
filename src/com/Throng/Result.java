package com.Throng;

/**
 *  Stores the result of a search
 */
public class Result {
    private String name;
    private String url;
    private String iconURL;

    public Result(String Name, String URL, String IconURL) {
        this.name = Name;
        this.url = URL;
        this.iconURL = IconURL;
    }

    public Result(String Name, String URL) {
        this.name = Name;
        this.url = URL;
        this.iconURL = null;
    }

    public String getName() {
        return this.name;
    }

    public String getUrl() {
        return this.url;
    }

    public String getIconURL() {
        return iconURL;
    }
}
