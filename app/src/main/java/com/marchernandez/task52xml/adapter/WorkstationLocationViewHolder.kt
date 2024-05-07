package com.marchernandez.task52xml.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.marchernandez.task52xml.WorkstationLocation
import com.marchernandez.task52xml.databinding.ItemWorkstationBinding

class WorkstationLocationViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemWorkstationBinding.bind(view)

    fun render(workstationLocation: WorkstationLocation) {
        binding.apply {
            tvDay.text = workstationLocation.day
            tvFloor.text = workstationLocation.floor.toString()
            tvPlace.text = workstationLocation.place.toString()
            tvCity.text = workstationLocation.office
            tvSection.text = workstationLocation.section
        }
    }
}