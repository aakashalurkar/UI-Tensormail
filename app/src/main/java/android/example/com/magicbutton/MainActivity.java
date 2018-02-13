package android.example.com.magicbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.com.bloder.magic.view.MagicButton;

public class MainActivity extends AppCompatActivity {

    MagicButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (MagicButton) findViewById(R.id.magic_button);

        button.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Calling Gmail API...", Toast.LENGTH_LONG).show();
                Intent goToEmail = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(goToEmail);
            }
        });
    }
}
