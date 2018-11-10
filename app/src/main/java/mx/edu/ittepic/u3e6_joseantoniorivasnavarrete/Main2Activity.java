package mx.edu.ittepic.u3e6_joseantoniorivasnavarrete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView(new Lienzo1( this ));
    }
}
