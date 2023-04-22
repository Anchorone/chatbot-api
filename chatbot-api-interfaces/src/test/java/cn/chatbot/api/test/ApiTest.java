package cn.chatbot.api.test;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import javax.swing.text.html.parser.Entity;
import java.io.IOException;

public class ApiTest {
    @Test
    public void query_unanswered_questions() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpGet get = new HttpGet();

        get.addHeader("cookie","");
        get.addHeader("Content-Type","");

        CloseableHttpResponse httpResponse = httpClient.execute(get);
        if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
            String res = EntityUtils.toString(httpResponse.getEntity());
            System.out.println(res);
        }else {
            System.out.println(httpResponse.getStatusLine().getStatusCode());
        }
    }
}
