package escobedo.jnix.escobedo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class emerg extends Activity implements View.OnClickListener {

    ImageButton image19;
    ImageButton image20;
    ImageButton image21;
    //ImageButton image22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emerg);

        image19 = (ImageButton) findViewById(R.id.imageButton19);
        image20 = (ImageButton) findViewById(R.id.imageButton20);
        image21 = (ImageButton) findViewById(R.id.imageButton21);
        //image22 = (ImageButton) findViewById(R.id.imageButton22);
        image19.setOnClickListener(this);
        image20.setOnClickListener(this);
        image21.setOnClickListener(this);
        //image22.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.imageButton19:
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:14771477"));
                startActivity(callIntent);
                break;

            case R.id.imageButton20:
                Intent callIntent2 = new Intent(Intent.ACTION_CALL);
                callIntent2.setData(Uri.parse("tel:10520700"));
                startActivity(callIntent2);
                break;

            case R.id.imageButton21:
                Intent callIntent3 = new Intent(Intent.ACTION_CALL);
                callIntent3.setData(Uri.parse("tel:81307091"));
                startActivity(callIntent3);
                break;

            default:
                break;
        }
    }
}
