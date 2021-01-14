package providerservice.framework;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public JsonNode loadProviderJson() throws UnirestException {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json; charset=UTF-8");
        return Unirest.post("http://localhost:8081/operation/addition").headers(headers).body(new JSONObject("{\n" +
                "    \"number1\": 10,\n" +
                "    \"number2\": 13\n" +
                "}"))
                .asJson().getBody();
    }
}
