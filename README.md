# Deprecated
Good bye...

# Android MVP Base
[![License](https://img.shields.io/hexpm/l/plug.svg)]()

Provides Java And Kotlin libraries.

Activity and Fragment are implemented.
Presenter is inherited from AbstractPresenter and can be implemented by inheriting
BasePresenterActivity/BasePresenterFragment.


# Android base with kotlin
[ ![Download](https://api.bintray.com/packages/taehwandev/thdev.tech/base-kotlin/images/download.svg) ](https://bintray.com/taehwandev/thdev.tech/base-kotlin/_latestVersion)

#### It is an MVP base written in Kotlin.

# Use Kotlin library

### Support base library gradle.

```
compile 'tech.thdev.support:base-kotlin:1.0.0'
```

### Use dependencies

```
buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        // Kotlin
        classpath 'org.jetbrains.kotlin:kotlin-gradle-plugin:1.1.2-3'
    }
}

apply plugin: 'com.android.application'
apply plugin: 'kotlin-android'

dependencies {
    compile 'com.android.support:appcompat-v7:25.3.1'

    // Kotlin
    compile 'org.jetbrains.kotlin:kotlin-stdlib:1.1.2-3'

    compile 'tech.thdev.support:base-kotlin:1.0.0'
}
```


# Android base with java
[ ![Download](https://api.bintray.com/packages/taehwandev/thdev.tech/base-java/images/download.svg) ](https://bintray.com/taehwandev/thdev.tech/base-java/_latestVersion)

#### It is an MVP base written in Java.

# Use

### Support base library gradle.

```
compile 'tech.thdev.support:base-java:1.0.0'
```

### Use dependencies

```
apply plugin: 'com.android.application'

dependencies {
    compile 'com.android.support:appcompat-v7:25.3.1'

    // ButterKnife
``    compile 'com.jakewharton:butterknife:8.5.1'
    apt 'com.jakewharton:butterknife-compiler:8.5.1'

    compile 'tech.thdev.support:base-java:1.0.0'
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
public class MainFragment extends BaseFragment {

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
- buildToolsVersion = 25.0.2
- compile sdk version = 25
- Target sdk version = 25
- Min sdk version = 16
- Android studio 2.3


## Use Library version
- Kotlin version = 1.1.2-3
- support libraryVersion = 25.3.1
- ButterKnife 8.5.1


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
