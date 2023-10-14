package com.example.testapp;

import java.net.URL;
import java.net.HttpURLConnection;

public class APIConnector{
    private String description;
    private String location;
    private Boolean full_time;
    private static final String jobListURL = "http://dev6.dansmultipro.co.id/api/recruitment/positions.json?description=python&location=berlin";
    private static final String jobDetailsURL = "http://dev6.dansmultipro.co.id/api/recruitment/positions/";
//    public static void main (String[] args) throws Exception{
//        getJobList();
//    }
    public static void getJobList() throws Exception{
        System.out.println(jobListURL);
        URL link = new URL(jobListURL);
        HttpURLConnection connection = (HttpURLConnection) link.openConnection();
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();

        System.out.println("GET Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK){
            System.out.println(connection.getContent());
        }
    }
}