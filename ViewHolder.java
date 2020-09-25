package com.prasad.new_explorer.ui.home;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;
import com.prasad.new_explorer.R;

import java.util.ArrayList;
public class ViewHolder extends RecyclerView.ViewHolder {
    ArrayList<Member> arrayList1;
    SimpleExoPlayer exoPlayer;
    PlayerView playerView;
    ImageView imageView;
    ImageView buttonView;
    Context context;
    View view;
   DownloadManager downloadManager;
    boolean flag=false;
    ProgressBar progressBar;
    View button;
    View buttondownload;

    public ViewHolder(@NonNull View itemView) {

        super(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // System.out.println("traceeeeee");
                 v.setBackgroundColor(0xffffff00);
                // System.out.println(getLayoutPosition()+"   position"+getAdapterPosition()+"   Adapter"+getItemId()+"  id traceeee");
            }
        });
        itemView.setOnLongClickListener(view -> {

            mClickListener.onItemLongClick(view,getAdapterPosition());
            return false;
        });

    }


    public void setExoplayer(Context application ,String Name, String Videourl,int size,ArrayList<Member> arrayList){
        this.arrayList1=arrayList;
        this.context=application;
        TextView textView = itemView.findViewById(R.id.tv_item_name);
       imageView=itemView.findViewById(R.id.images);
        textView.setText(Name);
        Glide.with(application).load(Videourl).into(imageView);
        ImageView buttondownload=itemView.findViewById(R.id.download);
        buttondownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          Toast toast= Toast.makeText(context


                  , "Downloading....", Toast.LENGTH_SHORT);
          toast.show();
                Member current=arrayList1.get(getAdapterPosition());
                downloadManager =(DownloadManager) application.getSystemService(Context.DOWNLOAD_SERVICE);
                Uri videoUrl=Uri.parse(current.getVideourl());
                DownloadManager.Request request=new DownloadManager.Request(videoUrl);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);

            }
        });


                imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Member current=arrayList1.get(getAdapterPosition());
                    System.out.println("   "+size+"  "  +"  A");
                System.out.println("fuckyouuuuuu"+current.getName()+" Name "+current.getVideourl()+"  Video");
                System.out.println(  getAdapterPosition()+"  "+getLayoutPosition()+" "+"fullscreen");
                Intent i=new Intent(application,Fullscreen.class);
                i.putExtra("urll" ,current.getVideourl());
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                application.startActivity(i);
            }
        });

//        playerView.setControllerShowTimeoutMs(2000);
//        playerView.setControllerAutoShow(false);
//        button =playerView.findViewById(R.id.exo_fullscreen_button);
//        buttondownload=playerView.findViewById(R.id.exo_download);
//       buttondownload.setVisibility(View.INVISIBLE);
//        button.setVisibility(View.VISIBLE);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Member current=arrayList1.get(getAdapterPosition());
//                    System.out.println("   "+size+"  "  +"  A");
//                System.out.println("fuckyouuuuuu"+current.getName()+" Name "+current.getVideourl()+"  Video");
//                System.out.println(  getAdapterPosition()+"  "+getLayoutPosition()+" "+"fullscreen");
//                Intent i=new Intent(application,Fullscreen.class);
//                i.putExtra("urll" ,current.getVideourl());
//                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                application.startActivity(i);
//            }
//        });
//
//        progressBar=playerView.findViewById(R.id.progress_Bar);
//
//
//        try {
//            BandwidthMeter bandwidthMeter = new DefaultBandwidthMeter.Builder(application).build();
//            TrackSelector trackSelector = new DefaultTrackSelector(new AdaptiveTrackSelection.Factory(bandwidthMeter));
//            exoPlayer = (SimpleExoPlayer) ExoPlayerFactory.newSimpleInstance(application);
//            System.out.println("nameeeeeeee");
//            System.out.println(Videourl+"urllllllllllllllllll");
//
//         //  Videourl="https://firebasestorage.googleapis.com/v0/b/bhanu-fd7cd.appspot.com/o/uploads%2F1593996887749.mp4?alt=media&token=224c3ef3-4278-4275-973b-f184412bd09b";
//            Uri video = Uri.parse(Videourl);
//            DefaultHttpDataSourceFactory dataSourceFactory = new DefaultHttpDataSourceFactory("video");
//            ExtractorsFactory extractorsFactory = new DefaultExtractorsFactory();
//            MediaSource mediaSource = new ExtractorMediaSource(video,dataSourceFactory,extractorsFactory,null,null);
//            playerView.setPlayer(exoPlayer);
//            exoPlayer.prepare(mediaSource);
//            exoPlayer.setPlayWhenReady(false);
//            exoPlayer.addListener(new Player.EventListener() {
//
//                @Override
//                public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
//                    if(playbackState==Player.STATE_BUFFERING)
//                          {
//                       progressBar.setVisibility(View.VISIBLE);
//                       playerView.setUseController(false);
//                           }
//                      else if (playbackState==Player.STATE_READY){
//                progressBar.setVisibility(View.GONE);
//                        playerView.setUseController(true);
//                }
//                }
//
//                @Override
//                public void onIsPlayingChanged(boolean isPlaying) {
//
//                }
//            });
//
//        }catch (Exception e){
//            Log.e("ViewHolder","exoplayer error"+e.toString());
//        }




    }
    private ViewHolder.Clicklistener mClickListener;

    public interface Clicklistener{
        void onItemClick(View view,int position);
        void onItemLongClick(View view ,int position);
    }

    public void setOnClicklistener(ViewHolder.Clicklistener clicklistener){
        mClickListener = clicklistener;
    }
}

