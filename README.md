# GCCard
This is a Single Page Business Card app. It contains some images, icons, and text.
I used mainly a ScrollLayout, because page height can overflow the height of the device.
Then I used RelativeLayout to distribute images and text over the page, and LinearLayout for ordered elements.
I tried to remove all hard coded dimensions, setting the relative values in dimens.xml file, using dp for image and sp for text size.
I designed some icon images, showed in the page, one for each contact type. And I've made those in 5 different sizes, to let Android to adapt itself to the different devices the app can run into. So I copied the images in the res folder, in 5 different folders (drawable-xxxhdpi, drawable-xxhdpi, drawable-xhdpi, drawable-hdpi, drawable-mdpi).
I added some java code to the MainActivity.java.
Each icon has its own OnClickListener, and implements the right action (written in the OnClick method).
If you want to give a try, you can click on the icons.
