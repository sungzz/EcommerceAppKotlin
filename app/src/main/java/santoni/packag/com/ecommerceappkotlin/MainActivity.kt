package santoni.packag.com.ecommerceappkotlin

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var shareP: SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        btnAdd.setOnClickListener {
//
//            shareP = getSharedPreferences("addData", Context.MODE_PRIVATE)
//            var myEditor = shareP?.edit()
//            myEditor?.putString("product_name", edtProduct.text.toString())
//            myEditor?.commit()
//
//            Toast.makeText(this@MainActivity, "The Product is saved", Toast.LENGTH_SHORT).show()
//
//        }
//        btnGetProduct.setOnClickListener {
//
//            txtGetProduct.text = shareP?.getString("product_name", "nothing")
//        }

        btnGetData.setOnClickListener {

            val serverURL = "http://192.168.5.102/Android/test_file.php"
            var requestQ: RequestQueue = Volley.newRequestQueue(this@MainActivity)
            var stringRequest = StringRequest(Request.Method.GET, serverURL,
                    Response.Listener { response ->

                txtHelloWorld.text = response

                    }, Response.ErrorListener { error ->

                txtHelloWorld.text = error.message

            })

            requestQ.add(stringRequest)

        }


    }
}
