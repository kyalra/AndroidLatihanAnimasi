package com.android.androidlatihantambahan

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.android.androidlatihantambahan.activitiesAnimation.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycleview=findViewById<RecyclerView>(R.id.recycle_view)
        recycleview.layoutManager=LinearLayoutManager(this)

        val item=ArrayList<RocketAnimationonItem>()

        item.add(RocketAnimationonItem("Lepas Landas Gan",
            Intent(this,LauchRocketValue::class.java)))
        item.add(RocketAnimationonItem("Pushing  Gan",
            Intent(this,RocketMuter::class.java)))
        item.add(RocketAnimationonItem("ngebut  Gan",
            Intent(this,RocketKecepetan::class.java)))
        item.add(RocketAnimationonItem("rocket obj",
            Intent(this,LaunchRocketObject::class.java)))
        item.add(RocketAnimationonItem("Mainin Background",
            Intent(this,MaininBackground::class.java)))
        item.add(RocketAnimationonItem("Muter Sambil ngegas",
            Intent(this,MuterSambilNgegas::class.java)))
        item.add(RocketAnimationonItem("Muter Sambil ngegasV2",
            Intent(this,MuterSambilNgegasV2::class.java)))
        item.add(RocketAnimationonItem("Terbang Bareng",
            Intent(this,TerbangBareng::class.java)))
        item.add(RocketAnimationonItem("Dengan Kata kata",
            Intent(this,WithListener::class.java)))
        item.add(RocketAnimationonItem("Ada yg lupa euy",
            Intent(this,MajuMundur2Syantik::class.java)))
        item.add(RocketAnimationonItem("XML",
            Intent(this,PakeXML::class.java)))



        recycleview.adapter=RocketAdapter(this,item)
    }
}
