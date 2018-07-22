package com.example.dhanush.clinic;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;


public class Tab1contact extends Fragment  {
    private ExpandListAdapter ExpAdapter;
    private ArrayList<Group> ExpListItems;
    private ExpandableListView ExpandList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1contact, container, false);
        ExpandList = (ExpandableListView)rootView.findViewById(R.id.exp_list);
        ExpListItems = SetStandardGroups();
        ExpAdapter = new ExpandListAdapter((getActivity()), ExpListItems);
        ExpandList.setAdapter(ExpAdapter);

        return rootView;

    }

    private ArrayList<Group> SetStandardGroups() {
        ArrayList<Group> group_list = new ArrayList<Group>();
        ArrayList<Child> child_list;
        // Setting Group 1
        child_list = new ArrayList<Child>();
        Group gru1 = new Group();
        gru1.setName("Clinic Consultation");

        Child ch1_1 = new Child();
        ch1_1.setName("First Time Vist");
        child_list.add(ch1_1);

        Child ch1_2 = new Child();
        ch1_2.setName("Follow Up");
        child_list.add(ch1_2);
        gru1.setItems(child_list);

        // Setting Group 2

        child_list = new ArrayList<Child>();
        Group gru2 = new Group();
        gru2.setName("Online Consultation");

        Child ch2_1 = new Child();
        ch2_1.setName("First Time Visit");
        child_list.add(ch2_1);

        Child ch2_2 = new Child();
        ch2_2.setName("Follow Up");
        child_list.add(ch2_2);
        gru2.setItems(child_list);

        child_list = new ArrayList<Child>();
        Group gru3 = new Group();
        gru3.setName("Email");

        Child ch3_1 = new Child();
        ch3_1.setName("First Time Visit");
        child_list.add(ch3_1);

        Child ch3_2 = new Child();
        ch3_2.setName("Follow Up");
        child_list.add(ch3_2);
        gru3.setItems(child_list);


        //listing all groups
        group_list.add(gru1);
        group_list.add(gru2);
        group_list.add(gru3);
        return group_list;
    }
}
