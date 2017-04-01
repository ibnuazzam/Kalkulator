package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editAngka1, editAngka2;
    TextView tvHasil;
    Button btnSubmit, btnSubmit1, btnSubmit2, btnSubmit3;

    Integer angka1, angka2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editAngka1 = (EditText) findViewById(R.id.edit_activity_main_angka_1);
        editAngka2 = (EditText) findViewById(R.id.edit_activity_main_angka_2);
        tvHasil = (TextView) findViewById(R.id.tv_activity_main_1);
        btnSubmit = (Button) findViewById(R.id.btn_activity_main_1);
        btnSubmit1 = (Button) findViewById(R.id.btn_activity_main_2);
        btnSubmit2 = (Button) findViewById(R.id.btn_activity_main_3);
        btnSubmit3 = (Button) findViewById(R.id.btn_activity_main_4);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitung();
            }
        });
        btnSubmit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitung1();
            }
        });
        btnSubmit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitung2();
            }
        });
        btnSubmit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitung3();
            }
        });
    }


    public void hitung() {
        if (!validasi()) {
            return;}

        try {
            angka1 = Integer.parseInt(editAngka1.getText().toString());
        } catch (Exception e) {
            Toast.makeText(this, "Mohon isi angka pada form 1", Toast.LENGTH_SHORT).show();
            return;
        }
        try {
            angka2 = Integer.parseInt(editAngka2.getText().toString());
        } catch (Exception e) {
            Toast.makeText(this, "Mohon isi angka pada form 2", Toast.LENGTH_SHORT).show();
            return;
        }
        Integer hasil = angka1 * angka2;
        tvHasil.setText(String.valueOf(hasil));
    }
    public void hitung1() {
        if (!validasi()) {
            return;}

        try {
            angka1 = Integer.parseInt(editAngka1.getText().toString());
        } catch (Exception e) {
            Toast.makeText(this, "Mohon isi angka pada form 1", Toast.LENGTH_SHORT).show();
            return;
        }
        try {
            angka2 = Integer.parseInt(editAngka2.getText().toString());
        } catch (Exception e) {
            Toast.makeText(this, "Mohon isi angka pada form 2", Toast.LENGTH_SHORT).show();
            return;
        }
        Integer hasil = angka1 / angka2;
        tvHasil.setText(String.valueOf(hasil));
    }
    public void hitung2() {
        if (!validasi()) {
            return;}

        try {
            angka1 = Integer.parseInt(editAngka1.getText().toString());
        } catch (Exception e) {
            Toast.makeText(this, "Mohon isi angka pada form 1", Toast.LENGTH_SHORT).show();
            return;
        }
        try {
            angka2 = Integer.parseInt(editAngka2.getText().toString());
        } catch (Exception e) {
            Toast.makeText(this, "Mohon isi angka pada form 2", Toast.LENGTH_SHORT).show();
            return;
        }
        Integer hasil = angka1 - angka2;
        tvHasil.setText(String.valueOf(hasil));
    }
    public void hitung3() {
        if (!validasi()) {
            return;}

        try {
            angka1 = Integer.parseInt(editAngka1.getText().toString());
        } catch (Exception e) {
            Toast.makeText(this, "Mohon isi angka pada form 1", Toast.LENGTH_SHORT).show();
            return;
        }
        try {
            angka2 = Integer.parseInt(editAngka2.getText().toString());
        } catch (Exception e) {
            Toast.makeText(this, "Mohon isi angka pada form 2", Toast.LENGTH_SHORT).show();
            return;
        }
        Integer hasil = angka1 + angka2;
        tvHasil.setText(String.valueOf(hasil));
    }


    public boolean validasi(){
        if (editAngka1.getText().toString().isEmpty()) {
            Toast.makeText(this, "Mohon isi form Angka 1", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (editAngka2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Mohon isi form Angka 2", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

}