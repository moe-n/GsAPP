//ブラウザを表示するアクティビティーです
package com.gashfara.moe.gsapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;


class WebActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //レイアウトをセットします
        setContentView(R.layout.activity_web);

        // Intent というクラスを取得。
        // getintenは頭にクラス名がついていない。もともとついている関数。
        // actionveractivitにintenという関数がありそれを使っている。
        // を継承Intentでアクティビティー間のデータを受け渡しします。
        // intenとはユニークな情報を管理する(値を渡す、画面を開く、など）のためのクラス。
        // 自分自身のIntentの値を受け取るためにインスタンスに代入。
        Intent intent = getIntent();
        // キーを元に自分自身のインテントデータを取得する
        // 複数の値を受け取れるため、今回はurlという値に指定する
        String url  = intent.getStringExtra("url");

        //WebViewというidをキーにして探す
        WebView webView = (WebView) findViewById(R.id.webView1);
        //log.dという関数を使ってデバッグログを実装。
        Log.d("get myurl", url);
        //webviewclientといクラスをnewする。
        // ブラウザの機能をセットします。javaのお約束。
        webView.setWebViewClient(new WebViewClient());
        //URLを表示します。
        webView.loadUrl(url);
    }
    //デフォルトで作成されたメニューの関数です。未使用。
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_web, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
