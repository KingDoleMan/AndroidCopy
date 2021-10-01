package com.example.androidcopy

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import com.example.androidcopy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_action_bar, menu)
        //menuItems 뷰객체 포획
        val menuItem = menu.findItem(R.id.menu_search)
        //액션뷰를 서치뷰로 캐스팅 (action 시 서치뷰 display)
        val searchView = menuItem.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextChange(newText: String?): Boolean {
                return true
            }

            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }
        })

        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        Log.d("main", "onSupportNavigateUp Called")
        return super.onSupportNavigateUp()
    }
}
