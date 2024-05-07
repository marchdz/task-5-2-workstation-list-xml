package com.marchernandez.task52xml.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marchernandez.task52xml.R
import com.marchernandez.task52xml.WorkstationLocation

class WorkstationLocationAdapter(private val workstationLocationList: List<WorkstationLocation>) :
    RecyclerView.Adapter<WorkstationLocationViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): WorkstationLocationViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return WorkstationLocationViewHolder(
            layoutInflater.inflate(R.layout.item_workstation, parent, false)
        )
    }

    override fun onBindViewHolder(holder: WorkstationLocationViewHolder, position: Int) {
        holder.render(workstationLocationList[position])
    }

    override fun getItemCount(): Int = workstationLocationList.size
}