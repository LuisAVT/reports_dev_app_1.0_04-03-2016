package escobedo.jnix.escobedo;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageButton;

public class mainActivity extends Activity implements View.OnClickListener {

    ImageButton image1;
    ImageButton image2;
    ImageButton image3;
    ImageButton image4;
    ImageButton image5;
    ImageButton image6;
    ImageButton image7;
    ImageButton image8;
    ImageButton image9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = (ImageButton) findViewById(R.id.imageButton);
        image2 = (ImageButton) findViewById(R.id.imageButton2);
        image3 = (ImageButton) findViewById(R.id.imageButton3);
        image4 = (ImageButton) findViewById(R.id.imageButton4);
        image5 = (ImageButton) findViewById(R.id.imageButton5);
        image6 = (ImageButton) findViewById(R.id.imageButton6);
        image7 = (ImageButton) findViewById(R.id.imageButton7);
        image8 = (ImageButton) findViewById(R.id.imageButton8);
        image9 = (ImageButton) findViewById(R.id.imageButton9);
        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
        image5.setOnClickListener(this);
        image6.setOnClickListener(this);
        image7.setOnClickListener(this);
        image8.setOnClickListener(this);
        image9.setOnClickListener(this);



        TextView textView = (TextView) findViewById(R.id.txtViewNews);
        TextView textView2 = (TextView) findViewById(R.id.txtViewDenu);

    }

    protected Dialog onCreateDialog(int id){

        Dialog dialog = null;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder = builder.setIcon(R.drawable.sos);
        builder = builder.setTitle("ALARMA DE PANICO");
        dialog = builder.create();

        return dialog;
    }


   // public void imagen(View v){

        //switch (v.getId()){
        //    case R.id.imageButton:
      //          Intent intent = new Intent(this,news.class);
    //            startActivity(intent);

  //              break;
//            case 2:

          //  default:

        //        break;
      //  }
    //}


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.imageButton:
                Intent intent = new Intent(this, news.class);
                startActivity(intent);
                break;
            case R.id.imageButton2:
                Intent intent1 = new Intent(this, Activity_Denu.class);
                startActivity(intent1);
                break;
            case R.id.imageButton3:
                Intent intent2 = new Intent(this, reportes.class);
                startActivity(intent2);
                break;
            case R.id.imageButton4:

                onCreateDialog(0).show();

                //Intent intent3 = new Intent(this,panic.class);
                //startActivity(intent3);
                break;
            case R.id.imageButton5:
                Intent intent4 = new Intent(this, emerg.class);
                startActivity(intent4);
                break;
            case R.id.imageButton6:
                Intent intent5 = new Intent(this, MapsActivity.class);
                startActivity(intent5);
                break;
            case R.id.imageButton7:
                Intent intent6 = new Intent(this,event.class);
                startActivity(intent6);
                break;
            case R.id.imageButton8:
                Intent intent7 = new Intent(this,redes.class);
                startActivity(intent7);
                break;
            case R.id.imageButton9:
                Intent intent8 = new Intent(this,contact.class);
                startActivity(intent8);
                break;

            default:
                break;


        }
    }
}
