package render.app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import render.animations.Attention;
import render.animations.Bounce;
import render.animations.Render;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Render render;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAttentionBounce = findViewById(R.id.btn_attention_bounce);
        Button buttonAttentionFlash = findViewById(R.id.btn_attention_flash);
        Button buttonAttentionPulse = findViewById(R.id.btn_attention_pulse);
        Button buttonAttentionRuberband = findViewById(R.id.btn_attention_ruberband);
        Button buttonAttentionShake = findViewById(R.id.btn_attention_shake);
        Button buttonAttentionStandup = findViewById(R.id.btn_attention_stand_up);

        final ImageView imageView = findViewById(R.id.iv_image);

        render = new Render(this);
        render.setDuration(1000);


        buttonAttentionBounce.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.Bounce(imageView));
                render.start();
            }
        });

        buttonAttentionFlash.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.Flash(imageView));
                render.start();
            }
        });

        buttonAttentionPulse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.Pulse(imageView));
                render.start();
            }
        });

        buttonAttentionRuberband.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.RuberBand(imageView));
                render.start();
            }
        });

        buttonAttentionShake.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.Shake(imageView));
                render.start();
            }
        });

        buttonAttentionStandup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.StandUp(imageView));
                render.start();
            }
        });



    }
}
