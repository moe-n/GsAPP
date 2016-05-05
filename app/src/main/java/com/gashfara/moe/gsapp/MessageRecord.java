//1つのセルにあるデータを保存するためのデータクラスです。
package com.gashfara.moe.gsapp;

public class MessageRecord {
    //保存するデータ全てを変数で定義します。
    private String imageUrl;
    private String title;
    private String store;
    private String comment;

    //データを１つ作成する関数です。項目が増えたら増やしましょう。
    public MessageRecord(String imageUrl, String title, String store, String comment) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.store = store;
        this.comment = comment;
    }
    //それぞれの項目を返す関数です。項目が増えたら増やしましょう。
    public String getComment() {
        return comment;
    }
    public String getTitle() {
        return title;
    }
    public String getStore() {
        return store;
    }
    public String getImageUrl() {return imageUrl; }

}
