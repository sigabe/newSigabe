package com.sigabe.sigabe;

import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.uncopt.android.widget.text.justify.JustifiedEditText;
import com.uncopt.android.widget.text.justify.JustifiedTextView;

import java.io.IOException;

public class QuickLearnGempa extends AppCompatActivity {

    private PopupWindow mPopupWindow;
    ImageView btnBack;
    Button btn_play, btn_pause, btn_stop;
    MediaPlayer mPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_learngempa);

        ImageView btShowAudio1 = (ImageView) findViewById(R.id.btn_audio);
        ImageView btShowMateri1 = (ImageView) findViewById(R.id.popUp);
        ImageView btShowAudio2 = (ImageView) findViewById(R.id.btn_audio1);
        ImageView btShowMateri2 = (ImageView) findViewById(R.id.popUp1);
        ImageView btShowAudio3 = (ImageView) findViewById(R.id.btn_audio2);
        ImageView btShowMateri3 = (ImageView) findViewById(R.id.popUp2);
        ImageView btShowAudio4 = (ImageView) findViewById(R.id.btn_audio3);
        ImageView btShowMateri4 = (ImageView) findViewById(R.id.popUp3);
        ImageView btShowAudio5 = (ImageView) findViewById(R.id.btn_audio4);
        ImageView btShowMateri5 = (ImageView) findViewById(R.id.popUp4);

        btn_play = (Button)findViewById(R.id.btnPlay);
        btn_pause = (Button)findViewById(R.id.btnPause);
        btn_stop = (Button)findViewById(R.id.btnStop);
        //stateAwal();

        btnBack = (ImageView) findViewById(R.id.btnBack);

        btShowAudio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Dialog dialog = new Dialog(QuickLearnGempa.this);
                dialog.setContentView(R.layout.activity_quick_learn_audiogempa);
                TextView text = (TextView) dialog.findViewById(R.id.tv);
                ImageButton dialogButton = (ImageButton) dialog.findViewById(R.id.ib_close);
                btn_play.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        play();
                    }
                });
                btn_pause.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        pause();
                    }
                });
                btn_stop.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        stop();
                    }
                });
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        btShowMateri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(QuickLearnGempa.this);
                dialog.setContentView(R.layout.activity_pop_upgempa);
                JustifiedTextView text = (JustifiedTextView) dialog.findViewById(R.id.tv);
                JustifiedTextView text1 = (JustifiedTextView) dialog.findViewById(R.id.tv1);
                JustifiedTextView text2 = (JustifiedTextView) dialog.findViewById(R.id.tv2);
                JustifiedTextView text3 = (JustifiedTextView) dialog.findViewById(R.id.tv3);

                ImageButton dialogButton = (ImageButton) dialog.findViewById(R.id.ib_close);
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });

        btShowAudio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(QuickLearnGempa.this);
                dialog.setContentView(R.layout.activity_quick_learn_audiogempa);
                dialog.setTitle("TWOH.Co");
                TextView text = (TextView) dialog.findViewById(R.id.tv);

                ImageButton dialogButton = (ImageButton) dialog.findViewById(R.id.ib_close);
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        btShowMateri2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(QuickLearnGempa.this);
                dialog.setContentView(R.layout.activity_pop_upgempa);
                dialog.setTitle("TWOH.Co");
                TextView text = (TextView) dialog.findViewById(R.id.tv);
                text.setText("TWOH's Engineering custom dialog sample");

                ImageButton dialogButton = (ImageButton) dialog.findViewById(R.id.ib_close);
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });

        btShowAudio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(QuickLearnGempa.this);
                dialog.setContentView(R.layout.activity_quick_learn_audiogempa);
                dialog.setTitle("TWOH.Co");
                TextView text = (TextView) dialog.findViewById(R.id.tv);

                ImageButton dialogButton = (ImageButton) dialog.findViewById(R.id.ib_close);
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        btShowMateri3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(QuickLearnGempa.this);
                dialog.setContentView(R.layout.activity_pop_upgempa);
                TextView text = (TextView) dialog.findViewById(R.id.tv);
                text.setText("TWOH's Engineering custom dialog sample");

                ImageButton dialogButton = (ImageButton) dialog.findViewById(R.id.ib_close);
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
        btShowAudio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(QuickLearnGempa.this);
                dialog.setContentView(R.layout.activity_quick_learn_audiogempa);
                dialog.setTitle("TWOH.Co");
                TextView text = (TextView) dialog.findViewById(R.id.tv);

                ImageButton dialogButton = (ImageButton) dialog.findViewById(R.id.ib_close);
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        btShowMateri4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(QuickLearnGempa.this);
                dialog.setContentView(R.layout.activity_pop_upgempa);
                dialog.setTitle("TWOH.Co");
                TextView text = (TextView) dialog.findViewById(R.id.tv);
                text.setText("TWOH's Engineering custom dialog sample");

                ImageButton dialogButton = (ImageButton) dialog.findViewById(R.id.ib_close);
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });

        btShowAudio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(QuickLearnGempa.this);
                dialog.setContentView(R.layout.activity_quick_learn_audiogempa);
                dialog.setTitle("TWOH.Co");
                TextView text = (TextView) dialog.findViewById(R.id.tv);

                ImageButton dialogButton = (ImageButton) dialog.findViewById(R.id.ib_close);
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        btShowMateri5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(QuickLearnGempa.this);
                dialog.setContentView(R.layout.activity_pop_upgempa);
                dialog.setTitle("TWOH.Co");
                TextView text = (TextView) dialog.findViewById(R.id.tv);
                text.setText("TWOH's Engineering custom dialog sample");

                ImageButton dialogButton = (ImageButton) dialog.findViewById(R.id.ib_close);
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
    }
    /*public void stateAwal(){
        btn_play.setEnabled(true);
        btn_pause.setEnabled(false);
        btn_stop.setEnabled(false);
    }*/
    private void play(){
        mPlayer = MediaPlayer.create(this, R.raw.rumah);
        try {
            mPlayer.prepare();
        }catch (IllegalStateException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        mPlayer.start();
    }
    public void pause(){
        if (mPlayer.isPlaying())
            if (mPlayer!=null){
                mPlayer.pause();
            }else{
                if (mPlayer!=null){
                    mPlayer.start();
                }
            }
    }
    public void stop(){
        mPlayer.stop();
        try {
            mPlayer.prepare();
            mPlayer.seekTo(0);
        }catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
