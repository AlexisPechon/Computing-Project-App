package com.example.a4th_year_mobile_timetable_app.ui.main;

import android.arch.core.util.Function;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Transformations;
import android.arch.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() { //Start of LiveData method
        @Override
        public String apply(Integer input) { //Start of method

            if(input == 1){
                return
                        "Version 1.0 - Updated: 23/03/2023" +
                                "\nWelcome to the homepage of the application!" +
                                "\nIn here you can catch up on the latest news" +
                                "\nand updates being made to this wonderful application!" +
                                "\nBe sure to tune in regularly to keep up to the date on the " +
                                "\nlatest update made to the Timetable Management Application!";

                //return "Hello world from section: " + input;
            }
            else if (input == 2){
                return
                        "Version 1.0 - Updated: 23/03/2023" +
                                "\nWelcome to the timetable page of the application!" +
                                "\nIn here you can expect to find the timetable for different" +
                                "\nmodes of transportation such as busses and trains." +
                                "\n\nThis page is currently in development, please come back" +
                                "\nlater!";

                //return "Hello world from section: " + input;
            }
            return "Hello world from section: " + input;
            
        } //End of method
    }); //End of LiveData method

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }
}