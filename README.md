# capacitor-twitter-example

## steps

- git clone this repo
- npm install
- clone `capacitor-twitter` plugin (https://github.com/stewwan/capacitor-twitter)
- cd to plugin folder
- npm install
- npm run build
- npm link
- go back to this project and `npm link capacitor-twitter`
- change the path located at `ios/App/Podfile`
- rename `capacitor.config-BLANK.json` removing the `-BLANK` part
- change the `consumerKey` and `consumerSecret` at `capacitor.config.json` [create one here](https://developer.twitter.com)
- cd to ios/App and `pod install`
- go back to the root of this project and `ionic cap run ios`

then you're set to go. relevant code is located at `src/app/home`

Cheers 🍻 Follow me [@Twitter](https://twitter.com/StewanSilva)

## license

MIT
