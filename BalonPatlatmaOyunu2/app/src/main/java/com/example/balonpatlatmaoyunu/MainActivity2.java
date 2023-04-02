package com.example.balonpatlatmaoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    ImageView []balloons;
    TextView score_textview;
    TextView time_textview;

    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        score_textview=findViewById(R.id.score_textview);
        time_textview=findViewById(R.id.time_textview);


       balloons=new ImageView[]{
               findViewById(R.id.Pink1),    findViewById(R.id.Pink2),    findViewById(R.id.Pink3),
               findViewById(R.id.Blue1),    findViewById(R.id.Blue2),    findViewById(R.id.Blue3),
               findViewById(R.id.Yellow1),  findViewById(R.id.Yellow2),  findViewById(R.id.Yellow3),
               findViewById(R.id.Green1),   findViewById(R.id.Green2),   findViewById(R.id.Green3),
               findViewById(R.id.Red1),     findViewById(R.id.Red2),     findViewById(R.id.Red3),
               findViewById(R.id.Orange1),  findViewById(R.id.Orange2),  findViewById(R.id.Orange3),
               findViewById(R.id.Green2_1), findViewById(R.id.Green2_2), findViewById(R.id.Green2_3),
               findViewById(R.id.Purple1),  findViewById(R.id.Purple2),  findViewById(R.id.Purple3),
               findViewById(R.id.Pink2_1),  findViewById(R.id.Pink2_2),  findViewById(R.id.Pink2_3)
       };



        //zamanı ayarı
        new CountDownTimer(KalanSure,1000) {//10sn boyunca 1sn geri sayıcak
            @Override
            public void onTick(long millisUntilFinished) {
                KalanSure = millisUntilFinished;
                updateCountdownText();//aşağıdan fonk çağırdık

                hideImage();


                Random rand=new Random();
                int visible=rand.nextInt(27);
                balloons[visible].setVisibility(View.VISIBLE);

            }

            @Override
            public void onFinish() {
                //süre bittiğinde yapılacak hamleler
                if(score >= 10) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    startActivity(intent);
                }
                else{
                    Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                    startActivity(intent);
                }

                hideImage();


            }
        }.start();

    }
    long KalanSure = 20000;  //süreyi tam sayı olarak geri saym yapıp ekrana bastırdık
    private void updateCountdownText() {
        int seconds = (int) (KalanSure / 1000);
        String timeLeftFormatted = "TİME:" + seconds;
        time_textview.setText(timeLeftFormatted);
    } // ÇALIŞIYOR AMA DÜZENLENİCEK



    //resimleri başlangıçta saklayn fonks
    public void hideImage(){

        for (ImageView dolas : balloons){//balloons arrayini dolaş
            dolas.setVisibility(View.INVISIBLE); //görünen image dolas
        }

   }

   public void tık(View view){ //skoru hesaplayıp ekrana bastırır
       score++;
       score_textview.setText("SCORE:"+score);

   }

}