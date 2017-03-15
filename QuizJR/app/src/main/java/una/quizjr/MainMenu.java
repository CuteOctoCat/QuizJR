package una.quizjr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {
    private String[] Juegos = {"Colores","Números","Animales","Posicionamiento"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        LlenarListView();
        DandoClickALosItems();


    }

    private void LlenarListView() {


        ArrayAdapter<String> adaptador =new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, Juegos);
        ListView milistview = (ListView) findViewById(R.id.listview);
        milistview.setAdapter(adaptador);
    }

    public void DandoClickALosItems() {
        ListView list = (ListView) findViewById(R.id.listview);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> paret, View viewClicked,
                                    int position, long id){
            switch (position) {
                case 0:
                    Mensaje(Juegos[position]);

                    Intent intento = new Intent(getApplicationContext(), MainColores.class);
                    startActivity(intento);
                    break;
                case 1:
                    Mensaje(Juegos[position]);
                    intento = new Intent(getApplicationContext(), MainAnimales.class);
                    startActivity(intento);
                    break;
                case 2:
                    Mensaje(Juegos[position]);
                    break;
                case 3:
                    Mensaje(Juegos[position]);
                    break;
                default:
                    break;
            }
        }
        });
    }

    private void Mensaje(String msg){
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }

}
