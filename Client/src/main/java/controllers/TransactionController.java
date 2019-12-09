package controllers;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class TransactionController {
    private String rootURL = "http://zipcode.rocks:8085";

    public TransactionController() {}

    public String getRootURL() {
        return rootURL;
    }

    public void setRootURL(String rootURL) {
        this.rootURL = rootURL;
    }

    public String makeURLCall(String endpoint, String method, String jpayload) {

        HttpResponse<JsonNode> jsonResponse;

        if ("get".equalsIgnoreCase(method)) {
            jsonResponse = Unirest.get(rootURL + endpoint)
                    .header("accept", "application/json").asJson();
        } else if ("put".equalsIgnoreCase(method)) {
            jsonResponse = Unirest.put(rootURL + endpoint).body(jpayload)
                    .header("accept", "application/json").asJson();
        } else if ("post".equalsIgnoreCase(method)) {
            jsonResponse = Unirest.post(rootURL + endpoint).body(jpayload)
                    .header("accept", "application/json").asJson();
        } else {
            return null;
        }
        return jsonResponse.getBody().toString();
    }
}
