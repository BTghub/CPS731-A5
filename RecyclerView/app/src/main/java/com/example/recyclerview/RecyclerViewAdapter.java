package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private String[] titles = new String[8];
    private String[] descriptions = new String[8];
    private Context mcontext;
    TextView title;
    TextView descrpition;

    public RecyclerViewAdapter(Context mcontext, String[] TitlesArray, String[] DescriptionsArray ) {
        this.titles = TitlesArray;
        this.descriptions = DescriptionsArray;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.wordlist_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(titles[position]);
        holder.descriptionText.setText(descriptions[position]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title;
        TextView descriptionText;
        LinearLayout parentLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            descriptionText=itemView.findViewById(R.id.description);
            parentLayout=itemView.findViewById(R.id.parent_layout);
        }

        @Override
        public void onClick(View v) {
            int myPosition = getLayoutPosition();
            String element = titles[myPosition];
        }
    }
}
