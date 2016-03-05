package escobedo.jnix.escobedo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class reportes extends Activity implements View.OnClickListener{

    ImageButton bboton1;
    ImageButton bboton2;
    ImageButton bboton3;
    ImageButton bboton4;
    ImageButton bboton5;
    ImageButton bboton6;
    ImageButton bboton7;
    ImageButton bboton8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);

        bboton1 = (ImageButton) findViewById(R.id.imab1);
        bboton2 = (ImageButton) findViewById(R.id.imab2);
        bboton3 = (ImageButton) findViewById(R.id.imabe3);
        bboton4 = (ImageButton) findViewById(R.id.imab4);
        bboton5 = (ImageButton) findViewById(R.id.imab5);
        bboton6 = (ImageButton) findViewById(R.id.imabe6);
        bboton7 = (ImageButton) findViewById(R.id.imab7);
        bboton8 = (ImageButton) findViewById(R.id.imab8);
        bboton1.setOnClickListener(this);
        bboton2.setOnClickListener(this);
        bboton3.setOnClickListener(this);
        bboton4.setOnClickListener(this);
        bboton5.setOnClickListener(this);
        bboton6.setOnClickListener(this);
        bboton7.setOnClickListener(this);
        bboton8.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.imab1:
                Intent intent = new Intent(this,DenuCame.class);
                startActivity(intent);
                break;

            case R.id.imab2:
                Intent intent2 = new Intent(this,DenuAlumbra.class);
                startActivity(intent2);
                break;

            case R.id.imabe3:
                Intent intent3 = new Intent(this,DenuLA.class);
                startActivity(intent3);
                break;

            case R.id.imab4:
                Intent intent4 = new Intent(this,MantePla.class);
                startActivity(intent4);
                break;

            case R.id.imab5:
                Intent intent5 = new Intent(this,DenuSema.class);
                startActivity(intent5);
                break;

            case R.id.imabe6:
                Intent intent6 = new Intent(this,DenuBaches.class);
                startActivity(intent6);
                break;

            case R.id.imab7:
                Intent intent7 = new Intent(this,DenuSegu.class);
                startActivity(intent7);
                break;

            case R.id.imab8:
                Intent intent8 = new Intent(this,DenuSenaVia.class);
                startActivity(intent8);
                break;

            default:
                break;

        }

    }
}
