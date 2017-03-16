package una.quizjr;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.flask.colorpicker.ColorPickerView;
import com.flask.colorpicker.OnColorSelectedListener;
import com.flask.colorpicker.builder.ColorPickerClickListener;
import com.flask.colorpicker.builder.ColorPickerDialogBuilder;

public class MainColores extends AppCompatActivity {
    private TextView txtVerde;
    private TextView txtRojo;
    private TextView txtAmarillo;
    private TextView txtAzul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_colores);
        this.SetActionBar("Colores");
        txtVerde = (TextView) findViewById(R.id.Verde);
        txtRojo = (TextView) findViewById(R.id.Rojo);
        txtAmarillo = (TextView) findViewById(R.id.Amarillo);
        txtAzul = (TextView) findViewById(R.id.Azul);
    }

    public void SetActionBar(String msg){
        getSupportActionBar().setTitle(msg);
    }
    public void pickColor(final View v) {
        ColorPickerDialogBuilder
                .with(this)
                .setTitle("Elija el color solicitado")
                .wheelType(ColorPickerView.WHEEL_TYPE.CIRCLE)
                .density(1)
                .noSliders()
                .setOnColorSelectedListener(new OnColorSelectedListener() {
                    @Override
                    public void onColorSelected(int selectedColor) {
                    }
                })
                .setPositiveButton("Seleccionar", new ColorPickerClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int selectedColor, Integer[] allColors) {
                        Log.d("DEBUG", String.valueOf(selectedColor));
                        switch (v.getId()) {
                            case (R.id.btnVerde):
                                txtVerde.setBackgroundColor(selectedColor);
                                break;
                            case (R.id.btnRojo):
                                txtRojo.setBackgroundColor(selectedColor);
                                break;
                            case (R.id.btnAmarillo):
                                txtAmarillo.setBackgroundColor(selectedColor);
                                break;
                            case (R.id.btnAzul):
                                txtAzul.setBackgroundColor(selectedColor);
                                break;

                        }
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .build()
                .show();
    }
}
