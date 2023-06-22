package jp.ac.ecc.se.on_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    private List<User>mListUsers;

    public UserAdapter(List<User> mListUsers) {

        this.mListUsers = mListUsers;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user=mListUsers.get(position);
        if(user==null){
            return;
        }
        holder.imgUser.setImageResource(user.getImage());
        holder.tvName.setText(user.getName());
        holder.tvAddress.setText(user.getAddress());


    }

    @Override
    public int getItemCount() {
        if (mListUsers !=null){
            return mListUsers.size();
        }
        return 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        private CircleImageView imgUser;
        private TextView tvName;
        private TextView tvAddress;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            imgUser= itemView.findViewById(R.id.img_user);
            tvName= itemView.findViewById(R.id.tv_name);
            tvAddress= itemView.findViewById(R.id.tv_address);
        }
    }
}
