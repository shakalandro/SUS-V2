package com.example.sus_v2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class SUSMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		WebView webview = new WebView(this);
		setContentView(webview);
		
		// Simplest usage: note that an exception will NOT be thrown
		// if there is an error loading this page (see below).
		webview.loadUrl("http://sus-menu.org/");
		
		// OR, you can also load from an HTML string:
		String summary = "<html><body>You scored <b>192</b> points.</body></html>";
		webview.loadData(summary, "text/html", null);
		// ... although note that there are restrictions on what this HTML can do.
		// See the JavaDocs for loadData() and loadDataWithBaseURL() for more info.
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.susmenu, menu);
		return true;
	}

}
