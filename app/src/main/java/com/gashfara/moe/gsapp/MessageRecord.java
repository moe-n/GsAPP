//1つのセルにあるデータを保存するためのデータクラスです。
package com.gashfara.moe.gsapp;

public class MessageRecord {
    //保存するデータ全てを変数で定義します。
    private String id;
    private String imageUrl;
    private String title;
    private String comment;
    private String store;


    //データを１つ作成する関数(コンストラクター)です。項目が増えたら増やしましょう。
    public MessageRecord(String id, String imageUrl, String title, String store, String comment) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.title = title;
        this.comment = comment;
        this.store = store;

    }
    //それぞれの項目を返す関数です。項目が増えたら増やしましょう。
    //上記の変数がprivateなので、それを呼ぶために書く
    public String getId() {
        return id;
    }
    public String getImageUrl() {return imageUrl; }
    public String getTitle() {
        return title;
    }
    public String getComment() {
        return comment;
    }
    public String getStore() {
        return store;
    }

}
