package com.example.rico.ricyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
/**
 * Created by Rico on 01-Oct-17.
 */

public class ResepAdapter extends RecyclerView.Adapter
        <ResepAdapter.ResepViewHolder>{
        private Context context ;
        private ArrayList<Resep> resep ;
        public ResepAdapter(Context context, ArrayList<Resep> resep){
            this.context = context;
            this.resep = resep;
        }

        @Override
        public ResepAdapter.ResepViewHolder
        onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from (parent.getContext()).inflate(R.layout.list_item_resep,parent,false );
            return new ResepViewHolder(view);
        }

        public class ResepViewHolder extends RecyclerView.ViewHolder {
            ImageView gambarResep;
            TextView namaResep;
            TextView deskripsi;
            public ResepViewHolder(View itemView) {
                super (itemView);
                gambarResep = (ImageView)itemView.findViewById(R.id.img_resep );
                namaResep = (TextView)itemView.findViewById(R.id.nama_resep );
                deskripsi = (TextView) itemView.findViewById(R.id.deskripsi);
            }
        }

        @Override
        public void onBindViewHolder(ResepAdapter.ResepViewHolder holder, final int position) {
            holder.namaResep.setText(resep.get(position).getNamaResep());
            holder.deskripsi.setText(resep.get(position).getDeskripsiResep());
            holder.gambarResep.setImageResource(resep.get(position).getGambarResep());

            holder.namaResep.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent nx = new Intent (context, DetailResep.class);
                    nx.putExtra("gambar",resep.get(position).getGambarDetail());
                    nx.putExtra("detail",resep.get(position).getResepDetail());

                context.startActivity(nx);
                }
            });

            holder.gambarResep.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent nx = new Intent(context, DetailResep.class);
                    nx.putExtra("gambar", resep.get(position).getGambarDetail());
                    nx.putExtra("detail", resep.get(position).getResepDetail());

                    context.startActivity(nx);
                }
            });

            holder.deskripsi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent nx = new Intent(context, DetailResep.class);
                    nx.putExtra("gambar", resep.get(position).getGambarDetail());
                    nx.putExtra("detail", resep.get(position).getResepDetail());

                    context.startActivity(nx);
                }
            });

        }
        @Override
        public int getItemCount() {return resep.size();
        }
    }

