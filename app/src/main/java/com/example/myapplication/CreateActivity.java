package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityCreateBinding;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class CreateActivity extends AppCompatActivity {


    private ActivityCreateBinding binding;
    List<ArrayList<View>> pole = new ArrayList<>();
    public int[][] shipsOnPole1=new int[10][10];//массив для хранения данных
    private TableLayout tableLayout;
    //private View[][] pole=new View[10][10];//массив view с кнопками


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);



       tableLayout=findViewById(R.id.linear);//таблица

        TableRow[] rows={findViewById(R.id.one),//массив строк таблицы
                findViewById(R.id.two),
                findViewById(R.id.three),
                findViewById(R.id.four),
                findViewById(R.id.five),
                findViewById(R.id.six),
                findViewById(R.id.seven),
                findViewById(R.id.eight),
                findViewById(R.id.nine),
                findViewById(R.id.ten)};

        for (int i = 0; i < 10; i++) {
            ArrayList <View> pole1=new ArrayList<>();
            for (int j = 0; j < 10; j++) {

                View view= getLayoutInflater().inflate(R.layout.custom_layout,null);
                pole1.add(view);//добавление кнопки в массив кнопок

                TableRow row=rows[i];//нахождение нужной строки
                row.addView(view);//добавление кнопки на экран в нужную строку

            }
            pole.add(pole1);

        }

    }
    private void setShip(Ship ship,int i,int j){//функция добавления корабля на поле
        if(ship.getOrientation().equals("vertical")){
            for (int k = i; k <i- ship.getLenght(); k--) {
                shipsOnPole1[k][j]=1;

            }
        }
        if(ship.getOrientation().equals("horizontal")){
            for (int k = j; k <j-ship.getLenght() ; k--) {
                shipsOnPole1[i][k]=1;
            }
        }
    }

}