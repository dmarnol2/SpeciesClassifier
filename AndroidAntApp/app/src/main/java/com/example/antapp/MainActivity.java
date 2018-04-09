package com.example.antapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    static final int REQUEST_IMAGE_CAPTURE = 1;
    private final ImageView mImageView=null;
    private Button logout;
    private Button identifyButton;
    private ImageButton file1Button;
    private ImageButton file2Button;
    private ImageButton file3Button;
    private ImageButton camButton;
    private String dlResults = "technomyrmex";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logout=(Button)findViewById(R.id.button);
        identifyButton = (Button)findViewById(R.id.button2);
        file1Button = (ImageButton)findViewById(R.id.imageButton);
        //file2Button = (ImageButton)findViewById(R.id.imageButton2);
        //file3Button = (ImageButton)findViewById(R.id.imageButton3);
        camButton = (ImageButton)findViewById(R.id.imageButton4);
        identifyButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent webIntent = new Intent(MainActivity.this, WebActivity.class);
                webIntent.putExtra("ANT", "Technomyrmex");
                startActivity(webIntent);
            }// end onclick
        });

    }

    // intent to use camera
    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }


}

    /**@Override  // retrieves image taken from camera and displays it in ImageView
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");

            mImageView.setImageBitmap(imageBitmap);
        }
    }
**/

}
