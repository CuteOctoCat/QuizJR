package una.quizjr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainAnimales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_animales);
        this.setActionBar("Animales");
    }

    public void setActionBar(String msg){
        getSupportActionBar().setTitle(msg);
    }
}
