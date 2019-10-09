package julisabarbanmartinez.example.tarea3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class FrmPrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_principal2);
    }
    public void  buton17 (View view){
        Intent buton17 = new Intent( this, Pantalla1.class);
        startActivity(buton17);
    }
}
