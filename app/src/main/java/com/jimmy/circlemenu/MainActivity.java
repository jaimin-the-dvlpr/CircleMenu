package com.jimmy.circlemenu;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
public class MainActivity extends AppCompatActivity {

    CircleMenu circleMenu;
    String Arr []= {
            "Facebook",
            "Twitter",
            "Instagram",
            "Google+",
            "Youtube",
            "Skype"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    circleMenu = findViewById(R.id.circlemenu);

    circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.plus,R.drawable.plus)
            .addSubMenu(Color.parseColor("#FF3B68C9"),R.drawable.fb)
            .addSubMenu(Color.parseColor("#FF00F7FF"),R.drawable.twit)
            .addSubMenu(Color.parseColor("#262626"),R.drawable.insta)
            .addSubMenu(Color.parseColor("#DB4437"),R.drawable.gplus)
            .addSubMenu(Color.parseColor("#FFFF454B"),R.drawable.you)
            .addSubMenu(Color.parseColor("#FF7DDCFF"),R.drawable.skype)
            .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                @Override
                public void onMenuSelected(int position) {
                    Toast.makeText(MainActivity.this,Arr[position], Toast.LENGTH_SHORT).show();
                }
            });
    }


}
