# scalroid-build-demo

Demo project for test [scalroid](https://github.com/chenakam/scalroid), which is a `scala-kotlin-java` union compile plugin built on `Gradle`.

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

   Alternatively, if you have not done this step, please make sure the line below is uncommented in the `/build.gradle` file:
   ```groovy
   plugins {
       // ...
       id 'cash.bdo.scalroid' version '[1.3,)' apply false
   }
   ```

3. Clone sub-projects:
    - [assoid](https://github.com/bdo-cash/assoid/tree/v.gradle) with branch `v.gradle`;
    - [annoid](https://github.com/bdo-cash/annoid/tree/v.gradle) with branch `v.gradle`.

   The command are:
   ```bash
   cd <PROJECT_ALIAS_NAME>
   git clone https://github.com/bdo-cash/annoid.git
   git clone https://github.com/bdo-cash/assoid.git

   cd annoid
   git checkout v.gradle

   cd ../assoid
   git checkout v.gradle
   ```

4. Open the project with `Android Studio`. Try run:
   ```bash
   ./gradlew :app:assembleDebug
   # or with variants (github/googleplay/xxx):
   ./gradlew :app:assembleGithubDebug
   ./gradlew :app:assembleGoogleplayDebug
   ./gradlew :app:assembleXxxDebug

   # or
   ./gradlew :app:assembleRelease
   # or with variants (github/googleplay/xxx):
   ./gradlew :app:assembleGithubRelease
   ./gradlew :app:assembleGoogleplayRelease
   ./gradlew :app:assembleXxxRelease

   # or
   ./gradlew :app:assemble # include all above

   # or
   ./gradlew :app:assembleAndroidTest
   # or with variants (github/googleplay/xxx):
   ./gradlew :app:assembleGithubDebugAndroidTest
   ./gradlew :app:assembleGoogleplayDebugAndroidTest
   ./gradlew :app:assembleXxxDebugAndroidTest

   # or
   ./gradlew :app:test
   ```
   in the `Terminal`, and you can find the outputs in dir `app/build/outputs/apk` when the `:app:assembleXxx` is executes successfully.
