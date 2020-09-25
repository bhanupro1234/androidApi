package com.prasad.new_explorer.ui.home;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.Map;
import com.prasad.new_explorer.R;
public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    DatabaseReference dref;
    FirebaseDatabase database;
    RecyclerView recyclerView;
  ProgressBar textView;
    String name,videourl,imageurl;
    ArrayList<Member> arrayList;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        arrayList=new ArrayList<Member>();
        textView=root.findViewById(R.id.offline_status);
        recyclerView =root.findViewById(R.id.recyclerview_ShowVideo);
//       // m_button = root.findViewById(R.id.fullscreenid);
//       // m_button.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////              //  Intent intent = new Intent(getActivity(), FullscreenActivity.class);
////                //intent.putExtra("","")
////                //startActivity(intent);
////            }
////        });

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        database = FirebaseDatabase.getInstance();
        dref = database.getReference("video");
        dref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                arrayList.clear();
                bhanuprasad();
                for (DataSnapshot childDataSnapshot : dataSnapshot.getChildren()) {
                    String temp = childDataSnapshot.getKey();
                    System.out.println(temp + "   bhanuprojamiikunta");
                    DatabaseReference mref = dref.child(temp);
                    mref.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            GenericTypeIndicator<Map<String, String>> gType = new GenericTypeIndicator<Map<String, String>>() {
                            };
                            Map<String, String> myMap = snapshot.getValue(gType);
                            videourl = myMap.get("videourl");
                            imageurl = myMap.get("imageurl");
                            name = myMap.get("name");
                         //   System.out.println(videourl + "  jammikunta");
                           Member member = new Member(name, videourl, imageurl);
                            arrayList.add(member);
                            Adapterr adapter = new Adapterr(arrayList, getContext());
                            recyclerView.setAdapter(adapter);
                            bhanuprasad();
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        bhanuprasad();

                return root;
    }

    public void bhanuprasad(){
        if(arrayList.size()>0)
        {
            textView.setVisibility(View.GONE);
        }
        else
        {
            textView.setVisibility(View.VISIBLE);

        }
    }
}