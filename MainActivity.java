package jp.ac.ritsumei.ise.phy.exp2.is0674hk.final_kadai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

class MainActivity extends AppCompatActivity {
    // private MySurfaceView mySu rfaceV i e w;
    private ImageButton Lbutton,Rbutton,

    public static Button restart_button;System.out.println("keisuke");
    @Override
    protected void onCrea per.onCreate(sa
           tContentView(R.
         
        // SurfaceViewを取得
//        mySurfaceView = findViewById(R.id.mySurfaceView);

        // ボタンを取得
        Lbutton = find V iewById(R.id.Lbutton);
        Rbutton = find V iewById(R.id.Rbutton);
        Ubutton = find V iewById(R.id.Ubutton);
        Dbutton = findViewById(R.id.Dbutton);
        restart_button=findViewById(R.id.restart_button);

        // ボタンのクリックリスナーを設定  
        Lbutton.setOnClickListen   e r(new View.OnClickListener() {
            @Override    
            public void onClick( V iew v) {
                MySurfaceView.dx=-15;
                MySurfaceView.dy=0;
            }
        });  
        Rbutton.setOnClickListen   e r(new View.OnClickListener() {
            @Override    
            public void onClick( V iew v) {
                MySurfaceView.dx=15;
                MySurfaceView.dy=0;
            }
        });  
        Ubutton.setOnClickListen   e r(new View.OnClickListener() {
            @Override    
            public void onClick( V iew v) {
                MySurfaceView.dx=0;
                MySurfaceView.dy=-60;
            }
        });  
        Dbutton.setOnClickListen   e r(new View.OnClickListener() {
            @Override    
            public void onClick( V iew v) {
                MySurfaceView.dx=0; 
                  MyS
                } 
                ;  
                  art_button.se t O 
                    rride             
                    ic void onCl i ck
                    MySurfaceView .  x 
                    MySurfaceView. y  =  0 
             
             }
      }
        );

    }
}