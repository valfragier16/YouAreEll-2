package controllers;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import models.Id;

public class IdController {
    Id myId;
    private TransactionController transactionController = new TransactionController();


    public ArrayList<Id> parseIds(String payload) {
        Type listType = new TypeToken<List<Id>>() {}.getType();
        return new Gson().fromJson(payload, listType);
    }

    public Id postId(Id id) {
        String payload = new Gson().toJson(id);
        transactionController.makeURLCall("/ids", "POST", payload);
        return id;
    }

    public Id putId(Id id) {
        String payload = new Gson().toJson(id);
        transactionController.makeURLCall("/ids", "PUT", payload);
        return id;
    }

    public String getIds() {
        return transactionController.makeURLCall( "/ids", "GET", "");
    }
    public Id findById(Id id) {
        ArrayList<Id> idList = parseIds(getIds());
        Id foundId = null;

        for (Id idInList : idList) {
            if (idInList.getGithub().equals(id.getGithub())) {
                foundId = idInList;
            }
        } return foundId;
    }

    public Id findByGitId(String gitId) {
        ArrayList<Id> idList = parseIds(getIds());
        Id foundId = null;

        for (Id idInList : idList) {
            if (gitId.equals(idInList.getGithub())) {
                foundId = idInList;
                break;
            }
        } return foundId;
    }
 
}