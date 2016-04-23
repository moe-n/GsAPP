//1つのセルにあるデータを保存するためのデータクラスです。
package com.gashfara.moe.gsapp;

public class MessageRecord {
    //保存するデータ全てを変数で定義します。
    private String people;
    private String imageUrl;
    private String comment;
    private String action;

    //データを１つ作成する関数です。項目が増えたら増やしましょう。
    public MessageRecord(String people,String imageUrl, String comment,String action) {
        this.people = people;
        this.imageUrl = imageUrl;
        this.comment = comment;
        this.action = action;

    }
    //それぞれの項目を返す関数です。項目が増えたら増やしましょう。
    public String getPeople() { return people; }
    public String getComment() {
        return comment;
    }
    public String getImageUrl() {return imageUrl; }
    public String getAction() {
        return action;
    }
}
