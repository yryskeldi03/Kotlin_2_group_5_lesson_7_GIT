package kg.geektech.kotlin2group5lesson7git

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Это мой первый комит
        lifecycleScope.launch {
            viewModel.addNoteState.collect { list ->
                if (list.isNotBlank()){
                    adapter.setList(list)
                    binding.rv.adapter = adapter
                } else {
                    showToast("List is empty")
                }
            }
        }
    }
}