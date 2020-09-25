package com.prasad.new_explorer.ui.home;

public class Member {

    String Videourl;
    String Name;
    String Imageurl;
    public Member(){}
    public String getImageurl() {
        return Imageurl;
    }
    public String getVideourl() {
        return Videourl;
    }
    public String getName() {
        return Name;
    }

    public void setVideourl(String videourl) {

        Videourl = videourl;
    }
    public  Member(String name,String videourl,String imageurl) {
        //here from show .java adding
        System.out.println("From Member class");
        Videourl = videourl;
        Imageurl=imageurl;
        Name=name;
    }

}
