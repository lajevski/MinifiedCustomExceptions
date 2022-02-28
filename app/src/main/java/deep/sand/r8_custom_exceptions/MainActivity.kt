package deep.sand.r8_custom_exceptions

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import deep.sand.r8_custom_exceptions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener { view ->
            val e = Exception1(
                "",
                Exception()
            )
            Snackbar.make(view, e.toString(), Snackbar.LENGTH_LONG)
                .setAction("Exception1", null).show()
        }

        binding.button2.setOnClickListener { view ->
            val e = Exception2(
                "",
                Exception()
            )
            Snackbar.make(view, e.toString(), Snackbar.LENGTH_LONG)
                .setAction("Exception2", null).show()
        }

        binding.button3.setOnClickListener { view ->
            val e = Exception3(
                "",
                Exception()
            )
            Snackbar.make(view, e.toString(), Snackbar.LENGTH_LONG)
                .setAction("Exception3", null).show()
        }

        binding.button4.setOnClickListener { view ->
            val e = Exception4(
                "",
                Exception()
            )
            Snackbar.make(view, e.toString(), Snackbar.LENGTH_LONG)
                .setAction("Exception4", null).show()
        }
    }
}