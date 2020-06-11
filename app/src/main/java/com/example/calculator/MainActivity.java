package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.View.*;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    int mDischarge = 0;
    String mDisplay ="";
    private TextView txtDisplay;
    private Button mBtnSeven, mBtnEight, mBtnNine;
    private Button mBtnFour, mBtnFive, mBtnSix;
    private Button mBtnOne, mBtnTwo, mBtnThree;
    private Button mBtnPoint, mBtnZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    private void initViews() {
        txtDisplay = findViewById(R.id.txtDisplay);
        mBtnSeven = findViewById(R.id.btnSeven);
        mBtnEight = findViewById(R.id.btnEight);
        mBtnNine = findViewById(R.id.btnNine);
        mBtnFour = findViewById(R.id.btnFour);
        mBtnFive = findViewById(R.id.btnFive);
        mBtnSix = findViewById(R.id.btnSix);
        mBtnOne = findViewById(R.id.btnOne);
        mBtnTwo = findViewById(R.id.btnTwo);
        mBtnThree = findViewById(R.id.btnThree);
        mBtnZero = findViewById(R.id.btnZero);
        mBtnPoint = findViewById(R.id.btnPoint);
    // Установим текст на кнопках
        mBtnSeven.setText(R.string.btnTextSeven);
        mBtnEight.setText(R.string.btnTextEight);
        mBtnNine.setText(R.string.btnTextNine);
        mBtnFour.setText(R.string.btnTextFour);
        mBtnFive.setText(R.string.btnTextFive);
        mBtnSix.setText(R.string.btnTextSix);
        mBtnOne.setText(R.string.btnTextOne);
        mBtnTwo.setText(R.string.btnTextTwo);
        mBtnThree.setText(R.string.btnTextThree);
        mBtnZero.setText(R.string.btnTextZero);
        mBtnPoint.setText(R.string.btnTextPoint);
    // присваиваем обработчик кнопкам
        mBtnSeven.setOnClickListener(this);
        mBtnEight.setOnClickListener(this);
        mBtnNine.setOnClickListener(this);
        mBtnFour.setOnClickListener(this);
        mBtnFive.setOnClickListener(this);
        mBtnSix.setOnClickListener(this);
        mBtnOne.setOnClickListener(this);
        mBtnTwo.setOnClickListener(this);
        mBtnThree.setOnClickListener(this);
        mBtnZero.setOnClickListener(this);
        mBtnPoint.setOnClickListener(this);
    }
    // Сохраним данные при повороте
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("Display", mDisplay);
        outState.putInt("Point", mDischarge);
    }
    // Вернем данные после поворота
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mDisplay = savedInstanceState.getString("Display");
        txtDisplay.setText(mDisplay);
        mDischarge = savedInstanceState.getInt("Point");
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        // Проверка длинны не более 11 символов!!!
        if (mDisplay.length()<11) {
            switch (v.getId()) {
                case R.id.btnSeven:
                    txtDisplay.setText(mDisplay + "7");
                    break;
                case R.id.btnEight:
                    txtDisplay.setText(mDisplay + "8");
                    break;
                case R.id.btnNine:
                    txtDisplay.setText(mDisplay + "9");
                    break;
                case R.id.btnFour:
                    txtDisplay.setText(mDisplay + "4");
                    break;
                case R.id.btnFive:
                    txtDisplay.setText(mDisplay + "5");
                    break;
                case R.id.btnSix:
                    txtDisplay.setText(mDisplay + "6");
                    break;
                case R.id.btnOne:
                    txtDisplay.setText(mDisplay + "1");
                    break;
                case R.id.btnTwo:
                    txtDisplay.setText(mDisplay + "2");
                    break;
                case R.id.btnThree:
                    txtDisplay.setText(mDisplay + "3");
                    break;
                case R.id.btnZero:
                    txtDisplay.setText(mDisplay + "0");
                    break;
                case R.id.btnPoint:
                    // Проверка в тексте наличия точки
                    if (mDischarge == 0) {
                        txtDisplay.setText(mDisplay + ".");
                        mDischarge = 1;
                    }
                    break;
            }
            // Хранить данный с дисплея в переменной
            mDisplay = (String) txtDisplay.getText();
        }
    }
}