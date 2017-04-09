package android.newcoder.huy.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String a,b,kq1;
    private int kq;
    private TextView tvhienthi1,tvhienthi2;
    private Button btndel,btnlaycan,btnxoa,btnchia,btnnhan,btntru,btncong,btnphay,btnbang,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvhienthi1 = (TextView)findViewById(R.id.tv_hienthi1);
        tvhienthi2 = (TextView)findViewById(R.id.tv_hienthi2);
        btndel = (Button)findViewById(R.id.btn_del);
        btnlaycan = (Button)findViewById(R.id.btn_laycan);
        btnxoa = (Button)findViewById(R.id.btn_xoa);
        btnchia = (Button)findViewById(R.id.btn_chia);
        btnnhan = (Button)findViewById(R.id.btn_nhan);
        btntru = (Button)findViewById(R.id.btn_tru);
        btncong = (Button)findViewById(R.id.btn_cong);
        btnphay = (Button)findViewById(R.id.btn_phay);
        btnbang = (Button)findViewById(R.id.btn_bang);
        btn0 = (Button)findViewById(R.id.btn_0);
        btn1 = (Button)findViewById(R.id.btn_1);
        btn2 = (Button)findViewById(R.id.btn_2);
        btn3 = (Button)findViewById(R.id.btn_3);
        btn4 = (Button)findViewById(R.id.btn_4);
        btn5 = (Button)findViewById(R.id.btn_5);
        btn6 = (Button)findViewById(R.id.btn_6);
        btn7 = (Button)findViewById(R.id.btn_7);
        btn8 = (Button)findViewById(R.id.btn_8);
        btn9 = (Button)findViewById(R.id.btn_9);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvhienthi1.setText(btn1.getText().toString().trim());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvhienthi1.setText(btn2.getText().toString().trim());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvhienthi1.setText(btn3.getText().toString().trim());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvhienthi1.setText(btn4.getText().toString().trim());
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvhienthi1.setText(btn5.getText().toString().trim());
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvhienthi1.setText(btn6.getText().toString().trim());
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvhienthi1.setText(btn7.getText().toString().trim());
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvhienthi1.setText(btn8.getText().toString().trim());
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvhienthi1.setText(btn9.getText().toString().trim());
            }
        });

        btncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = tvhienthi1.getText().toString().trim();
                tvhienthi2.setText(a + " +");
                tvhienthi1.setText("");
            }
        });
        btnbang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = tvhienthi1.getText().toString().trim();
                tvhienthi2.setText("");
                kq = (Integer.parseInt(a) + Integer.parseInt(b));
                kq1 = String.valueOf(kq);
                tvhienthi1.setText(kq1);
            }
        });


    }


}
