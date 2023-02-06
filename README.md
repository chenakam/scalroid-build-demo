# scalroid-build-demo

Demo project for test [scalroid](https://github.com/chenakam/scalroid), which is a `scala-kotlin-java` union compile Gradle plugin.

## Usage

1. Clone projects:

```bash
cd <PATH/TO/YOUR/WORKSPACE>
git clone git@github.com:chenakam/scalroid-build-demo.git <PROJECT_ALIAS_NAME>

cd <PROJECT_ALIAS_NAME>
```

2. Clone `buildSrc` (**optional**):

```bash
// dir name `buildSrc` should not be changed
git clone git@github.com:chenakam/scalroid.git buildSrc
```

* Alternatively, if you have not done this step, please make sure the line below is uncommented in the `/build.gradle` file:

```groovy
plugins {
    // ...
    id 'cash.bdo.scalroid' version '[1.3,)' apply false
}
```

3. Open the project with `Android Studio`.

4. Also refers sub-projects:
    - [assoid](https://github.com/bdo-cash/assoid/tree/v.gradle) with branch `v.gradle`;
    - [annoid](https://github.com/bdo-cash/annoid/tree/v.gradle) with branch `v.gradle`.
