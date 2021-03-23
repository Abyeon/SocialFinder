package com.Throng;

public interface WebsiteInterface {
    String description = null;
    Result[] Search(String query);
    String iconURL = null;
    boolean toggle = true;
}
