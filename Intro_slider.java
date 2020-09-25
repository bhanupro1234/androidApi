package com.prasad.new_explorer;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import androidx.core.content.ContextCompat;

public class Intro_slider extends AppCompatActivity {


    private Adapter onboardAdapter;
    private LinearLayout layoutOnboardIndicators;
    private boolean a=true;
    private int positonTrack=0;
    private PrefManager prefManager;
    private Button m_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prefManager = new PrefManager(this);
        if (!prefManager.isFirstTimeLaunch()) {
            launchHomeScreen();
            finish();
        }
        setContentView(R.layout.intro_layout);
        layoutOnboardIndicators=(LinearLayout) findViewById(R.id.indicators);
        m_button=(Button) findViewById(R.id.buttonAction);
        setupOnboardItems();
        final ViewPager2 onboardviewpager=findViewById(R.id.vp);
        onboardviewpager.setAdapter(onboardAdapter);

        a=true;
        onboardviewpager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                positonTrack=position;
                bhanu(positonTrack);
                System.out.println(position+"position traceing");
                setuponboardindicators();
                setcurrentonboardindicators(positonTrack);
            }
        });
        m_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positonTrack=positonTrack+1;
                onboardviewpager.setCurrentItem(positonTrack,true);
                setuponboardindicators();
                setcurrentonboardindicators(positonTrack);
                bhanu(positonTrack);
            }
        });


    }
    private void bhanu(int state)
    {
if(state>2)
{
    launchHomeScreen();
}
if(state==2)
{
    m_button.setText("Lunch");
}
if(state<2){
    m_button.setText("Next");
}
    }
    private void setupOnboardItems(){



        List <Onboard> onboardingItems =new ArrayList<>();
        Onboard itempayonline =new Onboard();
        itempayonline.setTitle("Break your Creativity Limits :)");
        itempayonline.setDescription("\nCleanup your mind , \n Build with new Dreams & \n Run");
        itempayonline.setImage(R.drawable.createve);


        Onboard itemontheway =new Onboard();
        itemontheway.setTitle("Draw Your Own Path :)");
        itemontheway.setDescription("\nPredict Every moment of life , \n By Exploring Way of \n Happiness ");
        itemontheway.setImage(R.drawable.explore);


        Onboard itemeattogether =new Onboard();
        itemeattogether.setTitle("Let's Start Your Productivity :)");
        itemeattogether.setDescription("\nCustomize your Thoughts ,\n To Become A \n Developer ");
        itemeattogether.setImage(R.drawable.productivity);
        onboardingItems.add(itempayonline);
        onboardingItems.add(itemontheway);
        onboardingItems.add(itemeattogether);

        onboardAdapter =new Adapter(onboardingItems);
    }
    public void setuponboardindicators() {
        ImageView[] indicators = new ImageView[onboardAdapter.getItemCount()];
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(8, 0, 8, 0);

        if (a==false) {
            layoutOnboardIndicators.removeAllViewsInLayout();
        }

        for (int i = 0; i < indicators.length; i++) {
            indicators[i] = new ImageView(getApplicationContext());
            indicators[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.inactive));
            indicators[i].setLayoutParams(layoutParams);
            layoutOnboardIndicators.addView(indicators[i]);
        }
        a=false;
    }

    public void setcurrentonboardindicators(int index)
    {

        int childCount=layoutOnboardIndicators.getChildCount();
        for(int i=index;i<childCount;i++){
            ImageView imageView=(ImageView) layoutOnboardIndicators.getChildAt(i);
            if(i==index){
                imageView.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.indicator_active));
            }
            else
            {
                imageView.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.inactive));
            }
        }
    }

    public void  launchHomeScreen()
    {
        prefManager.setFirstTimeLaunch(false);
        startActivity(new Intent(Intro_slider.this, MainActivity.class));
        finish();
    }
}
