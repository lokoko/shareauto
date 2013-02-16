package com.shareauto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

public class MainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.home);
    
    /*TableLayout viewHolder = (TableLayout) LayoutInflater.from(getApplicationContext()).inflate(R.layout.home, null);
    LinearLayout topContent = (LinearLayout) viewHolder.findViewById(R.id.top_content);
    topContent.setOnClickListener(new OnClickListener() {
      
      @Override
      public void onClick(View v) {
      }
    });
    
    TableLayout.LayoutParams params = new TableLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
    addContentView(viewHolder, params);*/
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.activity_main, menu);
    
    MenuItem logout = menu.findItem(R.id.logout);
    logout.setOnMenuItemClickListener(new OnMenuItemClickListener() {
      
      @Override
      public boolean onMenuItemClick(MenuItem item) {
        finish();
        
        return true;
      }
    });
    return true;
  }

}
