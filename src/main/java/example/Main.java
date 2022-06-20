package example;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        SignupDto signupDto = new SignupDto("email@email.com", "password", "010-0000-0000", "주소");
    
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()){
            HttpPost request = new HttpPost("http://localhost:8080/api/signup");
            StringEntity postData = new StringEntity(gson.toJson(signupDto));
            request.addHeader("Content-Type", "application/json");
            request.setEntity(postData);
            
            HttpResponse httpResponse = httpClient.execute(request);

            HttpEntity entity = httpResponse.getEntity();
            String resultJson = EntityUtils.toString(entity, "UTF-8");
            ResultDto resultDto = gson.fromJson(resultJson, ResultDto.class);
            
            System.out.println(resultDto.toString());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}