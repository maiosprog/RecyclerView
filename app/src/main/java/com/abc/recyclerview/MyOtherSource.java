package com.abc.recyclerview;

public class MyOtherSource extends Source {
    public MyOtherSource(String title, int image) {
        super(title, image);
    }

    public String getTitle() {
        return super.getTitle()+"Título Sobrescrito";
    }
}
