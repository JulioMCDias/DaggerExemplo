package com.jlmcdeveloper.daggerexemplo.contract;

import com.jlmcdeveloper.daggerexemplo.module.RecycleAdapterModule;
import com.jlmcdeveloper.daggerexemplo.scope.PerActivity;
import com.jlmcdeveloper.daggerexemplo.ui.ListCarActivity;

import dagger.Component;

@Component(dependencies = ApplicationComponent.class, modules = RecycleAdapterModule.class)
@PerActivity
public interface ActivityComponent {
    void inject(ListCarActivity listCarActivity);
}
