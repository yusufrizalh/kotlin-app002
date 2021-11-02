package id.yusufrizalh.app002

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSaveButtonClicked(view: View){
        var genreBook = 0.0
        var yearsBook = 0.0

        when {
            radio1.isChecked -> genreBook = 10.0
            radio2.isChecked -> genreBook = 8.0
            radio3.isChecked -> genreBook = 12.0
        }

        if (chk1.isChecked) { yearsBook += 30.0 }
        if (chk2.isChecked) { yearsBook += 20.0 }
        if (chk3.isChecked) { yearsBook += 10.0 }

        txtTotal.text = "TOTAL: " + (genreBook + yearsBook)
    }
}