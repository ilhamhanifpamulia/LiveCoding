package id.phb.login18090027


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private  lateinit var btnIntent: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.btnlogin)
        btnIntent.setOnClickListener(this)
        btnIntent = findViewById(R.id.btnregister)
        btnIntent.setOnClickListener(this)

    }
    override fun onClick(v: View) {
        when(v.id){
            R.id.btnlogin -> run {
                val intenBiasa = Intent(this@MainActivity, LoginActivity::class.java)
                startActivity(intenBiasa)
            }
            R.id.btnregister -> run {
                val intenBiasa = Intent(this@MainActivity, Register::class.java)
                startActivity(intenBiasa)
            }
        }
    }
}