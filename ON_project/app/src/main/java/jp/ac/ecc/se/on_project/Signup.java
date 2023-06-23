package jp.ac.ecc.se.on_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // 画面パーツ情報登録
        // 文字
        TextView login = findViewById(R.id.Text);
        // USERID
        EditText UserID = findViewById(R.id.UserId);
        // パスワード
        EditText Password = findViewById(R.id.Password);
        // アカウント作成ボタン
        Button CreationButton = findViewById(R.id.CreationButton);


        // 登録ユーザーID　８文字以上　かぶってたらトーストでだす





        // パスワード　８文字以上１４文字の半角英数字　





        // データベース接続？







        // アカウント作成したらログイン画面に戻る　遷移
        CreationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });




    }
}