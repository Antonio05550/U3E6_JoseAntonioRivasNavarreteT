package mx.edu.ittepic.u3e6_joseantoniorivasnavarrete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    String cat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        cat = getIntent().getExtras().getString("cat");
        setContentView(new Lienzo1( this ));
    }
}
