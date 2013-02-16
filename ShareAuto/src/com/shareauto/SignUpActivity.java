package com.shareauto;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.LinearLayout;
import android.widget.QuickContactBadge;
import android.widget.TableLayout;
import android.widget.TableRow;

import com.shareauto.utils.Utils;

public class SignUpActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.sign_up);

    LinearLayout content = (LinearLayout) findViewById(R.id.content);
    TableLayout name = (TableLayout) content.findViewById(R.id.name_with_image);
    QuickContactBadge contact_badge = (QuickContactBadge) name.findViewById(R.id.contact_badge);

    TableRow.LayoutParams params = new TableRow.LayoutParams(Utils.dipToPx(this, 64), Utils.dipToPx(this, 64));
    contact_badge.setLayoutParams(params);

    getIntent();
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.activity_sign_up, menu);
    
    final MenuItem done = menu.findItem(R.id.done);
    done.setOnMenuItemClickListener(new OnMenuItemClickListener() {
      
      @Override
      public boolean onMenuItemClick(MenuItem item) {
        finish();
        
        return true;
      }
    });
    
    return true;
  }

  public void onBackPressed() {
    // TODO Auto-generated method stub
    super.onBackPressed();
  }

}
