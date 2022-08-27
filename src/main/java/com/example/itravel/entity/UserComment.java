package com.example.itravel.entity;

public class UserComment {
    private String userCommentID;
    private String touristAttractionId;
    private String userPhone;
    private String content;
    private float score;
    public String getUserCommentID() {
        return userCommentID;
    }
    public void setUserCommentID(String userCommentID) {
        this.userCommentID = userCommentID;
    }
    public String getTouristAttractionId() {
        return touristAttractionId;
    }
    public void setTouristAttractionId(String touristAttractionId) {
        this.touristAttractionId = touristAttractionId;
    }
    public String getUserPhone() {
        return userPhone;
    }
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public float getScore() {
        return score;
    }
    public void setScore(float score) {
        this.score = score;
    }
    public UserComment(String userCommentID, String touristAttractionId, String userPhone, String content,
            float score) {
        this.userCommentID = userCommentID;
        this.touristAttractionId = touristAttractionId;
        this.userPhone = userPhone;
        this.content = content;
        this.score = score;
    }
    @Override
    public String toString() {
        return "UserComment [content=" + content + ", score=" + score + ", touristAttractionId=" + touristAttractionId
                + ", userCommentID=" + userCommentID + ", userPhone=" + userPhone + "]";
    }
    
}
