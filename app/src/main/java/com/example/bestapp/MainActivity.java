package com.example.bestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button bOne;
    private Button bTwo;
    private Button bThree;
    private Button bFour;
    private Button bFive;
    private Button bSix;
    private Button bSeven;
    private Button bEight;
    private Button bNine;
    private Button bZero;
    private Button bPlus;
    private Button bMinus;
    private Button bDivide;
    private Button bEquals;
    private Button bMultiply;
    private Button bDelete;
    private Button bClear;

    private TextView tvNumberOne;
    private TextView tvOperator;
    private TextView tvNumberTwo;
    private TextView tvEquals;
    private TextView tvResult;

    //Meine erste App - Das ist die Java-Datei zur Hauptoberfläche
    //Mein zweiter Kommentar
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bOne = this.findViewById(R.id.bOne);
        this.bTwo = this.findViewById(R.id.bTwo);
        this.bThree = this.findViewById(R.id.bThree);
        this.bFour = this.findViewById(R.id.bFour);
        this.bFive = this.findViewById(R.id.bFive);
        this.bSix = this.findViewById(R.id.bSix);
        this.bSeven = this.findViewById(R.id.bSeven);
        this.bEight = this.findViewById(R.id.bEight);
        this.bNine = this.findViewById(R.id.bNine);
        this.bZero = this.findViewById(R.id.bZero);
        this.bPlus = this.findViewById(R.id.bPlus);
        this.bDivide = this.findViewById(R.id.bDivide);
        this.bEquals = this.findViewById(R.id.bEquals);
        this.bMultiply = this.findViewById(R.id.bMultiply);
        this.bMinus = this.findViewById(R.id.bMinus);
        this.bDelete = this.findViewById(R.id.bDelete);
        this.bClear = this.findViewById(R.id.bClear);

        this.tvNumberOne = this.findViewById(R.id.tvNumberOne);
        this.tvOperator = this.findViewById(R.id.tvOperator);
        this.tvNumberTwo = this.findViewById(R.id.tvNumberTwo);
        this.tvEquals = this.findViewById(R.id.tvEquals);
        this.tvResult = this.findViewById(R.id.tvResult);

        this.bOne.setOnClickListener(this);
        this.bTwo.setOnClickListener(this);
        this.bThree.setOnClickListener(this);
        this.bFour.setOnClickListener(this);
        this.bFive.setOnClickListener(this);
        this.bSix.setOnClickListener(this);
        this.bSeven.setOnClickListener(this);
        this.bEight.setOnClickListener(this);
        this.bNine.setOnClickListener(this);
        this.bZero.setOnClickListener(this);
        this.bPlus.setOnClickListener(this);
        this.bDivide.setOnClickListener(this);
        this.bEquals.setOnClickListener(this);
        this.bMultiply.setOnClickListener(this);
        this.bMinus.setOnClickListener(this);
        this.bDelete.setOnClickListener(this);
        this.bClear.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        
    }
}

