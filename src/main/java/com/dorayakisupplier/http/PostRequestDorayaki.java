package com.dorayakisupplier.http;

import jdk.nashorn.internal.parser.JSONParser;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.util.Scanner;

public class PostRequestDorayaki {

    public int createPost(int idDorayaki, int amount) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("http://localhost:8000/requests");
        httpPost.setEntity(new StringEntity("{\"idDorayaki\": " + idDorayaki + ", \"amount\": " + amount + "}"));
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-type", "application/json");
        HttpResponse httpresponse = httpClient.execute(httpPost);
        Scanner sc = new Scanner(httpresponse.getEntity().getContent());
        return httpresponse.getStatusLine().getStatusCode();
//        String resp = sc.nextLine();
//        System.out.println(resp);
//        return resp;
    }

//    public static void main(String[] args) {
//        try{
//            (new PostRequestDorayaki()).createPost(1, 2);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
}
