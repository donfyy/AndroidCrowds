package com.donfyy.crowds.dagger;

import com.donfyy.crowds.MainFragment;
import com.donfyy.crowds.L1Fragment;
import com.donfyy.crowds.viewpager.ViewPagerFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class L1FragmentModule {

    @ContributesAndroidInjector(modules = {L2FragmentModule.class})
    abstract L1Fragment L1Fragment();

    @ContributesAndroidInjector()
    abstract MainFragment FeatureListFragment();

    @ContributesAndroidInjector()
    abstract ViewPagerFragment ViewPagerFragment();
}
