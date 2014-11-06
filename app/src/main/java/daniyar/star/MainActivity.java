package daniyar.star;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class MainActivity extends Activity {

    private static boolean vis = true;
    private static ImageView mImage1;
    private static ImageView mImage2;
    private static ImageView mImage3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImage1 = (ImageView)findViewById(R.id.star1);
        mImage2 = (ImageView)findViewById(R.id.star2);
        mImage3 = (ImageView)findViewById(R.id.star3);

        ImageButton button = (ImageButton)findViewById(R.id.imageButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(vis){
                    vis =false;
                    makeAnimationSetStarLeftOpen();
                    makeAnimationSetStarRightOpen();
                    makeAnimationSetStarTopOpen();
                }
                else {
                    vis = true;
                    makeAnimationSetStarLeftClose();
                    makeAnimationSetStarRightClose();
                    makeAnimationSetStarTopClose();
                }
            }
        });
    }

    private  void makeAnimationSetStarLeftOpen(){
        Animation set = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.set_star_left_open);
        mImage1.startAnimation(set);
    }

    private  void makeAnimationSetStarRightOpen(){
        Animation set = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.set_star_right_open);
        mImage2.startAnimation(set);
    }

    private void makeAnimationSetStarTopOpen(){
        Animation set = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.set_star_top_open);
        mImage3.startAnimation(set);
    }

    private void makeAnimationSetStarLeftClose(){
        Animation set = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.set_star_left_close);
        mImage1.startAnimation(set);
    }

    private void makeAnimationSetStarRightClose(){
        Animation set = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.set_star_right_close);
        mImage2.startAnimation(set);
    }

    private void makeAnimationSetStarTopClose(){
        Animation set = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.set_star_top_close);
        mImage3.startAnimation(set);
    }

/*
    //увеличение и уменьшение изображения
    private void makeScaleAnimation() {
        Animation scale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
        mImage1.startAnimation(scale);
    }

    // вертится по определенной траектории
    private void makeRotateAnimation() {
        Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        mImage1.startAnimation(rotate);
    }

    //изображение перемещается в новую позицию
    private void makeTranslateAnimation() {
        Animation translate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
        mImage1.startAnimation(translate);
    }

    // прозрачность
    private void makeAlphaAnimation() {
        Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
        mImage1.startAnimation(alpha);
    }

    // несколько элементов вместе
    private void makeAnimationSet() {
        Animation set = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.set);
        mImage1.startAnimation(set);
    }
*/
}
