package com.vsorokin.gridchat6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView messages;
    EditText message;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        message = (EditText) findViewById(R.id.message);
        messages = (TextView) findViewById(R.id.Messages);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = messages.getText().toString();
                messages.setText(text + "\r\n" + message.getEditableText());
            }
        });
    }

    protected void sendMessage(View view) {
        String text = message.getEditableText().toString();
        messages.setText(text);
    }
}
