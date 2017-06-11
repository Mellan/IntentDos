package com.example.intentdos;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class DetectActivity extends AppCompatActivity {
    public String packagename="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detect);
        packagename=this.getIntent().getStringExtra("packagename");
        Toast.makeText(this,"应用包名为："+packagename,Toast.LENGTH_LONG).show();
        showActivity();
    }
    public void showActivity(){
        PackageManager pm=getPackageManager();
        try {
            PackageInfo packageInfo=pm.getPackageInfo(packagename,PackageManager.GET_ACTIVITIES);
        } catch (PackageManager.NameNotFoundException e) {
        }
        //Log.d("Activity:",)
    }
}
