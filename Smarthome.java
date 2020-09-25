package com.prasad.new_explorer;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Switch;

public class Smarthome extends AppCompatActivity {


    private Animation animationFan;
    private  ImageView imageDoor;
    private  ImageView imageBulb;
    private  ImageView imageDesktop;
    private ImageView imageRouter;
    private ImageView imageFan;

    private  ImageView imageDoor1;
    private  ImageView imageBulb1;
    private  ImageView imageDesktop1;
    private ImageView imageRouter1;
    private ImageView imageFan1;

    private Switch door_switch;
    private Switch bulb_switch;
    private Switch desktop_switch;
    private Switch router_switch;
    private Switch fan_switch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_smarthome);

        ScrollView scrollView = (ScrollView) findViewById(R.id.vp);
        imageDoor = (ImageView) findViewById(R.id.door);
        imageDoor1 = (ImageView) findViewById(R.id.door1);

        imageBulb = (ImageView) findViewById(R.id.bulb);
        imageBulb1 = (ImageView) findViewById(R.id.bulb1);

        imageDesktop = (ImageView) findViewById(R.id.desktop);
        imageDesktop1 = (ImageView) findViewById(R.id.desktop1);

        imageRouter = (ImageView) findViewById(R.id.router);
        imageRouter1 = (ImageView) findViewById(R.id.router1);

        imageFan = (ImageView) findViewById(R.id.fan);
        imageFan1 = (ImageView) findViewById(R.id.fan1);

        door_switch = findViewById(R.id.door_switch);
        bulb_switch = findViewById(R.id.bulb_switch);
        desktop_switch = findViewById(R.id.desktop_switch);
        router_switch = findViewById(R.id.router_switch);
        fan_switch = findViewById(R.id.fan_switch);

        Resources res=getResources();
        Drawable drawableDoor = ResourcesCompat.getDrawable(res, R.drawable.ic_domotics, null);
        imageDoor.setImageDrawable(drawableDoor);




        imageDoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.scrollTo(0, scrollView.getTop());
                Resources res=getResources();
                Drawable drawableDoor = ResourcesCompat.getDrawable(res, R.drawable.ic_domotics, null);
                imageDoor.setImageDrawable(drawableDoor);
                Drawable drawableBulb = ResourcesCompat.getDrawable(res, R.drawable.ic_idea, null);
                imageBulb.setImageDrawable(drawableBulb);
                Drawable drawableDesktop = ResourcesCompat.getDrawable(res, R.drawable.ic_desktop, null);
                imageDesktop.setImageDrawable(drawableDesktop);
                Drawable drawableRouter = ResourcesCompat.getDrawable(res, R.drawable.ic_router, null);
                imageRouter.setImageDrawable(drawableRouter);
                Drawable drawableFan = ResourcesCompat.getDrawable(res, R.drawable.ic_fan, null);
                imageFan.setImageDrawable(drawableFan);

            }
        });

        imageBulb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.scrollTo(0, 1720);
                Resources res=getResources();
                Drawable drawableDoor = ResourcesCompat.getDrawable(res, R.drawable.ic_door_black, null);
                imageDoor.setImageDrawable(drawableDoor);
                Drawable drawableBulb = ResourcesCompat.getDrawable(res, R.drawable.ic_idea_ontrue, null);
                imageBulb.setImageDrawable(drawableBulb);
                Drawable drawableDesktop = ResourcesCompat.getDrawable(res, R.drawable.ic_desktop, null);
                imageDesktop.setImageDrawable(drawableDesktop);
                Drawable drawableRouter = ResourcesCompat.getDrawable(res, R.drawable.ic_router, null);
                imageRouter.setImageDrawable(drawableRouter);
                Drawable drawableFan = ResourcesCompat.getDrawable(res, R.drawable.ic_fan, null);
                imageFan.setImageDrawable(drawableFan);
            }
        });

        imageDesktop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.scrollTo(0, 3420);
                Resources res=getResources();
                Drawable drawableDoor = ResourcesCompat.getDrawable(res, R.drawable.ic_door_black, null);
                imageDoor.setImageDrawable(drawableDoor);
                Drawable drawableBulb = ResourcesCompat.getDrawable(res, R.drawable.ic_idea, null);
                imageBulb.setImageDrawable(drawableBulb);
                Drawable drawableDesktop = ResourcesCompat.getDrawable(res, R.drawable.ic_desktop_color, null);
                imageDesktop.setImageDrawable(drawableDesktop);
                Drawable drawableRouter = ResourcesCompat.getDrawable(res, R.drawable.ic_router, null);
                imageRouter.setImageDrawable(drawableRouter);
                Drawable drawableFan = ResourcesCompat.getDrawable(res, R.drawable.ic_fan, null);
                imageFan.setImageDrawable(drawableFan);
            }
        });
        imageRouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.scrollTo(0, 5100);
                Resources res=getResources();
                Drawable drawableDoor = ResourcesCompat.getDrawable(res, R.drawable.ic_door_black, null);
                imageDoor.setImageDrawable(drawableDoor);
                Drawable drawableBulb = ResourcesCompat.getDrawable(res, R.drawable.ic_idea, null);
                imageBulb.setImageDrawable(drawableBulb);
                Drawable drawableDesktop = ResourcesCompat.getDrawable(res, R.drawable.ic_desktop, null);
                imageDesktop.setImageDrawable(drawableDesktop);
                Drawable drawableRouter = ResourcesCompat.getDrawable(res, R.drawable.ic_router_color, null);
                imageRouter.setImageDrawable(drawableRouter);
                Drawable drawableFan = ResourcesCompat.getDrawable(res, R.drawable.ic_fan, null);
                imageFan.setImageDrawable(drawableFan);
            }
        });
        imageFan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.scrollTo(0, 6880);
                Resources res=getResources();
                Drawable drawableDoor = ResourcesCompat.getDrawable(res, R.drawable.ic_door_black, null);
                imageDoor.setImageDrawable(drawableDoor);
                Drawable drawableBulb = ResourcesCompat.getDrawable(res, R.drawable.ic_idea, null);
                imageBulb.setImageDrawable(drawableBulb);
                Drawable drawableDesktop = ResourcesCompat.getDrawable(res, R.drawable.ic_desktop, null);
                imageDesktop.setImageDrawable(drawableDesktop);
                Drawable drawableRouter = ResourcesCompat.getDrawable(res, R.drawable.ic_router, null);
                imageRouter.setImageDrawable(drawableRouter);
                Drawable drawableFan = ResourcesCompat.getDrawable(res, R.drawable.ic_fan_color, null);
                imageFan.setImageDrawable(drawableFan);
            }
        });


        door_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageDoor1.clearAnimation();
                    Resources res=getResources();
                    Drawable drawableThumb = ResourcesCompat.getDrawable(res, R.drawable.thumb_color, null);
                    door_switch.setThumbDrawable(drawableThumb);


                    View view = findViewById(R.id.door1);
                    int cx = view.getWidth() / 2;
                    int cy = view.getHeight() / 2;
                    float finalRadius = (float) Math.hypot(cx, cy);
                    Animator animator = ViewAnimationUtils.createCircularReveal(view, cx, cy, finalRadius, 0);
                    Drawable drawabledoor = ResourcesCompat.getDrawable(res, R.drawable.ic_domotics, null);
                    imageDoor1.setImageDrawable(drawabledoor);
                    animator = ViewAnimationUtils.createCircularReveal(view, cx, cy, 0, finalRadius);
                    view.setVisibility(View.VISIBLE);
                    animator.start();

                } else {
                    imageDoor1.clearAnimation();
                    Resources res=getResources();
                    Drawable drawableThumb = ResourcesCompat.getDrawable(res, R.drawable.custom_thumb, null);
                    door_switch.setThumbDrawable(drawableThumb);
                    View view = findViewById(R.id.door1);
                    int cx = view.getWidth() / 2;
                    int cy = view.getHeight() / 2;

                    float finalRadius = (float) Math.hypot(cx, cy);
                    Animator animator = ViewAnimationUtils.createCircularReveal(view, cx, cy, finalRadius, 0);
                    Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.ic_door_black, null);
                    imageDoor1.setImageDrawable(drawable);
                    animator = ViewAnimationUtils.createCircularReveal(view, cx, cy, 0, finalRadius);
                    view.setVisibility(View.VISIBLE);
                    animator.start();
                }
            }
        });

        bulb_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageBulb1.clearAnimation();
                    Resources res=getResources();
                    Drawable drawableThumb = ResourcesCompat.getDrawable(res, R.drawable.thumb_color, null);
                    bulb_switch.setThumbDrawable(drawableThumb);
                    View view = findViewById(R.id.bulb1);
                    int cx = view.getWidth() / 2;
                    int cy = view.getHeight() / 2;
                    float finalRadius = (float) Math.hypot(cx, cy);
                    Animator animator = ViewAnimationUtils.createCircularReveal(view, cx, cy, finalRadius, 0);
                    Drawable drawabledoor = ResourcesCompat.getDrawable(res, R.drawable.ic_idea_ontrue, null);
                    imageBulb1.setImageDrawable(drawabledoor);
                    animator = ViewAnimationUtils.createCircularReveal(view, cx, cy, 0, finalRadius);
                    view.setVisibility(View.VISIBLE);
                    animator.start();

                } else {
                    imageBulb1.clearAnimation();
                    Resources res=getResources();
                    Drawable drawableThumb = ResourcesCompat.getDrawable(res, R.drawable.custom_thumb, null);
                    bulb_switch.setThumbDrawable(drawableThumb);
                    View view = findViewById(R.id.bulb1);
                    int cx = view.getWidth() / 2;
                    int cy = view.getHeight() / 2;
                    float finalRadius = (float) Math.hypot(cx, cy);
                    Animator animator = ViewAnimationUtils.createCircularReveal(view, cx, cy, finalRadius, 0);
                    Drawable drawabledoor = ResourcesCompat.getDrawable(res, R.drawable.ic_idea, null);
                    imageBulb1.setImageDrawable(drawabledoor);
                    animator = ViewAnimationUtils.createCircularReveal(view, cx, cy, 0, finalRadius);
                    view.setVisibility(View.VISIBLE);
                    animator.start();

                }
            }
        });

        desktop_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageDesktop1.clearAnimation();
                    Resources res=getResources();
                    Drawable drawableThumb = ResourcesCompat.getDrawable(res, R.drawable.thumb_color, null);
                    desktop_switch.setThumbDrawable(drawableThumb);
                    View view = findViewById(R.id.desktop1);
                    int cx = view.getWidth() / 2;
                    int cy = view.getHeight() / 2;
                    float finalRadius = (float) Math.hypot(cx, cy);
                    Animator animator = ViewAnimationUtils.createCircularReveal(view, cx, cy, finalRadius, 0);
                    Drawable drawabledoor = ResourcesCompat.getDrawable(res, R.drawable.ic_desktop_color, null);
                    imageDesktop1.setImageDrawable(drawabledoor);
                    animator = ViewAnimationUtils.createCircularReveal(view, cx, cy, 0, finalRadius);
                    view.setVisibility(View.VISIBLE);
                    animator.start();

                } else {
                    imageDesktop1.clearAnimation();
                    Resources res=getResources();
                    Drawable drawableThumb = ResourcesCompat.getDrawable(res, R.drawable.custom_thumb, null);
                    desktop_switch.setThumbDrawable(drawableThumb);
                    View view = findViewById(R.id.desktop1);
                    int cx = view.getWidth() / 2;
                    int cy = view.getHeight() / 2;
                    float finalRadius = (float) Math.hypot(cx, cy);
                    Animator animator = ViewAnimationUtils.createCircularReveal(view, cx, cy, finalRadius, 0);
                    Drawable drawabledoor = ResourcesCompat.getDrawable(res, R.drawable.ic_desktop, null);
                    imageDesktop1.setImageDrawable(drawabledoor);
                    animator = ViewAnimationUtils.createCircularReveal(view, cx, cy, 0, finalRadius);
                    view.setVisibility(View.VISIBLE);
                    animator.start();

                }
            }
        });

        router_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
if (isChecked)
{
    imageRouter1.clearAnimation();
    Resources res=getResources();
    Drawable drawableThumb = ResourcesCompat.getDrawable(res, R.drawable.thumb_color, null);
    router_switch.setThumbDrawable(drawableThumb);
    View view = findViewById(R.id.router1);
    int cx = view.getWidth() / 2;
    int cy = view.getHeight() / 2;
    float finalRadius = (float) Math.hypot(cx, cy);
    Animator animator = ViewAnimationUtils.createCircularReveal(view, cx, cy, finalRadius, 0);
    Drawable drawabledoor = ResourcesCompat.getDrawable(res, R.drawable.ic_router_color, null);
    imageRouter1.setImageDrawable(drawabledoor);
    animator = ViewAnimationUtils.createCircularReveal(view, cx, cy, 0, finalRadius);
    view.setVisibility(View.VISIBLE);
    animator.start();
}
else
{
    imageRouter1.clearAnimation();
    Resources res=getResources();
    Drawable drawableThumb = ResourcesCompat.getDrawable(res, R.drawable.custom_thumb, null);
    router_switch.setThumbDrawable(drawableThumb);
    View view = findViewById(R.id.router1);
    int cx = view.getWidth() / 2;
    int cy = view.getHeight() / 2;
    float finalRadius = (float) Math.hypot(cx, cy);
    Animator animator = ViewAnimationUtils.createCircularReveal(view, cx, cy, finalRadius, 0);
    Drawable drawabledoor = ResourcesCompat.getDrawable(res, R.drawable.ic_router, null);
    imageRouter1.setImageDrawable(drawabledoor);
    animator = ViewAnimationUtils.createCircularReveal(view, cx, cy, 0, finalRadius);
    view.setVisibility(View.VISIBLE);
    animator.start();

}
            }
        });

        fan_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    imageFan1.clearAnimation();
                    Resources res=getResources();
                    Drawable drawableThumb = ResourcesCompat.getDrawable(res, R.drawable.thumb_color, null);
                    fan_switch.setThumbDrawable(drawableThumb);
                    View view = findViewById(R.id.fan1);
                    int cx = view.getWidth() / 2;
                    int cy = view.getHeight() / 2;
                    float finalRadius = (float) Math.hypot(cx, cy);
                    Animator animator = ViewAnimationUtils.createCircularReveal(view, cx, cy, finalRadius, 0);
                    Drawable drawabledoor = ResourcesCompat.getDrawable(res, R.drawable.ic_fan_color, null);
                    imageFan1.setImageDrawable(drawabledoor);
                    animator = ViewAnimationUtils.createCircularReveal(view, cx, cy, 0, finalRadius);
                    view.setVisibility(View.VISIBLE);
                    animator.start();
                    animationFan = AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.rotate);
                    animationFan.setStartTime(0);
                   imageFan1.startAnimation(animationFan);
                }
                else
                {
                    imageFan1.clearAnimation();
                    Resources res=getResources();
                    Drawable drawableThumb = ResourcesCompat.getDrawable(res, R.drawable.custom_thumb, null);
                    fan_switch.setThumbDrawable(drawableThumb);
                    View view = findViewById(R.id.fan1);
                    int cx = view.getWidth() / 2;
                    int cy = view.getHeight() / 2;
                    float finalRadius = (float) Math.hypot(cx, cy);
                    Animator animator = ViewAnimationUtils.createCircularReveal(view, cx, cy, finalRadius, 0);
                    Drawable drawabledoor = ResourcesCompat.getDrawable(res, R.drawable.ic_fan, null);
                    imageFan1.setImageDrawable(drawabledoor);
                    animator = ViewAnimationUtils.createCircularReveal(view, cx, cy, 0, finalRadius);
                    view.setVisibility(View.VISIBLE);
                    animator.start();
                }
            }
        });


    }

}