package a4everstudent.animations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

//solving the problem of instant animation with help of fellow students of the course

    public void challenge(View view){

        ImageView deadpool = (ImageView) findViewById(R.id.deadpool);

        //will call the xml file to get the setted animations config
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anidead);
        deadpool.startAnimation(animation);

    }

      /*
        //left translation
        deadpool.animate().translationX(-1000f).setDuration(1000);
        //right translation
        deadpool.animate().translationX(1000f).setDuration(2000);
        //Zoom in full screen
        deadpool.animate().scaleX(2f).scaleY(2f).setDuration(3000);
*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
