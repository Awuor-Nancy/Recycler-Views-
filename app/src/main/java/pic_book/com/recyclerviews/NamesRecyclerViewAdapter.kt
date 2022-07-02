package pic_book.com.recyclerviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class NamesRecyclerViewAdapter(var nameList: List<String>):  //fetches info from main activity
RecyclerView.Adapter<NamesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        var  itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.name_list_item, parent,false)
        return NamesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) { //binds the data to the view
        holder.tvName.text = nameList.get(position)
    }

    override fun getItemCount(): Int {
        return nameList.size
    }
}

class NamesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
}