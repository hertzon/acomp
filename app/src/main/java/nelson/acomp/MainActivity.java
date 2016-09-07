package nelson.acomp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    String LOGTAG="Debug";
    ImageButton imageButton_bar;
    ImageButton imageButton_girl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(LOGTAG, "Comenzando aplicacion.....");

        imageButton_bar=(ImageButton)findViewById(R.id.imageButton_bar);
        imageButton_girl=(ImageButton)findViewById(R.id.imageButton_girl);

        imageButton_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(LOGTAG,"Oprimio buscar bbc");
                

            }
        });

        imageButton_girl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(LOGTAG,"Oprimio buscar girl");
            }
        });

    }
}
