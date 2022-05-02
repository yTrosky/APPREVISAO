package com.example.apprevisao

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{valMaiorMenor(it)}
    }


    private fun valMaiorMenor(view: View) {

        val editText = findViewById<EditText>(R.id.val_num)
        val editText2 = findViewById<EditText>(R.id.val_numII)


        if (editText.text.isNotEmpty() && editText2.text.isNotEmpty()) {
            if (Integer.parseInt(editText.text.toString()) == Integer.parseInt(editText2.text.toString())) {
                Toast.makeText(this, "Os valores são iguais", Toast.LENGTH_SHORT).show()
            } else
                if (Integer.parseInt(editText.text.toString()) > Integer.parseInt(editText2.text.toString())) {
                    Toast.makeText(this, "O primeiro é MAIOR que o segundo", Toast.LENGTH_SHORT)
                        .show()
                } else {
                    Toast.makeText(this, "O primeiro é MENOR que o segundo", Toast.LENGTH_SHORT)
                        .show()
                }
        }

    }
}
