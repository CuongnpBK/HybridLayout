package com.example.nguye.hybridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SayHelloHybrid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hello_hybrid);
        Button greetingbutton = (Button)findViewById(R.id.greeting_button);
        greetingbutton.setOnClickListener(new Toaster());
    }
    private class Toaster implements View.OnClickListener{
        @Override
        public void onClick(View clickedButton){
            String greetingText = getString(R.string.greeting_text);
            Toast tempMassage = Toast.makeText(SayHelloHybrid.this, greetingText,Toast.LENGTH_SHORT);
            tempMassage.show();
        }
    }
}
