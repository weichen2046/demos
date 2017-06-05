package com.example.chenwei.debugaidlparameters;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by chenwei on 6/5/17.
 */

public class MyParcelable implements Parcelable {
    protected MyParcelable(Parcel in) {
    }

    public static final Creator<MyParcelable> CREATOR = new Creator<MyParcelable>() {
        @Override
        public MyParcelable createFromParcel(Parcel in) {
            return new MyParcelable(in);
        }

        @Override
        public MyParcelable[] newArray(int size) {
            return new MyParcelable[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
