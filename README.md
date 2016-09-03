# AndroidBase
[![License](https://img.shields.io/hexpm/l/plug.svg)]()
[ ![Download](https://api.bintray.com/packages/taehwandev/thdev.tech/base/images/download.svg) ](https://bintray.com/taehwandev/thdev.tech/base/_latestVersion)

Created kotlin. It includes ButterKnife and Adapter.

## Use

```
compile 'tech.thdev.support:base:1.0.1'
```

dependencies

```
buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        // Kotlin 1.0.3
        classpath 'org.jetbrains.kotlin:kotlin-gradle-plugin:1.0.3'

        // ButterKnife
        classpath 'com.neenbedankt.gradle.plugins:android-apt:1.8'
    }
}

apply plugin: 'android-apt'
apply plugin: 'kotlin-android'

dependencies {
    compile 'com.android.support:appcompat-v7:24.2.0'
    compile 'com.android.support:recyclerview-v7:24.2.0'

    // ButterKnife
    compile 'com.jakewharton:butterknife:8.4.0'
    apt 'com.jakewharton:butterknife-compiler:8.4.0'

    // Kotlin
    provided 'org.jetbrains.kotlin:kotlin-stdlib:1.0.3'

    compile 'tech.thdev.support:base:1.0.1'
}
```

## API Class

- BaseActivity

```
public class MainActivity extends BaseActivity {
  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
  }
}
```

- BaseFragment

```
public class MainFragment extends BaseFragment<MainContract.Presenter> implements MainContract.View {

  @BindView(R.id.textView)
  TextView textView;

  @Override
  public int getLayout() {
      return R.layout.fragment_main;
  }
}
```

- BaseRecyclerAdapter
- BaseRecyclerViewHolder
- BasePresenter
- BaseView


## Android Developer Version info
- buildToolsVersion = 24.0.2
- compile sdk version = 24
- Target sdk version = 24
- Min sdk version = 16
- Android studio 2.2 RC


## Use Library version
- Kotlin version = 1.0.3
- support libraryVersion = 24.2.0
- ButterKnife 8.4.0


## License

```
Copyright 2016 Tae-hwan

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
