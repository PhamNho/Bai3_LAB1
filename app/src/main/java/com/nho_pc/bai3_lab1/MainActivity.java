package com.nho_pc.bai3_lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.nho_pc.bai3_lab1.Service.LabIntentService;

public class MainActivity extends AppCompatActivity {
    private EditText edtNhapChuoi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Bài 3 LAB 1");
        edtNhapChuoi=findViewById(R.id.edtNhapChuoi);
    }

    public void TimA(View view) {
        String chuoi = edtNhapChuoi.getText().toString();
//        // khởi tạo đối tượng Intent
//        Intent intent = new Intent(MainActivity.this, LabIntentService.class);
//        // khởi tạo đối tượng Bundle
//        Bundle bundle = new Bundle();
//        bundle.putString("Chuoi",chuoi);
//        intent.putExtra("Text", bundle);
//        startService(intent);
        if (chuoi.length() == 0) {
            Toast.makeText(MainActivity.this, "Chưa nhập chuỗi", Toast.LENGTH_SHORT).show();
        } else {
            int dem = 0;
            for (int i = 0; i < chuoi.length(); i++) {
                if (chuoi.charAt(i) == 'A'||chuoi.charAt(i) == 'a') {
                    dem++;
                }
            }
            Toast.makeText(MainActivity.this, "Số lần ký Tự A xuất hiện trong chuỗi là :\t" + dem, Toast.LENGTH_SHORT).show();
        }
    }

    public void TimB(View view) {
        String chuoi = edtNhapChuoi.getText().toString();
        if (chuoi.length() == 0) {
            Toast.makeText(MainActivity.this, "Chưa nhập chuỗi", Toast.LENGTH_SHORT).show();
        } else {
            int dem = 0;
            for (int i = 0; i < chuoi.length(); i++) {
                if (chuoi.charAt(i) == 'B'||chuoi.charAt(i) == 'b') {
                    dem++;
                }
            }
            Toast.makeText(MainActivity.this, "Số lần ký Tự B xuất hiện trong chuỗi là :\t" + dem, Toast.LENGTH_SHORT).show();
        }
    }

    public void TimC(View view) {
        String chuoi = edtNhapChuoi.getText().toString();
        if (chuoi.length() == 0) {
            Toast.makeText(MainActivity.this, "Chưa nhập chuỗi", Toast.LENGTH_SHORT).show();
        } else {
            int dem = 0;
            for (int i = 0; i < chuoi.length(); i++) {
                if (chuoi.charAt(i) == 'C'||chuoi.charAt(i) == 'c') {
                    dem++;
                }
            }
            Toast.makeText(MainActivity.this, "Số lần ký Tự C xuất hiện trong chuỗi là :\t" + dem, Toast.LENGTH_SHORT).show();
        }
    }

    public void TimD(View view) {
        String chuoi = edtNhapChuoi.getText().toString();
        if (chuoi.length() == 0) {
            Toast.makeText(MainActivity.this, "Chưa nhập chuỗi", Toast.LENGTH_SHORT).show();
        } else {
            int dem = 0;
            for (int i = 0; i < chuoi.length(); i++) {
                if (chuoi.charAt(i) == 'D'||chuoi.charAt(i) == 'd') {
                    dem++;
                }
            }
            Toast.makeText(MainActivity.this, "Số lần ký Tự D xuất hiện trong chuỗi là :\t" + dem, Toast.LENGTH_SHORT).show();
        }
    }
}
