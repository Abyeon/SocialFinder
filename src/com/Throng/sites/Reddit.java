package com.Throng.sites;

import com.Throng.WebsiteInterface;
import com.Throng.Result;

import java.util.ArrayList;

public class Reddit implements WebsiteInterface {

    public String description = null;
    public String iconURL = null;
    public boolean toggle = true;

    public Result[] Search() {
        ArrayList<Result> Results = new ArrayList<>();

        // Insert Code here

        return (Result[]) Results.toArray();
    }
}