package com.example.viewpager.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.viewpager.AccountFragment;
import com.example.viewpager.EventsFragment;
import com.example.viewpager.HomeFragment;

public class SectionAdapter extends FragmentStateAdapter {
    public SectionAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new EventsFragment();
            default:
                return new AccountFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
