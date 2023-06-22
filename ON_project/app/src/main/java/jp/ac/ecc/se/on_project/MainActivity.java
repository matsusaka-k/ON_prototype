package jp.ac.ecc.se.on_project;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvUsers;
    private UserAdapter userAdapter;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvUsers = findViewById(R.id.rcv_users);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
        rcvUsers.setLayoutManager(linearLayoutManager);

        userAdapter = new UserAdapter(getListUsers());
        rcvUsers.setAdapter(userAdapter);

        RecyclerView.ItemDecoration itemDecoration= new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        rcvUsers.addItemDecoration(itemDecoration);




    }

    private List<User> getListUsers() {
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.img_1,"リン", "東京"));
        list.add(new User(R.drawable.img_2,"山下", "東京"));
        list.add(new User(R.drawable.img_3,"マルコ", "東京"));

        return list;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        SearchManager searchManager= (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        searchView= (SearchView) menu.findItem(R.id.action_search).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setMaxWidth(Integer.MAX_VALUE);
        return true;
    }

}