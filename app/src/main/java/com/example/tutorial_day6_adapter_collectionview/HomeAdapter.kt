package com.example.tutorial_day6_adapter_collectionview

import android.content.Context
import android.os.Build
import android.util.DisplayMetrics
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class HomeAdapter(private val dataList: Array<Int>): RecyclerView.Adapter<HomeAdapter.ViewHolderClass>(){

    class ViewHolderClass(itemView: View): RecyclerView.ViewHolder(itemView) {
        val rvImage: ImageView = itemView.findViewById(R.id.anhGirlXinh)

    }

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.layout_item, parent, false)
        return  ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        Log.d("AAA", "girl: $position")
        val currentItem = dataList[position]
        holder.rvImage.setImageResource(currentItem)


        val context = holder.itemView.context
        val windowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager

        // Get the current window metrics, compatible across API levels.
        val currentWindowMetrics = windowManager.currentWindowMetrics

        val screenHeight = currentWindowMetrics.bounds.width()
        holder.rvImage.layoutParams.height =
            (screenHeight/3).toInt() // Chia độ cao của màn hình thành 3 phần

    }


}