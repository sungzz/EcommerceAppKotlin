package santoni.packag.com.ecommerceappkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_downloading_image.*

class DownloadingImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_downloading_image)

        btnDownloadImage.setOnClickListener {

            val imageURL = "http://192.168.5.102/Android/macbook.png"

            Picasso.get().load(imageURL).into(imgDownloadedImage);
        }
    }
}
