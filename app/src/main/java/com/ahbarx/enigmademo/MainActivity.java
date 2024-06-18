package com.ahbarx.enigmademo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4;
    String[] texts = {
            "“Be yourself; everyone else is already taken.” ― Oscar Wilde",
            "“Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.” ― Albert Einstein",
            "“Be the change that you wish to see in the world.” ― Mahatma Gandhi",
            "“If you tell the truth, you don't have to remember anything.” ― Mark Twain"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
    }

    @Override
    protected void onResume() {
        super.onResume();
        tv1.setText(texts[0]);
        tv2.setText(texts[1]);
        tv3.setText(texts[2]);
        tv4.setText(texts[3]);
    }
}