package com.Throng;

import com.Throng.sites.Discord;
import com.Throng.sites.Facebook;
import com.Throng.sites.Reddit;
import com.Throng.sites.Twitter;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Initialize Websites
        WebsiteExecutor.add(new Discord());
        WebsiteExecutor.add(new Facebook());
        WebsiteExecutor.add(new Reddit());
        WebsiteExecutor.add(new Twitter());
    }
}
