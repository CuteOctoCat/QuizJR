package una.quizjr;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import java.util.concurrent.ThreadLocalRandom;

public class MainAnimales extends AppCompatActivity {
    private String [] animales={"cow","dog","monkey","pig"};
    int id []={R.drawable.cow,R.drawable.dog,R.drawable.monkey,R.drawable.pig};
    private ImageSwitcher sw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_animales);
        this.setActionBar("Animales");

        sw= (ImageSwitcher) findViewById(R.id.imageswitcher);        sw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView (){
                ImageView imageview = new ImageView(getApplicationContext());
                imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imageview;

            }

        });

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void change ()
    {   int randomNum = ThreadLocalRandom.current().nextInt(3 + 1, 0);


    }

    private void setActionBar(String msg){
        getSupportActionBar().setTitle(msg);
    }
}
