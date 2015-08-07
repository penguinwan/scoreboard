package com.jt.scoreboard.core;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.InputStream;
import java.io.StringWriter;

/**
 * Created by superman on 8/7/2015.
 */
public class HttpCommunicationManager {
    public String callUpdate() {
        String result = "";

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://localhost:8080/update");
        CloseableHttpResponse response1 = null;
        try {
            response1 = httpclient.execute(httpGet);
            System.out.println(response1.getStatusLine());
            HttpEntity entity1 = response1.getEntity();

            InputStream inputStream = entity1.getContent();
            StringWriter writer = new StringWriter();
            IOUtils.copy(inputStream, writer, "UTF-8");
            result = writer.toString();

            EntityUtils.consume(entity1);
        } catch (Exception ex) {

        } finally {
            if (response1 != null) {
                try {
                    response1.close();
                } catch (Exception ex) {

                }
            }
        }

        return result;
    }
}
