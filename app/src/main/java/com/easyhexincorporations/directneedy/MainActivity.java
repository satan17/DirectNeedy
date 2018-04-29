package com.easyhexincorporations.directneedy;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String about = "http://www.directneedy.org/about-us/",
            contact = "http://www.directneedy.org/offline-donations/",
            now = "http://www.directneedy.org/donate/",
            cause = "http://www.directneedy.org/causes/",
            help = "http://www.directneedy.org/shop-n- help/";
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i = new Intent(Intent.ACTION_VIEW);

    }

    public void about(View v)
    {
        i.setData(Uri.parse(about));
        startActivity(i);
    }


    public void donateNow(View v)
    {
        i.setData(Uri.parse(now));
        startActivity(i);
    }

    public void causes(View v)
    {
        i.setData(Uri.parse(cause));
        startActivity(i);
    }

   public void help(View v)
   {
       i.setData(Uri.parse(help));
       startActivity(i);
   }

    public void contact(View v)
    {
        i.setData(Uri.parse(contact));
        startActivity(i);
    }

   public void scanQr(View v)
   {
//       Toast.makeText(this, "Had to work", Toast.LENGTH_SHORT).show()
   }
}
