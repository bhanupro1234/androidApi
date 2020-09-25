package com.prasad.new_explorer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends  RecyclerView.Adapter<Adapter. OnboardViewHolder>{
private List<Onboard> onboardingItems;

    public Adapter(List<Onboard> onboardingItems) {
        this.onboardingItems = onboardingItems;
    }

    @NonNull
    @Override
    public OnboardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new OnboardViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_container,parent,false
        ))
        {
        };
    }

    @Override
    public void onBindViewHolder(@NonNull  OnboardViewHolder holder, int position) {
holder.setOnboardingData(onboardingItems.get(position));
    }

    @Override
    public int getItemCount() {
        return onboardingItems.size();
    }

    class  OnboardViewHolder extends RecyclerView.ViewHolder{

        private TextView textTitle;
        private TextView textDescription;
        private ImageView imageView;

        public  OnboardViewHolder (@NonNull View itemView) {
            super(itemView);
            textTitle =itemView.findViewById(R.id.text_Title);
            textDescription=itemView.findViewById(R.id.text_Description);
            imageView=itemView.findViewById(R.id.imageOnboarding);
        }
        void setOnboardingData(com.prasad.new_explorer.Onboard onboardingData)  //onboardingitem
        {
            textTitle.setText(onboardingData.getTitle());
            textDescription.setText(onboardingData.getDescription());
            imageView.setImageResource(onboardingData.getImage());
        }
    }
}
