package jp.ac.ecc.se.on_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class shop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);


        //変数の初期化
        RecyclerView normal_rec = findViewById(R.id.recyclerView);
        // RecyclerViewに設定するリストを作成
        ArrayList<RowData> planetArrayList = new ArrayList<RowData>();

        planetArrayList.add(new RowData("フローリングタイル","100PT"));
        planetArrayList.add(new RowData("丸カーペット","50PT"));
        planetArrayList.add(new RowData("テレビ","50PT"));
        planetArrayList.add(new RowData("カラーボックス1","20PT"));
        planetArrayList.add(new RowData("カラーボックス2","20PT"));
        planetArrayList.add(new RowData("ファンシー枕","40PT"));

        normal_rec.setLayoutManager(new LinearLayoutManager(this));
        // 作成したlistをアダプターに渡し、RecyclerViewにアダプターを設定する
        ProductRecycleAdapter adapter = new ProductRecycleAdapter(planetArrayList);
        normal_rec.setAdapter(adapter);

//        List planetArrayList = new ArrayList<>();
//        normal_rec.addItemDecoration(new DividerItemDecoration(this,
//                    LinearLayoutManager.VERTICAL));
//
//            createListData();
//        }

//        private void createListData() {
//
//            //this method is for adding data to recyclerview
//            //let make adepter and planet model class
//
//        }

    }
}
