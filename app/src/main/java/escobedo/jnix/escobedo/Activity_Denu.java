package escobedo.jnix.escobedo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Activity_Denu extends Activity implements View.OnClickListener {

    ImageButton boton1;
    ImageButton boton2;
    ImageButton boton3;
    ImageButton boton4;
    ImageButton boton5;
    ImageButton boton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity__denu);

        boton1 = (ImageButton) findViewById(R.id.denu1);
        boton2 = (ImageButton) findViewById(R.id.denu2);
        boton3 = (ImageButton) findViewById(R.id.denu3);
        boton4 = (ImageButton) findViewById(R.id.denu4);
        boton5 = (ImageButton) findViewById(R.id.denu5);
        boton6 = (ImageButton) findViewById(R.id.denu6);
        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);
        boton5.setOnClickListener(this);
        boton6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.denu1:
                Intent intent = new Intent(this,Denu_Sospechoso.class);
                startActivity(intent);
                break;

            case R.id.denu2:
                Intent intent2 = new Intent(this,DenuCorru.class);
                startActivity(intent2);
                break;

            case R.id.denu3:
                Intent intent3 = new Intent(this,DenuRobo.class);
                startActivity(intent3);
                break;

            case R.id.denu4:
                Intent intent4 = new Intent(this,DenuAutos.class);
                startActivity(intent4);
                break;

            case R.id.denu5:
                Intent intent5 = new Intent(this,DenuVio.class);
                startActivity(intent5);
                break;

            case R.id.denu6:
                Intent intent6 = new Intent(this,DenuDano.class);
                startActivity(intent6);
                break;

            default:
                break;

        }

    }
}
