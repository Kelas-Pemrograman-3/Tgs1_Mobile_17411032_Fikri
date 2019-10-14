package com.Fikri.mybio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText npm,nama,alamat,prodi;
    Button button;
    TextView vnpm,vnama,valamat,vprodi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        npm=(EditText) findViewById(R.id.txtnpm);
        nama=(EditText) findViewById(R.id.txtnama);
        alamat=(EditText) findViewById(R.id.txtalamat);
        prodi=(EditText) findViewById(R.id.txtprodi);
        button=(Button) findViewById(R.id.btnsubmit);
        vnpm=(TextView) findViewById(R.id.tvnpm);
        vnama=(TextView) findViewById(R.id.tvnama);
        valamat=(TextView) findViewById(R.id.tvalamat);
        vprodi=(TextView) findViewById(R.id.tvprodi);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String strnpm = npm.getText().toString();
               String strnama = nama.getText().toString();
               String stralamat = alamat.getText().toString();
               String strprodi = prodi.getText().toString();

               vnpm.setText(strnpm);
               vnama.setText(strnama);
               valamat.setText(stralamat);
               vprodi.setText(strprodi);
               npm.setText("");
               nama.setText("");
               alamat.setText("");
               prodi.setText("");
               npm.requestFocus();
           }
       });
    }
}
