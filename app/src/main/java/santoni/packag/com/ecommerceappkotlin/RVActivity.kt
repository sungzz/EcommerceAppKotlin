package santoni.packag.com.ecommerceappkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_rv.*

class RVActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rv)

        var myProductsList = ArrayList<EProduct>()
        myProductsList.add(EProduct(0,"iPhone",1000, R.drawable.iphone))
        myProductsList.add(EProduct(1,"Macbook",2000, R.drawable.macbook))
        myProductsList.add(EProduct(2,"iPad",1500, R.drawable.ipad))
        myProductsList.add(EProduct(3,"iPod Nano",500, R.drawable.ipodnano))
        myProductsList.add(EProduct(4,"iPod Shuffle",200, R.drawable.ipodshuffle))
        myProductsList.add(EProduct(5,"iPod Touch",900, R.drawable.ipodtouch))

        var rvAdapter = RVAdapter(this@RVActivity, myProductsList)

        recycleView.layoutManager = LinearLayoutManager(this@RVActivity)
        recycleView.adapter = rvAdapter

    }
}
