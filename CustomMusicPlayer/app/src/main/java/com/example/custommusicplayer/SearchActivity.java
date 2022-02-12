package com.example.custommusicplayer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class SearchActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;
        bindViews();
    }

    private void bindViews() {
        bottomNavigationView = findViewById(R.id.bottom_navigtaion);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent;
                switch (item.getItemId()){
                    case R.id.action_search:
                        intent = new Intent(mContext, SearchActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.current_playlist:
                        intent = new Intent(mContext, CurrentPlaylistActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.user_playlist:
                        intent = new Intent(mContext, MyPlayListActivity.class);
                        startActivity(intent);
                        break;
                }
                return false;
            }
        });
    }


}