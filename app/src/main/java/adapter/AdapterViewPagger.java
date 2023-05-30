package adapter;

/**
 * NIM      : 10120068
 * Nama     : Alberiansyah
 * Kelas    : IF-2
 */

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

import fragment.FragmentHome;

public class AdapterViewPagger extends FragmentStateAdapter {
    ArrayList<Fragment> arr;
    public AdapterViewPagger(@NonNull FragmentActivity fragmentActivity, ArrayList<Fragment> arr){
        super(fragmentActivity);
        this.arr = arr;
    }
    @NonNull
    @Override
    public Fragment createFragment(int position){
        return arr.get(position);
    }

    @Override
    public int getItemCount(){
        return arr.size();
    }
}
