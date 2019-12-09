package models;

/* 
 * POJO for an Id object
 */
public class Id {
    private String name;
    private String github;
    private String userid;


    public Id (String name, String githubId) {
        this.name = name;
        this.github = githubId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

}