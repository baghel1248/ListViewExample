package com.example.listviewexample

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AbsListView
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.core.view.get

class MainActivity : AppCompatActivity() {
    private lateinit var listView1: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView1=findViewById(R.id.listview)
        var movieimage= intArrayOf(R.drawable.bb2,R.drawable.kgf2,R.drawable.marvel,R.drawable.salute,R.drawable.worldcup83)
        var moviename= arrayOf("bb2","kgf2","marvel","salute","worldcup83")
        var arraylist=ArrayList<HashMap<String,String>>()
        for (i in 0..movieimage.lastIndex)
        {
            var hm =HashMap<String,String >()
            hm.put("movieimage",movieimage[i].toString())
            hm.put("moviename",moviename[i])
            arraylist.add(hm)
        }
        var from= arrayOf("movieimage","moviename")
        var to= intArrayOf(R.id.imageview1,R.id.textview)
        var customSimpleAdapter=CustomSimpleAdapter(applicationContext,arraylist,R.layout.list_item,from, to)
        listView1.adapter=customSimpleAdapter
        listView1.setOnItemClickListener(object:AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(applicationContext,moviename[p2],Toast.LENGTH_SHORT).show()

            }

        })
    }
}