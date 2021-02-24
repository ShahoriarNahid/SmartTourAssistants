package com.example.smarttourassistants;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {


   /* public static final int REQUEST_CODE=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new TestNet().execute();
    }

    class TestNet extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {

            Toast.makeText(SplashScreen.this, "Please Wait...",
                    Toast.LENGTH_SHORT).show();

        }
        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace(); //show logcat error
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            String[] permissions= {Manifest.permission.SEND_SMS,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.ACCESS_FINE_LOCATION};
            if (hasPermission(SplashScreen.this, permissions)){
                Intent goHome =new Intent(SplashScreen.this,MainActivity.class);
                startActivity(goHome);

            }
            else {
                ActivityCompat.requestPermissions(SplashScreen.this, permissions, REQUEST_CODE);
            }



        }
    }

    public static boolean hasPermission(Context c, String... permissions){

        if (c!=null && permissions!=null){
            for (String p: permissions){
                if (ContextCompat.checkSelfPermission(c, p)!= PackageManager.PERMISSION_DENIED);
                return false;

            }
        }

        return true;

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (grantResults.length==3 && grantResults[0]==PackageManager.PERMISSION_GRANTED &&
                grantResults[1]==PackageManager.PERMISSION_GRANTED &&
                grantResults[2]==PackageManager.PERMISSION_GRANTED)
        {


            Intent goHome =new Intent(SplashScreen.this,MainActivity.class);
            startActivity(goHome);
        }

        else {
            AlertDialog.Builder builder = new AlertDialog.Builder(SplashScreen.this);
            builder.setMessage("You have to grant all the permission");
            builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });

            AlertDialog dialog = builder.create();
            dialog.setCancelable(false);
            dialog.show();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new waitTask().execute();
        /*Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    Intent goHome = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(goHome);
                }

            }
        });

        t.start();*/
    }

    class waitTask extends AsyncTask<Void, Void, Void>{

        @Override
        protected void onPreExecute() {
            Toast.makeText(SplashScreen.this,"please wait",
                    Toast.LENGTH_LONG).show();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {

            Intent goHome = new Intent(SplashScreen.this, MainActivity.class);
            startActivity(goHome);

        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
