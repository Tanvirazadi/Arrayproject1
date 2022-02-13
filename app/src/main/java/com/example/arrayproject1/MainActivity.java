package com.example.arrayproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    TextView nam,age,avrg,sen,jun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nam=findViewById(R.id.names);
        age=findViewById(R.id.ages);
        avrg=findViewById(R.id.average);
        sen=findViewById(R.id.senior);
        jun=findViewById(R.id.junior);

        String[] candidates={"Talha","Taher","Fayz","Banna","Ajman","Shuvo","Tanvir"};
        int[]ages= {35,29,47,58,29,30,31};

        for (int i=0; i<candidates.length; i++) {
            String nametext = nam.getText().toString();
            nam.setText(nametext +candidates[i] + "\n");

        }
        Arrays.sort(ages);
        for (int i : ages) {
            String agetext = age.getText().toString();
            age.setText(agetext + i + "\n");
        }
        avrg.setText(setaverage(ages)+"");
        sen.setText(getsenior(ages)+"");
        jun.setText(getjunior(ages)+"");


    }
    public  int setaverage(int... numbers){
        int totalvalue=0;
        for (int value:numbers){
            totalvalue+=value;
        }
        return totalvalue /numbers.length;


    }

    public int getjunior(int[]juniorarray){
        int totalvalue=juniorarray[0];
        for (int value:juniorarray){
            if (value<totalvalue){
                totalvalue=value;

            }
        }
        return totalvalue;
    }
    public  int getsenior(int[]seniorarray){
        int totalvalue=seniorarray[0];
        for (int value:seniorarray){
            if (totalvalue<value){
                totalvalue=value;
            }
        }
        return  totalvalue;
    }

}