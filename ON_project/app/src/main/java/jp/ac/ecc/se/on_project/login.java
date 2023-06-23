package jp.ac.ecc.se.on_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState){
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_login);


         // 画面パーツ情報
         // 文字
         TextView login = findViewById(R.id.Text);
         // USERID
         EditText UserID = findViewById(R.id.UserId);
         // パスワード
         EditText Password = findViewById(R.id.Password);
         // ログイン画面
         Button LoginButton = findViewById(R.id.LoginButton);
         // 新規登録ボタン
         Button SignupButton = findViewById(R.id.SignupButton);



         // 新規登録ボタンが押されたらSignup画面に遷移
        SignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), Signup.class);
                startActivity(intent);
            }
        });


        // ログインボタンが押されたらマイルーム画面に遷移
        /*
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Myroom.class);
                startActivity(intent);
            }
        });

         */




            // SQL文





    }
}