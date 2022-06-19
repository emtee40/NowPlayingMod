![Ambient Music Mod Banner](https://i.imgur.com/xVKAYYjl.png)

[Ambient Music Mod](https://github.com/KieronQuinn/AmbientMusicMod) | **Now Playing** 

Now Playing is a modified version of Android System Intelligence, running only the Now Playing (music recognition) component on other devices. It is only usable with the Ambient Music Mod app.

**If you are trying to install Now Playing, please use the links on the Ambient Music Mod repo for prebuilt APKs**

## Building

> Note: If you are building Now Playing yourself, you **must** also build Ambient Music Mod, since the signatures have to match for security reasons.

1. Clone the repository as normal
2. Download the latest original Pixel 6 APK of Android System Intelligence from [APKmirror](https://www.apkmirror.com/apk/google-inc/device-personalization-services/). (Note: At the time of writing, "S" builds are being used for the prebuilt APKs. "T" builds may work but have not been tested)
3. Place the downloaded APK in the root of the repository, name it `base.apk`
4. Download the latest [APKtool](https://github.com/iBotPeaches/Apktool/releases) JAR and place it in `tools/`. Name it `apktool.jar`
5. Create a `local.properties` file in the root of the project, and set it up:
```
sdk.dir=<path to your Android SDK>
storeFile=<path to your keystore>
keyAlias=<keystore alias>
storePassword=<keystore password>
keyPassword=<key password>
build.tools.version=<the version of build tools to use, eg. 32.0.0>
```
6. Open the project in Android Studio, and run the `installApkRelease` Gradle task. This will build an APK (placed in `build/out-release.apk`) and install it on your device.

## Sources

This repository contains a local version of [dain/leveldb](https://github.com/dain/leveldb) ([Apache 2.0 licence](https://github.com/dain/leveldb/blob/master/license.txt)).