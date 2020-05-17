package com.mydumfries.mydiary;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ReceiptsActivity  extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receipts);
        final TextView onenote = findViewById(R.id.launchonenote);
        onenote.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                PackageManager packageManager = getPackageManager();
                String packageName = "com.microsoft.office.onenote";
                try {
                    Intent intent = packageManager
                            .getLaunchIntentForPackage(packageName);
                    if (null != intent) {
                        startActivity(intent);
                    }
                } catch (ActivityNotFoundException e) {

                }
            }
        });
        final TextView lens = findViewById(R.id.launchlens);
        lens.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                PackageManager packageManager = getPackageManager();
                String packageName = "com.microsoft.office.officelens";
                try {
                    Intent intent = packageManager
                            .getLaunchIntentForPackage(packageName);
                    if (null != intent) {
                        startActivity(intent);
                    }
                } catch (ActivityNotFoundException e) {

                }
            }
        });
    }
}
