package escobedo.jnix.escobedo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.support.v4.widget.DrawerLayout;
import android.widget.ListView;

public class userAndPassword extends Activity implements View.OnClickListener {
    //implements View.OnClickListener
    Button boton1;
    Button boton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_and_password);

        boton1 = (Button) findViewById(R.id.button2Iniciar);
        boton1.setOnClickListener(this);
        boton2 = (Button) findViewById(R.id.button3Registrarse);
        boton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

           switch (v.getId()){
               case R.id.button2Iniciar:
               Intent intent = new Intent(this,mainActivity.class);
                   startActivity(intent);
                   break;
               case R.id.button3Registrarse:
                   Intent intent2 = new Intent(this,registro.class);
                   startActivity(intent2);
                   break;
           }


    }
}
