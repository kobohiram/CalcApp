package jp.teckacademy.yuka.komaki.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.teckacademy.yuka.komaki.calcapp.databinding.ActivityMainBinding
import jp.teckacademy.yuka.komaki.calcapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val value = intent.getFloatExtra("VALUE",0F)
        val message=intent.getStringExtra("MESSAGE")

        binding.textView.text = "${value}"
        binding.textView2.text= message.toString()
    }
}