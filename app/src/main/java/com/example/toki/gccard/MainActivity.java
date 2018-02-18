package com.example.toki.gccard;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declaring and assigning ImageView variable
        ImageView phoneClick = (ImageView) findViewById(R.id.phonePic);

        // Setting an OnClickListener method to listen for an image click
        phoneClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // try-catch construct to catch possible errors
                try {
                    ImageView phone = findViewById(R.id.phonePic);
                    String mNumber = phone.getContentDescription().toString();
                    Intent phoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + mNumber));
                    startActivity(phoneIntent);
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Error in launching a call", Toast.LENGTH_LONG).show();
                    Log.e("DIAL action", "Error in launching a call because of" + e);
                }
            }
        });

        // Declaring and assigning ImageView variable
        ImageView emailClick = (ImageView) findViewById(R.id.mailPic);

        // Setting an OnClickListener method to listen for an image click
        emailClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // try-catch construct to catch possible errors
                try {
                    Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                    Uri uri = Uri.parse("mailto:giacomo.ciotola@gmail.com");
                    emailIntent.setData(uri);
                    startActivity(emailIntent);
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Error in launching email app", Toast.LENGTH_LONG).show();
                    Log.e("Sending email action", "Error in launching email app because of" + e);
                }
            }
        });

        // Declaring and assigning ImageView variable
        ImageView linkedInClick = (ImageView) findViewById(R.id.linkedinPic);
        String linkedinId = "giacomo-ciotola-62207333/";
        final String urlLinkedin = "linkedin://" + linkedinId;
        final PackageManager packageManager = this.getPackageManager();
        final String urlBrowser = "http://www.linkedin.com/in/" + linkedinId;

        // Setting an OnClickListener method to listen for an image click
        linkedInClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkedinIntent = new Intent(Intent.ACTION_VIEW);
                linkedinIntent.setData(Uri.parse(urlLinkedin));

                List<ResolveInfo> list = packageManager.queryIntentActivities(linkedinIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);

                if (list.size() == 0) {
                    linkedinIntent.setData(Uri.parse(urlBrowser));
                }
                startActivity(linkedinIntent);
            }
        });

        // Declaring and assigning ImageView variable
        ImageView twitterClick = (ImageView) findViewById(R.id.twitterPic);
        String twitterId = "giatoki";
        final String urlTwitter = "twitter://" + twitterId;
        final PackageManager packageManagerTW = this.getPackageManager();
        final String urlBrowserTW = "https://twitter.com/" + twitterId;

        // Setting an OnClickListener method to listen for an image click
        twitterClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(urlTwitter));

                List<ResolveInfo> list = packageManagerTW.queryIntentActivities(intent,
                        PackageManager.MATCH_DEFAULT_ONLY);

                if (list.size() == 0) {
                    intent.setData(Uri.parse(urlBrowserTW));
                }
                startActivity(intent);
            }
        });

        // Declaring and assigning ImageView variable
        ImageView websiteClick = (ImageView) findViewById(R.id.websitePic);

        // Setting an OnClickListener method to listen for an image click
        websiteClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // try-catch construct to catch possible errors
                try {
                    Intent websiteIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gcengineering.it"));
                    startActivity(websiteIntent);
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Error in launching browser app", Toast.LENGTH_LONG).show();
                    Log.e("Opening website action", "Error in launching browser app because of" + e);
                }
            }
        });

        // Declaring and assigning ImageView variable
        ImageView fbClick = (ImageView) findViewById(R.id.fbPic);
        String fbId = "519118900";
        final String urlFacebook = "fb://page/" + fbId;
        final PackageManager packageManagerFB = this.getPackageManager();
        final String urlBrowserFB = "https://www.facebook.com/" + fbId;

        // Setting an OnClickListener method to listen for an image click
        fbClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(urlFacebook));

                List<ResolveInfo> list = packageManagerFB.queryIntentActivities(intent,
                        PackageManager.MATCH_DEFAULT_ONLY);

                if (list.size() == 0) {
                    intent.setData(Uri.parse(urlBrowserFB));
                }
                startActivity(intent);
            }
        });

        // Declaring and assigning ImageView variable
        ImageView mapClick = (ImageView) findViewById(R.id.addressPic);
        final String map = "https://www.google.it/maps/place/Via+Giovanni+Castellaccio,+99,+80075+Forio+NA";

        // Setting an OnClickListener method to listen for an image click
        mapClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(intent);
            }
        });

        // Declaring and assigning ImageView variable
        ImageView resumeClick = (ImageView) findViewById(R.id.resumePic);

        // Setting an OnClickListener method to listen for an image click
        resumeClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // try-catch construct to catch possible errors
                try {
                    Intent resumeIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gcengineering.it/images/curriculum.pdf"));
                    startActivity(resumeIntent);
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Error in launching browser app", Toast.LENGTH_LONG).show();
                    Log.e("Opening website action", "Error in launching browser app because of" + e);
                }
            }
        });
    }
}