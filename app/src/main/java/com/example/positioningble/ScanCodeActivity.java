package com.example.positioningble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.positioningble.MainActivity;
import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class ScanCodeActivity extends AppCompatActivity implements ZXingScannerView.ResultHandler {

    ZXingScannerView ScannerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScannerView=new ZXingScannerView(this);

        setContentView(ScannerView);
    }

    @Override
    public void handleResult(Result result)
    {
        MainActivity.plan_link=result.getText().toString();
        startActivity(new Intent(getApplicationContext(),PositioningActivity.class));
        //onBackPressed();
    }

    @Override
    protected void onPause()
    {

        super.onPause();

        ScannerView.stopCamera();
    }

    @Override
    protected void onResume()
    {
        super.onResume();

        ScannerView.setResultHandler(this);
        ScannerView.startCamera();
    }
}
