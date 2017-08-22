package markticzon.me.cvandrv;

import android.media.Image;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mark Ticzon on 8/19/2017.
 */

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {


    List<Animal> animals;

    public AnimalAdapter(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public AnimalAdapter.AnimalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
        AnimalViewHolder avh = new AnimalViewHolder(v);


        return avh;
    }

    @Override
    public void onBindViewHolder(AnimalAdapter.AnimalViewHolder holder, int position) {
        holder.tvName.setText(
        animals.get(position).getName().toString());
        holder.tvAge.setText(Integer.toString( animals.get(position).getAge()));
        holder.imgPhoto.setImageResource(animals.get(position).getPhotos());
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }


    public static class AnimalViewHolder extends RecyclerView.ViewHolder{
        CardView cv;
        TextView tvName;
        TextView tvAge;
        ImageView imgPhoto;

        public AnimalViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            tvName = (TextView)itemView.findViewById(R.id.lblName);
            tvAge = (TextView) itemView.findViewById(R.id.lblAge);
            imgPhoto = (ImageView) itemView.findViewById(R.id.imgPhoto);
        }
    }
}
