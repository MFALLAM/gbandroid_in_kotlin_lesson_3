package com.example.weatherapp.view.cities

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.R
import com.example.weatherapp.model.Weather;

class CitiesFragmentAdapter(
    private var onItemViewClickListener: CitiesListFragment.OnItemViewClickListener?
) :

    RecyclerView.Adapter<CitiesFragmentAdapter.CitiesViewHolder>() {

    private var weatherData: List<Weather> = listOf()

    @SuppressLint("NotifyDataSetChanged")
    fun setWeather(data: List<Weather>) {
        weatherData = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) : CitiesViewHolder {
        return CitiesViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_cities_list_recycler_item, parent, false)
                as View) }

    override fun onBindViewHolder(holder: CitiesViewHolder, position: Int) {
        holder.bind(weatherData[position])
    }

    override fun getItemCount(): Int { return weatherData.size }

    fun removeListener() {
        onItemViewClickListener = null
    }

    inner class CitiesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(weather: Weather) {
            itemView.findViewById<TextView>(R.id.mainFragmentRecyclerItemTextView).text =
                weather.city.name
            itemView.setOnClickListener {
                onItemViewClickListener?.onItemViewClick(weather)
            }
        }
    }
}