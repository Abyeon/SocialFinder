package com.Throng;

import java.util.ArrayList;

public class WebsiteExecutor {
    public static ArrayList<WebsiteInterface> sites = new ArrayList<>();

    public static void add(WebsiteInterface site) {
        sites.add(site);
    }
}
