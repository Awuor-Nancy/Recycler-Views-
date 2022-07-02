package pic_book.com.recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import pic_book.com.recyclerviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displaynames()
    }
    fun displaynames(){
        var nameList = listOf("Nancy","Kayitete","Joana","Fayzi","Rhahma","Faiz","Mimi","Adrian","Damian","Suzy")
        var nameAdapter = NamesRecyclerViewAdapter(nameList)
        binding.rvNames.layoutManager = LinearLayoutManager(this)
        binding.rvNames.adapter = nameAdapter
    }
}