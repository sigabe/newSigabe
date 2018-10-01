package com.sigabe.sigabe;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

public class QuickLearnGempa extends AppCompatActivity {

    private PopupWindow mPopupWindow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_learn);

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

        btShowAudio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(QuickLearnGempa.this);
                dialog.setContentView(R.layout.activity_quick_learn_audio);
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

        btShowMateri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(QuickLearnGempa.this);
                dialog.setContentView(R.layout.activity_pop_up);
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

        btShowAudio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(QuickLearnGempa.this);
                dialog.setContentView(R.layout.activity_quick_learn_audio);
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
                dialog.setContentView(R.layout.activity_pop_up);
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
                dialog.setContentView(R.layout.activity_quick_learn_audio);
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
                dialog.setContentView(R.layout.activity_pop_up);
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
        btShowAudio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(QuickLearnGempa.this);
                dialog.setContentView(R.layout.activity_quick_learn_audio);
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
                dialog.setContentView(R.layout.activity_pop_up);
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
                dialog.setContentView(R.layout.activity_quick_learn_audio);
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
                dialog.setContentView(R.layout.activity_pop_up);
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
}
