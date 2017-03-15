package una.quizjr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainInterface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_interface);
        // alambramos el Button
        // alambramos el Button
        ImageView Next = (ImageView) findViewById(R.id.irsiguiente);

        //Programamos el evento onclick

        Next.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View arg0) {


                Intent intento = new Intent(getApplicationContext(), MainMenu.class);
                startActivity(intento);


            }

        });

    }
}
