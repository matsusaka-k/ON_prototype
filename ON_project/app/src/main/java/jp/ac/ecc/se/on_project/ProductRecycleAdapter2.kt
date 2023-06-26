package jp.ac.ecc.se.on_project

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ProductRecycleAdapter2(private val dataset: MutableList<RowData>) : RecyclerView.Adapter<ProductRecycleAdapter2.ViewHolder>(){

    class ViewHolder(item : View) : RecyclerView.ViewHolder(item){
        val itemnametxt : TextView
        val pointtxt : TextView

        init {
            itemnametxt = item.findViewById(R.id.txtItemName);
            pointtxt = item.findViewById(R.id.point);
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //1行分のデータのイメージ(今回だとrecycle_roe.xml)を読み込み、ViewHolderに設定。
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_rw, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //取得したデータ画面に表示している項目に設定する
        holder.itemnametxt.text = dataset[position].itemName
        holder.pointtxt.text = dataset[position].point
    }

    override fun getItemCount(): Int {
        //データ件数を返す
        return dataset.size
    }

}

