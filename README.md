# capacitor-twitter-example

## steps

- git clone this repo
- npm install
- clone capacitor-twitter plugin (https://github.com/stewwan/capacitor-twitter)
- cd to plugin folder
- npm install
- npm run build
- npm link
- back to this project and `npm link capacitor-twitter`
- change the path located at `ios/App/Podfile`
- cd to ios/App and `pod install`
- back to the root of this project and `ionic cap run ios`

then you're set to go. relevant code is located at `src/app/home`

## license

MIT
