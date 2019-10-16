package com.example.jordan.pococr;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class ViewImageActivity extends AppCompatActivity {

    String photoPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageview);

        RelativeLayout layout = findViewById(R.id.image_view_layout);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            photoPath = extras.getString("photoPath");
        }

        ImageView ocrImageView = new ImageView(this);

        ocrImageView.setImageURI(Uri.parse(photoPath));

        layout.addView(ocrImageView);
    }
}
