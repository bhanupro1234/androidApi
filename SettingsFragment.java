package com.prasad.new_explorer.ui.setttings;

import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.ViewModelProviders;

import android.animation.Animator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.prasad.new_explorer.R;
import com.prasad.new_explorer.R;
import com.prasad.new_explorer.ui.home.HomeViewModel;

import org.w3c.dom.Text;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class SettingsFragment extends Fragment {
FrameLayout frameLayout;
     SettingsViewModel mViewModel;
     String imageUrl="https://firebasestorage.googleapis.com/v0/b/bhanu-fd7cd.appspot.com/o/images%2Fone.jpg?alt=media&token=bc7cdb0d-47ee-4bd1-81f3-79e4c4b7325e";
ImageView imageView;
View view;
    TextView textView;
    TextView textView1;
Animation animation;
    public static SettingsFragment newInstance() {
        return new SettingsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mViewModel =
                ViewModelProviders.of(this).get(SettingsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_settings, container, false);
        imageView=root.findViewById(R.id.imageee);

        textView=root.findViewById(R.id.tv_text);
        textView.setVisibility(View.INVISIBLE);
        textView1=root.findViewById(R.id.tv_text_two);
        textView.setVisibility(View.INVISIBLE);
        textView1.setVisibility(View.INVISIBLE);
        ProgressBar progressBar=(ProgressBar) root.findViewById(R.id.progress_Bar_act);
        Glide.with(getActivity()).load(imageUrl).listener(new RequestListener<Drawable>() {
            @Override
            public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                return false;
            }

            @Override
            public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                progressBar.setVisibility(View.GONE);
                textView.setText("Bhanu Prasad");
                textView1.setText("Passionate In Play with Internet");
                textView.setVisibility(View.VISIBLE);
                textView1.setVisibility(View.VISIBLE);
                animation= AnimationUtils.loadAnimation(getActivity(),R.anim.textxml);
               animation.reset();
               textView.clearAnimation();
               textView.startAnimation(animation);
               textView.setTextSize(40);
               textView1.clearAnimation();
               textView1.startAnimation(animation);

                return false;
            }
        }).into(imageView);

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(SettingsViewModel.class);
        // TODO: Use the ViewModel
    }

}