package a4everstudent.animations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void fade(View view){

        ImageView catwoman = (ImageView) findViewById(R.id.CatWoman);
        ImageView deadpool = (ImageView) findViewById(R.id.deadpool);

        //fade out catwoman image
        catwoman.animate().alpha(0f).setDuration(2000);
        //fade in deadpool image
        deadpool.animate().alpha(1f).setDuration(2000);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
