package escobedo.jnix.escobedo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Recomendations extends Activity implements View.OnClickListener {

    ImageView zika;
    ImageView dengue;
    ImageView chikungunya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recomendations);
        //getActionBar().setDisplayHomeAsUpEnabled(true);

        zika = (ImageView) findViewById(R.id.imageView7);
        dengue = (ImageView) findViewById(R.id.imageView18);
        chikungunya = (ImageView) findViewById(R.id.imageView19);
        zika.setOnClickListener(this);
        dengue.setOnClickListener(this);
        chikungunya.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.imageView7:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nl.gob.mx/servicios/prevencion-del-zika")));
                break;

            case R.id.imageView18:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nl.gob.mx/servicios/prevencion-del-dengue")));
                break;

            case R.id.imageView19:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nl.gob.mx/servicios/prevencion-del-chikungunya")));
                break;

            default:
                break;
        }
    }
}
