package jp.teckacademy.yuka.komaki.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import jp.teckacademy.yuka.komaki.calcapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button1.setOnClickListener (this)
        binding.button2.setOnClickListener (this)
        binding.button3.setOnClickListener (this)
        binding.button4.setOnClickListener (this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button1 -> showTashizan()
            R.id.button2 -> showHikizan()
            R.id.button3 -> showKakezan()
            R.id.button4 -> showWarizan()
        }

    }
    private fun showTashizan(){
        var value:Float =0F
        var message="足し算計算結果"
        try {
            val str1:Float=binding.editStr1.text.toString().toFloat()
            val str2:Float=binding.editStr2.text.toString().toFloat()
            value=str1+str2
        }catch (e:Exception){
            message="計算できません"
        }finally{
        }

        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("VALUE",value)
        intent.putExtra("MESSAGE",message)
        startActivity(intent)
    }
    private fun showHikizan(){
        var value:Float =0F
        var message="引き算計算結果"
        try {
            val str1:Float=binding.editStr1.text.toString().toFloat()
            val str2:Float=binding.editStr2.text.toString().toFloat()
            value=str1-str2
        }catch (e:Exception){
            message="計算できません"
        }finally{
        }
        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("VALUE",value)
        intent.putExtra("MESSAGE",message)
        startActivity(intent)
    }
    private fun showKakezan(){
        var value:Float =0F
        var message="掛け算計算結果"

        try {
            val str1:Float=binding.editStr1.text.toString().toFloat()+0f
            val str2:Float=binding.editStr2.text.toString().toFloat()+0f
            value=str1*str2
        }catch (e:Exception){
            message="計算できません"
        }finally{
        }
        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("VALUE",value)
        intent.putExtra("MESSAGE",message)
        startActivity(intent)
    }
    private fun showWarizan(){

        var value:Float =0F
        var message="割り算計算結果"

        try {
            val str1:Float=binding.editStr1.text.toString().toFloat()+0f
            val str2:Float=binding.editStr2.text.toString().toFloat()+0f
            value =str1/str2
        }catch (e:Exception){
            message="計算できません"

        }finally{

        }
        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("VALUE",value)
        intent.putExtra("MESSAGE",message)
        startActivity(intent)
    }

}