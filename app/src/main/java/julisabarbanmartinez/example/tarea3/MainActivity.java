package julisabarbanmartinez.example.tarea3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void principal (View view){
        Intent principal = new Intent( this, FrmPrincipalActivity.class);
        startActivity(principal);
    }
}
