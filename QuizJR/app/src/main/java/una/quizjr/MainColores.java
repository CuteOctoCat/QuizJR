package una.quizjr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainColores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_colores);
        this.SetActionBar("Colores");
    }

    public void SetActionBar(String msg){getSupportActionBar().setTitle(msg);}
}
