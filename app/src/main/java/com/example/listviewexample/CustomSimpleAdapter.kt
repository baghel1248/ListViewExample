package com.example.listviewexample

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.SimpleAdapter

class CustomSimpleAdapter(context: Context?,
                          data: MutableList<out MutableMap<String, *>>?, resource: Int,
                          from: Array<out String>?, to: IntArray?
) : SimpleAdapter(context, data, resource, from, to) {
    override fun getCount(): Int {
        return super.getCount()
    }

    override fun getItem(position: Int): Any {
        return super.getItem(position)
    }

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return super.getView(position, convertView, parent)
    }

}