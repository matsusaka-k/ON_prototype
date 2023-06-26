package jp.ac.ecc.se.on_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class ProductRecycleAdapter extends RecyclerView.Adapter<ProductRecycleAdapter.ViewHolder> {
    public ArrayList<RowData> localDataSet;

    public ProductRecycleAdapter(@NotNull ArrayList<RowData> dataset) {
        Intrinsics.checkNotNullParameter(dataset, "dataset");
        this.localDataSet = dataset;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView itemnametxt;
        private TextView pointtxt;

        public ViewHolder(View view){
            super(view);
            itemnametxt = view.findViewById(R.id.txtItemName);
            pointtxt = view.findViewById(R.id.point);
        }

        public TextView getItemNameTxt(){
            return itemnametxt;
        }
        public TextView getPointTxt(){
            return pointtxt;
        }
    }

    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_rw, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }
    public void onBindViewHolder(ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if(holder != null){
            holder.getItemNameTxt().setText(localDataSet.get(position).itemName);
            holder.getPointTxt().setText(localDataSet.get(position).point);
        }
    }

    public int getItemCount() {
        return this.localDataSet.size();
    }

}
