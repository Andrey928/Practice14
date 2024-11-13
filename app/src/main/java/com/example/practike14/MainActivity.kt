package com.example.practike14

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val arguments: Bundle? = intent.extras

        if (arguments != null){
            val mail1 = arguments.get("mail").toString()
            val name1 = arguments.get("name").toString()
            val age1 = arguments.get("age").toString()
            val name = findViewById<EditText>(R.id.editTextName1)
            val age = findViewById<EditText>(R.id.editTextAge1)
            val mail = findViewById<EditText>(R.id.editTextMail1)
            mail.text=mail1.toEditable()
            name.text=name1.toEditable()
            age.text=age1.toEditable()




        }


    }

    fun buttonSendClick(view: View) {

        val mailText: EditText = findViewById(R.id.editTextMail1)
        val NameText: EditText = findViewById(R.id.editTextName1)
        val AgeText: EditText = findViewById(R.id.editTextAge1)
        val mail = mailText.text.toString()
        val name = NameText.text.toString()
        val age = AgeText.text.toString()
        val intent: Intent =
            Intent(this@MainActivity, MainActivity2::class.java)
        intent.putExtra("mail", mail)
        intent.putExtra("name", name)
        intent.putExtra("age", age)
        startActivity(intent)
    }
}